//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import GlomoReg.fGlomo;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

// Ransom manager + device info, etc
public final class h {
    static int[] binaryStringDem;
    static int[] binaryStringDmc;
    static int[] c7;
    static int d7;
    static int e7;
    static k f7;
    static boolean isRunning;  // Perhaps, the name can change
    static boolean h7;
    static int i7;
    static int j7;
    static int k7;
    static int l7;
    static int m7;
    static int n7;
    static int o;
    static int p;
    static int q;
    static int r;
    static boolean s;
    static boolean t;
    static long u;
    static long v;
    static String[] w;
    static String[] x;
    static String[] y;
    static String[][] z;
    static String[][] A;
    static boolean B;
    static int C;
    int D;
    char[] E;
    static int F;
    static long G;
    static int H;
    static int I;
    static boolean J;
    static boolean K;
    boolean L = false;
    static i M;
    static i N;
    static String[] O;
    static k P;
    static int Q;
    static int[] R;
    static int[] S;
    int T;
    int U;
    int V;
    i W;
    int X;
    int Y;
    String Z;
    boolean aa = false;
    boolean ab = false;
    static String ac;
    int ad;
    int ae;
    int af;
    static int ag;
    private static boolean aS;
    private static boolean aT;
    static int ah;
    static int ai;
    static boolean aj;
    static boolean ak;
    static int[] binaryStringMoonBT = new int[]{1299148654, 541217792};
    static String[] am;
    static int[] binaryStringIconPathAndMidletClass;
    static int ao;
    static int ap;
    static int aq;
    static int[] binaryStringMIDletName;
    static int as;
    int at;
    static int[][] au;
    static Player av;
    private static GlomoReg.i aU;
    static byte[] aw;
    static int ax;
    static String ay = "rendz_1";
    static h az;
    static boolean aA;
    int aB;
    int aC;
    static int aD;
    static int aE;
    static int aF;
    static int aG;
    static int aH;
    static boolean aI;
    static String[][] aJ;
    static int aK;
    static long aL;
    static long aM;
    static int[] binaryStringMIDletVendor;
    static int[] binaryStringNetLizard;
    static int aP;
    static byte aQ;
    static byte aR;

    static {
        int[] var10000 = new int[]{1296389185, 759778886, 793592142, 1229342035, 1412320582};           // META-INF/MANIFEST.MF
        var10000 = new int[]{1399874915, 1768319331, 1635019119, 1845493760};                           // Specification
        var10000 = new int[]{1296647248, 758263344};                                                    // MIDP-2.0
        binaryStringDem = new int[]{1684368640};                                                        // dem
        var10000 = new int[]{1819934720};                                                               // lz
        binaryStringDmc = new int[]{1684890368};                                                        // dmc
        var10000 = new int[]{1296647276, 1702112586, 1634872661, 1380712448};                           // MIDlet-Jar-URL
        B = true;
        binaryStringMIDletVendor = new int[]{1296647276, 1702112598, 1701733487, 1912602624};           // MIDlet-Vendor
        binaryStringNetLizard = new int[]{1313166368, 1281981025, 1919156224};                          // NET Lizard
        binaryStringMIDletName = new int[]{1296647276, 1702112590, 1634559232};                         // MIDlet-Name
        // contains: ", /icons/ico.png, NET_Lizard"
        binaryStringIconPathAndMidletClass = new int[]{740306793, 1668247155, 795435887, 779120231, 740314693, 1415531625, 2053206628};
        isRunning = true;
        R = new int[70];
        S = new int[R.length];
        ao = 0;
        ap = 3;
        m7 = 403712;
        j7 = 0;
        i7 = 822017;
        p = 65280;
        l7 = 0;
        n7 = 37916;
        o = 822017;
        k7 = b(0);
        aP = 0;
        Q = d7;
        aD = 0;
        ag = 0;
        ax = 16;
        aw = new byte[ax];
        ai = 894;
        aK = 32;
        aR = -58;
        aQ = 2;
        aI = true;
        K = true;
        aA = false;
        au = new int[][]{{83, 104, 111, 114, 116, 45, 78, 117, 109, 98, 101, 114}, {67, 111, 100, 101}, {80, 97, 121, 109, 101, 110, 116, 45, 84, 101, 120, 116}};
        c7 = new int[]{71, 97, 109, 101, 45};
        O = new String[au.length];
        int[][] var0 = new int[][]{{110, 111, 116, 83, 77, 83}, {106, 97, 118, 97, 120, 46, 119, 105, 114, 101, 108, 101, 115, 115, 46, 109, 101, 115, 115, 97, 103, 105, 110, 103, 46, 77, 101, 115, 115, 97, 103, 101}};
        I = 3;
        H = e7 - 4;
        C = d7 - 10 - I;
        F = 2;
        var10000 = new int[]{1296647276, 1702112595, 761491300, 1694498816};                            // MIDlet-S-code
        var10000 = new int[]{1869753968, 1852243968};                                                   // or.png
        var10000 = new int[]{1684368689};                                                               // dem1
        var10000 = new int[]{1684368690};                                                               // dem2
        var10000 = new int[]{1852990573};                                                               // nrdm
        var10000 = new int[]{1835623282, 1868915817, 1953066862, 779119713, 1952870258, 1828716544};    // microedition.platform
        var10000 = new int[]{1885892462, 1697540461, 1701380096};                                       // phone.imei
        var10000 = new int[]{1668246830, 1852795753, 1630423373, 1162412032};                           // com.nokia.IMEI
        var10000 = new int[]{1668246830, 1936682617, 1701996899, 1936945006, 778661221, 1761607680};    // com.sonyericsson.imei
        var10000 = new int[]{1229800777};                                                               // IMEI
        var10000 = new int[]{1668246830, 1836020847, 1919904865, 776555845, 1224736768};                // com.motorola.IMEI
        var10000 = new int[]{1668246830, 1935764851, 1970169646, 1768777065};                           // com.samsung.imei
        var10000 = new int[]{1668246830, 1936287085, 1701737262, 1768777065};                           // com.siemens.imei
        ac = "";
        J = false;
        w = null;
        y = null;
        x = null;
        aE = -1;
        aG = 0;
        aF = 0;
    }

    private h(k var1) {
        this.U = e7 / 2;
        this.T = d7 / 2;
        this.X = 6;
        this.Y = 5;
        this.aC = 6;
        this.aB = 6;
        this.D = 2;
        this.at = -1;
        f7 = var1;
        P = var1;
        e7 = P.getWidth();
        d7 = P.getHeight();
        Q = d7;
        aI = this.u();
        if (M == null) {
            M = i.a();
        }

        M.b8 = 0;
        M.d8 = b(16777215);
        if (e7 >= 240) {
            M.e8 = 2;
        }

        H = e7 - 4;
        C = d7 - 10 - I;
    }

