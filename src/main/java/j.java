//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// Text manager
public final class j {
    static int a9 = 208;
    static int b9;
    boolean c9;
    String d9;
    static int e9 = 176;
    static int f9;
    byte[] g9;
    int h9;
    static k i9;
    int j9 = -1;
    int k9;
    boolean l9;
    Image m9;
    boolean n9;
    int o;
    static boolean p = false;
    int q;
    int r;
    boolean s;
    boolean t;
    static boolean u;
    boolean v;
    static boolean w;
    static d x;
    static Font y;
    static int z = 0;
    static d A;
    static boolean B;
    boolean C;
    int D;
    int E;
    int F;
    Image G;
    Image H;
    Image I;
    Image[] J;
    int[][] K;
    boolean L;
    int[] M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    Image S;
    boolean T;
    boolean U;
    boolean V;
    int W = 3;
    int X;
    int Y = 1;
    boolean Z;
    boolean aa;
    int ab;
    static Image ac;
    static Image ad;
    Image[] ae;
    int[][] af;
    int ag;
    int ah;
    boolean ai;
    boolean aj;
    boolean ak = false;
    static boolean al = true;
    boolean am;
    int an;
    private int[][] bO = new int[][]{{104, 108}, {99, 114}, {105, 110}, new int[0], {105, 110, 48}, new int[0], new int[0]};
    Image ao;
    int ap;
    int aq;
    int ar = 2;
    int as;
    int at;
    int au;
    byte[] av;
    int aw = 100;
    boolean ax;
    int[][] ay;
    String[] az;
    String[] aA;
    int aB;
    byte[][] aC;
    boolean aD = true;
    int aE = 10;
    Image aF;
    Image aG;
    Image[] aH;
    boolean aI;
    int aJ;
    int aK;
    boolean aL;
    boolean aM;
    long aN;
    static boolean aO = true;
    int aP;
    int aQ;
    String aR;
    String[] aS;
    String[] aT;
    int aU = 0;
    int aV = 0;
    int aW = 0;
    String[] aX;
    d aY;
    Image aZ;
    static boolean ba = true;
    long bb;
    int bc;
    Image bd;
    Image be;
    int bf;
    Image bg;
    long bh;
    long bi;
    long bj;
    boolean bk;
    boolean bl = false;
    boolean bm = false;
    int bn;
    int bo;
    boolean bp;
    int bq = 0;
    static String br;
    int bs;
    int bt;
    int bu;
    int bv = 0;
    int bw;
    long bx;
    boolean by;
    int[] bz;
    boolean bA;
    long bB;
    int bC;
    static boolean bD;
    boolean bE = false;
    int bF;
    int bG;
    int bH;
    int bI;
    int bJ;
    int bK = 1;
    int bL = 0;
    static int bM;
    int bN;

    static {
        f9 = e9 >> 1;
        b9 = a9 >> 1;
        bD = false;
        B = false;
        w = false;
        u = true;
        bM = 2;
    }

    public j(k var1) {
        this.D = a9;
        this.bG = 3;
        this.bu = 4;
        this.bs = 1;
        this.Z = false;
        this.aa = true;
        this.F = 2;
        this.E = 100;
        this.bN = 100;
        this.L = false;
        this.M = new int[10];
        this.aJ = 0;
        this.as = 0;
        int[][] var10000 = new int[][]{{83, 105, 116, 101, 85, 82, 76}, {77, 73, 68, 108, 101, 116, 45, 73, 110, 102, 111, 45, 85, 82, 76}};
        this.av = new byte[100];
        this.bo = 12;
        this.bn = 0;
        this.d9 = null;
        this.at = 0;
        this.aK = 3;
        this.P = false;
        this.bF = 0;
        this.l9 = true;
        this.aC = new byte[][]{{47, 108, 112, 46, 112, 110, 103}, {47, 108, 112, 50, 46, 112, 110, 103}, {47, 112, 46, 112, 110, 103}, {47, 109, 105, 46, 112, 110, 103}, {47, 109, 105, 49, 46, 112, 110, 103}, {47, 109, 105}, {46, 112, 110, 103}, {47, 107, 110, 112, 46, 112, 110, 103}, {47, 110, 108, 46, 112, 110, 103}, {108, 122}, {108, 100, 46, 112, 110, 103}, {47, 111, 114, 46, 112, 110, 103}, {47, 111, 114, 95, 102, 46, 112, 110, 103}, {47, 105, 108, 48, 46, 112, 110, 103}, {111, 114, 49}, {111, 114, 50}, {47, 108, 105, 48, 46, 112, 110, 103}};
        this.am = false;
        this.bh = 7L;
        this.bi = 70L;
        this.bj = 20L;
        this.n9 = false;
        this.q = 110;
        this.r = 5;
        this.o = 1;
        this.aj = false;
        this.ai = false;
        this.s = false;
        this.t = false;
        this.an = 0;
        this.aB = 10;
        this.v = false;
        this.ax = false;
        this.bk = false;
        this.g9 = new byte[]{31, 22, 33, 32, 35, 42, 35, 35, 47, 38, 41, 40, 35, 44, 36};
        this.T = false;
        this.U = false;
        this.V = false;
        this.h9 = 15;
        this.aQ = 11;
        this.bC = -1;
        this.bA = false;
        this.by = false;
        this.bz = new int[10];
        i9 = var1;
        g();
        k.cP = false;
    }

    private final void h() {
        try {
            this.ao = null;
            String var1 = k.a(this.aC[9]);

            try {
                this.ao = f.a(var1);
            } catch (Exception var11) {
                this.n9 = false;
                i9.S = false;
                return;
            }

            try {
                this.H = f.a(k.a(this.aC[10]));
            } catch (Exception var10) {
            }

            if (this.ao.getWidth() > e9 || this.ao.getWidth() <= e9 * 3 >> 2) {
                int var2 = e9;

                try {
                    this.ao = f.a(this.ao, 0, 0, this.ao.getWidth(), this.ao.getHeight(), var2, this.ao.getHeight() * var2 / this.ao.getWidth(), 0, false, true);
                } catch (OutOfMemoryError var9) {
                }
            }

            this.j9 = 0;
            long var13 = System.currentTimeMillis();
            this.ar = -1;
            this.t();
            this.ar = 2;
            long var4 = var13;
            int var6 = 3000 / ((e9 >> 2) - this.ar);

            while(this.ar < e9 >> 2) {
                this.x();
                ++this.ar;
                if ((var13 = System.currentTimeMillis()) - var4 < (long)var6) {
                    try {
                        Thread.sleep((long)var6 - (var13 - var4));
                    } catch (Exception var8) {
                    }
                }
            }

            this.ar = (short) e9;
            this.H = null;
        } catch (Exception var12) {
        }

        this.ao = null;
    }

    private final void a(boolean var1) {
        boolean var2 = i9.aO;
        boolean var3 = k.cq;
        i9.aO = false;
        k.cq = true;
        this.j9 = 0;
        this.bF = 0;

        try {
            try {
                this.bd = f.b(k.a(this.aC[11]));
            } catch (OutOfMemoryError var10) {
            }

            try {
                if (this.bd != null) {
                    this.bd = f.a(this.bd);
                }
            } catch (OutOfMemoryError var9) {
            }

            try {
                if (this.bd != null && (this.bd.getWidth() != e9 || this.bd.getHeight() != a9)) {
                    this.bd = f.a(this.bd, 0, 0, this.bd.getWidth(), this.bd.getHeight(), e9, a9, 0, false, true);
                }
            } catch (OutOfMemoryError var13) {
            }

            try {
                try {
                    this.be = f.a(k.a(this.aC[12]));
                    this.bf = e9 >> 1;
                    int var4 = this.bf / 6;

                    while(this.bf >= 0) {
                        this.bf -= var4;
                        this.x();
                        Thread.sleep(7L);
                    }
                } catch (Exception var11) {
                }
            } catch (OutOfMemoryError var12) {
            }

            this.j9 = 0;
            this.bf = 0;
            if (this.bd != null || this.be != null) {
                this.t();
            }

            this.x();
            if (al) {
                Thread.sleep(780L);
            }

            byte var15 = 1;
            this.bF = 1;
            this.x();
            if (!var1) {
                Thread.sleep(1700L);
            }

            this.P = true;
            long var5 = System.currentTimeMillis();
            this.N = 0;

            label107:
            while(true) {
                while(!var1 || this.N == 53 || this.N == -6 || this.N == -5 || this.N == -7 || this.N == 35) {
                    k.l();
                    if (var15 == 2) {
                        if (this.N == -7 || this.N == 35) {
                            f.l1 = false;
                            k.t();
                            this.r();
                        }

                        if (this.N == 53 || this.N == -6 || this.N == -5) {
                            f.l1 = true;
                            s();
                            this.r();
                        }

                        this.am = false;
                    }

                    this.N = 0;
                    if (var15 != 1) {
                        this.P = false;
                        this.bF = 0;
                        this.bm = false;
                        break label107;
                    }

                    var15 = 2;
                    this.bF = 2;
                    this.x();
                }

                Thread.sleep(33L);
                long var7;
                if ((var7 = System.currentTimeMillis()) - var5 > 350L && var15 == 1) {
                    var5 = var7;
                    if (this.bF == 0) {
                        this.bF = var15;
                    } else {
                        this.bF = 0;
                    }

                    this.x();
                }

                this.q();
            }
        } catch (Exception var14) {
        }

        i9.aO = var2;
        k.cq = var3;
        this.be = null;
        this.bd = null;
        this.N = 0;
        this.U = false;
        this.T = true;
        this.j9 = -1;
        this.ao = null;
        al = false;
    }

    private final void i() {
        if (k.cy && !n.g12) {
            this.N = 0;
            this.T = true;
            this.U = false;
            this.bp = true;

            while(this.c9 && !n.g12) {
                if (!n.s) {
                    i9.d();
                    i9.u();
                }

                if (this.N == -7 || this.N == 35) {
                    /// NOTE: might be coupled with class i instead of k (little chance)
                    i9.d();
                    i9.c(-1);
                    break;
                }

                this.x();

                try {
                    Thread.sleep(30L);
                } catch (Exception var2) {
                }
            }

            this.bp = false;
            if (!n.g12) {
                this.N = 0;
                this.T = true;
                this.U = false;
                if (this.c9 && this.aJ == 5) {
                    return;
                }

                this.c(15);
                return;
            }
        }

        if (k.cy && n.g12) {
            i9.c(7);
        }

        this.n9 = false;
        if (!k.cy) {
            f.a();
        }

    }

    private static Image a(String var0, Image var1) {
        Image var2 = null;
        Image var3 = null;

        try {
            if (var1 != null) {
                var3 = var1;
            } else {
                try {
                    var3 = f.b(f.c(var0));
                } catch (Exception var6) {
                }
            }

            try {
                var3 = f.a(var3);
            } catch (OutOfMemoryError var5) {
            }

            try {
                if (var3.getWidth() != e9 || var3.getHeight() != a9) {
                    var3 = f.a(var3, 0, 0, var3.getWidth(), var3.getHeight(), e9, a9, 0, false, true);
                }
            } catch (OutOfMemoryError var7) {
            }

            var2 = var3;
        } catch (OutOfMemoryError var8) {
            System.out.println("out off memory menu fon");
        }

        return var2;
    }

    private static Image j() {
        return null;
    }

    private final void b(String var1, Image var2) {
        this.G = null;

        try {
            Thread.sleep(7L);
        } catch (Exception var5) {
        }

        try {
            this.G = a(var1, var2);
        } catch (Exception var4) {
        }

        if (this.G == null) {
            this.j9 = 0;
        }

    }

    private static String k() {
        String var1 = null;
        var1 = k.r[12][3] + '\r';

        for(int var2 = 1; var2 <= k.bP; ++var2) {
            String var3;
            if (k.bQ != null) {
                if ((var3 = new String(k.bQ[var2][0])).length() > 2) {
                    for(int var4 = 2; var4 < var3.length(); ++var4) {
                        if (var3.charAt(var4) >= '0' && var3.charAt(var4) <= '9') {
                            var3 = var3.substring(0, var4);
                            break;
                        }
                    }
                }
            } else {
                var3 = new String(k.r[1][1] + var2);
            }

            String[] var7 = new String[]{"", ""};
            int[] var5 = k.e(var2);

            for(int var6 = 0; var6 < var7.length; ++var6) {
                var7[var6] = "" + var5[var6];
                if (var5[var6] < 10) {
                    var7[var6] = "0" + var5[var6];
                }
            }

            if (var5[0] == 0 && var5[1] == 0) {
                var3 = var3 + " *--:--";
            } else {
                var3 = var3 + " *" + var7[0] + ":" + var7[1];
            }

            var1 = var1 + var3 + '\r';
        }

        return var1;
    }

