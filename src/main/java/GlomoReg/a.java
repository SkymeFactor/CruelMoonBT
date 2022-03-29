//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;

public class a {
    public final Hashtable a = new Hashtable(12);
    protected MIDlet b;

    public a() {
    }

    public final String a(String var1) {
        return (String)this.a.get(var1);
    }

    public final String a(String var1, String var2) {
        this.a.put(var1, var2);
        return var2;
    }

    public final int b(String var1) {
        var1 = this.a(var1);

        try {
            return var1 == "" ? 0 : Integer.parseInt(var1);
        } catch (Exception var2) {
            return 0;
        }
    }

    public final void a(MIDlet var1) {
        this.b = var1;
    }

    public final String c(String var1) {
        return c.b(this.b, var1);
    }

    public final void a(String[] var1, String[] var2) {
        for(int var3 = 0; var3 < var2.length && var3 < var1.length; ++var3) {
            if (var1[var3].compareTo("") != 0) {
                this.a(var1[var3], var2[var3]);
            }
        }

    }
}