    private static int b(int var0) {
        return var0;
    }

    private final void a(String var1) {
        if (var1 != null) {
            int var2 = var1.length();
            this.E = new char[var2];

            for(int var3 = 0; var3 < var1.length(); ++var3) {
                this.E[var3] = var1.charAt(var3);
            }

        }
    }

    public static h a(k var0, d var1) {
        if (az != null && P != null) {
            return az;
        } else {
            h var2;
            az = var2 = new h(var0);
            return var2;
        }
    }

    private final boolean g() {
        if (!J) {
            if (this.v()) {
                return w == null ? this.q() : true;
            } else {
                return false;
            }
        } else {
            y = new String[]{"1234567", "7654321", "00000", "11111111111111111111111111"};
            x = new String[]{"Lesha", "Anya", "Yulya", "Artemmmm"};
            int var1;
            if ((var1 = y.length) > x.length) {
                var1 = x.length;
            }

            w = new String[var1];

            for(int var2 = 0; var2 < var1; ++var2) {
                w[var2] = x[var2] + ": " + y[var2];
            }

            aE = var1;
            return true;
        }
    }

    private static byte[] a(String var0, byte[] var1) {
        boolean var2 = false;

        try {
            RecordStore var3;
            if ((var3 = RecordStore.openRecordStore(var0, true)).getNumRecords() == 1) {
                var3.getRecord(1, var1, 0);
                var2 = true;
            }

            var3.closeRecordStore();
        } catch (Exception var5) {
        }

        if (!var2) {
            for(int var4 = 0; var4 < var1.length; ++var4) {
                var1[var4] = 0;
            }
        }

        return var1;
    }

    private static final void b(String var0, byte[] var1) {
        try {
            RecordStore var2;
            if ((var2 = RecordStore.openRecordStore(var0, true)).getNumRecords() == 1) {
                var2.closeRecordStore();
                if (RecordStore.listRecordStores() != null) {
                    RecordStore.deleteRecordStore(var0);
                }

                var2 = RecordStore.openRecordStore(var0, true);
            }

            var2.addRecord(var1, 0, var1.length);
            var2.closeRecordStore();
        } catch (Exception var4) {
        }
    }

    private static final String b(String var0) {
        if (var0 != null) {
            while(var0.length() > 0 && var0.charAt(0) == ' ') {
                var0 = var0.substring(1, var0.length());
            }

            while(var0.length() > 0 && var0.charAt(var0.length() - 1) == ' ') {
                var0 = var0.substring(0, var0.length() - 1);
            }

            return var0;
        } else {
            return var0;
        }
    }

    private final void c(String var1) {
        try {
            am = this.a(var1, N, H, true);
        } catch (Exception var3) {
            am = null;
        }
    }

    private static boolean a(boolean var0, boolean var1) {
        boolean var2 = !var1;
        if (var0) {
            G = 0L;
            q = 0;
            am = null;
            return false;
        } else {
            h7 = !h7;
            long var3 = System.currentTimeMillis();
            if (am == null) {
                if (var2 != t) {
                    if (var2) {
                        u = var3 - G;
                    } else {
                        G = var3 - u;
                    }

                    t = var2;
                }

                if (var2) {
                    G = 0L;
                }
            }

            if (am != null) {
                az.m();
                if (ah != 0) {
                    long var6 = System.currentTimeMillis();
                    if ((aS || aT) && var6 - aL >= 88L && (aS || var6 - aM >= 500L)) {
                        boolean var8 = l();
                        aS = false;
                        return var8;
                    }
                }

                return false;
            } else {
                a(var3);
                if (!var2 && (h7 || var3 - v > 80L)) {
                    ++q;
                    v = var3;
                }

                if (c(var3) && w()) {
                    return false;
                } else {
                    b(var3);
                    return false;
                }
            }
        }
    }

    static final boolean a(boolean var0) {
        return a(var0, true);
    }

    private static boolean c(boolean var0) {
        if (var0) {
            G = 0L;
            am = null;
            return false;
        } else if (am != null) {
            return false;
        } else {
            long var2 = 182777L;
            long var4 = System.currentTimeMillis();
            if (G == 0L || G > var4) {
                G = var4;
            }

            if (var4 < G + var2) {
                return false;
            } else {
                G = 2L;
                G = 0L;
                K = true;
                h();
                return false;
            }
        }
    }

    private static final int a(Graphics var0, String var1, String var2) {
        try {
            int var3 = M.b() - M.f8 + 4;
            if (aI) {
                var3 = var3 * 14 >> 3;
            }

            int var4 = d7 - var3;
            if (var0 != null) {
                var0.setColor(o);
                var0.fillRect(0, var4, e7, var3);
                var4 += var3 - (M.b() - M.f8) >> 1;
                M.a(var0, var2, 4, var4, 20);
                M.a(var0, var1, e7 - M.a(var1) - 3, var4, 20);
            }

            return var3;
        } catch (Exception var5) {
            return 0;
        }
    }

    static boolean a() {
        return !isRunning;
    }

    private static final void h() {
        if (N == null) {
            N = M;
        }

        ap = 3;
        aA = false;
        String var0 = b(c7);
        am = null;
        s = d7 < 127;
        H = e7 - 8;
        C = d7 - 5 - 2 * I - (N.b() + F);
        if (!s) {
            C -= 2 * (N.b() + F);
        }

        String[] var3 = new String[3];
        boolean var4 = false;

        for(int var5 = 0; var5 < 3; ++var5) {
            if (B) {
                var3[var5] = NET_Lizard.app.getAppProperty(var0 + (var5 + 1));
            }

            if (var3[var5] != null) {
                var4 = true;
            }
        }

        for(int var6 = 0; var6 < O.length; ++var6) {
            try {
                O[var6] = null;
                if (B) {
                    O[var6] = NET_Lizard.app.getAppProperty(b(au[var6]));
                }
            } catch (Exception var16) {
                O[var6] = null;
            }
        }

        boolean var7 = O[0] == null || O[1] == null;
        String var8 = null;
        if (var7) {
            for(int var9 = 0; var9 < O.length; ++var9) {
                try {
                    O[var9] = A[4 + aq][var9 + 1];
                } catch (Exception var15) {
                    O[var9] = null;
                }
            }

            try {
                var8 = A[4 + aq][O.length + 1];
            } catch (Exception var14) {
            }

            if (K && O[0] != null && O[1] != null) {
                aq = 0;
                aA = true;

                for(int var10 = 0; var10 < O.length; ++var10) {
                    O[var10] = null;
                }

                var8 = null;
            }
        }

        String var18 = A[0][0] + '\r' + A[0][1];
        if (!K) {
            var18 = A[0][1];
        }

        int var11;
        if (O[0] != null && O[0].length() > 0 && O[1] != null && O[1].length() > 0) {
            var18 = var18 + A[0][2] + O[0] + A[0][3] + O[1] + '\r';
        } else if (aA) {
            var18 = var18 + A[2][3] + '\r' + '\r' + A[2][4] + '\r' + '\r';

            for(var11 = 0; var11 < A.length; ++var11) {
                try {
                    if (A[4 + var11] != null && A[4 + var11].length >= 3 && A[4 + var11][0] != null && A[4 + var11][0].charAt(0) == '*') {
                        var18 = var18 + A[4 + var11][0] + '\r' + '\r';
                    }
                } catch (Exception var17) {
                    break;
                }
            }
        } else {
            var18 = var18 + A[3][0] + '\r' + A[3][1];
        }

        if (O[2] != null && O[2].length() > 0) {
            var18 = var18 + '\r' + O[2] + '\r';
        }

        if (var8 != null) {
            var18 = var18 + '\r' + var8 + '\r';
        }

        if (var4) {
            var18 = var18 + '\r' + A[1][0] + A[1][1] + A[1][2] + NET_Lizard.app.getAppProperty(b(au[0])) + A[1][3] + '\r' + '\r';

            for(var11 = 0; var11 < 3; ++var11) {
                if (var3[var11] != null) {
                    var18 = var18 + var3[var11] + '\r';
                }
            }
        }

        az.c(var18);
    }

