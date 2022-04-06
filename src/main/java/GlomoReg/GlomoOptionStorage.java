//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;

public class GlomoOptionStorage {
    public final Hashtable options = new Hashtable(12);
    protected MIDlet appHandler;

    public GlomoOptionStorage() {
    }

    public final String getOption(String opt) {
        return (String)this.options.get(opt);
    }

    public final String putOption(String opt, String value) {
        this.options.put(opt, value);
        return value;
    }

    public final int getOptionInt(String option) {
        option = this.getOption(option);

        try {
            return option == "" ? 0 : Integer.parseInt(option);
        } catch (Exception e) {
            return 0;
        }
    }

    public final void setMidletHandler(MIDlet midletApp) {
        this.appHandler = midletApp;
    }

    public final String getMidletProperty(String property) {
        return GlomoConfigLoader.getMidletPropertySafe(this.appHandler, property);
    }

    public final void putOptions(String[] opts, String[] values) {
        for(int i = 0; i < values.length && i < opts.length; ++i) {
            if (opts[i].compareTo("") != 0) {
                this.putOption(opts[i], values[i]);
            }
        }

    }
}