    private final void l() {
        this.G = null;
        this.G = j();
    }

    static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var3 > 0 && var4 > 0 && var6 > 0) {
            try {
                int var7 = var0.getClipX();
                int var8 = var0.getClipY();
                int var9 = var0.getClipWidth();
                int var10 = var0.getClipHeight();
                int var11 = var1;
                int var12 = var2;
                if (var1 < var7) {
                    var3 -= var7 - var1;
                    var11 = var7;
                }

                if (var2 < var8) {
                    var4 -= var8 - var2;
                    var12 = var8;
                }

                if (var11 + var3 > var7 + var9) {
                    var3 = var7 + var9 - var11;
                }

                if (var12 + var4 > var8 + var10) {
                    var4 = var8 + var10 - var12;
                }

                if (var3 > 0 && var4 > 0 && var1 >= -var3) {
                    var0.setClip(var11, var12, var3, var4);
                    int var13 = 0;
                    int var14 = 0;
                    if (var1 != var1 >> 1 << 1 ^ var2 != var2 >> 1 << 1) {
                        ++var13;
                        ++var14;
                    }

                    int var15 = var3;
                    if (var3 > var4) {
                        var15 = var4;
                    }

                    var0.setColor(var5);

                    for(int var16 = var1 + var13; var16 < var1 + var3; var16 += 2) {
                        var0.drawLine(var16, var2, var16 + var15, var2 + var15);
                    }

                    for(int var17 = var2 + var14; var17 < var2 + var4; var17 += 2) {
                        var0.drawLine(var1, var17, var1 + var15, var17 + var15);
                    }
                }

                var0.setClip(var7, var8, var9, var10);
            } catch (Exception var18) {
            }
        }
    }

    public static final void a() {
        x = d.a();
        y = Font.getFont(0, 0, 8);
        A = x;
    }

    private final void m() {
        try {
            this.J = new Image[3];

            for(int var1 = 0; var1 < this.J.length; ++var1) {
                try {
                    this.J[var1] = f.a("/int" + var1 + ".png");
                } catch (Exception var18) {
                }
            }

            try {
                this.J[0] = f.a(this.J[0]);
            } catch (OutOfMemoryError var17) {
            }

            if (this.J[1] != null && this.J[2] != null) {
                this.K = new int[this.J.length][2];
                this.K[1][1] = a9 - this.J[1].getHeight();
                this.K[2][0] = e9 + (this.J[2].getWidth() >> 1);
                this.K[2][1] = this.J[2].getHeight() / 4;
                boolean var2 = false;
                this.aU = 4;
                this.d();

                try {
                    if (al) {
                        Thread.sleep(17L);
                    }

                    int var3;
                    if ((var3 = e9 / 64) < 1) {
                        var3 = 1;
                    }

                    int var4 = var3 / 6;
                    if (var3 == var4) {
                        var3 = var4 + 1;
                    }

                    long var5 = System.currentTimeMillis();
                    this.ak = false;
                    boolean var7 = true;
                    this.N = 0;
                    boolean var8 = false;

                    while(true) {
                        if (var7 && (this.K[2][0] < e9 - this.J[2].getWidth() || System.currentTimeMillis() >= var5 + 1500L)) {
                            this.ak = true;
                            var7 = false;
                        }

                        if (this.N != 0) {
                            if (this.N == 53 || this.N == -6 || this.N == -5) {
                                this.bl = true;
                            }

                            if (this.N == 50 || this.N == 56 || this.N == -2 || this.N == -1) {
                                this.o();
                            }
                        }

                        if (this.bl && this.bL >= b9) {
                            this.bl = false;
                            this.N = 53;
                            this.U = true;
                            this.o();
                            this.ak = false;
                            break;
                        }

                        long var9 = System.currentTimeMillis();
                        this.x();
                        Thread.sleep(7L);
                        long var11 = System.currentTimeMillis();
                        long var13 = 128L;

                        try {
                            if (var11 - var9 < var13) {
                                Thread.sleep(var13 - (var11 - var9));
                            }
                        } catch (Exception var16) {
                        }

                        int[] var10000 = this.K[1];
                        var10000[0] -= var3;
                        var10000 = this.K[2];
                        var10000[0] -= var4;
                        if (var4 == 0 && var8) {
                            int var10002 = this.K[2][0]--;
                        }

                        var8 = !var8;
                        if (this.K[2][0] < -this.J[2].getWidth() - 1) {
                            this.K[2][0] = e9 + 1;
                        }

                        if (this.N != 0 && !this.ak && var7) {
                            this.N = 0;
                        }
                    }
                } catch (Exception var19) {
                }
            }
        } catch (OutOfMemoryError var20) {
        }

        this.m9 = null;
        this.ay = null;
        this.J = null;
        this.K = null;
    }

    protected final void a(int var1) {
        if (this.P) {
            this.b(var1);
        }

        this.N = var1;
        this.T = false;
        this.bh = 0L;
        this.V = true;
    }

    private final void b(int var1) {
        byte[] var2;
        if ((var2 = this.g9)[0] != 1) {
            var2 = f.a(var2, 30);
        }

        int var3 = var1 - 48;
        if (this.O < var2.length && var3 == var2[this.O]) {
            ++this.O;
            if (this.O >= var2.length) {
                if (f.a1[12] == 0) {
                    f.a1[12] = 7;
                } else {
                    f.a1[12] = 0;
                }

                p = false;
            }

        } else {
            this.O = 0;
        }
    }

    protected final void b() {
        if (this.T) {
            this.N = 0;
        } else {
            this.U = true;
        }

        this.bh = 0L;
        this.V = false;
    }

    private void n() {
        this.T = true;
        if (this.ak) {
            this.p();
        } else if (this.aA != null) {
            if ((this.s || this.t) && k.b10 != null) {
                if (this.N == -7 || this.N == 35) {
                    i9.d();
                    i9.c(-1);
                    this.s = false;
                    this.t = false;
                }

            } else {
                this.aI = true;
                this.X = 3;
                this.bB = System.currentTimeMillis();
                int var1;
                int var2;
                switch(this.N) {
                    case -7:
                    case 35:
                        if (this.aJ != 0) {
                            if (this.aJ == 8 && this.aK == 6) {
                                this.aK = 0;
                                this.at = 0;
                            }

                            if (this.aJ == 14 || this.aJ == 15) {
                                this.aK = 0;
                                this.at = 0;
                            }

                            if (this.aJ == 16) {
                                this.aK = 15;
                                this.at = 0;
                            }

                            var1 = this.aK;
                            var2 = this.at;
                            this.c(this.aK);
                            this.as = var2;
                            this.C();
                            if (var1 == -1 && this.aK == -3) {
                                this.aK = 0;
                                this.at = this.au;
                            }

                            if (this.aK == 6 || this.aK == 7 || this.aK == 8) {
                                this.aK = 0;
                                this.at = this.au;
                            }

                            return;
                        }
                        break;
                    case -6:
                    case -5:
                    case -4:
                    case -3:
                    case 52:
                    case 53:
                    case 54:
                        switch(this.aJ) {
                            case -3:
                                k.dS = (byte)this.as;
                                f.b();
                            case 4:
                                i9.i(1);
                                this.aU = 5;
                                this.d();
                                u();
                                this.i();
                                return;
                            case -2:
                            case 1:
                            case 9:
                            case 11:
                            case 12:
                            case 13:
                            default:
                                return;
                            case -1:
                                this.c(-3);
                                return;
                            case 0:
                                if (this.as == 0) {
                                    this.c(14);
                                    return;
                                }

                                if (this.as == 1 && aO) {
                                    n.c12 = null;
                                    this.c(15);
                                    return;
                                }

                                if (this.as == 2 && p) {
                                    if (ba) {
                                        this.y();
                                        return;
                                    }

                                    this.n9 = false;
                                    i9.aO = true;
                                    i9.dB = false;
                                    f.e1 = -1;
                                    k.cq = false;
                                    h.d();
                                    return;
                                }

                                if (this.as == this.aA.length - 5 - 1 && this.d9 != null) {
                                    try {
                                        NET_Lizard.app.platformRequest(this.d9);
                                        this.n9 = false;
                                        i9.S = false;
                                        return;
                                    } catch (Exception var7) {
                                        this.aU = 3;
                                        this.d();
                                        return;
                                    }
                                }

                                if (this.as == this.aA.length - 5) {
                                    this.aU = 8;
                                    this.d();
                                    return;
                                }

                                if (this.as == this.aA.length - 4) {
                                    this.c(2);
                                    return;
                                }

                                if (this.as != this.aA.length - 3 && this.as != this.aA.length - 2) {
                                    if (this.as == this.aA.length - 1) {
                                        this.c(7);
                                        return;
                                    }

                                    return;
                                }

                                if (this.as == this.aA.length - 3) {
                                    this.c(10);
                                    return;
                                }

                                this.aU = this.as - (this.aA.length - 3);
                                this.d();
                                return;
                            case 2:
                                switch(this.as) {
                                    case 0:
                                        f.l1 = !f.l1;
                                        z();
                                        if (f.l1) {
                                            s();
                                        } else {
                                            k.t();
                                        }

                                        return;
                                    case 1:
                                        int var5 = m.K;
                                        byte var6 = 10;
                                        if (this.N == 52 || this.N == -3) {
                                            var6 = -10;
                                        }

                                        if ((var5 += var6) > 100) {
                                            var5 -= 100;
                                        }

                                        if (var5 > 100) {
                                            var5 = 100;
                                        }

                                        if (var5 < 0) {
                                            var5 = 0;
                                        }

                                        m.K = var5;
                                        m.b();
                                        z();
                                        return;
                                    case 2:
                                        k.du = !k.du;
                                        z();
                                        return;
                                    case 3:
                                        if (k.fe) {
                                            f.o = !f.o;
                                            z();
                                            if (!f.o) {
                                                return;
                                            }

                                            k.y();
                                            return;
                                        }
                                    case 4:
                                        this.c(6);
                                        return;
                                    default:
                                        return;
                                }
                            case 3:
                                switch(this.as) {
                                    case 0:
                                        f.l1 = true;
                                        s();
                                        this.r();
                                        return;
                                    case 1:
                                        f.l1 = false;
                                        k.t();
                                        this.r();
                                        return;
                                    default:
                                        return;
                                }
                            case 5:
                                f.e1 = this.as + 1;
                                if (f.e1 > 1 && p) {
                                    this.n9 = false;
                                    i9.aO = true;
                                    i9.dB = false;
                                    f.e1 = -1;
                                    k.cq = false;
                                    h.d();
                                    return;
                                }

                                if (k.cy) {
                                    k.cl &= 126;
                                    k.cl |= k.ec & 1;
                                    k.cl &= 125;
                                    if (k.ax) {
                                        k.cl |= 2;
                                    }

                                    k.cz = (byte) f.e1;
                                }

                                if (!k.cy) {
                                    int var4 = f.e1;
                                    if (f.e1 > 0) {
                                        i9.i(f.e1);
                                        this.aU = 5;
                                        this.d();
                                    }

                                    f.e1 = var4;
                                }

                                boolean var8 = bD;
                                bD = true;
                                v();
                                bD = var8;
                                this.i();
                                return;
                            case 6:
                                u();
                                this.c(8);
                                return;
                            case 7:
                                if (this.as == 0) {
                                    this.n9 = false;
                                    i9.S = false;
                                    return;
                                }

                                return;
                            case 8:
                                this.c(0);
                                this.as = 0;
                                return;
                            case 10:
                                this.aU = 0;
                                this.a("" + this.as);
                                return;
                            case 14:
                                k.cy = false;
                                f.a();
                                var1 = 0;
                                if (!p && this.aL) {
                                    ++var1;
                                }

                                if (this.as == 0 && !p && this.aL) {
                                    f.a();
                                    this.i();
                                    return;
                                }

                                if (this.as == var1) {
                                    if (D()) {
                                        this.c(-1);
                                    } else {
                                        this.c(-3);
                                    }

                                    this.aU = 2;
                                    this.d();
                                    return;
                                }

                                var2 = 2;
                                if (!this.aL) {
                                    --var2;
                                }

                                if (this.as == var2 && !p && this.aM) {
                                    this.c(5);
                                    return;
                                }

                                return;
                            case 15:
                                k.cy = true;
                                if (k.cS[2]) {
                                    f.h1 = false;
                                } else {
                                    for(var1 = 32; var1 < 64; ++var1) {
                                        f.a1[var1] = 0;
                                    }
                                }

                                k.dS = 1;
                                f.h1 = false;
                                if (this.as == 0) {
                                    i9.cx = false;
                                    i9.d();
                                    this.c9 = true;
                                    this.c(16);
                                    return;
                                }

                                if (this.as == 1) {
                                    i9.cx = false;
                                    this.c9 = false;
                                    if (n.c12 == null) {
                                        this.t = true;
                                        return;
                                    }
                                } else if (this.as == 2) {
                                    i9.cx = true;
                                    i9.d();
                                    this.c9 = true;
                                    k.k();
                                    k.cz = (byte) f.e1;
                                    i9.u();
                                    this.i();
                                    return;
                                }

                                return;
                            case 16:
                                if (this.as == 0) {
                                    if (k.ec == 0) {
                                        k.ec = 1;
                                        return;
                                    }

                                    k.ec = 0;
                                    return;
                                }

                                if (this.as == 1) {
                                    k.ax = !k.ax;
                                    return;
                                }

                                if (this.as == 2) {
                                    this.c9 = true;
                                    this.c(5);
                                    return;
                                }

                                return;
                        }
                    case -2:
                    case 56:
                        if (this.as < this.aA.length - 1) {
                            ++this.as;
                            if (this.aW == this.aw) {
                                ++this.bv;
                            }
                        } else {
                            this.as = 0;
                            this.bv = 0;
                        }

                        if (this.aJ == 4 && f.e1 < k.bP) {
                            ++f.e1;
                        }

                        this.Q = true;
                        this.C();
                        return;
                    case -1:
                    case 50:
                        if (this.as > 0) {
                            --this.as;
                            if (this.aW == 0) {
                                --this.bv;
                            }
                        } else {
                            this.as = this.aA.length - 1;
                            this.bv = this.as - (this.Y - 1);
                        }

                        if (this.aJ == 4 && f.e1 > 1) {
                            --f.e1;
                        }

                        this.R = true;
                        this.C();
                        return;
                }

            }
        }
    }

    private final void o() {
        this.n();
        boolean var1 = false;
        switch(this.N) {
            case -7:
            case -6:
            case -5:
            case 35:
            case 53:
                this.N = 0;
                var1 = true;
        }

        if (this.U || var1) {
            this.N = 0;
            this.U = false;
            this.bh = 0L;
        }

        if (this.bk && !this.ak) {
            this.N = 0;
            this.U = false;
            this.bh = 0L;
            this.bk = false;
            k.h10 = false;
        }

    }

    private final void p() {
        int var1;
        int var2;
        if (this.aU == 1 && this.N != 0) {
            label181:
            switch(this.N) {
                case 35:
                    this.L = true;
                    break;
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 52:
                case 53:
                case 54:
                default:
                    this.L = false;
                    int var7 = 0;

                    while(true) {
                        if (var7 >= this.M.length) {
                            break label181;
                        }

                        this.M[var7] = 0;
                        ++var7;
                    }
                case 49:
                    for(int var5 = 0; var5 < this.M.length; ++var5) {
                        if (var5 != 1) {
                            this.M[var5] = 0;
                        }
                    }

                    if ((this.L || this.M[1] > 0) && ++this.M[1] == 3) {
                        k.ep = !k.ep;
                    }

                    this.L = false;
                    break;
                case 50:
                    for(int var4 = 0; var4 < this.M.length; ++var4) {
                        if (var4 != 2) {
                            this.M[var4] = 0;
                        }
                    }

                    if ((this.L || this.M[2] > 0) && ++this.M[2] == 3) {
                        bD = true;
                    }

                    this.L = false;
                    break;
                case 51:
                    for(int var6 = 0; var6 < this.M.length; ++var6) {
                        if (var6 != 3) {
                            this.M[var6] = 0;
                        }
                    }

                    if ((this.L || this.M[3] > 0) && ++this.M[3] == 3) {
                        k.ey = true;
                    }

                    this.L = false;
                    break;
                case 55:
                    for(var1 = 0; var1 < this.M.length; ++var1) {
                        if (var1 != 7) {
                            this.M[var1] = 0;
                        }
                    }

                    if ((this.L || this.M[7] > 0) && ++this.M[7] == 3) {
                        k.aR = true;
                    }

                    this.L = false;
                    break;
                case 56:
                    for(var2 = 0; var2 < this.M.length; ++var2) {
                        if (var2 != 8) {
                            this.M[var2] = 0;
                        }
                    }

                    if ((this.L || this.M[8] > 0) && ++this.M[8] == 3) {
                        k.aS = true;
                    }

                    this.L = false;
                    break;
                case 57:
                    for(int var3 = 0; var3 < this.M.length; ++var3) {
                        if (var3 != 9) {
                            this.M[var3] = 0;
                        }
                    }

                    if ((this.L || this.M[9] > 0) && ++this.M[9] == 3) {
                        k.aT = true;
                    }

                    this.L = false;
            }
        }

        switch(this.N) {
            case -6:
            case -5:
            case 53:
                this.w();
                if (this.bE && this.aJ == 0 && this.aA != null) {
                    var1 = this.as;
                    var2 = this.aA.length;
                    this.c(this.aJ);
                    this.as = var1 + this.aA.length - var2;
                }
            default:
                return;
            case -2:
            case 56:
                return;
            case -1:
            case 50:
                return;
            case 35:
                if (this.aU == 1) {
                    return;
                }
            case -7:
        }
    }

    private final void q() {
        if (this.ak && this.aU == 1) {
            this.a(e9, a9);
        }

        try {
            if (k.ds) {
                this.v = true;
            }

            if (this.v) {
                int var1;
                if ((var1 = x.b() * 2 + 2) < k.n()) {
                    var1 = k.n();
                }

                int var2 = 0;
                if (0 < k.o()) {
                    var2 = k.o();
                }

                int var4 = this.aB;
                int var5 = 0;
                if (!this.ak && this.ax && k.dr) {
                    if (k.ds) {
                        this.bc = k.fZ;
                    } else {
                        int var6 = Math.abs(k.fZ - this.bc);
                        byte var7 = 1;
                        if (k.fZ < this.bc) {
                            var7 = -1;
                        }

                        while(var6 >= var4) {
                            var5 += var7;
                            var6 -= var4;
                        }

                        this.bc += var5 * var4;
                        this.bv -= var5;
                        if (this.bv < 0) {
                            this.bv = 0;
                        }

                        if (this.bv > this.aA.length - this.Y) {
                            this.bv = this.aA.length - this.Y;
                        }

                        if (this.bv != 0 && var5 != 0) {
                            this.C();
                        }
                    }
                }

                (new StringBuffer()).append("").append(k.fF).append(" ").append(k.fZ).toString();
                if ((this.ak || !this.ax) && k.c(0, var2, e9, a9 - var1 - var2)) {
                    i9.fc = true;
                    this.a(this.N = 53);
                }

                if (k.d(0, a9 - var1, e9 / 3, var1)) {
                    i9.fc = true;
                    this.a(this.N = 53);
                }

                if (k.d(e9 - e9 / 3, a9 - var1, e9 / 3, var1)) {
                    i9.fc = true;
                    this.a(this.N = 35);
                }
            }

            if (k.dt) {
                if (this.T) {
                    this.N = 0;
                } else {
                    this.U = true;
                }

                this.bh = 0L;
                this.V = false;
            }

        } catch (Exception var8) {
        }
    }

    private final void r() {
        z();
        this.c(0);
        this.as = 0;
        this.aK = this.aJ;
        this.at = this.as;
    }

    private final void c(int var1) {
        this.W = 3;
        int var2 = 0;
        if (var1 >= 0 && var1 < this.av.length) {
            var2 = this.av[var1];
        }

        if (var1 == 0 || var1 == 15) {
            i9.d();
        }

        if (this.aJ == 0) {
            this.au = this.as;
        }

        if (var1 == 14) {
            k.cy = false;
        }

        if (var1 == 15) {
            k.cy = true;
        }

        if (var1 == 15 || var1 == 7) {
            i9.c(-1);
        }

        this.aK = this.aJ;
        this.at = this.as;
        if (this.aJ >= 0 && this.aJ < this.av.length) {
            this.av[this.aJ] = (byte)this.as;
        }

        try {
            this.bn = 0;
            if (var1 == 0) {
                if (this.d9 == null) {
                    this.d9 = h.c();
                }

                if (this.d9 != null) {
                    this.bn += this.bo;
                }

                if (p) {
                    this.bn += 5;
                }
            }

            if (var1 == -3) {
                this.bv = 0;
            }

            this.aX = null;

            String[] var3;
            int var6;
            try {
                if ((var3 = k.r[10 + var1 + 30]) != null && var3.length > 0 && var3[0].length() > 1 && var3[0].charAt(0) > ' ') {
                    String var4 = "";
                    boolean var5 = false;

                    for(var6 = 0; var6 < var3.length; ++var6) {
                        var4 = var4 + var3[0] + '\r';
                    }

                    while(true) {
                        if (var4.charAt(var4.length() - 1) != '\r' && var4.charAt(var4.length() - 1) != '\n') {
                            if (this.aY == null) {
                                this.aY = A;
                            }

                            this.aX = f.instanceHandler.a(var4, this.aY, e9 - this.aY.a(" "), true);
                            break;
                        }

                        var4 = var4.substring(0, var4.length() - 1);
                    }
                }
            } catch (Exception var11) {
                this.aX = null;
            }

            var3 = null;
            int var14;
            if (var1 != 5) {
                String[] var13;
                var3 = new String[(var13 = k.r[10 + var1 + this.bn]).length];

                for(var14 = 0; var14 < var3.length; ++var14) {
                    var3[var14] = var13[var14];
                }

                if (p && var1 == 0 && ba) {
                    var3[1] = k.r[34][0];
                }

                int var7;
                int var8;
                if (var1 == 0) {
                    if (this.B()) {
                        if (k.b10 == null) {
                            e.a(3);
                            i9.f();
                            k.b10 = new n(k.dz);
                        }
                    } else {
                        aO = false;
                        k.cy = false;
                        var13 = var3;
                        var3 = new String[var3.length - 1];
                        var7 = 0;

                        for(var8 = 0; var8 < var13.length && var7 < var3.length; ++var8) {
                            if (var8 != 1) {
                                var3[var7] = var13[var8];
                                ++var7;
                            }
                        }
                    }
                }

                if (var1 == 14) {
                    this.aL = D();
                    this.aM = this.aL || bD || f.f1 > 1;
                    this.aL = this.aM;
                    var13 = var3;
                    if (p) {
                        this.aL = false;
                        this.aM = false;
                    }

                    var6 = var3.length;
                    if (!this.aL) {
                        --var6;
                    }

                    if (!this.aM) {
                        --var6;
                    }

                    var3 = new String[var6];
                    var7 = 0;

                    for(var8 = 0; var8 < var13.length && var7 < var3.length; ++var8) {
                        if ((var8 != 0 || this.aL) && (var8 != 2 || this.aM)) {
                            var3[var7] = var13[var8];
                            ++var7;
                        }
                    }
                }

                if (var1 == 15) {
                    boolean var16 = k.x();
                    var13 = var3;
                    if (p) {
                        var16 = false;
                    }

                    var7 = var3.length;
                    if (!var16) {
                        --var7;
                    }

                    var3 = new String[var7];
                    var8 = 0;

                    for(int var9 = 0; var9 < var13.length && var8 < var3.length; ++var9) {
                        if (var9 != 2 || var16) {
                            var3[var8] = var13[var9];
                            ++var8;
                        }
                    }
                }

                if (var1 == 2) {
                    if (!D() || p) {
                        var13 = var3;
                        var6 = var3.length;
                        --var6;
                        var3 = new String[var6];
                        var7 = 0;

                        for(var8 = 0; var8 < var13.length && var7 < var3.length; ++var8) {
                            if (var8 != 4) {
                                var3[var7] = var13[var8];
                                ++var7;
                            }
                        }
                    }

                    if (!k.fe) {
                        var13 = var3;
                        var6 = var3.length;
                        --var6;
                        var3 = new String[var6];
                        var7 = 0;

                        for(var8 = 0; var8 < var13.length && var7 < var3.length; ++var8) {
                            if (var8 != 3) {
                                var3[var7] = var13[var8];
                                ++var7;
                            }
                        }
                    }
                }
            }

            if (var1 == 5) {
                int var15;
                if ((var15 = f.e1) < 1) {
                    var14 = f.e1;
                    f.a();
                    var15 = f.e1;
                    f.e1 = var14;
                }

                if (var15 < 1) {
                    var15 = 1;
                }

                var14 = f.f1;
                if (bD || k.cy) {
                    var14 = k.bP;
                }

                if (p) {
                    var14 = 1;
                }

                if (k.cy) {
                    var14 = k.bP;
                }

                if (var14 < 1) {
                    return;
                }

                if (var15 > var14) {
                    var15 = var14;
                }

                var3 = new String[var14];

                for(var6 = 0; var6 < var14; ++var6) {
                    var3[var6] = k.r[14][0] + String.valueOf(var6 + 1);

                    try {
                        if (k.bQ != null && var6 + 1 < k.bQ.length) {
                            var3[var6] = k.bQ[var6 + 1][0];
                        }
                    } catch (Exception var10) {
                    }
                }

                var2 = var15 - 1;
            }

            if (var3 == null) {
                return;
            }

            if (var3.length < 1) {
                return;
            }

            if (var1 == -3) {
                var2 = k.dS;
            }

            if (var1 == 3) {
                var2 = 1;
            }

            this.aA = var3;
            this.aJ = var1;
            this.as = var2;
            this.bv = 0;
            this.aD = true;
            this.bH = this.bJ;
        } catch (Exception var12) {
        }

        this.C();
    }

    public static final void a(Graphics var0, String var1, boolean var2) {
        var0.setClip(0, 0, e9, a9);
        var0.setColor(0);
        var0.fillRect(0, 0, e9, a9);
        boolean var3 = false;
        boolean var4 = false;
        int var6 = x.b() + 3;
        int var23 = 2;
        if (var2) {
            boolean var7 = true;
            if (a9 > 100 && var2) {
                try {
                    try {
                        try {
                            if (ad == null) {
                                ad = f.b(k.a(NET_Lizard.c_nl.cr.aC[16]));
                                if (ad != null) {
                                    try {
                                        ad = f.a(ad);
                                    } catch (OutOfMemoryError var17) {
                                    }
                                }

                                if (ad != null && (ad.getWidth() != e9 || ad.getHeight() != a9)) {
                                    try {
                                        ad = f.a(ad, 0, 0, ad.getWidth(), ad.getHeight(), e9, a9, 0, false, true);
                                    } catch (OutOfMemoryError var16) {
                                    }
                                }
                            }
                        } catch (Exception var19) {
                        }

                        try {
                            if (ad == null && !u) {
                                ad = f.b(k.a(NET_Lizard.c_nl.cr.aC[16]));
                                if (ad != null) {
                                    try {
                                        ad = f.a(ad);
                                    } catch (OutOfMemoryError var15) {
                                    }
                                }

                                if (ad != null && (ad.getWidth() != e9 || ad.getHeight() != a9)) {
                                    try {
                                        ad = f.a(ad, 0, 0, ad.getWidth(), ad.getHeight(), e9, a9, 0, false, true);
                                    } catch (OutOfMemoryError var14) {
                                    }
                                }
                            }
                        } catch (Exception var18) {
                        }

                        if (ad != null) {
                            var0.drawImage(ad, f9, b9, 3);
                            int var8 = ad.getWidth() / 18;
                            i9.ab = f.e1 * 10;
                            int var9 = ad.getWidth() * 2 / 3;
                            int var10 = i9.c() * (var9 - var8) / 100;
                            int var11 = i9.c() * (var9 - var8) / 100;
                            var10 = var10 - (var9 >> 1) + (e9 >> 1);
                            var11 = var11 - (var9 >> 1) + (a9 >> 1);
                            var0.setColor(16711680);
                            var0.drawRect(var10, var11, var8, var8);
                            var10 += var8 * 2;
                            var11 -= var8 * 2;
                            var0.setColor(255);
                            var0.drawRect(var10, var11, var8, var8);
                        }

                        var7 = false;
                        if (!k.C) {
                            ac = null;
                            ad = null;
                        }

                        return;
                    } catch (Exception var20) {
                    }
                } catch (OutOfMemoryError var21) {
                }
            }

            if (var7) {
                try {
                    if (ac == null) {
                        ac = f.b(k.a(NET_Lizard.c_nl.cr.aC[12]));
                    }

                    var23 = a9 - ac.getHeight() >> 1;
                    var0.drawImage(ac, f9, var23, 17);
                    if ((var23 += ac.getHeight() + 3) < b9 - var6) {
                        var23 = b9 - var6;
                    }

                    ac = null;
                    ad = null;
                } catch (Exception var13) {
                }
            }
        } else {
            var23 = b9 + var6;
        }

        var0.setColor(z);
        var0.setFont(y);

        for(int var24 = 0; var24 < 1; ++var24) {
            if (var24 == 1) {
                var23 += var6;
                var1 = k.r[1][1] + String.valueOf(f.e1);
                if (f.e1 < 1 || k.cq) {
                    var1 = "";
                }
            }

            int var22 = e9 - x.a(var1) >> 1;
            if (var2 || var24 < 1) {
                x.a(var0, var1, var22, var23, 20);
            }
        }

        if (!var2) {
            try {
                boolean var25 = false;
            } catch (Exception var12) {
            }

            var0.setClip(0, 0, e9, a9);
        }

        if (!k.C) {
            ac = null;
        }

    }

    public static final void a(Graphics var0) {
        a(var0, k.r[1][0], true);
    }

    public static final void a(Graphics var0, d var1, int var2) {
        try {
            if (f.e1 > 0) {
                if (k.bQ != null) {
                    var1.a(var0, k.bQ[f.e1][0], f9, var2, 17);
                    return;
                }

                var1.a(var0, k.r[1][1] + f.e1, f9, var2, 3);
            }

        } catch (Exception var4) {
        }
    }

    private static void s() {
        if (f.l1) {
            k.b(k.bI, true);
        }

    }

    private final void t() {
        this.aq = 0;
        this.ap = 255;
        long var1 = 55L;
        long var3 = 900L;
        int var11;
        if (!this.f()) {
            this.ap = 0;
        } else {
            for(; this.ap > 0; this.ap -= var11) {
                long var5 = System.currentTimeMillis();
                this.x();
                long var9;
                if ((var9 = System.currentTimeMillis() - var5) < var1) {
                    try {
                        Thread.sleep(var1 - var9);
                    } catch (Exception var13) {
                    }

                    var9 = var1;
                }

                if ((var11 = (int)(256L * var9 / var3)) < 1) {
                    var11 = 1;
                }
            }
        }

        this.x();

        try {
            Thread.sleep(470L);
        } catch (Exception var12) {
        }
    }

    final void c() {
        long var1;
        if ((var1 = System.currentTimeMillis()) - this.aN >= 120L) {
            this.aN = var1;
            ++this.aV;
            if (this.aV > 3) {
                this.aV = 0;
                --this.W;
            }
        }

    }

    private static void u() {
        boolean var0 = bD;
        bD = false;
        v();
        bD = var0;
    }

    private static void v() {
        int var0 = f.e1;
        f.a();
        f.e1 = var0;
        if (!bD || f.e1 < 1) {
            f.e1 = 1;
        }

        if (!bD) {
            f.f1 = 1;
            k.ax = false;
        }

        f.c1 = 0;
        f.g1 = 0;
        if (!bD) {
            for(int var1 = 32; var1 < f.d1; ++var1) {
                f.a1[var1] = 0;
            }
        }

        if (!k.cy) {
            f.b();
        }

        if (k.cy) {
            try {
                i9.u();
                return;
            } catch (Exception var2) {
            }
        }

    }

    public final void b(Graphics var1) {
        try {
            if (var1 != null) {
                var1.setClip(0, 0, e9, a9);
                if (this.j9 >= 0) {
                    var1.setColor(this.j9);
                    var1.fillRect(0, 0, e9, a9);
                }
            }

            if (this.ao != null) {
                this.g(var1);
            } else if (this.J != null) {
                this.c(var1);
                if (this.ak) {
                    this.d(var1);
                }

            } else {
                if (var1 != null) {
                    if (this.bd != null) {
                        var1.drawImage(this.bd, f9 + this.bf, 0, 17);
                    }

                    if (this.be != null) {
                        var1.drawImage(this.be, f9 - this.bf, a9 - this.be.getHeight(), 17);
                    }

                    if ((this.bd != null || this.be != null) && this.ap > 0) {
                        k.a(var1, 0, 0, e9, a9, this.aq, this.ap);
                        return;
                    }

                    if (this.bd != null || this.be != null) {
                        this.f(var1);
                    }

                    if (this.bd != null && i9.v != null && this.bm) {
                        var1.drawImage(i9.v, -(i9.v.getWidth() >> 1), a9 - i9.v.getHeight(), 20);
                    }

                    if (this.bd != null) {
                        return;
                    }

                    if (this.aT != null) {
                        this.e(var1);
                        return;
                    }
                }

                if (this.bE) {
                    if (var1 != null) {
                        var1.setFont(y);
                    }

                    if (this.ak) {
                        this.d(var1);
                    } else {
                        d var2 = x;
                        if (this.aJ == 5) {
                            var2 = A;
                        }

                        if (this.aA != null) {
                            if (i9.cs == null && this.n9) {
                                int var3 = 2;
                                if (e9 >= 240) {
                                    ++var3;
                                }

                                int var4 = 3;
                                if (a9 > 320) {
                                    ++var3;
                                }

                                int var5 = var2.b() - var2.f3 + 2 * var3;
                                int var6 = 4;
                                if (i9.v()) {
                                    var6 = 4 + var2.b() - var2.f3 + 2;
                                }

                                if (a9 > 320) {
                                    var6 += 2;
                                }

                                int var8;
                                if (this.aF != null) {
                                    var5 = this.aF.getHeight();
                                    var8 = var2.f3;
                                    boolean var9 = false;
                                    var3 = var5 - (var2.b() - var8) >> 1;
                                    var4 = 1 + (5 * var5 >> 3);
                                    var6 = 4;
                                }

                                var8 = 0;
                                int var37;
                                int var10 = (var37 = 10 - this.bv * (var5 + var6)) + this.bv * (var5 + var6);
                                boolean var11 = false;
                                boolean var12 = false;
                                int var39;
                                if ((var39 = (a9 * 5 >> 3) / (var5 + var6)) < 1) {
                                    var39 = 1;
                                }

                                if (var39 > this.aA.length) {
                                    var39 = this.aA.length;
                                }

                                int var38 = a9 - (var5 + var6) * var39 >> 1;
                                var38 -= 10;
                                if (var38 < 0) {
                                    var38 = 0;
                                }

                                if (var1 != null) {
                                    if (this.G != null) {
                                        var1.drawImage(this.G, f9, b9, 3);
                                    } else if (!i9.aO) {
                                        var1.setColor(8355711);
                                        var1.fillRect(0, 0, e9, a9);
                                    }
                                }

                                int var15;
                                int var16;
                                int var40;
                                if (this.aX != null) {
                                    boolean var14 = false;
                                    if ((var16 = (var15 = this.aX.length * var2.b()) + 4) > 0) {
                                        if (var1 != null) {
                                            var1.setColor(0);
                                            if (this.f()) {
                                                k.a(var1, 0, 0, e9, var16, 0, 128);
                                            } else {
                                                a(var1, 0, 0, e9, var16, 0, 128);
                                            }

                                            if (this.f()) {
                                                k.a(var1, 0, a9 - var16, e9, var16, 0, 128);
                                            } else {
                                                a(var1, 0, a9 - var16, e9, var16, 0, 128);
                                            }
                                        }
                                    } else {
                                        var16 = 0;
                                    }

                                    var40 = var16 - var15 >> 1;

                                    for(int var17 = 0; var17 < this.aX.length; ++var17) {
                                        if (var1 != null) {
                                            this.aY.a(var1, this.aX[var17], f9, var40, 17);
                                        }

                                        var40 += this.aY.b();
                                    }

                                    if (var38 < var40) {
                                        var38 = var40;
                                    }
                                }

                                var40 = 5;
                                if (this.aJ != 3) {
                                    if (i9.x[2] != null) {
                                        var40 = i9.x[2].getHeight() >> 1;
                                    }
                                } else {
                                    var40 = 0;
                                }

                                var38 += var40;
                                var37 += var38;
                                int var18 = (var10 += var38) - 0 - 3 - 1;
                                boolean var19 = false;
                                String var20 = null;
                                String[] var21 = null;
                                if (this.aJ == 2) {
                                    boolean var22 = false;
                                    var21 = new String[4];
                                    byte var23 = 1;
                                    if (f.l1) {
                                        var23 = 0;
                                    }

                                    var21[0] = k.r[8][var23];
                                    var21[1] = "" + m.K + "%";
                                    var23 = 1;
                                    if (k.du) {
                                        var23 = 0;
                                    }

                                    var21[2] = k.r[19][var23];
                                    var23 = 1;
                                    if (k.fe) {
                                        if (f.o) {
                                            var23 = 0;
                                        }

                                        var21[3] = k.r[8][var23];
                                    } else {
                                        var21[2] = "";
                                    }

                                    if (var21.length > 4) {
                                        var21[4] = "";
                                    }
                                }

                                if (this.aJ == 16) {
                                    var21 = new String[2];
                                    int var42 = 9;
                                    if (k.ec == 0) {
                                        ++var42;
                                    }

                                    var21[0] = k.r[1][var42];
                                    var42 = 0;
                                    if (!k.ax) {
                                        ++var42;
                                    }

                                    var21[1] = k.r[8][var42];
                                }

                                int var24;
                                int var41;
                                if (this.aD) {
                                    var41 = 1;

                                    for(var24 = 0; var24 < this.aA.length; ++var24) {
                                        var20 = this.aA[var24];
                                        if (this.aJ == 2 && var24 < var21.length) {
                                            var20 = var20 + var21[var24];
                                        }

                                        if (this.aJ == 16 && var24 < var21.length) {
                                            var20 = var20 + var21[var24];
                                        }

                                        if (this.aJ == 4) {
                                            var20 = var20 + f.e1;
                                        }

                                        var16 = var2.a(var20) + 2 * var4;
                                        if (this.aJ == 2) {
                                            var16 += var2.a("Ы");
                                        }

                                        if (var41 < var16) {
                                            var41 = var16;
                                        }
                                    }

                                    this.aE = var41;
                                    this.aD = false;
                                }

                                var41 = var10;
                                var24 = 0;
                                this.aW = -1;
                                if (this.aF != null) {
                                    this.aE = this.aF.getWidth();
                                    int var25 = this.bI - 64 * this.aA.length;
                                    this.bH -= 64;
                                    if (this.bH < var25) {
                                        this.bH = var25;
                                    }
                                }

                                int var26 = var2.e3;
                                this.Y = 0;
                                boolean var27 = true;

                                int var30;
                                for(int var28 = 0; var28 < this.aA.length; ++var28) {
                                    var20 = this.aA[var28];
                                    if (this.aJ == 2 && var28 < var21.length) {
                                        var20 = var20 + var21[var28];
                                    }

                                    if (this.aJ == 16 && var28 < var21.length) {
                                        var20 = var20 + var21[var28];
                                    }

                                    if (this.aJ == 4) {
                                        var20 = var20 + f.e1;
                                    }

                                    boolean var29 = var8 < var39;
                                    if (var37 >= var38 && var37 < a9 - var5 - var2.b() - 3 && var29 && var37 < a9 - var5 - 0 - 3 - var40 - 1) {
                                        ++this.Y;
                                        var41 = var37;
                                        ++var8;
                                        var30 = var6 >> 1;
                                        if (this.f()) {
                                            if (var1 != null) {
                                                k.a(var1, 0, var37 - var30, e9, var5 + var6, 0, 128);
                                            } else {
                                                a(var1, 0, var37 - var30, e9, var5 + var6, 0, 128);
                                            }
                                        }

                                        if (this.aF != null) {
                                            if ((var15 = this.bH + var28 * 32) < this.bI) {
                                                var15 = this.bI;
                                            }

                                            if (var15 > this.bI) {
                                                var27 = false;
                                            }

                                            var15 = -var15 + (e9 - this.aF.getWidth() >> 1);
                                            if (var28 == this.as) {
                                                this.aW = var24;
                                                if (var1 != null) {
                                                    var1.drawImage(this.aG, var15, var37, 20);
                                                }
                                            } else if (var1 != null) {
                                                var1.drawImage(this.aF, var15, var37, 20);
                                            }

                                            if (var1 != null) {
                                                var1.setColor(z);
                                            }

                                            if (var1 != null) {
                                                var2.a(var1, var20, var15 + (this.aF.getWidth() >> 1), var37 + var3, 17);
                                            }
                                        } else {
                                            if (var1 != null) {
                                                var1.setColor(0);
                                                if (var1 != null && !this.s && !this.t && !this.bp) {
                                                    var30 = var6 >> 1;
                                                    if (k.d(0, var37 - var30, e9, var5 + var6)) {
                                                        if (var28 != this.as) {
                                                            this.as = var28;
                                                        }

                                                        i9.fc = true;
                                                    }

                                                    if (k.c(0, var37 - var30, e9, var5 + var6)) {
                                                        if (var28 != this.as) {
                                                            this.as = var28;
                                                        }

                                                        i9.fa = true;
                                                        this.N = 53;
                                                        if (k.fF < e9 >> 1) {
                                                            this.N = 52;
                                                        }

                                                        this.T = false;
                                                        this.bh = 0L;
                                                        this.V = true;
                                                        this.U = true;
                                                        this.bh = 0L;
                                                        this.V = false;
                                                    }
                                                }
                                            }

                                            if (var1 != null && var28 == this.as) {
                                                var1.setColor(16777215);
                                                var1.fillRect(0, var37 - 1, e9, var5 + 2);
                                                var1.setColor(0);
                                                var1.fillRect(0, var37, e9, var5);
                                            }

                                            var15 = e9 - var2.a(var20) >> 1;
                                            if (this.aJ == 5) {
                                                var15 = e9 - this.aE >> 1;
                                            }

                                            if (var15 < 1) {
                                                var15 = 1;
                                            }

                                            if (var1 != null) {
                                                var1.setColor(z);
                                                var2.a(var1, var20, var15, var37 + var3, 20);
                                            }
                                        }

                                        ++var24;
                                    } else {
                                        var19 = true;
                                        if (var24 > 0 & this.aW == var24 - 1) {
                                            this.aW = this.aw;
                                        }

                                        if (var28 == this.as) {
                                            if (var37 <= var38) {
                                                --this.bv;
                                            } else {
                                                ++this.bv;
                                            }
                                        }
                                    }

                                    var37 += var5 + var6;
                                }

                                var2.e3 = var26;
                                int var43;
                                if ((var19 && var27 || this.Y > 1) && var1 != null) {
                                    this.a(var1, var10 - 3, var18, var10 > var37, false);
                                    this.a(var1, var41 + var5 + 3, var18, var37 - var5 - var6 > var41, true);
                                    var43 = e9 / 3;
                                    var30 = e9 * 2 >> 2;
                                    int var31;
                                    if ((var31 = e9 - var30 >> 1) < var43) {
                                        var31 = var43;
                                        var30 = e9 - var43 - var43;
                                    }

                                    int var32 = var41 + var5 + 3;
                                    if (var1 != null) {
                                        if (k.c(var31, var32, var30, a9 - var32)) {
                                            this.N = 56;
                                            this.T = false;
                                            this.bh = 0L;
                                            this.V = true;
                                            this.U = true;
                                            this.bh = 0L;
                                            this.V = false;
                                            i9.fc = true;
                                        }

                                        var32 = var10 - 3;
                                        if (k.c(var31, 0, var30, var32)) {
                                            this.N = 50;
                                            this.T = false;
                                            this.bh = 0L;
                                            this.V = true;
                                            this.U = true;
                                            this.bh = 0L;
                                            this.V = false;
                                            i9.fc = true;
                                        }
                                    }
                                }

                                var43 = (var30 = var2.b() - var2.f3 + 2 + 3 + 1) - (var2.b() - var2.f3) >> 1;
                                var43 += a9 - var30;
                                var1.setColor(0);
                                boolean var44 = this.aJ != 3 & this.aJ != 0;
                                String var45 = k.r[11][1];
                                if (this.aJ == 0) {
                                    var45 = k.r[11][5];
                                }

                                if (this.S == null) {
                                    boolean var33 = false;
                                    var1.fillRect(0, a9 - var30 - 0, var2.a(k.r[11][0]) + 4, var30 + 0);
                                    int var34 = var2.a(var45) + 3;
                                    if (var44) {
                                        var1.fillRect(e9 - var34, a9 - var30 - 0, var34, var30 + 0);
                                    }

                                    var1.setColor(100, 100, 100);
                                    int var35 = var2.a(k.r[11][0]) + 4;
                                    var1.drawRect(0, a9 - var30 - 0, var35 - 1, var30 - 1 + 0);
                                    if (var44) {
                                        var1.drawRect(e9 - var34, a9 - var30 - 0, var34 - 1, var30 - 1 + 0);
                                    }

                                    var1.setColor(0);
                                } else {
                                    var43 = a9 - this.S.getHeight() + (this.S.getHeight() - var2.b() >> 1);
                                }

                                this.b(var1, var2, k.r[11][0], 2, var43);
                                if (var44) {
                                    this.b(var1, var2, var45, e9 - 1, var43);
                                }

                                var1.setColor(z);
                                var2.a(var1, k.r[11][0], 2, var43, 20);
                                if (var44) {
                                    var2.a(var1, var45, e9 - 1, var43, 24);
                                }

                                if (this.aZ != null) {
                                    int var46 = 0;
                                    if (e9 <= 132) {
                                        var46 = var30 + 2;
                                    }

                                    var1.drawImage(this.aZ, f9, a9 - (var30 >> 1) - var46, 3);
                                }

                            }
                        }
                    }
                }
            }
        } catch (Exception var36) {
        }
    }

    private final void c(Graphics var1) {
        if (this.J != null) {
            try {
                var1.setColor(0);
                var1.fillRect(0, 0, e9, a9);
                i9.ab = 0;
                int var2 = a9 - this.J[1].getHeight();
                int var3 = e9 * var2 / 40;
                boolean var4 = false;
                if (this.ay == null) {
                    this.ay = new int[var3][4];
                    var4 = true;
                }

                Graphics var5 = var1;
                int var6;
                int var7;
                if (this.m9 != null) {
                    var1.drawImage(this.m9, 0, 0, 20);
                } else {
                    if (this.l9) {
                        this.m9 = Image.createImage(e9, var2);
                        (var5 = this.m9.getGraphics()).setColor(0);
                        var5.fillRect(0, 0, e9, var2);
                    }

                    for(var6 = 0; var6 < var3; ++var6) {
                        int var8;
                        int var9;
                        int var10;
                        if (var4) {
                            var7 = i9.q() * e9 / 100;
                            var8 = i9.q() * var2 / 100;
                            if ((var9 = i9.q() * 255 / 100) < 32) {
                                var9 = 32;
                            }

                            if (var9 > 255) {
                                var9 = 255;
                            }

                            if ((var10 = var9 / 120) < 1) {
                                var10 = 1;
                            }

                            if (var10 > 2) {
                                var10 = 2;
                            }

                            this.ay[var6][0] = var7;
                            this.ay[var6][1] = var8;
                            this.ay[var6][2] = var9;
                            this.ay[var6][3] = var10;
                        } else {
                            var7 = this.ay[var6][0];
                            var8 = this.ay[var6][1];
                            var9 = this.ay[var6][2];
                            var10 = this.ay[var6][3];
                        }

                        var5.setColor(var9, var9, var9);
                        if (var10 > 0) {
                            var5.fillRect(var7, var8, var10, var10);
                        }
                    }

                    if (this.m9 != null) {
                        var1.drawImage(this.m9, 0, 0, 20);
                    }
                }

                for(var6 = 0; var6 < this.J.length; ++var6) {
                    if (var6 == 1 && this.J[var6] != null) {
                        int[] var10000;
                        while(this.K[var6][0] < -this.J[var6].getWidth()) {
                            var10000 = this.K[var6];
                            var10000[0] += this.J[var6].getWidth();
                        }

                        while(this.K[var6][0] > 0) {
                            var10000 = this.K[var6];
                            var10000[0] -= this.J[var6].getWidth();
                        }

                        var7 = this.K[var6][0];

                        do {
                            if (var7 > -this.J[var6].getWidth()) {
                                var1.drawImage(this.J[var6], var7, this.K[var6][1], 20);
                            }
                        } while((var7 += this.J[var6].getWidth()) < e9);
                    } else if (this.J[var6] != null && this.K[var6][0] > -this.J[var6].getWidth()) {
                        var1.drawImage(this.J[var6], this.K[var6][0], this.K[var6][1], 20);
                    }
                }

            } catch (Exception var11) {
            }
        }
    }

    private final void d(Graphics var1) {
        if (this.I != null) {
            this.bq = this.I.getHeight();
            if (this.aa) {
                if (this.I.getWidth() < e9) {
                    var1.setColor(0);
                    var1.fillRect(0, 0, e9, this.bq);
                }

                var1.drawImage(this.I, f9, 0, 17);
                this.aa = false;
            }
        }

        var1.setClip(0, 0, e9, a9);
        var1.translate(-var1.getTranslateX(), this.bq - var1.getTranslateY());
        d var2 = A;
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;

        try {
            int var6;
            if ((var6 = a9 - this.bq) > this.D) {
                var6 = this.D;
            }

            int var8 = e9 - this.bG - this.bK - 1;
            boolean var9 = false;
            int var10 = var2.b() + 1;
            if (e9 >= 240) {
                ++var10;
            }

            if (var6 >= 400) {
                ++var10;
            }

            int var11 = var2.b() - var2.f3 + 2 + 3;
            if (this.S != null) {
                var11 = this.S.getHeight();
            }

            int var12 = (var12 = var11 + 2) + (var2.b() >> 1);
            int var13 = var6 - var12;
            int var15;
            if (this.ae != null) {
                var11 = var6 >> 3;
                if (this.ae[2] != null) {
                    var15 = this.ae[2].getHeight() >> 1 << 1;
                    if (var11 < var15) {
                        var11 = var15;
                    }
                }

                var13 = var6 - var11;
            }

            if (var12 < var11) {
                var12 = var11;
            }

            this.Z = true;
            var15 = this.az.length - 1;
            boolean var16 = false;
            ++var11;
            this.E = var6 - var11 - var11;
            this.bN = this.E;
            --var11;
            int var18 = var13 - var12;
            int var20;
            int var21;
            if (var1 != null) {
                if ((this.G == null || this.G.getWidth() < e9 || this.G.getHeight() < var6) && this.J == null) {
                    var1.setColor(0);
                    var1.fillRect(0, 0, e9, var6);
                }

                if (this.G != null && this.J == null) {
                    var1.drawImage(this.G, f9, b9, 3);
                }

                if (this.ae != null) {
                    if (this.af[0][0] > 0) {
                        this.af[0][0] = 0;
                    }

                    try {
                        if (this.ae[0] != null && this.J == null) {
                            var1.drawImage(this.ae[0], this.af[0][0], this.af[0][1], 20);
                        }

                        if (this.af[0][0] < 0) {
                            if (this.ae[0] != null) {
                                int[] var10000 = this.af[0];
                                var10000[0] += this.ae[0].getWidth() >> 3;
                            } else {
                                this.af[0][0] = 0;
                            }

                            this.bL = var18;
                            return;
                        }
                    } catch (Exception var31) {
                    }

                    int var19 = var18;
                    if (this.bl) {
                        var19 = -var18;
                    }

                    if (this.J != null) {
                        this.bL -= var19 >> 4;
                    } else {
                        this.bL -= var19 >> 3;
                    }

                    var20 = var18 - this.bL;
                    if (this.f()) {
                        k.a(var1, 0, var6 - var20 >> 1, e9, var20, 0, 128);
                    } else {
                        a(var1, 0, var6 - var20 >> 1, e9, var20, 0, 128);
                    }

                    if (this.bL > 0) {
                        return;
                    }

                    this.bL = 0;
                    if (this.ae[1] != null) {
                        var21 = (var6 - var18 >> 1) + var18;
                        var21 += var6 - var21 + this.ae[1].getHeight() >> 1;
                        var1.drawImage(this.ae[1], this.bu, var21, 20);
                    }

                    if (this.ae[2] != null) {
                        var21 = this.ae[2].getHeight() >> 1;
                        int var22 = 2 * var21 + 2;
                        this.E = var18 - 2 * var22;
                        int var33;
                        var4 = (var33 = var6 - this.E >> 1) - var22 + (var22 - var21 >> 1);
                        var5 = var33 + this.E + (var22 - var21 >> 1);
                    }

                    this.bN = this.E;
                }

                this.bL = 0;
                if (this.ae == null) {
                    if (this.S == null) {
                        var1.setColor(6, 41, 0);
                        k.b(var1, 0, 0, e9, var11, 128, 96);
                        if (this.bg != null) {
                            var1.drawImage(this.bg, 1, var11 - this.bg.getHeight() >> 1, 20);
                        }

                        k.b(var1, 0, var6 - var11, e9, var11, 128, 96);
                        var1.setColor(126, 255, 0);
                        var1.drawRect(0, 0, e9 - 1, var11 - 1);
                        var1.drawRect(0, var6 - var11, e9 - 1, var11 - 1);
                    }

                    var1.setColor(0);
                }

                if (this.ae == null) {
                    var1.setColor(z);
                    var20 = var11 - (var2.b() - var2.f3) >> 1;
                    this.b(var1, var2, this.az[0], 1, var20);
                    var2.a(var1, this.az[0], 1, var20, 20);
                    var21 = 3;
                    if (this.aU == 2) {
                        ++var21;
                    }

                    var20 += var6 - var11;
                    this.b(var1, var2, k.r[11][2], 1, var20);
                    var2.a(var1, k.r[11][2], 1, var20, 20);
                    this.b(var1, var2, k.r[11][var21], e9 - 1, var20);
                    var2.a(var1, k.r[11][var21], e9 - 1, var20, 24);
                }
            }

            var1.setClip(0, var12, e9, var18);
            var20 = this.bt - var18;
            this.bs = 1;
            if (var20 >= var10) {
                var21 = var20 / var10;
                var20 -= var21 * var10;
                this.bs += var21;
            }

            var12 -= var20;
            if (var18 > 0) {
                this.Z = this.bs >= this.az.length;
            }

            int var35;
            for(var35 = this.bs; var35 < this.az.length; ++var35) {
                int var34 = this.bu;
                if (var1 != null) {
                    char var37 = 0;

                    try {
                        var37 = this.az[var35].charAt(0);
                    } catch (Exception var30) {
                    }

                    byte var36 = 4;
                    boolean var23 = true;
                    switch(var37) {
                        case '/':
                            var36 = 8;
                            var34 = var8 - 1;
                            var23 = false;
                            break;
                        case '|':
                            var36 = 1;
                            var34 = (var8 - this.bu >> 1) + this.bu;
                            var23 = false;
                    }

                    if (var23) {
                        if (this.aU == 8) {
                            this.a(var1, var2, this.az[var35], var34, var12);
                        } else {
                            var2.a(var1, this.az[var35], var34, var12, 20);
                        }
                    } else {
                        var2.a(var1, this.az[var35], 1, this.az[var35].length() - 1, var34, var12, var36 | 16);
                    }
                }

                if ((var12 += var10) >= var13) {
                    this.Z = false;
                    break;
                }
            }

            var1.setClip(0, 0, e9, var6);
            var35 = this.bt;
            var11 = var6 - this.E >> 1;
            int var38 = var15 * var10;
            boolean var24 = false;
            if (var38 <= 0) {
                var38 = 1;
                var24 = true;
            }

            int var25;
            if ((var25 = this.E * var18 / var38) > this.E >> 3) {
                var25 = this.E >> 3;
            }

            if (var25 < this.F) {
                var25 = this.F;
            }

            if (var25 > this.E) {
                var25 = this.E;
            }

            int var26;
            if ((var26 = var38 - var18 + 2 * var18) <= 0) {
                var26 = 1;
                var24 = true;
            }

            int var27;
            int var28 = (var27 = this.bN - var25) * var35 / var26;
            if (var24) {
                var25 = this.E;
                var28 = 0;
            }

            if (var28 < 0) {
                var28 = 0;
            }

            if (var28 > var27) {
                var28 = var27;
            }

            if (this.aU != 2 && this.J == null) {
                var1.setColor(168, 169, 151);
                var1.fillRect(e9 - this.bG - this.bK, var11, this.bG - 1, this.E - 1);
                var1.setColor(0);
                var1.drawRect(e9 - this.bG - this.bK, var11, this.bG - 1, this.E - 1);
                var1.setColor(153, 253, 240);
                var1.fillRect(e9 - this.bG - this.bK, var11 + var28 + 1, this.bG, var25 - 2);
                var1.setColor(0);
                var1.fillRect(e9 - this.bG - this.bK + 1, var11 + var28 + 1 + 1, this.bG - 1 - 1, var25 - 2 - 2);
                if (this.ae[2] != null) {
                    int var29 = e9 - this.bG - this.bK + (this.bG >> 1) - (this.ae[2].getWidth() >> 1);
                    if (this.aj) {
                        var4 -= 2;
                    }

                    var1.setClip(0, var4, e9, this.ae[2].getHeight() >> 1);
                    var1.drawImage(this.ae[2], var29, var4, 20);
                    if (this.ai) {
                        var5 += 2;
                    }

                    ++var5;
                    var1.setClip(0, var5, e9, this.ae[2].getHeight() >> 1);
                    var1.drawImage(this.ae[2], var29, var5 - (this.ae[2].getHeight() >> 1), 20);
                    var1.setClip(0, 0, e9, var6);
                }
            }
        } catch (Exception var32) {
        }

        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
    }

    private final void e(Graphics var1) {
        try {
            var1.setClip(0, 0, e9, a9);
            var1.setColor(65280);
            int var2;
            if ((var2 = (a9 >> 1) / this.aT.length) < x.b()) {
                var2 = x.b();
            }

            int var3 = a9 / 3;
            int var4 = a9 - (this.aT.length + 4) * var2 >> 1;
            if (var3 > var4) {
                var3 = var4;
            }

            int var5 = var3;

            for(int var6 = 0; var6 < this.aT.length; ++var6) {
                x.a(var1, this.aT[var6], e9 >> 1, var5, 17);
                var5 += var2;
            }

            if (this.aR != null) {
                x.a(var1, this.aR, e9 >> 1, var5, 17);
            }

            if (this.aS != null && this.aS.length > 0) {
                var5 = a9 - var2;
                if (this.aS[0] != null && this.aS[0].length() > 1 && this.aR != null && this.aR.length() >= this.aQ) {
                    x.a(var1, this.aS[0], 2, var5, 20);
                }

                if (this.aS.length > 1 && this.aS[1] != null && this.aS[1].length() > 1) {
                    x.a(var1, this.aS[1], e9 - 2, var5, 24);
                }
            }

        } catch (Exception var8) {
        }
    }

    private final void f(Graphics var1) {
        if (this.bF > 0) {
            d var2;
            int var3;
            int var4 = (var3 = (var2 = x).b() - var2.f3 + 5) - (var2.b() - var2.f3) >> 1;
            String var5 = "";
            if (this.bF == 1) {
                var5 = k.r[1][8];

                try {
                    if (i9.v()) {
                        var5 = k.r[1][11];
                    }
                } catch (Exception var8) {
                }
            }

            int var6;
            if (this.bF == 2) {
                var5 = k.r[1][2] + k.r[1][5];
                k.a(var1, 0, a9 - var3, e9, var3, 0, 190);
                var6 = a9 - var3;
                var2.a(var1, k.r[1][3], 2, var6 + var4, 20);
                var2.a(var1, k.r[1][4], e9 - 1 - 2, var6 + var4, 24);
            }

            var6 = a9 - var3 >> 1;
            k.a(var1, 0, var6, e9, var3, 0, 190);
            var2.a(var1, var5, f9, var6 + var4, 17);
        }

    }

    private final void a(Graphics var1, d var2, String var3, int var4, int var5) {
        int var6 = var4;
        int var7 = var5 + var2.b() - var2.f3;
        int var10 = var3.length();
        int var11 = 0;
        boolean[] var12 = new boolean[]{true};
        int[] var13 = new int[]{var2.a("28. "), e9 >> 1};
        char[] var14 = new char[]{' ', '*'};
        int var15 = 0;

        for(char var16 = '0'; var16 <= '9'; ++var16) {
            if (var15 < var2.a(var16)) {
                var15 = var2.a(var16);
            }
        }

        if (var15 < var2.a('-')) {
            var15 = var2.a('-');
        }

        int var17 = e9 - this.bu - this.bG - this.bK - 1 - var15 * 5 - 2;
        boolean var18 = false;

        for(int var19 = 0; var19 < 0 + var10; ++var19) {
            if (var3.charAt(var19) == '*') {
                if (var6 < var17) {
                    var6 = var17;
                }

                ++var19;
                var18 = true;
            }

            if (var18) {
                var2.a(var1, var3.charAt(var19), var6 + (var15 - var2.a(var3.charAt(var19)) >> 1), var7);
                var6 += var15;
            } else {
                var6 += var2.a(var1, var3.charAt(var19), var6, var7);
            }

            if (var11 < var12.length && var3.charAt(var19) == var14[var11]) {
                if (var13[var11] > 0 && var6 < var13[var11]) {
                    var6 = var13[var11];
                }

                while(var19 + 1 < var3.length() && var3.charAt(var19 + 1) == ' ') {
                    ++var19;
                }

                ++var11;
            }
        }

    }

    private void a(String var1) {
        k.l();
        boolean var2 = false;
        String var3 = null;

        try {
            if (this.aU == 5) {
                var3 = br;
                br = null;
            } else if (this.aU == 3) {
                boolean var4 = false;
                var3 = k.r[23][0] + '\r' + k.r[23][1] + this.d9;
            } else if (this.aU == 8) {
                var3 = k();
            } else {
                var3 = f.instanceHandler.f(k.a(this.bO[this.aU]) + var1);
            }

            if (var3 == null) {
                var2 = true;
            } else if (var3.length() < 1) {
                var2 = true;
            }
        } catch (Exception var9) {
            var2 = true;
        }

        if (!var2) {
            if (this.aJ >= 0 && this.aJ < this.av.length) {
                this.av[this.aJ] = (byte)this.as;
            }

            i9.c(-1);
            this.W = 3;
            this.G = null;
            this.l();
            this.aa = true;
            this.az = f.instanceHandler.a(var3, A, e9 - 2 * this.bu - this.bG - this.bK - 1, true);
            this.bs = 1;
            this.bt = 0;
            this.ak = true;
            this.N = 0;
            this.T = false;
            this.U = false;
            this.C = i9.aO;
            this.k9 = this.j9;
            i9.aO = false;
            this.j9 = -1;
            this.bq = 0;
            this.D = a9;
            this.I = null;
            if (this.aU == 5) {
                this.i();
            }

            try {
                this.ae = new Image[3];

                for(int var11 = 0; var11 < this.ae.length; ++var11) {
                    if (this.J == null) {
                        try {
                            if (var11 == 0) {
                                this.ae[var11] = f.b("/c_" + var11 + ".png");
                            } else {
                                this.ae[var11] = f.a("/c_" + var11 + ".png");
                            }
                        } catch (Exception var8) {
                        }
                    }
                }

                this.af = new int[this.ae.length][2];
                if (this.ae[0] != null) {
                    try {
                        this.ae[0] = f.a(this.ae[0]);
                    } catch (OutOfMemoryError var7) {
                    }

                    if (this.ae[0] != null && this.ae[0].getHeight() != a9) {
                        try {
                            this.ae[0] = f.a(this.ae[0], 0, 0, this.ae[0].getWidth(), this.ae[0].getHeight(), this.ae[0].getWidth() * a9 / this.ae[0].getHeight(), a9, 0, false, true);
                        } catch (OutOfMemoryError var6) {
                        }
                    }

                    this.af[0][0] = -this.ae[0].getWidth();
                    this.af[0][1] = a9 - this.ae[0].getHeight() >> 1;
                }
            } catch (OutOfMemoryError var10) {
                this.ae = null;
            }

            this.bL = b9;
        }
    }

    final void d() {
        this.a("");
    }

    private void w() {
        k.l();
        this.ae = null;
        this.I = null;
        this.az = null;
        this.ak = false;
        this.N = 0;
        this.T = false;
        this.U = false;
        i9.aO = this.C;
        this.j9 = this.k9;
        if (i9.aO && k.cq) {
            this.j9 = -1;
            this.G = null;
        } else {
            if (this.G == null) {
                this.b(k.a(this.aC[14]), (Image)null);
            }

            if (this.G == null) {
                this.b(k.a(this.aC[15]), (Image)null);
            }

            if (this.G == null) {
                this.b(k.a(this.aC[11]), (Image)null);
            }

            if (this.G != null) {
                this.j9 = this.k9;
            }

            this.bv = 0;
            this.C();
        }
    }

    private final void a(Graphics var1, int var2, int var3, boolean var4, boolean var5) {
        if (i9.x[2] != null) {
            int var6 = i9.x[2].getWidth();
            int var7 = i9.x[2].getHeight() >> 1;
            int var8 = f9 - (var6 >> 1);
            if (this.aF != null) {
                var8 = this.aF.getWidth() * 10 / 166 - (var6 >> 1);
            }

            int var9 = 0;
            Image var10 = i9.x[2];
            if (var5) {
                var9 = var7;
                var2 += this.bw;
                if (this.Q && i9.x[3] != null) {
                    var10 = i9.x[3];
                }
            } else {
                var2 = var2 - var7 - this.bw;
                if (this.R && i9.x[3] != null) {
                    var10 = i9.x[3];
                }
            }

            var1.setClip(var8, var2, var6, var7);
            var1.drawImage(var10, var8, var2 - var9, 20);
            var1.setClip(0, 0, e9, a9);
        } else {
            if (var4) {
                var1.setColor(10223442);
            } else {
                var1.setColor(35346);
            }

            if (!var5) {
                var2 -= var3;
            }

            a(var1, f9, var2, var3 << 1, var3, var5);
        }
    }

    static final void a(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
        if (var5) {
            var1 -= var3 >> 1;
        }

        int var6;
        if ((var6 = var3 / var4) < 1) {
            var6 = 1;
        }

        int var7;
        if ((var7 = var6 >> 1) < 1) {
            var7 = 1;
        }

        var6 = var7 * 2;
        var7 = -var7;
        if (var5) {
            var7 = -var7;
            var6 = -var6;
        } else {
            var3 = 1;
        }

        for(int var8 = var2; var8 < var2 + var4; ++var8) {
            var0.drawLine(var1, var8, var1 + var3 - 1, var8);
            var1 += var7;
            var3 += var6;
        }

    }

    private final void x() {
        this.q();
        i9.z();
        if (this.t && k.b10 != null) {
            if (i9.h()) {
                i9.c(1);
                this.bb = System.currentTimeMillis();
                this.an = 0;
                this.s = true;
                this.t = false;
            } else {
                i9.c(5);
            }
        }

        if (this.s && k.b10 != null && !n.s && System.currentTimeMillis() - this.bb > 177L) {
            if (n.c12 != null && this.an >= 2) {
                if (i9.e()) {
                    this.A();
                    this.s = false;
                    return;
                }

                i9.c(2);
                i9.d();
                this.s = false;
            }

            if (n.c12 != null) {
                ++this.an;
            } else {
                i9.c(4);
                this.s = false;
            }
        }

        long var1 = System.currentTimeMillis();
        this.q += this.r;
        if (this.q <= 110) {
            this.r = Math.abs(this.r);
        }

        if (this.q >= 210) {
            this.r = -Math.abs(this.r);
        }

        if (var1 - this.bB > 180L) {
            if (this.X > 0 || !this.aI) {
                this.aI = !this.aI;
                --this.X;
                this.bB = var1;
            }

            if (this.X <= 0 && var1 - this.bB > 580L) {
                this.aI = true;
                this.X = 3;
                this.bB = var1;
            }
        }

        if (var1 - this.bx > 80L) {
            this.bw += this.o;
            if (this.bw < 0) {
                this.bw = 1;
                this.o = 1;
            }

            if (this.bw > 2) {
                this.bw = 1;
                this.o = -1;
            }

            this.bx = var1;
            if (this.aH != null) {
                ++this.aP;
                if (this.aP >= this.aH.length || this.aP < 1 || this.aH[this.aP] == null) {
                    this.aP = 1;
                }

                if (this.aH[this.aP] != null) {
                    this.aG = this.aH[this.aP];
                }
            }
        }

        if (i9 != null) {
            try {
                long var3 = System.currentTimeMillis();
                if (!i9.aO) {
                    i9.repaint();
                    i9.serviceRepaints();
                } else {
                    i9.a();
                }

                long var5 = System.currentTimeMillis();
                if (!i9.aO) {
                    this.c();
                }

                long var7 = var5 - var3;
                long var9 = 64L;
                if (this.ak) {
                    var9 = 47L;
                }

                if (var7 < var9) {
                    Thread.sleep(var9 - var7);
                }

                if (this.ak) {
                    var7 = System.currentTimeMillis() - var3;
                    this.ah = (int)(var7 * (long)A.b() / 50L);
                    short var11 = 350;
                    if (e9 >= 240) {
                        var11 = 280;
                    }

                    this.ag = (int)(var7 * (long)A.b() / (long)var11);
                    if (this.ag < 1) {
                        this.ag = 1;
                    }

                    if (this.ag > A.b()) {
                        this.ag = A.b();
                    }

                    if (this.ah < 1) {
                        this.ah = 1;
                    }

                    if (this.bL > 0) {
                        return;
                    }

                    int var12 = this.ag;
                    this.aj = false;
                    this.ai = false;
                    if (this.N != 0) {
                        var12 = 0;
                        switch(this.N) {
                            case -2:
                            case 56:
                                var12 = this.ah;
                                this.ai = true;
                                break;
                            case -1:
                            case 50:
                                var12 = -this.ah;
                                this.aj = true;
                        }
                    }

                    if (this.ab != var12) {
                        int var13;
                        if ((var13 = Math.abs(this.ab - var12)) > 1) {
                            var13 = 1;
                        }

                        if (this.ab < var12) {
                            this.ab += var13;
                        } else {
                            this.ab -= var13;
                        }
                    }

                    if (k.dr) {
                        if (k.ds) {
                            this.bc = k.fZ;
                        } else {
                            this.ab = -(k.fZ - this.bc);
                            this.bc = k.fZ;
                        }
                    } else {
                        if (this.ab < -this.ah) {
                            this.ab = -this.ah;
                        }

                        if (this.ab > this.ah) {
                            this.ab = this.ah;
                        }
                    }

                    if (this.ab < 0) {
                        if (this.bt > 0) {
                            this.bt += this.ab;
                        }

                        if (this.bt < 0) {
                            this.bt = 0;
                        }

                        return;
                    }

                    if (!this.Z) {
                        this.bt += this.ab;
                        return;
                    }

                    this.bt = 0;
                }

                return;
            } catch (Exception var15) {
            }
        }

    }

    public final void e() {
        this.ax = false;
        this.bd = null;
        this.be = null;
        this.ao = null;
        this.j9 = -1;
        this.n9 = true;
        w = false;
        this.bE = false;
        this.am = al;
        u = false;
        if (al) {
            this.N = 0;
            i9.aO = false;

            try {
                this.ar = e9;
                this.j9 = 0;
                this.ao = f.b(k.a(this.aC[0]));
                this.t();
                this.ao = null;
                Thread.sleep(330L);
            } catch (Exception var15) {
            }

            this.h();
            if (!this.n9) {
                return;
            }

            if (this.N == 42) {
                k.C = false;
            }

            if (this.N == 48) {
                k.C = false;
            }

            try {
                this.ao = null;
                Thread.sleep(33L);
                this.ao = f.b(k.a(this.aC[1]));
                if (this.ao != null) {
                    this.ar = e9;
                    this.j9 = 0;
                    this.t();
                    this.ao = null;
                    Thread.sleep(330L);
                }
            } catch (Exception var14) {
            }

            this.a(true);
            i9.aO = false;
            f.e1 = 0;
            this.m();
        } else {
            s();
        }

        this.be = null;
        this.bd = null;
        this.N = 0;
        this.U = false;
        this.T = true;
        this.j9 = -1;
        this.ao = null;
        al = false;

        try {
            Thread.sleep(33L);
        } catch (Exception var13) {
        }

        this.C = i9.aO;
        this.k9 = this.j9;
        if (!this.ak) {
            this.w();
        }

        if (this.bg == null) {
            try {
                this.bg = f.a(k.a(this.aC[2]));
            } catch (Exception var12) {
            }
        }

        if (this.aF == null) {
            try {
                this.aF = f.a(k.a(this.aC[3]));
                this.bJ = e9;
                this.bI = e9 - this.aF.getWidth() >> 1;
                this.bH = this.bJ;
                this.aG = f.a(k.a(this.aC[4]));
                this.aH = new Image[5];
                this.aH[1] = this.aG;

                for(int var1 = 2; var1 < this.aH.length; ++var1) {
                    this.aH[var1] = f.a(k.a(this.aC[5]) + var1 + k.a(this.aC[6]));
                }
            } catch (Exception var17) {
            }
        }

        if (this.S == null) {
            try {
                this.S = f.a(k.a(this.aC[7]));
            } catch (Exception var11) {
            }
        }

        if (this.aZ == null) {
            try {
                this.aZ = f.a(k.a(this.aC[8]));
            } catch (Exception var10) {
            }
        }

        this.y();
        u = false;
        byte var18 = 0;
        if (this.am) {
            var18 = 3;
        }

        this.c(var18);
        this.aK = var18;
        this.N = 0;
        this.n9 = true;
        this.bE = true;
        if (B) {
            this.aU = 1;
            this.d();
            B = false;
        }

        if (br != null) {
            this.aU = 5;
            this.d();
            br = null;
        }

        if (this.aZ == null) {
            try {
                this.aZ = f.a(k.a(this.aC[8]));
            } catch (Exception var9) {
            }
        }

        this.ax = true;
        long var2 = 0L;

        while(this.n9 || this.ak || i9.cs != null) {
            if (w) {
                return;
            }

            this.R = false;
            this.Q = false;

            try {
                if (this.N != 0) {
                    long var4;
                    if ((var4 = System.currentTimeMillis() - var2) >= this.bh * 3L) {
                        this.bh = 0L;
                    } else {
                        this.bh = (this.bh * 3L - var4) / 3L;
                    }

                    if (!this.ak) {
                        for(int var6 = 0; (long)var6 < this.bh; ++var6) {
                            try {
                                Thread.sleep(3L);
                            } catch (Exception var8) {
                            }

                            this.q();
                            if (this.N == 0 || this.V) {
                                break;
                            }
                        }
                    }

                    if (this.N != 0) {
                        this.o();
                    }

                    this.bh = this.bj;
                    if (this.V) {
                        this.V = false;
                        this.bh = this.bi;
                    }

                    var2 = System.currentTimeMillis();
                }

                if (this.n9 || this.ak || i9.cs != null) {
                    this.x();
                }

                Thread.sleep(3L);
            } catch (Exception var16) {
            }
        }

        if (i9.S && h.G != 1L) {
            if (ad == null) {
                ad = j();
            }

            i9.g();
            i9.bJ = 0;
            i9.dE = true;
            i9.ev = true;
            i9.p();
        }

        this.ae = null;
        k.l();
        k.a5 = null;
        this.az = null;
        this.aA = null;
        this.ao = null;
        this.G = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.S = null;
        i9.i();
    }

    private final void y() {
        ba = false;
    }

    private static void z() {
        boolean var0 = f.l1;
        boolean var1 = f.o;
        boolean var2 = f.h1;
        boolean var3 = k.du;
        int var4 = m.K;
        int var5 = f.e1;
        f.a();
        f.l1 = var0;
        f.o = var1;
        f.h1 = var2;
        k.du = var3;
        m.K = var4;
        f.b();
        f.e1 = var5;
    }

    private final void b(Graphics var1, d var2, String var3, int var4, int var5) {
        if (var1 != null && var3 != null && var3.length() > 1 && this.S != null) {
            boolean var6 = false;
            int var7 = 0;
            if (var5 >= b9) {
                var7 = a9 - this.S.getHeight();
            }

            int var8;
            if (var4 >= f9) {
                var8 = e9 - var2.a(var3 + " ");
            } else {
                var8 = -(this.S.getWidth() - var2.a(var3 + " "));
            }

            var1.drawImage(this.S, var8, var7, 20);
        }
    }

    private final void A() {
        f.e1 = k.cz;
        if (f.e1 < 1) {
            f.e1 = 1;
        }

        k.ax = (k.cl & 2) != 0;
        k.ec = (byte)(k.cl & 1);
        if (k.ec < 0) {
            k.ec = 0;
        }

        if (k.ec > 1) {
            k.ec = 1;
        }

        this.i();
    }

    final boolean f() {
        if (this.bC < 0) {
            this.bC = 0;

            try {
                Image var1;
                Graphics var2;
                (var2 = (var1 = Image.createImage(1, 1)).getGraphics()).setColor(16777215);
                var2.fillRect(0, 0, 1, 1);
                k.a(var2, 0, 0, 1, 1, 0, 127);
                int[] var3 = new int[1];
                var1.getRGB(var3, 0, 1, 0, 0, 1, 1);
                int var4;
                if ((var4 = var3[0] & 255) > 96 && var4 < 160) {
                    this.bC = 1;
                }
            } catch (Exception var6) {
            }
        }

        return this.bC > 0;
    }

    private boolean a(byte[] var1, int var2) {
        try {
            try {
                if (var1[var2] > 0) {
                    return true;
                }

                if (var1[var2] < 0) {
                    return false;
                }

                var1[var2] = -1;
                f.a(k.cI, var1);
                i9.m();

                try {
                    Class.forName("javax.microedition.io.Connector");
                    Class.forName("javax.bluetooth.DiscoveryAgent");
                    this.x();
                    var1[var2] = 1;
                    f.a(k.cI, var1);
                    return true;
                } catch (Exception var4) {
                    this.x();
                }
            } catch (Throwable var5) {
                this.x();
            }

            return false;
        } catch (Exception var6) {
            return false;
        }
    }

    private boolean B() {
        return this.a(f.a1, 31);
    }

    private void a(int var1, int var2) {
        int var3 = var1 / 3;
        int var5 = var2 >> 2;
        int[] var6 = new int[]{49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 48, 35};
        int var7 = 0;
        if (k.dr && (k.ds || this.bA)) {
            for(int var8 = 0; var8 < 4; ++var8) {
                for(int var9 = 0; var9 < 3; ++var9) {
                    int var10 = var9 * var3;
                    int var11 = var8 * var5;
                    if (k.b(var10, var11, var3, var5)) {
                        try {
                            if (k.ds) {
                                i9.fc = true;
                            }

                            label178:
                            switch(var6[var7]) {
                                case 35:
                                    this.by = true;
                                    break;
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 52:
                                case 53:
                                case 54:
                                default:
                                    this.by = false;
                                    int var18 = 0;

                                    while(true) {
                                        if (var18 >= this.bz.length) {
                                            break label178;
                                        }

                                        this.bz[var8] = 0;
                                        ++var18;
                                    }
                                case 49:
                                    int var16 = 0;

                                    for(; var16 < this.M.length; ++var16) {
                                        if (var16 != 1) {
                                            this.M[var16] = 0;
                                        }
                                    }

                                    if ((this.by || this.M[1] > 0) && ++this.M[1] == 3) {
                                        k.ep = !k.ep;
                                    }

                                    this.by = false;
                                    break;
                                case 50:
                                    for(int var15 = 0; var15 < this.bz.length; ++var15) {
                                        if (var15 != 2) {
                                            this.bz[var15] = 0;
                                        }
                                    }

                                    if ((this.by || this.bz[2] > 0) && ++this.bz[2] == 3) {
                                        bD = true;
                                    }

                                    this.by = false;
                                    break;
                                case 51:
                                    for(int var17 = 0; var17 < this.M.length; ++var17) {
                                        if (var17 != 3) {
                                            this.M[var17] = 0;
                                        }
                                    }

                                    if ((this.by || this.M[3] > 0) && ++this.M[3] == 3) {
                                        this.by = false;
                                    }
                                    break;
                                case 55:
                                    for(int var12 = 0; var12 < this.bz.length; ++var12) {
                                        if (var12 != 7) {
                                            this.bz[var12] = 0;
                                        }
                                    }

                                    if ((this.by || this.bz[7] > 0) && ++this.bz[7] == 3) {
                                        k.aR = true;
                                    }

                                    this.by = false;
                                    break;
                                case 56:
                                    for(int var13 = 0; var13 < this.bz.length; ++var13) {
                                        if (var13 != 8) {
                                            this.bz[var13] = 0;
                                        }
                                    }

                                    if ((this.by || this.bz[8] > 0) && ++this.bz[8] == 3) {
                                        k.aS = true;
                                    }

                                    this.by = false;
                                    break;
                                case 57:
                                    for(int var14 = 0; var14 < this.bz.length; ++var14) {
                                        if (var14 != 9) {
                                            this.bz[var14] = 0;
                                        }
                                    }

                                    if ((this.by || this.bz[9] > 0) && ++this.bz[9] == 3) {
                                        k.aT = true;
                                    }

                                    this.by = false;
                            }
                        } catch (Exception var19) {
                        }
                    }

                    ++var7;
                }
            }
        }

        if (k.dr) {
            this.bA = false;
        } else {
            this.bA = true;
        }
    }

    private final void C() {
        int var1 = this.bv;

        for(int var2 = 0; var2 < 7; ++var2) {
            try {
                this.b((Graphics)null);
            } catch (Exception var4) {
            }

            if (this.bv == var1) {
                return;
            }

            var1 = this.bv;
        }

    }

    static final void g() {
        e9 = i9.getWidth();
        a9 = i9.getHeight();
        f9 = e9 >> 1;
        b9 = a9 >> 1;
    }

    private static boolean D() {
        return f.e1 > 1 || f.c1 != 0 || f.f1 > 1;
    }

    private void g(Graphics var1) {
        try {
            var1.setClip(0, 0, e9, a9);
            var1.setColor(0);
            var1.fillRect(0, 0, e9, a9);
            if (this.ar < e9) {
                int var2 = (a9 >> 3) * 3 - (this.ao.getHeight() >> 1);
                if (this.H == null && this.ar < 0) {
                    var2 = a9 - this.ao.getHeight() >> 1;
                }

                var1.drawImage(this.ao, (e9 >> 1) - (this.ao.getWidth() >> 1), var2, 20);
                if (this.ar >= 0) {
                    if (this.H != null) {
                        var1.drawImage(this.H, (e9 >> 1) - (this.H.getWidth() >> 1), a9 - (a9 >> 3) - (this.H.getHeight() >> 1), 20);
                    }

                    var1.setColor(185, 185, 185);
                    var1.fillRect((e9 >> 1) - (this.ar >> 1) - (this.ar >> 2), a9 - (a9 >> 4), this.ar + (this.ar >> 1), 1);
                    int var9 = 640 / this.ar;
                    int var10 = 640 / this.ar;
                    int var11 = 640 / this.ar;
                    int var12 = 740;
                    int var13 = 740;
                    int var14 = 740;

                    for(short var15 = 0; var15 < this.ar; ++var15) {
                        var12 -= var9;
                        var13 -= var10;
                        var14 -= var11;
                        var1.setColor(var12 >> 2, var13 >> 2, var14 >> 2);
                        var1.fillRect((e9 >> 1) - (this.ar >> 1) - var15 - 1, a9 - (a9 >> 4), 1, 1);
                        var1.fillRect((e9 >> 1) + (this.ar >> 1) + var15, a9 - (a9 >> 4), 1, 1);
                    }
                }
            } else {
                var1.drawImage(this.ao, (e9 >> 1) - (this.ao.getWidth() >> 1), (a9 >> 1) - (this.ao.getHeight() >> 1), 20);
            }

            if (this.ap > 0) {
                k.a(var1, 0, 0, e9, a9, this.aq, this.ap);
            }

        } catch (Exception var16) {
        }
    }
}