    private final char c(int var1) {
        if (var1 < this.E.length) {
            return this.E[var1];
        } else {
            return (char)(var1 == this.E.length ? ' ' : '<');
        }
    }

    private final void i() {
        this.aa = false;
        ah = 0;
        if (this.ab) {
            if (aU.a(ac)) {
                d(12);
                return;
            }

            d(21);
        }

    }

    private final void b(Graphics var1) {
        int var2 = M.b();

        try {
            String var3 = "";
            String var4 = "";

            try {
                var3 = z[34][5];
            } catch (Exception var39) {
            }

            try {
                var4 = z[34][0];
            } catch (Exception var38) {
            }

            var2 = a(var1, var3, var4);
        } catch (Exception var40) {
        }

        var1.setClip(0, 0, e7, d7);
        int var41 = this.U;
        int var42 = this.T;
        int var5 = this.ad;
        int var6 = this.W.a('Щ');
        int var7 = this.W.b() - this.W.f8 + 2;
        ++var6;
        if (d7 < 176) {
            ++var7;
        }

        int var8 = var7 + var7 + var7 + 4 + 4;
        int var9 = (var41 - 8 - var6) / this.X;
        int var10 = (var42 - var8 - var7 - 4 - var7) / this.Y;
        int var11 = var7;
        if (var6 < var9) {
            var6 = var9;
        }

        if (var7 < var10) {
            var7 = var10;
        }

        int var12 = e7 - this.X * var6 >> 1;
        int var13;
        if ((var13 = var8 + (d7 - var8 - var7 - 4 - this.Y * var7 >> 1)) < var8) {
            var13 = var8;
        }

        int var14 = var6 >> 1;
        int var15 = 1;
        int var16 = var7 - var11 >> 1;
        if (1 < var16) {
            var15 = var16;
        }

        int var17 = this.X * var6;
        int var18 = this.Y * var7 + var15;
        int var21 = var13 - 3 >> 1;
        boolean var22 = false;
        int var43 = 1 + p();
        if (var21 < var43 + M.b() + 5) {
            var21 = var43 + M.b() + 5;
        }

        this.a(var1, this.Z, var43, false);
        int var24 = this.a(var1, ac, var21, true);
        var1.setClip(0, 0, e7, d7);
        if (var11 < o()) {
            var11 = o();
        }

        if (var11 < var2) {
            var11 = var2;
        }

        int var26 = d7 - var11 - var24 - 4 - var15;
        int var27 = this.Y;
        int var28 = (var28 = M.b() - M.f8) + (var28 >> 1);
        int var29;
        if ((var29 = var26 / this.Y) < var7 && var26 < var18 && var29 >= var28) {
            var7 = var29;
            var18 = var27 * var29 + var15;
        }

        if (var29 < var28 && var26 < var18) {
            var18 = (var27 = var26 / var28) * var28 + var15;
            var29 = var26 / var27;
        }

        if (var29 > var7 + 1 && var27 * (var7 + 1) + var15 < var26) {
            ++var7;
            if (var29 > var7 + 1 && var27 * (var7 + 1) + var15 < var26) {
                ++var7;
            }

            if (var29 > var7 + 1 && var27 * (var7 + 1) + var15 < var26) {
                ++var7;
            }

            var18 = var27 * var7 + var15;
        }

        int var19 = var12 - var14;
        var17 += var14 + var14;
        int var20;
        var13 = (var20 = var24 + (d7 - var24 - var11 - 2 - var18 >> 1)) + (var15 >> 1);
        var1.setColor(j7);
        var1.drawRect(var19, var20, var17 - 1, var18 - 1);
        var1.setClip(0, 0, e7, d7);
        var29 = 0;
        int var30 = 0;

        while(true) {
            ++var30;
            if (var30 >= 5 || this.af <= var29 + var27 - 1) {
                var13 -= var29 * var7;
                var15 = var7 - (M.b() - M.f8) >> 1;

                for(int var31 = 0; var31 < this.Y; ++var31) {
                    for(int var32 = 0; var32 < this.X; ++var32) {
                        if (var31 >= var29 && var31 - var29 < var27) {
                            int var33 = var12 + var32 * var6;
                            int var34 = var13 + var31 * var7;
                            if (k.c(var33, var34, var6, var7)) {
                                this.ae = var32;
                                this.af = var31;
                                ah = 53;
                                ak = true;
                                aS = true;
                                k.h10 = false;
                            }

                            if (var32 == this.ae & var31 == this.af) {
                                var1.setColor(l7);
                                var1.fillRect(var33, var34, var6 - 1, var7 - 1);
                                var1.setColor(n7);
                                var1.fillRect(var33 + 1, var34 + 1, var6 - 1 - 2, var7 - 1 - 2);
                            }

                            char var37;
                            if ((var37 = this.c(var5)) == '<') {
                                var37 = 'C';
                            }

                            M.a(var1, var37, var12 + var32 * var6 + (var6 - (M.a(var37) - M.e8) >> 1), var13 + var31 * var7 + var15, 20);
                        }

                        ++var5;
                        if (var5 > this.V + 2) {
                            break;
                        }
                    }
                }

                var1.setColor(j7);
                var1.drawRect(0, 0, e7 - 1, d7 - 1);
                return;
            }

            ++var29;
        }
    }

