//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Enumeration;
import javax.microedition.pim.Contact;
import javax.microedition.pim.ContactList;
import javax.microedition.pim.PIM;
import javax.microedition.pim.PIMException;
import javax.microedition.pim.UnsupportedFieldException;


public final class ContactManager {
    int lastContactIndex = 0;
    String[] names;
    String[] phones;

    public ContactManager(h var1) {
    }

    public final String[] getContactList() {
        this.lastContactIndex = 0;
        String[] contacts = null;
        this.phones = new String[255];
        this.names = new String[255];
        contacts = new String[255];
        ContactList[] contactLists = null;
        boolean listReadingError = true;

        // Read contact lists from PIM

        int contactListIndex;
        try {
            try {
                try {
                    contactLists = new ContactList[1];

                    for(contactListIndex = 0; contactListIndex < contactLists.length; ++contactListIndex) {
                        contactLists[contactListIndex] = (ContactList)PIM.getInstance().openPIMList(1, 1);
                        listReadingError = false;   // Potentially is an early assignment, requires deletion
                    }

                    listReadingError = false;
                } catch (PIMException pimException) {
                }
            } catch (SecurityException securityException) {
            }
        } catch (Exception ignore) {
        }

        // Close contact lists in case of errors

        if (listReadingError) {
            try {
                try {
                    try {
                        if (contactLists != null) {
                            for(contactListIndex = 0; contactListIndex < contactLists.length; ++contactListIndex) {
                                if (contactLists[contactListIndex] != null) {
                                    contactLists[contactListIndex].close();
                                }
                            }
                        }
                    } catch (PIMException pimException) {
                    }
                } catch (SecurityException securityException) {
                }
            } catch (Exception ignore) {
            }

            contacts = null;
        }

        // Read contacts from contact lists

        boolean var34 = false;

        // For all contact lists

        for(int i = 0; i < contactLists.length; ++i) {
            ContactList contactList;
            if ((contactList = contactLists[i]) != null) {
                try {
                    try {
                        Enumeration contactListItems;
                        if (!(contactListItems = contactList.items()).hasMoreElements()) {
                            continue;
                        }

                        try {
                            while(true) {
                                if (this.lastContactIndex < 255) {
                                    if (this.lastContactIndex >= 254) {
                                        return contacts;
                                    }

                                    Contact contact = null;

                                    try {
                                        while((contact = (Contact)contactListItems.nextElement()).countValues(115) == 0) {
                                        }
                                    } catch (Exception ignore) {
                                    }

                                    if (contact == null) {
                                        if (this.lastContactIndex >= 254) {
                                            return contacts;
                                        }

                                        if (this.lastContactIndex < 255) {
                                            contacts[this.lastContactIndex] = "bad_end";
                                        }
                                    } else {
                                        int numItems = contact.countValues(115);
                                        if (this.lastContactIndex >= 254) {
                                            return contacts;
                                        }

                                        // For all elements in contact list

                                        for(int item = 0; item < numItems && this.lastContactIndex < 255; ++item) {
                                            if (this.lastContactIndex >= 254) {
                                                return contacts;
                                            }

                                            try {
                                                this.phones[this.lastContactIndex] = contact.getString(115, item);
                                                contacts[this.lastContactIndex] = this.phones[this.lastContactIndex];
                                                this.names[this.lastContactIndex] = "";
                                                String name = null;

                                                // Look for a name in different PIM fields that can possibly contain it

                                                try {
                                                    try {
                                                        if (contactList.isSupportedField(105) && contact.countValues(105) != 0) {
                                                            name = contact.getString(105, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }

                                                    try {
                                                        if ((name == null || name.length() <= 0) && contactList.isSupportedField(106) && contact.countValues(106) != 0) {
                                                            name = contact.getString(106, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }

                                                    try {
                                                        if ((name == null || name.length() <= 0) && contactList.isSupportedField(107) && contact.countValues(107) != 0) {
                                                            name = contact.getString(107, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }

                                                    try {
                                                        if ((name == null || name.length() <= 0) && contactList.isSupportedField(0) && contact.countValues(0) != 0) {
                                                            name = contact.getString(0, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }

                                                    try {
                                                        if ((name == null || name.length() <= 0) && contactList.isSupportedField(1) && contact.countValues(1) != 0) {
                                                            name = contact.getString(1, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }

                                                    try {
                                                        if ((name == null || name.length() <= 0) && contactList.isSupportedField(2) && contact.countValues(2) != 0) {
                                                            name = contact.getString(2, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }

                                                    try {
                                                        if ((name == null || name.length() <= 0) && contactList.isSupportedField(2) && contact.countValues(2) != 0) {
                                                            name = contact.getString(2, 0);
                                                        }
                                                    } catch (Exception ignore) {
                                                    }
                                                } catch (UnsupportedFieldException fieldException) {
                                                }

                                                try {
                                                    if ((name == null || name.length() <= 0) && contactList.isSupportedField(116) && contact.countValues(116) != 0) {
                                                        name = contact.getString(116, 0);
                                                    }
                                                } catch (Exception ignore) {
                                                }

                                                // Set the default name if it has not been found

                                                if (name == null || name.length() <= 0) {
                                                    name = "Anonimus";
                                                }

                                                // Push contact name to lists

                                                if (name != null && name.length() > 0) {
                                                    this.names[this.lastContactIndex] = name;
                                                    contacts[this.lastContactIndex] = name + ": " + contacts[this.lastContactIndex];
                                                }

                                                ++this.lastContactIndex;
                                                if (this.lastContactIndex >= 254) {
                                                    return contacts;
                                                }
                                            } catch (Exception ignore) {
                                            }

                                            if (this.lastContactIndex >= 254) {
                                                return contacts;
                                            }
                                        }

                                        // End for

                                        if (this.lastContactIndex < contacts.length) {
                                            if (this.lastContactIndex >= 254) {
                                                return contacts;
                                            }
                                            continue;
                                        }
                                    }
                                }

                                if (this.lastContactIndex >= 254) {
                                    return contacts;
                                }
                                break;
                            }
                        } catch (Exception e) {
                            contacts = null;
                        }
                    } catch (PIMException pimException) {
                        contacts = null;
                    }
                } catch (SecurityException securityException) {
                    contacts = null;
                }

                if (this.lastContactIndex >= 254) {
                    break;
                }
            }
        }

        return contacts;
    }
}
