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

// Contacts manager
public final class g {
    int a6 = 0;
    String[] b6;
    String[] c6;

    public g(h var1) {
    }

    public final String[] a() {
        this.a6 = 0;
        String[] var2 = null;
        this.c6 = new String[255];
        this.b6 = new String[255];
        var2 = new String[255];
        ContactList[] var3 = null;
        boolean var4 = true;

        int var5;
        try {
            try {
                try {
                    var3 = new ContactList[1];

                    for(var5 = 0; var5 < var3.length; ++var5) {
                        var3[var5] = (ContactList)PIM.getInstance().openPIMList(1, 1);
                        var4 = false;
                    }

                    var4 = false;
                } catch (PIMException var31) {
                }
            } catch (SecurityException var32) {
            }
        } catch (Exception var33) {
        }

        if (var4) {
            try {
                try {
                    try {
                        if (var3 != null) {
                            for(var5 = 0; var5 < var3.length; ++var5) {
                                if (var3[var5] != null) {
                                    var3[var5].close();
                                }
                            }
                        }
                    } catch (PIMException var28) {
                    }
                } catch (SecurityException var29) {
                }
            } catch (Exception var30) {
            }

            var2 = null;
        }

        boolean var34 = false;

        for(int var6 = 0; var6 < var3.length; ++var6) {
            ContactList var7;
            if ((var7 = var3[var6]) != null) {
                try {
                    try {
                        Enumeration var8;
                        if (!(var8 = var7.items()).hasMoreElements()) {
                            continue;
                        }

                        try {
                            while(true) {
                                if (this.a6 < 255) {
                                    if (this.a6 >= 254) {
                                        return var2;
                                    }

                                    Contact var9 = null;

                                    try {
                                        while((var9 = (Contact)var8.nextElement()).countValues(115) == 0) {
                                        }
                                    } catch (Exception var24) {
                                    }

                                    if (var9 == null) {
                                        if (this.a6 >= 254) {
                                            return var2;
                                        }

                                        if (this.a6 < 255) {
                                            var2[this.a6] = "bad_end";
                                        }
                                    } else {
                                        int var10 = var9.countValues(115);
                                        if (this.a6 >= 254) {
                                            return var2;
                                        }

                                        for(int var11 = 0; var11 < var10 && this.a6 < 255; ++var11) {
                                            if (this.a6 >= 254) {
                                                return var2;
                                            }

                                            try {
                                                this.c6[this.a6] = var9.getString(115, var11);
                                                var2[this.a6] = this.c6[this.a6];
                                                this.b6[this.a6] = "";
                                                String var12 = null;

                                                try {
                                                    try {
                                                        if (var7.isSupportedField(105) && var9.countValues(105) != 0) {
                                                            var12 = var9.getString(105, 0);
                                                        }
                                                    } catch (Exception var14) {
                                                    }

                                                    try {
                                                        if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(106) && var9.countValues(106) != 0) {
                                                            var12 = var9.getString(106, 0);
                                                        }
                                                    } catch (Exception var21) {
                                                    }

                                                    try {
                                                        if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(107) && var9.countValues(107) != 0) {
                                                            var12 = var9.getString(107, 0);
                                                        }
                                                    } catch (Exception var20) {
                                                    }

                                                    try {
                                                        if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(0) && var9.countValues(0) != 0) {
                                                            var12 = var9.getString(0, 0);
                                                        }
                                                    } catch (Exception var19) {
                                                    }

                                                    try {
                                                        if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(1) && var9.countValues(1) != 0) {
                                                            var12 = var9.getString(1, 0);
                                                        }
                                                    } catch (Exception var18) {
                                                    }

                                                    try {
                                                        if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(2) && var9.countValues(2) != 0) {
                                                            var12 = var9.getString(2, 0);
                                                        }
                                                    } catch (Exception var17) {
                                                    }

                                                    try {
                                                        if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(2) && var9.countValues(2) != 0) {
                                                            var12 = var9.getString(2, 0);
                                                        }
                                                    } catch (Exception var16) {
                                                    }
                                                } catch (UnsupportedFieldException var22) {
                                                }

                                                try {
                                                    if ((var12 == null || var12.length() <= 0) && var7.isSupportedField(116) && var9.countValues(116) != 0) {
                                                        var12 = var9.getString(116, 0);
                                                    }
                                                } catch (Exception var15) {
                                                }

                                                if (var12 == null || var12.length() <= 0) {
                                                    var12 = "Anonimus";
                                                }

                                                if (var12 != null && var12.length() > 0) {
                                                    this.b6[this.a6] = var12;
                                                    var2[this.a6] = var12 + ": " + var2[this.a6];
                                                }

                                                ++this.a6;
                                                if (this.a6 >= 254) {
                                                    return var2;
                                                }
                                            } catch (Exception var23) {
                                            }

                                            if (this.a6 >= 254) {
                                                return var2;
                                            }
                                        }

                                        if (this.a6 < var2.length) {
                                            if (this.a6 >= 254) {
                                                return var2;
                                            }
                                            continue;
                                        }
                                    }
                                }

                                if (this.a6 >= 254) {
                                    return var2;
                                }
                                break;
                            }
                        } catch (Exception var25) {
                            var2 = null;
                        }
                    } catch (PIMException var26) {
                        var2 = null;
                    }
                } catch (SecurityException var27) {
                    var2 = null;
                }

                if (this.a6 >= 254) {
                    break;
                }
            }
        }

        return var2;
    }
}