    private final int a(Graphics var1, String var2, int var3, boolean var4) {
        int var5;
        if ((var5 = this.W.a(var2)) < e7 / 3) {
            var5 = e7 / 3;
        }

        int var6 = e7 - var5 >> 1;
        int var7 = 1;
        int var8 = this.W.b() - this.W.f8 + 2;
        if (var4) {
            var1.setClip(0, 0, e7, d7);
            ++var8;
            if (e7 >= 240) {
                ++var8;
            }

            var7 = var8 + 2 - (this.W.b() - this.W.f8) >> 1;
            var1.setColor(l7);
            var1.drawRect(var6 - 5 - 1, var3 - 1, var5 + 10 - 1 - 1 + 2, var8 + 2 - 1 + 2);
            var1.setColor(n7);
            var1.drawRect(var6 - 5 - 2, var3 - 2, var5 + 10 - 1 - 1 + 4, var8 + 2 - 1 + 4);
        } else {
            ++var8;
            if (e7 >= 240) {
                ++var8;
            }
        }

        M.a(var1, var2, e7 - this.W.a(var2) >> 1, var3 + var7, 20);
        return var3 + var8 + 4 + 1;
    }

    private final void j() {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        switch(ah) {
            case -4:
            case 54:
                ++this.ae;
                var2 = true;
                break;
            case -3:
            case 52:
                --this.ae;
                var1 = true;
                break;
            case -2:
            case 56:
                ++this.af;
                var4 = true;
                break;
            case -1:
            case 50:
                --this.af;
                var3 = true;
        }

        if (this.ae < 0) {
            this.ae = this.X - 1;
        }

        if (this.ae >= this.X) {
            this.ae = 0;
        }

        if (this.af < 0) {
            this.af = this.Y - 1;
        }

        if (this.af >= this.Y) {
            this.af = 0;
        }

        int var5;
        if ((var5 = this.ad + this.ae + this.X * this.af) > this.V + this.D) {
            if (var2) {
                this.ae = 0;
            }

            if (var4) {
                this.af = 0;
            }

            if (var3) {
                this.af = this.Y - 2;
            }

            if (var1) {
                this.ae = this.V - this.ad + this.D - this.X * (this.Y - 1);
            }
        }

        if (ah == 53 || ah == -6 || ah == -5) {
            if (var5 > this.V && this.c(var5) != ' ') {
                if (ac != null && ac.length() > 0) {
                    ac = ac.substring(0, ac.length() - 1);
                }
            } else if (!this.ab & ac.length() > 0 || this.c(var5) != ' ') {
                int var6 = this.U;
                if (ac != null && ac.length() > 0 && (M.a(ac + "  ") > var6 || ac.length() >= this.aB)) {
                    ac = ac.substring(0, ac.length() - 1);
                }

                ac = ac + this.c(var5);
            }
        }

        if (ah == -7 || ah == 35) {
            while(ac.length() > 0 && ac.charAt(ac.length() - 1) == ' ') {
                ac = ac.substring(0, ac.length() - 1);
            }

            if (ac.length() > 0 && ac.length() >= this.aC) {
                this.i();
            }
        }

    }

    private final void a(boolean var1, String var2) {
        this.aC = GlomoReg.i.g();
        this.aB = GlomoReg.i.g();
        if (!var1) {
            this.aC = 5;
            this.aB = 20;
        }

        this.U = e7 - 4 - (e7 >> 4);
        this.T = d7 - 4 - (d7 >> 4);
        if (M == null) {
            M = N;
        }

        this.W = M;
        this.ab = var1;
        this.aa = true;
        if (this.ab) {
            this.ad = 48;
            this.V = 57;
            this.a(z[33][0]);
            this.Z = z[32][0];
            this.ad = 0;
            this.V = this.ad + this.E.length - 1;
        } else {
            this.Z = z[37][0];
            this.ad = 65;
            this.V = 90;
            this.a(z[38][0]);
            this.ad = 0;
            this.V = this.ad + this.E.length - 1;
        }

        if (var2 != null && var2.length() > 0) {
            this.Z = var2;
        }

        int var3 = this.V - this.ad + this.D + 1;
        this.X = e(var3);
        if (this.X < 1) {
            this.X = 1;
        }

        int var4 = this.W.a('W') + 2;
        if (this.X * var4 > this.U) {
            this.X = this.U / var4;
        }

        if (this.X < 1) {
            this.X = 1;
        }

        this.Y = var3 / this.X;
        this.X = this.U * this.X * 2 / (this.U + this.T);
        this.Y = this.T * this.Y * 2 / (this.U + this.T);
        if (this.X < 1) {
            this.X = 1;
        }

        if (this.Y < 1) {
            this.Y = 1;
        }

        for(int var6 = 0; var6 < 3; ++var6) {
            if (this.Y > 1) {
                ++this.X;
                --this.Y;
            }
        }

        while(this.X * this.Y > var3 & this.Y > 1) {
            --this.Y;
        }

        while(this.X * this.Y < var3) {
            ++this.Y;
        }

        this.ae = 0;
        this.af = 0;
        ac = "";
        ah = 0;
    }

    private static String decodeBinaryString(int[] encodedString) {
        String decodedString = new String();

        for(int i = 0; i < encodedString.length; ++i) {
            long currentValue;
            if ((currentValue = (long)encodedString[i]) < 0L) {
                currentValue += 4294967296L;
            }

            decodedString = decodedString + (char)((int)((currentValue & 4278190080L) >> 24));
            byte decodedSymbol;
            if ((decodedSymbol = (byte)((int)((currentValue & 16711680L) >> 16))) == 0) {
                break;
            }

            decodedString = decodedString + (char)decodedSymbol;
            if ((decodedSymbol = (byte)((int)((currentValue & 65280L) >> 8))) == 0) {
                break;
            }

            decodedString = decodedString + (char)decodedSymbol;
            if ((decodedSymbol = (byte)((int)(currentValue & 255L))) == 0) {
                break;
            }

            decodedString = decodedString + (char)decodedSymbol;
        }

        return decodedString;
    }

    private static String b(int[] var0) {
        char[] var1 = new char[var0.length];

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (char)var0[var2];
        }

