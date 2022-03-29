//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class m implements Runnable {
    static int a = -1;
    static int b = -1;
    static boolean c = false;
    static boolean d = true;
    static int e = -1;
    static String f = "v";
    static int[] g;
    static int h = 8;
    static boolean i = false;
    static boolean j = false;
    static int k = 6;
    static Random l = new Random();
    static String[] m = null;
    static String[] n;
    static String o = "/mm";
    static int p = 1;
    static int q = 3;
    static int r = 100;
    static boolean s = false;
    static int[] t = new int[]{778922340};
    static Player[] u;
    static int v = -1;
    static boolean w = true;
    static boolean x = true;
    static m y;
    static boolean z = false;
    static int A = -1;
    static int B = -1;
    static int[] C = null;
    static int D = -1;
    static String E = "";
    static String F = "";
    static boolean G = true;
    static boolean H = true;
    static Thread I;
    static long J = 0L;
    static int K = 60;
    static boolean L = false;

    public m() {
        if (i) {
            k.bI = k;
        }

    }

    private m(k var1) {
        if (i) {
            k.bI = k;
        }

    }

    private static boolean a(String var0, String var1) {
        if (var0 != null && var1 != null) {
            if (var0.length() != var1.length()) {
                return false;
            } else {
                for(int var2 = 0; var2 < var0.length(); ++var2) {
                    if (var0.charAt(var2) != var1.charAt(var2)) {
                        return false;
                    }
                }

                return true;
            }
        } else {
            return var0 == null && var1 == null;
        }
    }

    private static void a(String var0, int var1) {
        if (E != null && var1 != k.bI) {
            var0 = new String(E + var0);
        }

        var0 = a(var0);
        u[var1] = null;
        InputStream var2 = null;

        try {
            var0 = var0.substring(0, var0.length() - 4) + ".mp3";
        } catch (Exception var15) {
        }

        try {
            try {
                if (c(var0) > 0) {
                    var2 = y.getClass().getResourceAsStream(var0);
                }
            } catch (Exception var13) {
            }

            try {
                if (var2 == null && !var0.endsWith(".mp3") && c(var0 = var0.substring(0, var0.length() - 4) + ".mp3") > 0) {
                    var2 = y.getClass().getResourceAsStream(var0);
                }
            } catch (Exception var12) {
            }

            try {
                if (var2 == null && !var0.endsWith(".wav") && c(var0 = var0.substring(0, var0.length() - 4) + ".wav") > 0) {
                    var2 = y.getClass().getResourceAsStream(var0);
                }
            } catch (Exception var11) {
            }

            try {
                if (var2 == null && !var0.endsWith(".amr") && c(var0 = var0.substring(0, var0.length() - 4) + ".amr") > 0) {
                    var2 = y.getClass().getResourceAsStream(var0);
                }
            } catch (Exception var10) {
            }
        } catch (OutOfMemoryError var14) {
        }

        boolean var3 = true;
        int var4 = 0;

        do {
            ++var4;

            try {
                try {
                    if (var2 == null && !var0.endsWith(".mid")) {
                        var3 = false;
                        if (c(var0 = var0.substring(0, var0.length() - 4) + ".mid") > 0) {
                            var2 = y.getClass().getResourceAsStream(var0);
                        }
                    }
                } catch (Exception var8) {
                }

                try {
                    String var5 = "audio/midi";
                    if (var0.endsWith(".amr")) {
                        var5 = "audio/amr";
                    }

                    if (var0.endsWith(".wav")) {
                        if (L) {
                            var5 = "audio/x-wav";
                        } else {
                            var5 = "audio/wav";
                        }
                    }

                    if (var0.endsWith(".mp3")) {
                        var5 = "audio/mpeg";
                    }

                    Player var6 = Manager.createPlayer(var2, var5);
                    if (u[var1] != null) {
                        f(var1);
                    }

                    u[var1] = var6;
                    n[var1] = var0;
                    u[var1].realize();
                    if (!j) {
                        u[var1].prefetch();
                    }

                    var3 = false;
                } catch (Exception var7) {
                    var2 = null;
                }
            } catch (OutOfMemoryError var9) {
            }
        } while(var3 && var4 <= 3);

    }

    private static void a(int var0, int var1) {
        if (!z) {
            a();
        }

        if (i) {
            k.bI = k;
        }

        if (u == null) {
            u = new Player[k.bI + 1];
        }

        if (u[var0] == null || u[var0].getState() == 0) {
            String var2 = "/" + var0 + ".mp3";
            if (var0 == k.bI) {
                var2 = "/mm.mid";
            }

            if (m != null && var0 < m.length) {
                var2 = new String(m[var0]);
            }

            int var3;
            if (H && (var3 = b(b(var2) + f, var0)) > 0) {
                while(var1 >= var3) {
                    var1 -= var3;
                }

                var2 = a(b(var2) + f + var1);
            }

            a(var2, var0);
        }
    }

    private static void d(int var0) {
        int var1 = Math.abs(l.nextInt() % h);
        a(var0, var1);
    }

    public static void a() {
        z = true;
        if (y == null) {
            a(NET_Lizard.c);
        }

        if (y == null) {
            h();
        }

        j();
        if (u == null) {
            f();
        }

        if (x) {
            d = true;
            if (I == null) {
                I = new Thread(y);
                I.start();
            }

            if (I.getPriority() != 1) {
                I.setPriority(1);
            }
        }

    }

    private static void f() {
        if (u == null) {
            u = new Player[k.bI + 1];
        }

        if (n == null) {
            n = new String[k.bI + 1];
        }

        for(int var0 = 0; var0 < u.length; ++var0) {
            if ((m == null || var0 < m.length || var0 >= k.bI) && u[var0] == null) {
                d(var0);
            }
        }

        F = E;
    }

    private static int b(String var0, int var1) {
        var0 = b(var0);
        if (g == null) {
            g = new int[k.bI + 1];

            for(int var2 = 0; var2 < g.length; ++var2) {
                g[var2] = -1;
            }
        }

        return g[var1] = c(var0, g[var1]);
    }

    private static String a(String var0) {
        try {
            if (var0.length() > 0) {
                if (var0.charAt(0) != '/') {
                    var0 = new String('/' + var0);
                }
            } else {
                var0 = new String('/' + var0);
            }

            boolean var3 = true;

            for(int var4 = 0; var4 < var0.length(); ++var4) {
                if (var0.charAt(var4) == '.') {
                    var3 = false;
                }
            }

            if (var3) {
                var0 = var0 + a(t);
            }
        } catch (Exception var5) {
        }

        return var0;
    }

    private static String b(String var0) {
        try {
            boolean var2 = true;
            int var3 = 0;

            for(int var4 = 0; var4 < var0.length(); ++var4) {
                if (var0.charAt(var4) == '.') {
                    var2 = false;
                    var3 = var4;
                }
            }

            if (!var2) {
                var0 = var0.substring(0, var3);
            }
        } catch (Exception var5) {
        }

        return var0;
    }

    private static int c(String var0) {
        var0 = a(var0);
        int var1 = 0;
        int var2 = -1;

        try {
            InputStream var3;
            if ((var3 = y.getClass().getResourceAsStream(var0)) == null) {
                return -1;
            }

            while(var1 != -1) {
                var1 = var3.read();
                ++var2;
            }

            var3.close();
        } catch (Exception var4) {
            var2 = -1;
        }

        return var2;
    }

    private static String a(int[] var0) {
        String var1 = new String();

        for(int var5 = 0; var5 < var0.length; ++var5) {
            long var3;
            if ((var3 = (long)var0[var5]) < 0L) {
                var3 += 4294967296L;
            }

            var1 = var1 + (char)((int)((var3 & 4278190080L) >> 24));
            byte var2;
            if ((var2 = (byte)((int)((var3 & 16711680L) >> 16))) == 0) {
                break;
            }

            var1 = var1 + (char)var2;
            if ((var2 = (byte)((int)((var3 & 65280L) >> 8))) == 0) {
                break;
            }

            var1 = var1 + (char)var2;
            if ((var2 = (byte)((int)(var3 & 255L))) == 0) {
                break;
            }

            var1 = var1 + (char)var2;
        }

        return var1;
    }

    private static final int g() {
        e = c(o, e);
        return e;
    }

    private static int c(String var0, int var1) {
        var0 = b(var0);
        if (var1 < 0) {
            for(var1 = 0; f.n.d(var0 + var1 + ".mid") > 0 || f.n.d(var0 + var1 + ".amr") > 0 || f.n.d(var0 + var1 + ".mp3") > 0 || f.n.d(var0 + var1 + ".wav") > 0; ++var1) {
            }
        }

        return var1;
    }

    static final String a(int var0) {
        if (u == null) {
            a();
        }

        g();
        if (var0 < 0) {
            var0 = 0;
        }

        d();
        int var1 = k.bI;
        if (e > 0) {
            while(var0 >= e) {
                var0 -= e;
            }

            f(var1);
            a(o + var0 + ".mid", var1);
            v = var1;
        }

        e(k.bI);
        return n[var1];
    }

    public final void run() {
        if (u == null) {
            f();
        }

        int var1 = -1;

        while(d) {
            if (B >= 0 && var1 >= 0 && var1 != B && !i()) {
                a(B, false);
                D = var1 = B;
            }

            if (j && c && B < 0 && var1 >= 0 && !i()) {
                g(var1);
                var1 = -1;
            }

            try {
                Thread.sleep(3L);
            } catch (Exception var4) {
            }

            if (A >= 0) {
                e(A);
                var1 = A;
                A = -1;
            }

            try {
                Thread.sleep(17L);
            } catch (Exception var3) {
            }
        }

    }

    public static final void b() {
        if (i()) {
            try {
                ((VolumeControl)u[D].getControl("VolumeControl")).setLevel(K);
                return;
            } catch (Exception var1) {
            }
        }

    }

    public static final String b(int var0) {
        if (!z) {
            a();
        }

        if (u == null) {
            a();
        }

        if (var0 == v) {
            f(var0);
            d(var0);
            v = -1;
        }

        if (x) {
            A = var0;
        } else {
            e(var0);
        }

        return n[var0];
    }

    private static final void e(int var0) {
        if (!z) {
            a();
        }

        if (u == null) {
            a();
        }

        a(var0, true);
    }

    private static void f(int var0) {
        try {
            if (u[var0].getState() == 400) {
                u[var0].stop();
            }

            u[var0].close();
        } catch (Exception var2) {
        }

        u[var0] = null;
    }

    public static void c() {
        A = -1;
        B = -1;
        if (x) {
            d = false;

            try {
                Thread.sleep(33L);
            } catch (Exception var1) {
            }

            I = null;
        }

        if (u != null) {
            try {
                for(int var0 = 0; var0 < u.length; ++var0) {
                    f(var0);
                }
            } catch (Exception var2) {
            }
        }

        u = null;
    }

    private static void g(int var0) {
        try {
            if (u[var0] != null && u[var0].getState() == 300) {
                u[var0].deallocate();
            }

        } catch (Exception var2) {
        }
    }

    private static void h(int var0) {
        try {
            if (u[var0] == null) {
                d(var0);
            }

            if (u[var0] != null) {
                if (u[var0].getState() == 0) {
                    d(var0);
                }

                if (u[var0].getState() == 100) {
                    u[var0].realize();
                }

                if (u[var0].getState() == 200) {
                    u[var0].prefetch();
                }
            }

        } catch (Exception var2) {
        }
    }

    private static final void a(int var0, boolean var1) {
        if (!z) {
            a();
        }

        int var2;
        if (!a(E, F)) {
            try {
                d();

                for(var2 = 0; var2 < k.bI; ++var2) {
                    f(var2);
                }

                f();
            } catch (Exception var8) {
            }

            F = E;
        }

        if (!s && !G || !i() || var0 != D) {
            if (w && i() && var0 < D && D != k.bI) {
                boolean var9 = true;
                if (C != null) {
                    for(int var3 = 0; var3 < C.length; ++var3) {
                        if (C[var3] == D) {
                            var9 = false;
                        }
                    }
                }

                if (var9) {
                    return;
                }
            }

            d();
            if (j && var0 != D) {
                g(D);
            }

            h(var0);

            try {
                u[var0].setMediaTime(-1L);
            } catch (Exception var6) {
            }

            if (var1) {
                try {
                    var2 = 1;
                    if (var0 == k.bI) {
                        var2 = q;
                    }

                    if (var0 == a || var0 == v) {
                        var2 = r;
                    }

                    if (var0 == b) {
                        var2 = p;
                        b = -1;
                    }

                    u[var0].setLoopCount(var2);
                } catch (Exception var7) {
                }
            }

            try {
                ((VolumeControl)u[var0].getControl("VolumeControl")).setLevel(K);
            } catch (Exception var5) {
            }

            try {
                if (var1) {
                    u[var0].start();
                }

                D = var0;
            } catch (Exception var4) {
            }
        }
    }

    private static void h() {
        if (i) {
            k.bI = k;
        }

    }

    public static final void a(k var0) {
        y = new m(var0);
        if (i) {
            k.bI = k;
        }

    }

    private static boolean i() {
        try {
            return D >= 0 && u[D] != null && u[D].getState() == 400;
        } catch (Exception var1) {
            return false;
        }
    }

    private static void i(int var0) {
        if (var0 >= 0 && u[var0] != null) {
            try {
                if (u[var0].getState() == 400) {
                    u[var0].stop();
                    if (G) {
                        u[var0].close();
                    }
                }

                return;
            } catch (Exception var2) {
            }
        }

    }

    public static void d() {
        if (u != null) {
            try {
                for(int var0 = 0; var0 < u.length; ++var0) {
                    i(var0);
                }

                return;
            } catch (Exception var1) {
            }
        }

    }

    private static void j() {
        try {
            String[] var0 = Manager.getSupportedContentTypes((String)null);
            L = false;

            for(int var1 = 0; var1 < var0.length; ++var1) {
                if (var0[var1].equals("audio/x-wav")) {
                    L = true;
                    return;
                }
            }

        } catch (Exception var2) {
        }
    }

    public static void c(int var0) {
        long var1;
        if ((var1 = System.currentTimeMillis()) >= J) {
            try {
                Display.getDisplay(NET_Lizard.a).vibrate(var0);
            } catch (Exception var4) {
            }

            J = var1 + (long)var0 + 7L;
        }
    }

    public static void e() {
        c(110);
    }
}