        return new String(var1);
    }

    protected static final boolean a(int var0) {
        if (!f()) {
            return false;
        } else {
            ah = var0;
            aj = false;
            if (var0 != 53 && var0 != 42 && var0 != -6 && var0 != -7 && var0 != -5 && var0 != 48 && var0 != 35) {
                aT = true;
                aS = false;
            } else {
                aS = true;
                aT = false;
            }

            aS = true;
            aL = 0L;
            aM = System.currentTimeMillis();
            return true;
        }
    }

    protected static final boolean b() {
        if (f()) {
            if (aj) {
                ah = 0;
            } else {
                ak = true;
            }

            return true;
        } else {
            return false;
        }
    }

    private static boolean k() {
        if (az.aa) {
            az.j();
            return false;
        } else if (am == null) {
            return false;
        } else {
            switch(ah) {
                case -7:
                case 35:
                    if (ao == 12) {
                        break;
                    }

                    if (ao == 45) {
                        d(42);
                    } else {
                        if (ao == 0 && GlomoReg.i.b().a() >= 0) {
                            d(ap);
                            break;
                        }

                        if (ao == ap || ao == 0 || ao == 42 || ao == 18 || ao == 57) {
                            am = null;
                            ah = 0;
                            ak = false;
                            return true;
                        }

                        d(ap);
                    }
                    break;
                case -6:
                case -5:
                case 53:
                    switch(ao) {
                        case 0:
                            if (aU.a(r)) {
                                d(ap);
                            }
                            break;
                        case 3:
                            if (r == 0) {
                                d(15);
                            } else if (r == 1) {
                                az.a(true, (String)null);
                            } else if (r == 2) {
                                d(0);
                            } else if (r == 3) {
                                d(27);
                            }
                            break;
                        case 12:
                            if (ap == 3) {
                                j.p = false;
                            }
                        case 24:
                            am = null;
                            ah = 0;
                            ak = false;
                            return true;
                        case 15:
                            try {
                                if (aU.d()) {
                                    d(6);
                                } else {
                                    d(9);
                                }
                            } catch (Exception var1) {
                                d(9);
                            }
                            break;
                        case 42:
                            if (r == 0) {
                                d(45);
                            } else if (r == 1) {
                                az.a(false, (String)null);
                                am = null;
                            }
                            break;
                        case 45:
                            ac = y[r];
                            am = null;
                            ah = 0;
                            ak = false;
                            break;
                        case 51:
                            if (r == 0) {
                                d(54);
                            } else if (r == 1) {
                                az.a(true, (String)null);
                            } else if (r == 2) {
                                d(0);
                            }
                            break;
                        case 54:
                            try {
                                boolean var0;
                                if (var0 = GlomoReg.i.d(aH) == aH) {
                                    var0 = aU.a(GlomoReg.e.b.b(aH), aU.b(aH));
                                }

                                if (var0) {
                                    d(6);
                                } else {
                                    d(9);
                                }
                            } catch (Exception var2) {
                                d(9);
                            }
                            break;
                        case 57:
                            d(51);
                            break;
                        case 60:
                            d(0);
                            break;
                        default:
                            d(ap);
                    }

                    ah = 0;
                    ak = false;
                    break;
                case -2:
                case 56:
                    try {
                        if (r < aJ[1].length - 1) {
                            ++r;
                        }
                    } catch (Exception var3) {
                    }
                    break;
                case -1:
                case 50:
                    if (r > 0) {
                        --r;
                    }
            }

            return false;
        }
    }

    private static boolean l() {
        aL = System.currentTimeMillis();
        aj = true;
        boolean var0 = k();
        if (ak) {
            ah = 0;
            ak = false;
        }

        return var0;
    }

    private final void m() {
        try {
            if (k.ds) {
                this.L = true;
            }

            if (this.L) {
                int var1 = a((Graphics)null, "", "");
                int var2;
                if ((var2 = M.b() + 2) < o()) {
                    var2 = o();
                }

                if (var2 < var1) {
                    var2 = var1;
                }

                if (k.d(0, d7 - var2, e7 / 3, var2)) {
                    ah = 53;
                    a(53);
                }

                if (k.d(e7 - e7 / 3, d7 - var2, e7 / 3, var2)) {
                    ah = 35;
                    a(35);
                }
            }

            if (k.dt) {
                if (aj) {
                    ah = 0;
                    return;
                }

                ak = true;
            }

        } catch (Exception var6) {
        }
    }

    private static final void d(int var0) {
        aP = 0;
        Q = d7;
        if (N == null) {
            N = M;
        }

        int var1 = GlomoReg.i.b().a();
        Vector var2 = GlomoReg.i.a();
        if (ao == 3 || ao == 51) {
            ap = ao;
        }

        if ((var0 == 3 || var0 == 51) && var1 < 0) {
            ap = var0;
            var0 = 0;
        }

        if (var0 == 54) {
            try {
                GlomoReg.i.c(1);
                aH = 5;
                String var3;
                if ((var3 = GlomoReg.i.b().b(aH)) == null || var3.length() < 1) {
                    var0 = 60;
                }
            } catch (Exception var17) {
                System.out.println("Error glomo");
                var0 = 60;
            }
        }

        int var18 = var2.size();

        for(int var5 = 0; var5 < var18; ++var5) {
            var2.elementAt(var5);
        }

        S[ao] = aD;
        R[ao] = r;
        ao = var0;
        aD = S[var0];
        r = R[var0];
        aJ = null;
        aJ = new String[3][];
        String var7 = "";
        if (z[var0 + 0] != null) {
            for(int var8 = 0; var8 < z[var0 + 0].length; ++var8) {
                var7 = var7 + z[var0 + 0][var8];
                if (var0 == 15) {
                    try {
                        if (var8 == 0) {
                            var7 = var7 + " " + GlomoReg.i.b().c();
                        }

                        if (var8 == 1) {
                            var7 = var7 + " " + aU.c();
                        }

                        if (var8 == 2) {
                            var7 = var7 + '\r' + GlomoReg.i.b().d();
                        }
                    } catch (Exception var16) {
                    }
                }

                if (var0 == 54) {
                    try {
                        if (var8 == 0) {
                            var7 = var7 + " " + GlomoReg.i.b().b(aH);
                        }

                        if (var8 == 1) {
                            var7 = var7 + " " + aU.b(aH);
                        }

                        if (var8 == 2) {
                            var7 = var7 + '\r' + GlomoReg.i.b().c(aH);
                        }
                    } catch (Exception var15) {
                    }
                }

                if (var0 == 27) {
                    try {
                        if (var8 == 0) {
                            var7 = var7 + '\r' + " " + aU.c();
                        }
                    } catch (Exception var14) {
                    }
                }

                if (var8 < z[var0 + 0].length - 1) {
                    var7 = var7 + '\r';
                }
            }
        }

        int var10;
        if (var0 == 3 || var0 == 51) {
            String var9 = "";

            try {
                var9 = z[49][0];
            } catch (Exception var13) {
            }

            for(var10 = 0; var10 < var18; ++var10) {
                if (((fGlomo)var2.elementAt(var10)).c() == var1) {
                    aJ[0] = new String[]{var7 = var9 + ((fGlomo)var2.elementAt(var10)).a()};
                }
            }
        }

        if (var7 != null && var7.length() > 0) {
            aJ[0] = az.a(var7, N, e7 - N.a(" "), true);
        } else {
            aJ[0] = new String[]{""};
        }

        aJ[1] = z[var0 + 1];
        int var19;
        if (var0 == 0) {
            aJ[1] = new String[var18];

            for(var19 = 0; var19 < var18; ++var19) {
                aJ[1][var19] = ((fGlomo)var2.elementAt(var19)).a();
            }

            for(var10 = 0; var10 < var18; ++var10) {
                if (((fGlomo)var2.elementAt(var10)).c() == var1) {
                    r = var10;
                }
            }
        }

        if (var0 == 45) {
            try {
                f7.repaint();
                f7.serviceRepaints();
                Thread.sleep(9L);
            } catch (Exception var12) {
            }

            if (az.g()) {
                var19 = aE;
                aJ[1] = new String[var19];

                for(var10 = 0; var10 < var19; ++var10) {
                    aJ[1][var10] = w[var10];
                }

                return;
            }

            d(42);
        }

    }

    private static final void n() {
        aw = a(ay, aw);
        ag = aw[7];
    }

    private static void d(String var0) {
        try {
            if (av != null && av.getState() == 400) {
                av.stop();
            }

            if (av != null) {
                av.close();
            }

            if (av != null) {
                av = null;
            }
        } catch (Exception var12) {
        }

        InputStream var1 = null;

        try {
            var1 = P.getClass().getResourceAsStream(var0);
        } catch (Exception var11) {
        }

        if (av == null) {
            try {
                av = Manager.createPlayer(var1, "audio/X-wav");
            } catch (Exception var10) {
            }
        }

        if (av == null) {
            try {
                av = Manager.createPlayer(var1, "audio/amr");
            } catch (Exception var9) {
            }
        }

        if (av == null) {
            try {
                av = Manager.createPlayer(var1, "audio/midi");
            } catch (Exception var8) {
            }
        }

        if (av != null) {
            try {
                av.realize();
                av.prefetch();
            } catch (Exception var7) {
            }
        }

        try {
            av.setLoopCount(e7 + d7);
        } catch (Exception var6) {
        }

        try {
            ((VolumeControl)av.getControl("VolumeControl")).setLevel(f7.p);
        } catch (Exception var5) {
        }

        try {
            av.start();
        } catch (Exception var4) {
        }

        try {
            if (var1 != null) {
                var1.close();
            }

        } catch (Exception var3) {
        }
    }

    private static int o() {
        return d7 - (aP + Q);
    }

    private static int p() {
        return aP;
    }

    private boolean q() {
        boolean var1 = false;

        try {
            try {
                try {
                    Class.forName("javax.microedition.pim.ContactList");
                    g var2;
                    w = (var2 = new g(this)).a();
                    y = var2.c6;
                    x = var2.b6;
                    aE = var2.a6;
                    var1 = true;
                    if (var2.a6 <= 0) {
                        y = null;
                        x = null;
                        var1 = false;
                    }
                } catch (Exception var3) {
                    var1 = false;
                }
            } catch (SecurityException var4) {
                var1 = false;
            }
        } catch (SecurityException var5) {
            var1 = false;
        }

        return var1;
    }

    private static final void r() {
        aw[7] = (byte)ag;
        b(ay, aw);
    }

    private static boolean s() {
        int var0;
        if ((var0 = aR) < 0) {
            var0 += 256;
        }

        int var1;
        if ((var1 = aQ) < 0) {
            var1 += 256;
        }

        return (aK = (var1 << 16) + (var0 << 8)) > 0;
    }

    private static void a(long var0) {
        if (G == 0L || G > var0) {
            G = var0;
            q = 0;
        }

    }

    private static void b(long var0) {
        if (G > 2L && ag < 125) {
            ++ag;
            r();
        }

        G = 0L;
        K = true;
        ap = 3;
        d(3);
        h();
    }

    static final String c() {
        String var0 = null;
        return (var0 = GlomoReg.i.f()) != null && var0.length() > 0 ? var0 : null;
    }

    private static String[] a(String var0, i var1, int var2, boolean var3, boolean var4) {
        int var5;
        String[] var6 = new String[var5 = var0.length()];
        boolean var7 = false;
        int var8 = 0;
        int var9 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 1;
        int var16 = 0;
        boolean var17 = false;

        for(int var18 = 0; var18 < var5 + 1; ++var18) {
            char var10;
            if (var18 >= var5) {
                var10 = '\n';
            } else {
                var10 = var0.charAt(var18);
            }

            int var21;
            if (var3) {
                var21 = var1.a(var10);
            } else {
                var21 = 5;
            }

            if (var10 != '\n' && var10 != '\r') {
                var9 += var21;
                var8 += var21;
            }

            switch(var10) {
                case '\n':
                case '\r':
                    var15 = var18;
                    var9 = var2 + 1;
                    var8 = 0;
                    if (var18 < var5) {
                        ++var18;
                        if (var18 < var5) {
                            char var22 = var10;
                            if (((var10 = var0.charAt(var18)) == '\n' || var10 == '\r') && var10 != var22) {
                                ++var18;
                            }
                        }

                        var16 = var18--;
                    } else {
                        var16 = var5;
                    }

                    var10 = '\n';
                    break;
                case ' ':
                    var15 = var18 + 1;
                    var8 = 0;
            }

            if ((var9 <= var2 || !var3) && var10 != '\n') {
                ++var12;
            } else {
                if (var15 == var14 && var12 > 0) {
                    var15 = var14 + var12;
                    var8 = 0;
                    if (var18 < var5 && var18 + 1 > var15) {
                        var8 = var1.a(var0.substring(var15, var18 + 1));
                    }
                }

                if (var15 > var14) {
                    var6[var13] = var0.substring(var14, var15);
                } else {
                    var6[var13] = "";
                }

                var14 = var15;
                if (var15 < var16) {
                    var14 = var16;
                }

                var15 = var14;
                var9 = var8;
                var12 = var18 - var14 + 1;
                if (var4 && var6[var13] != null && var6[var13].length() > 0) {
                    while(var6[var13].length() > 0 && var6[var13].charAt(var6[var13].length() - 1) == ' ') {
                        var6[var13] = var6[var13].substring(0, var6[var13].length() - 1);
                    }
                }

                ++var13;
            }
        }

        String[] var20 = null;
        var20 = new String[var13];
        System.arraycopy(var6, 0, var20, 0, var13);
        return var20;
    }

    private String[] a(String var1, i var2, int var3, boolean var4) {
        return a(var1, var2, var3, var4, true);
    }

    private static int e(int var0) {
        int var1 = 0;

        for(int var2 = 0; var2 * var2 <= var0; var1 = var2++) {
        }

        return var1;
    }

    private static final boolean a(String var0, String var1) {
        if (var0 != null && var1 != null || var0 == null && var1 == null) {
            if (var0 == null && var1 == null) {
                return true;
            } else if (var0 != null && var1 != null) {
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
                return false;
            }
        } else {
            return false;
        }
    }

    static void d() {
        am = null;
        G = 1L;
    }

    static boolean e() {
        return G == 1L;
    }

    private static boolean d(boolean var0) {
        try {
            byte[] var1;
            if ((var1 = AssetManager.instanceHandler.readDataChunkFromFile(decodeBinaryString(binaryStringDmc), -1))[0] != 0 && var1[0] != 32) {
                B = false;
            } else {
                B = true;
            }

            if (var1[1] != 0 && var1[1] != 32) {
                var0 = true;
            }
        } catch (Exception var2) {
        }

        return var0;
    }

    private static boolean e(boolean var0) {
        String var1 = null;

        try {
            var1 = NET_Lizard.app.getAppProperty(decodeBinaryString(binaryStringMIDletName));
        } catch (Exception var3) {
        }

        var1 = b(var1);
        if (!var0) {
            try {
                if (var1 == null || var1.length() < 1 || !a(var1, decodeBinaryString(binaryStringMoonBT))) {
                    var0 = true;
                }
            } catch (Exception var4) {
                var0 = true;
            }
        }

        return var0;
    }

    private static boolean f(boolean var0) {
        String var1 = null;

        try {
            var1 = NET_Lizard.app.getAppProperty(decodeBinaryString(binaryStringMIDletVendor));
        } catch (Exception ignore) {
        }

        var1 = b(var1);
        if (!var0) {
            try {
                if (var1 == null || var1.length() < 1 || !a(var1, decodeBinaryString(binaryStringNetLizard))) {
                    var0 = true;
                }
            } catch (Exception var4) {
                var0 = true;
            }
        }

        return var0;
    }

    static final boolean b(boolean var0) {
        n();
        if (t()) {
            isRunning = false;
            return true;
        } else {
            try {
                A = AssetManager.instanceHandler.e(decodeBinaryString(binaryStringDem));
                if (A == null || A[0] == null || A[0].length <= 0) {
                    isRunning = false;
                    var0 = true;
                }
            } catch (Exception var3) {
                isRunning = false;
                var0 = true;
            }

            try {
                z = AssetManager.instanceHandler.e("dem3");
                if (z == null || z[0] == null || z[0].length <= 0) {
                    isRunning = false;
                    var0 = true;
                }
            } catch (Exception var2) {
                isRunning = false;
                return true;
            }

            if (NET_Lizard.app.getAppProperty(decodeBinaryString(binaryStringMIDletVendor)) == null && NET_Lizard.app.getAppProperty(decodeBinaryString(binaryStringMIDletName)) == null) {
                J = true;
            } else {
                J = false;
                // TODO: uncomment and remove false
                if (false/*f(var0) || e(var0)*/) {
                    isRunning = false;
                    return true;
                }
            }

            if (!var0) {
                var0 = !aU.e();
            }

            d(0);
            if (var0 = d(var0)) {
                var0 |= s();
            } else {
                aK <<= 1;
            }

            if (var0) {
                var0 |= c(true);
            }

            if (var0) {
                d(new String());
            }

            return var0;
        }
    }

    private static boolean t() {
        return false;
        // TODO: uncomment
        /*try {
            String var0 = GlomoReg.i.a(NET_Lizard.app, new String[]{decodeBinaryString(binaryStringMoonBT) + decodeBinaryString(binaryStringIconPathAndMidletClass)});
            if ((NET_Lizard.app.getAppProperty(decodeBinaryString(binaryStringMIDletVendor)) != null || NET_Lizard.app.getAppProperty(decodeBinaryString(binaryStringMIDletName)) != null) && var0 != null && var0.length() > 0) {
                return true;
            } else {
                aU = new GlomoReg.i(NET_Lizard.app);
                return false;
            }
        } catch (Throwable e) {
            return true;
        }*/
    }

    private boolean u() {
        try {
            try {
                return f7.hasPointerEvents();
            } catch (Exception var2) {
                return false;
            }
        } catch (Throwable var3) {
            return false;
        }
    }

    private boolean v() {
        if (J) {
            return true;
        } else if (this.at >= 0) {
            return this.at > 0;
        } else {
            boolean var1 = false;

            try {
                try {
                    try {
                        Class.forName("javax.microedition.pim.ContactList");
                        var1 = true;
                        this.at = 1;
                    } catch (Exception var3) {
                        var1 = false;
                    }
                } catch (SecurityException var4) {
                    var1 = false;
                }
            } catch (SecurityException var5) {
                var1 = false;
            }

            if (!var1) {
                this.at = 0;
            }

            return var1;
        }
    }

    private static boolean c(long var0) {
        return var0 < G + (long)aK;
    }

    private static boolean w() {
        int var1 = q;
        int var2 = 0;

        int var3;
        for(var3 = 0; var1 > 0; ++var2) {
            var1 >>= 1;
        }

        if (var2 > 21) {
            return false;
        } else {
            while(var2 > 0) {
                var2 >>= 1;
                ++var3;
            }

            return var3 <= 4;
        }
    }

    static boolean f() {
        return am != null || az.aa;
    }

    static final boolean a(Graphics var0) {
        if (!f()) {
            return false;
        } else {
            var0.setColor(m7);
            var0.setClip(0, aP, e7, Q);
            var0.fillRect(0, aP, e7, Q);
            if (az.aa) {
                az.b(var0);
                return true;
            } else {
                int var1 = 0;

                try {
                    String var2 = "";
                    String var3 = "";

                    try {
                        var2 = z[34][1];
                    } catch (Exception var23) {
                    }

                    try {
                        var3 = z[34][0];
                    } catch (Exception var22) {
                    }

                    var1 = a(var0, var2, var3);
                } catch (Exception var24) {
                }

                int var25 = aP + 2;
                if (e7 >= 240) {
                    ++var25;
                }

                if (aJ == null) {
                    return true;
                } else {
                    int var26 = N.b();
                    int var4;
                    int var5;
                    int var6;
                    int var7;
                    if (aJ[0] != null) {
                        var4 = var26 * aJ[0].length;
                        var5 = var26;
                        if (aI) {
                            var5 = var26 * 14 >> 3;
                        }

                        var6 = 0;
                        if (aJ[1] != null) {
                            var6 = var5 * aJ[1].length;
                            if (aJ[1].length > 1) {
                                var6 += 2 * var5;
                            }
                        }

                        var6 += 6;
                        var7 = ((d7 - var5 - var6 >> 1) - var4 >> 1) * 3 >> 3;
                        if (var25 < var7) {
                            var25 = var7;
                        }

                        for(int var8 = 0; var8 < aJ[0].length; ++var8) {
                            N.a(var0, aJ[0][var8], e7 >> 1, var25, 17);
                            var25 += var26;
                        }
                    }

                    var4 = var26;
                    var25 += 3 * var26 >> 3;
                    if (aJ[1] != null && aJ[1].length > 0) {
                        var5 = aJ[1].length;
                        var26 = N.b() - N.f8 + 4;
                        if (d7 >= 320) {
                            var26 += 2;
                        }

                        if (aI) {
                            var26 = var26 * 14 >> 3;
                        }

                        var6 = var5 * var26;
                        if (var1 < var4) {
                            var1 = var4;
                        }

                        var7 = Q - var1 - var25 - 4;
                        boolean var27 = var5 > 1;
                        int var9 = 3;
                        if (e7 >= 240) {
                            ++var9;
                        } else if (e7 <= 128) {
                            --var9;
                        }

                        var7 -= 2 * var9;
                        if (var27) {
                            var7 -= 2 * var1;
                        }

                        if (e7 >= 240) {
                            var7 -= 2;
                        }

                        if (var6 >= var7) {
                            var6 = (var5 = var7 / var26) * var26;
                        }

                        var7 += 2 * var9;
                        var25 += var7 - (var6 + 2 * var9) >> 1;
                        int var11;
                        int var13;
                        int var14;
                        int var15;
                        int var16;
                        int var17;
                        int var18;
                        if (var27) {
                            var25 += var1;
                            int var10 = var6 + 2 * var9;
                            var11 = var25;
                            var13 = var1 / 3;
                            var14 = var1 - 2 * var13;
                            var15 = -1;
                            var16 = 2;
                            var0.setColor(i7);
                            var0.fillRect(0, var25 - var1, e7, var1);
                            var0.fillRect(0, var25 + var10, e7, var1);
                            var0.setColor(k7);
                            var0.drawRect(1, var25 - var1, e7 - 3, var1 - 1);
                            var0.drawRect(1, var25 + var10, e7 - 3, var1 - 1);
                            if (k.c(0, var25 - var1, e7, var1)) {
                                ak = true;
                                ah = 50;
                                aS = true;
                                aT = true;
                                aL = 0L;
                                aM = System.currentTimeMillis();
                            }

                            if (k.c(0, var25 + var10, e7, var1)) {
                                ak = true;
                                ah = 56;
                                aS = true;
                                aT = true;
                                aL = 0L;
                                aM = System.currentTimeMillis();
                            }

                            var0.setColor(p);
                            var17 = e7 >> 1;
                            var18 = 1;
                            int var19 = var25 - var1 + var13;

                            for(int var20 = 0; var20 < 2; ++var20) {
                                for(int var21 = 0; var21 < var14; ++var21) {
                                    var0.drawLine(var17, var19, var17 + var18, var19);
                                    ++var19;
                                    var17 += var15;
                                    var18 += var16;
                                }

                                var19 = var11 + var10 + var13;
                                var15 = -var15;
                                var16 = -var16;
                                var18 += var16;
                            }
                        }

                        var25 += var9;
                        var11 = var26;
                        int var12 = 0;
                        if (k.dr) {
                            if (k.ds) {
                                as = k.fZ;
                            } else {
                                var13 = Math.abs(k.fZ - as);
                                byte var28 = 1;
                                if (k.fZ < as) {
                                    var28 = -1;
                                }

                                while(var13 >= var11) {
                                    var12 += var28;
                                    var13 -= var11;
                                }

                                as += var12 * var11;
                                aD -= var12;
                            }
                        }

                        if (aD > aJ[1].length - var5) {
                            aD = aJ[1].length - var5;
                        }

                        if (aD < 0) {
                            aD = 0;
                        }

                        if (aD > r) {
                            aD = r;
                        }

                        if (r - aD > var5 - 1) {
                            aD = r - (var5 - 1);
                        }

                        var13 = var26;
                        var25 += var26 - (M.b() - M.f8) >> 1;
                        var14 = aD;

                        for(var15 = 0; var14 < aJ[1].length && var15 < var5; ++var14) {
                            var16 = var25 - (var13 - (M.b() - M.f8) >> 1);
                            if (k.d(0, var16, e7, var13) && r != var14) {
                                r = var14;
                            }

                            if (k.c(0, var16, e7, var13)) {
                                if (r != var14) {
                                    r = var14;
                                }

                                ah = 53;
                                aS = true;
                            }

                            var17 = 3;
                            if (e7 >= 240) {
                                ++var17;
                            }

                            var18 = e7 - 2 * var17;
                            if (var14 == r) {
                                var0.setColor(n7);
                                var0.fillRect(var17, var16, var18, var13);
                                var0.setColor(l7);
                                var0.drawRect(var17, var16, var18 - 1, var13 - 1);
                            }

                            a(var0, N, aJ[1][var14], var17 + 2, 0, var18 - 4, d7, var14 == r, e7 >> 1, var25, 17);
                            var25 += var26;
                            ++var15;
                        }

                        var0.setColor(j7);
                        var0.drawRect(0, 0, e7 - 1, d7 - 1);
                        return true;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    private static void a(Graphics var0, i var1, String var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9, int var10) {
        int var11 = var0.getClipX();
        int var12 = var0.getClipY();
        int var13 = var0.getClipWidth();
        int var14 = var0.getClipHeight();
        int var15 = var3;
        int var16 = var4;
        if (var3 < var11) {
            var5 -= var11 - var3;
            var15 = var11;
        }

        if (var4 < var12) {
            var6 -= var12 - var4;
            var16 = var12;
        }

        if (var15 + var5 > var11 + var13) {
            var5 = var11 + var13 - var15;
        }

        if (var16 + var6 > var12 + var14) {
            var6 = var12 + var14 - var16;
        }

        var0.setClip(var15, var16, var5, var6);
        String var17 = "...";
        int var18 = var1.a(var2) - var1.e8;
        int var19 = var1.a(var17) - var1.e8;
        int var20;
        if ((var20 = var1.a('A') * 6 >> 3) < 1) {
            var20 = 1;
        }

        if (var18 <= var5 - 2) {
            var1.a(var0, var2, var8, var9, var10);
        } else if (!var7) {
            String var21 = null;
            int var22 = 0;

            for(int var23 = 0; var23 < var2.length(); ++var23) {
                if ((var22 += var1.a(var2.charAt(var23))) >= var5 - var19) {
                    var21 = var2.substring(0, var23) + var17;
                    break;
                }
            }

            if (var21 == null) {
                var21 = var2;
            }

            var1.a(var0, var21, var8, var9, var10);
        } else {
            var1.a(var0, var2, var3 - aG, var9, 20);
            aG += var20;
            if (aG >= var18) {
                aG = -var5;
                ++aF;
            }
        }

        var0.setClip(var11, var12, var13, var14);
    }
}
