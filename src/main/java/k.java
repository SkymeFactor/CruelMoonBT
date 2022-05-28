//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// Game logic + rendering
public final class k extends a implements Runnable {
    static n b10;
    int c10;
    int d10;
    int e10;
    int f10;
    int g10;
    static boolean h10;
    boolean i10;
    boolean j10;
    boolean k10;
    boolean l10;
    int m10;
    int n10;
    int o;
    int p;
    boolean q;
    static String[][] r;
    String[] s;
    int t;
    boolean u;
    Image v;
    Image[] w;
    Image[] x;
    boolean y;
    boolean z;
    int A;
    int B;
    static boolean C = true;
    byte D;
    int E;
    int F;
    String[] G;
    int H;
    Image[] I;
    int J;
    int K;
    int L;
    int M;
    static byte[] N;
    byte[] O;
    boolean P;
    boolean Q;
    short[][] R;
    boolean S;
    int T;
    boolean U;
    int V;
    int W;
    int X;
    int[] Y;
    byte Z;
    byte aa;
    int ab;
    static byte[] ac;
    int ad;
    boolean ae;
    int af;
    boolean ag;
    boolean ah;
    static int ai;
    static int aj;
    int ak;
    int al;
    short[][] am;
    byte[][] an;
    int ao;
    int ap;
    int aq;
    Image[] ar;
    int as;
    int at;
    Image au;
    static byte av;
    static byte aw = 1;
    static boolean ax = false;
    boolean ay = false;
    boolean[] az;
    Image aA;
    boolean aB;
    boolean aC = false;
    boolean aD = false;
    boolean aE = false;
    int aF;
    int aG;
    byte[][] aH;
    int[] aI;
    boolean aJ;
    static boolean aK;
    boolean aL = false;
    int aM;
    Graphics aN;
    boolean aO;
    static k aP;
    c aQ;
    static boolean aR = false;
    static boolean aS = false;
    static boolean aT = false;
    boolean aU;
    int aV;
    boolean aW;
    boolean aX;
    boolean aY;
    int aZ;
    int ba;
    int bb = 3;
    int bc;
    int bd;
    int be;
    int bf;
    int bg;
    int bh;
    boolean bi;
    int bj;
    Image bk;
    Image bl;
    Image bm;
    boolean bn;
    Image[] bo;
    int bp;
    boolean bq;
    int br;
    int bs;
    int bt;
    int bu;
    int bv;
    int bw;
    int bx;
    boolean by;
    boolean bz;
    static int[][] bA;
    int bB;
    int bC;
    int bD;
    int bE;
    static int[][] bF;
    int bG;
    int bH;
    static int bI = 9;
    int bJ;
    int bK;
    int bL;
    int bM;
    boolean bN;
    static int bO = 4096;
    static int bP = 15;
    static String[][] bQ;
    int bR;
    int bS;
    int bT;
    int bU;
    byte[][] bV;
    int[][] bW;
    byte[][] bX;
    int[][] bY;
    int[][] bZ;
    boolean[] ca;
    boolean[] cb;
    boolean[] cc;
    byte[] cd;
    byte[][] ce;
    byte[][] cf;
    byte[][] cg;
    int[][] ch;
    byte[][] ci;
    byte[][] cj;
    short[][] ck;
    static int cl;
    int cm;
    int cn;
    int co;
    int cp;
    static boolean cq;
    j cr;
    String[] cs;
    String ct;
    boolean cu;
    int[] cv;
    long cw;
    boolean cx;
    static boolean cy = false;
    private Random randomGenerator;
    static byte cz;
    int cA;
    int cB;
    boolean cC;
    boolean cD;
    boolean cE;
    int cF;
    int cG;
    boolean cH;
    static String cI = "MNMc";
    String cJ;
    int cK;
    int cL;
    boolean cM;
    boolean[] cN;
    boolean cO;
    static boolean cP = true;
    static boolean cQ = false;
    static boolean cR = true;
    static final boolean[] cS;
    int cT;
    int cU;
    Image[] cV;
    Image[] cW;
    int cX;
    int cY;
    static boolean cZ;
    static boolean da;
    int db;
    int dc;
    long dd;
    long de;
    long df;
    long dg;
    long dh;
    long di;
    int[][] dj;
    long dk;
    long dl;
    boolean dm;
    boolean dn;
    int doo;
    int dp;
    int dq;
    static boolean dr;
    static boolean ds;
    static boolean dt;
    static boolean du = false;
    byte[] dv;
    static int dw = 8;
    int dx;
    boolean dy;
    static int dz;
    boolean dA;
    boolean dB;
    long dC;
    boolean dD;
    boolean dE;
    static boolean dF;
    int dG;
    int dH;
    int dI;
    int dJ;
    static boolean dK = true;
    boolean dL;
    boolean dM;
    boolean dN;
    boolean dO;
    Image dP;
    int dQ;
    Image[] dR;
    static byte dS = 1;
    static int dT;
    int dU;
    int[] dV;
    int dW;
    boolean[] dX;
    int dY;
    int dZ;
    int ea;
    int eb;
    static byte ec;
    static byte ed;
    static int ee;
    boolean[] ef;
    int eg;
    int eh;
    int ei;
    int ej = 20;
    int ek;
    int el;
    static int em;
    int en;
    int eo;
    static boolean ep = false;
    long eq;
    boolean er;
    static boolean es;
    int[] et;
    static boolean eu;
    boolean ev;
    int[] ew;
    int ex;
    static boolean ey = false;
    Thread ez;
    long eA;
    String eB;
    long eC;
    long eD;
    long eE;
    int eF;
    int eG;
    static long eH;
    long eI;
    static long eJ;
    static long eK;
    int eL;
    int eM;
    long eN;
    long eO;
    long eP;
    long eQ;
    long eR;
    static boolean eS;
    int eT;
    int eU;
    boolean eV;
    int eW;
    Image[] eX;
    boolean eY;
    long eZ;
    boolean fa;
    boolean fb;
    boolean fc;
    boolean fd;
    static boolean fe = true;
    int ff;
    long fg;
    long fh;
    boolean fi;
    boolean fj;
    boolean fk;
    int fl;
    int fm;
    boolean fn;
    boolean fo;
    int fp;
    int fq;
    int fr;
    int fs;
    boolean victory = false;
    long fu;
    long fv;
    int fw;
    int fx;
    int fy;
    int fz;
    int fA;
    int fB;
    int fC;
    int fD;
    int fE;
    static int fF;
    static int fG;
    int fH;
    int fI;
    int fJ;
    int fK;
    int fL;
    int fM;
    int fN;
    int fO;
    int fP;
    int fQ;
    int fR;
    int fS;
    int fT;
    int fU;
    int fV;
    int fW;
    int fX;
    int fY;
    static int fZ;
    static int ga;
    int gb;
    int gc;
    int gd;
    int ge;
    int gf;

    static {
        av = aw;
        ec = 0;
        ed = 0;
        cq = false;
        eS = false;
        aK = false;
        eu = true;
        da = false;
        es = true;
        cS = new boolean[]{false, false, false, false, true, true, true, true, true};
        ee = 1;
        N = new byte[bO];
        h10 = false;
        cZ = false;
        dF = false;
        ds = false;
        dt = false;
        dr = false;
        dz = 256;
        aj = dz;
        ai = dz;
        ac = new byte[1024];
    }

    public k() {
        this.eg = this.ej;
        this.el = this.ej;
        this.ek = this.ej / 2;
        this.eh = this.eg / 2;
        this.ei = this.eg / 4;
        this.cm = 0;
        this.cn = 0;
        this.e10 = this.getWidth();
        this.c10 = this.getHeight();
        this.ae = false;
        this.Q = false;
        this.P = true;
        this.dO = false;
        this.dy = false;
        this.aB = false;
        this.fE = 31;
        this.fX = 31;
        this.cU = 60;
        this.bg = 40;
        this.bY = new int[5][this.cU];
        this.ce = new byte[16][16];
        this.cL = 250;
        this.cf = new byte[this.cL + 2][this.cU + 2];
        this.cg = new byte[this.cL + 2][this.cU + 2];
        this.fD = this.e10 / this.ej;
        this.fW = this.c10 / this.eg;
        this.fB = this.fD;
        this.fU = this.fW;
        this.fJ = 0;
        this.gd = 0;
        this.fK = this.fJ;
        this.ge = this.gd;
        this.fy = 0;
        this.fQ = 0;
        this.fA = this.fy;
        this.fS = this.fQ;
        this.cC = false;
        this.aW = false;
        this.randomGenerator = new Random();
        Runtime.getRuntime();
        this.fT = 0;
        this.aM = this.c10;
        this.aO = false;
        this.S = false;
        this.x = new Image[4];
        int[] var10000 = new int[]{1296389185, 759778886, 793592142, 1229342035, 1412320582};   // META-INF/MANIFEST.MF
        var10000 = new int[]{1399874915, 1768319331, 1635019119, 1845493760};                   // Specification
        var10000 = new int[]{1296647248, 758263344};                                            // MIDP-2.0
        var10000 = new int[]{1684368640};                                                       // dem
        var10000 = new int[]{1819934720};                                                       // lz
        this.aH = new byte[][]{{99, 102, 50}, {102, 110, 116, 50}, {50}, {115, 116}, {116, 108, 107}, {110, 109}, {47, 97, 114, 46, 112, 110, 103}, {47, 97, 114}, {46, 112, 110, 103}, {47, 122, 118, 122, 46, 112, 110, 103}, {46, 106, 112, 103}, {47, 108}, {47, 117}, {99, 99, 51}, {99, 117, 51}, {109, 117, 97}, {47, 105, 108, 49, 46, 112, 110, 103}, {47, 105, 108, 50, 46, 112, 110, 103}, {47, 105, 108, 51, 46, 112, 110, 103}, {47, 105, 108, 108, 46, 112, 110, 103}, {47, 105, 108, 119, 46, 112, 110, 103}, {47, 101, 108, 48, 46, 112, 110, 103}, {47, 101, 108, 49, 46, 112, 110, 103}, {47, 105, 108, 108, 119, 46, 112, 110, 103}};
        this.fw = 0;
        this.fO = 0;
        this.dq = 0;
        this.doo = 0;
        this.dp = 2;
        this.eb = 1;
        this.ea = 1;
        this.aZ = 0;
        this.ah = false;
        this.bB = 8;
        this.ad = 0;
        this.V = 11;
        this.as = 0;
        this.at = 0;
        this.ag = true;
        this.z = false;
        this.bT = 255;
        this.eO = 0L;
        this.aF = 0;
        this.aG = 0;
        this.cu = false;
        this.ev = false;
        this.dE = false;
        this.dB = false;
        this.dn = false;
        this.dm = false;
        this.eU = -1;
        this.eT = -1;
        this.dQ = -1;
        this.dP = null;
        this.aN = null;
        this.eC = 670L;
        this.aJ = false;
        this.U = false;
        this.cH = true;
        this.cT = -this.eg;
        this.dk = 0L;
        this.fl = 0;
        this.fm = 3;
        this.fo = false;
        this.fu = 0L;
        this.bU = 0;
        this.fv = 0L;
        this.eN = 3000L;
        this.dL = false;
        this.eW = -1;
        this.aU = false;
        this.dx = 3;
        this.dj = new int[(this.dx + 1) * (this.dx + 1)][4];
        this.cA = -1;
        this.cG = 1;
        this.A = 0;
        this.B = 0;
        this.bj = 2;
        this.co = 0;
        this.eZ = 0L;
        this.dA = false;
        this.dM = true;
        this.bG = 0;
        this.bH = 0;
        this.fi = false;
        this.bC = 86;
        this.bu = 8;
        this.bt = 2 * this.bu;
        this.bs = 14;
        this.bS = 10;
        this.bR = 1000;
        this.fN = 5;
        this.fq = this.e10 - 2 * this.fN;
        this.fr = 0;
        this.fs = 0;
        this.bJ = 0;
        this.eE = 1700L;
        this.dY = 0;
        this.fC = this.fB;
        this.fV = this.fU;
        this.W = 1;
        this.fM = this.e10;
        this.bf = 0;
        this.ak = 0;
        this.ao = 0;
        this.ap = 0;
        this.cB = -1;
        this.bx = this.c10;
        this.aq = 0;
        this.dN = true;
        this.ff = -1;
        this.fH = -1;
        this.gb = -1;
        this.cF = 0;
        this.Z = 0;
        this.X = 1;
        this.dZ = -1;
        this.eY = false;
        this.cJ = cI + "m";
        this.D = 0;
        this.cx = false;
        this.aV = 0;
        this.bh = 279;
        this.cM = false;
        this.ab = 0;
        this.bE = 4;
        this.cX = 6;
        this.cY = 6;
        this.n10 = 9;
        this.er = false;
        this.y = false;
        this.dG = 0;
        this.dH = 0;
        this.dI = 0;
        this.bv = 0;
        this.bw = 0;
        this.bN = false;
        this.d10 = 35;
        this.bq = false;
        this.br = 0;
        this.cb = new boolean[64];
        this.cc = new boolean[this.cb.length];
        this.ca = new boolean[this.cb.length];
        this.by = true;
        this.bz = false;
        this.al = 65;
        this.E = 249;
        this.t = 22;
        this.bD = 0;
        this.eP = 0L;
        this.fp = this.e10 * 2 / 3;
        this.ba = this.c10 * 2 / 3;
        this.fI = this.e10 - this.fp >> 1;
        this.gc = this.c10 - this.ba >> 1;
        this.en = 0;
        this.f10 = this.e10 / 2;
        this.g10 = this.e10 * 3 / 4;
        this.bn = false;
        this.m10 = 0;
        this.bK = 0;
        this.dv = new byte[32];
        this.bp = 0;
        this.K = 2;
        this.bL = -1;
        this.Y = new int[2];
        this.dV = new int[2];
        this.ef = new boolean[2];
        this.az = new boolean[2];
        eu = true;
        j.init();
        j.e9 = this.e10;
        j.a9 = this.c10;
    }

    private boolean A() {
        return n.b12 ^ this.bn;
    }

    final void a() {
        this.eA = System.currentTimeMillis();
        this.aU();
        if (this.cu) {
            try {
                Thread.sleep(33L);
            } catch (Exception var16) {
            }
        } else {
            this.z();
            this.ah();
            if (this.aB) {
                this.repaint();
                this.serviceRepaints();
            } else {
                long var1 = System.currentTimeMillis();
                if (this.aO && cy) {
                    this.al();
                }

                this.aQ();
                this.ay();
                this.D();
                this.am();
                this.ap();
                int var3 = this.cm;
                int var4 = this.cn;
                if (this.fl > 0) {
                    this.cm += this.randomGenerator.nextInt() % this.fm;
                    this.cn += this.randomGenerator.nextInt() % this.fm;
                    --this.fl;
                }

                this.bG = 0;
                this.bH = 0;
                this.repaint();
                this.serviceRepaints();
                this.cm = var3;
                this.cn = var4;
                this.aq();
                this.as();
                this.ar();
                this.C();
                long var5 = this.b();
                this.a(var5);
                long var7;
                long var9 = (var7 = System.currentTimeMillis()) - var1;
                this.dk = var9;
                da = true;
                eH = var7;
                long var11 = 70L;
                long var13 = 70L;
                if (70L < this.dg) {
                    var13 = this.dg;
                }

                if (var9 < var13) {
                    try {
                        Thread.sleep(var13 - var9);
                    } catch (Exception var17) {
                    }
                }

                try {
                    if (this.T == 0) {
                        this.ct = null;
                    }

                    if (!this.aW && !this.aY && this.ff != 122 && this.ff != 121) {
                        if (this.q) {
                            switch(this.bU) {
                                case 0:
                                    if (!this.q(1, 1) && (this.D & 1) > 0) {
                                        this.ct = r[4][0];
                                    }
                                    break;
                                case 1:
                                    if (!this.k(1)) {
                                        this.ct = r[4][1];
                                    }
                                    break;
                                case 2:
                                    if (this.aU) {
                                        this.ct = r[4][2];
                                    }
                            }
                        }

                        short var15 = 0;
                        if (!s() || this.ci == null || this.ci[this.fy][this.fQ] > 0) {
                            var15 = this.ck[this.fy][this.fQ];
                        }

                        if (this.aW || this.aY) {
                            var15 = 0;
                        }

                        if (this.ct == null) {
                            if (var15 > 0 && var15 <= this.cU) {
                                this.ct = r[6][this.ch[0][var15 - 1]];
                                this.T = 8;
                            }

                            if (var15 >= 64 && var15 - 64 < this.bg) {
                                this.ct = r[5][this.bZ[0][var15 - 64]];
                                this.T = 8;
                            }
                        }
                    } else if (this.q && this.cv[1] < this.ak) {
                        this.ct = r[4][3];
                        this.T = 8;
                    }
                } catch (Exception var18) {
                }

                if (this.T == 8) {
                    this.fv = 0L;
                }

            }
        }
    }

    final long b() {
        long var1 = System.currentTimeMillis();
        boolean var3 = true;
        if (cq || this.aC || !this.aO) {
            this.dC = var1;
            var3 = false;
        }

        long var4 = var1 - this.dC + this.fg;
        if (var3) {
            this.fg = var4;
            this.dC = var1;
        }

        long var6;
        if ((var6 = (long)(ec + 1) * var4) < this.di) {
            var6 = this.di;
            this.fg = var6 / (long)(ec + 1);
        } else {
            this.di = var6;
        }

        long var8 = var4;
        if (this.dL) {
            var8 = var6;
        }

        long var10;
        if ((var10 = var8 - this.fh) < 0L) {
            this.fh = var8;
        }

        if (var10 >= 1000L) {
            long var12;
            if ((var12 = var10 - 1000L) >= 2000L) {
                var12 = 0L;
            }

            this.fh = var8 - var12;
            ++this.eL;
            if (this.eL >= 60) {
                this.eL = 0;
                ++this.eF;
            }
        }

        return var6;
    }

    private final void m(int var1) {
        try {
            if (this.bZ[17][var1] > 0 && this.bZ[16][var1] > 0 && this.bZ[12][var1] > 0) {
                for(int var2 = 0; var2 < this.bg; ++var2) {
                    if (this.bZ[0][var2] == 1 && this.bZ[5][var1] == this.bZ[5][var2] && this.bZ[16][var2] == this.bZ[16][var1] && this.bZ[12][var2] > 0) {
                        this.bZ[12][var2] = 0;
                        this.bZ[17][var2] = 0;
                        break;
                    }
                }

                this.bZ[17][var1] = 0;
                this.bZ[12][var1] = 0;
            }

        } catch (Exception var3) {
        }
    }

    private final boolean b(byte[] var1) {
        byte[] var2;
        int var3 = (var2 = ac).length;

        try {
            if (this.m10 + var1.length > var3) {
                return false;
            }

            int var4 = this.m10;

            for(int var5 = 0; var5 < var1.length; ++var5) {
                var2[var4] = var1[var5];
                ++var4;
            }

            this.m10 += var1.length;
        } catch (Exception var6) {
        }

        return true;
    }

    private final boolean c(byte[] var1) {
        byte[] var2;
        int var3 = (var2 = ac).length;

        try {
            if (this.m10 + var1.length > var3) {
                return false;
            }

            byte[] var4 = new byte[var3];
            System.arraycopy(var2, 0, var4, var1.length, var3 - var1.length);

            for(int var5 = 0; var5 < var1.length; ++var5) {
                var4[var5] = var1[var5];
            }

            ac = var4;
            this.m10 += var1.length;
        } catch (Exception var6) {
        }

        return true;
    }

    final void b(int var1) {
        try {
            if (this.o >= this.dv.length) {
                byte[] var2 = new byte[this.dv.length];
                System.arraycopy(this.dv, 1, var2, 0, this.dv.length - 1);
                this.o = this.dv.length - 1;
                this.dv = var2;
            }

            this.dv[this.o] = (byte)(var1 + 1);
            ++this.o;
        } catch (Exception var3) {
        }
    }

    private final void B() {
        this.cB = -1;
        if (this.fJ < this.fL) {
            this.cB = 126;
        }

        if (this.gd < this.gf) {
            this.cB = 133;
        }

        if (this.fJ > this.fL) {
            this.cB = 129;
        }

        if (this.gd > this.gf) {
            this.cB = 134;
        }

        this.fL = this.fJ;
        this.gf = this.gd;
        if (this.cB >= 0) {
            if (++this.bD < 2) {
                this.cB = -1;
            }

        } else {
            this.bD = 0;
        }
    }

    private final void C() {
        if (this.bW != null) {
            for(int var1 = 0; var1 < this.t; ++var1) {
                if (this.bW[0][var1] > 0) {
                    int var10002 = this.bW[7][var1]++;
                    int[] var10000;
                    if (this.bW[0][var1] >= 91 && this.bW[0][var1] < 99) {
                        var10000 = this.bW[4];
                        var10000[var1] -= this.ei;
                    }

                    if (this.bW[10][var1] > 0 || this.bW[11][var1] > 0) {
                        var10000 = this.bW[10];
                        var10000[var1] -= this.bW[12][var1];
                        if (this.bW[10][var1] < 0) {
                            this.bW[10][var1] = 0;
                        }

                        var10000 = this.bW[11];
                        var10000[var1] -= this.bW[13][var1];
                        if (this.bW[11][var1] < 0) {
                            this.bW[11][var1] = 0;
                        }
                    }

                    boolean var2 = false;
                    if ((this.bW[12][var1] != 0 || this.bW[13][var1] != 0) && this.bW[10][var1] <= 0 && this.bW[11][var1] <= 0) {
                        var2 = true;
                    }

                    if (this.bW[7][var1] >= this.bW[8][var1] || var2) {
                        this.bW[7][var1] = 0;
                        var10002 = this.bW[5][var1]++;
                        if (this.bW[5][var1] >= this.bW[6][var1] || var2) {
                            this.bW[5][var1] = 0;
                            this.bW[4][var1] = 0;
                            if (this.bW[10][var1] <= 0 && this.bW[11][var1] <= 0) {
                                if (this.bW[0][var1] >= 168 && this.bW[0][var1] <= 171) {
                                    if (this.bW[0][var1] < 171) {
                                        this.bW[0][var1] = 174;
                                    } else {
                                        this.bW[0][var1] = 177;
                                    }

                                    if (this.bW[0][var1] >= 174) {
                                        if (this.bW[0][var1] >= 177) {
                                            try {
                                                this.e(this.bW[1][var1], this.bW[2][var1]);
                                                this.bV[this.bW[1][var1]][this.bW[2][var1]] = -16;
                                                this.cj[this.bW[1][var1]][this.bW[2][var1]] = 0;
                                            } catch (Exception var7) {
                                            }
                                        } else {
                                            var10000 = this.bW[3];
                                            var10000[var1] -= this.ek;

                                            try {
                                                this.e(this.bW[1][var1], this.bW[2][var1]);
                                                this.e(this.bW[1][var1] - 1, this.bW[2][var1]);
                                                this.bV[this.bW[1][var1]][this.bW[2][var1]] = -15;
                                                this.bV[this.bW[1][var1] - 1][this.bW[2][var1]] = -14;
                                                this.cj[this.bW[1][var1]][this.bW[2][var1]] = 0;
                                                this.cj[this.bW[1][var1] - 1][this.bW[2][var1]] = 0;
                                            } catch (Exception var6) {
                                            }
                                        }

                                        this.m(this.bW[1][var1], this.bW[2][var1]);
                                        if (this.bW[0][var1] <= 176) {
                                            this.m(this.bW[1][var1], this.bW[2][var1]);
                                        }
                                    }

                                    this.bW[6][var1] = 3;
                                    this.bW[8][var1] = 3;
                                    this.bW[9][var1] = 0;
                                    this.bW[12][var1] = 0;
                                    this.bW[13][var1] = 0;
                                } else if (this.bW[0][var1] >= 99) {
                                    this.bW[6][var1] = 4;
                                    this.bW[0][var1] = 91;
                                    this.bW[8][var1] = 2;
                                    this.bW[9][var1] = 5;
                                } else {
                                    var10002 = this.bW[9][var1]--;
                                    if (this.bW[9][var1] <= 0) {
                                        this.bW[0][var1] = 0;

                                        try {
                                            if (this.ck[this.bW[1][var1]][this.bW[2][var1]] < 0) {
                                                this.ck[this.bW[1][var1]][this.bW[2][var1]] = 0;
                                            }
                                        } catch (Exception var5) {
                                        }

                                        try {
                                            if (a(this.bX[this.bW[1][var1]][this.bW[2][var1]]) >= this.E) {
                                                this.bX[this.bW[1][var1]][this.bW[2][var1]] = 0;
                                            }
                                        } catch (Exception var4) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    private final void D() {
        try {
            boolean var1 = false;
            if (this.fi != this.fj) {
                this.aQ();
            }

            int var2 = 50;
            if (this.fi != this.fj) {
                this.fj = this.fi;
                if (!this.fi) {
                    this.fk = true;
                } else {
                    this.aQ.a2 = 0;
                }
            }

            if ((this.fi || this.fk) && (this.aQ.a2 < this.aQ.K || this.fk)) {
                if (this.aQ.B < this.aQ.C) {
                    this.aQ.B = this.aQ.C;
                    this.aQ.a();
                }

                if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() <= 2) {
                    var2 = 250;
                }

                if (this.fk) {
                    var2 = -var2;
                }

                c var10000 = this.aQ;
                var10000.a2 += var2;
                if (this.aQ.a2 > this.aQ.K) {
                    this.aQ.a2 = this.aQ.K;
                }

                if (this.aQ.a2 < 0) {
                    this.aQ.a2 = 0;
                    this.fk = false;
                    this.fi = false;
                }

                this.aQ.c();
            }

            byte var5 = 7;
            if (this.cC != this.cD) {
                this.cD = this.cC;
                if (!this.cC) {
                    this.cE = true;
                }
            }

            if ((this.cC || this.cE) && (this.cT < 0 || this.cE)) {
                if (this.cE) {
                    var5 = -7;
                }

                this.cT += var5;
                if (this.cT > 0) {
                    this.cT = 0;
                }

                if (this.cT < -this.eg) {
                    this.cT = -this.eg;
                    this.cE = false;
                    this.cC = false;
                }
            }

            var5 = -7;
            var2 = this.D(0);
            if (this.aW != this.aX) {
                this.aX = this.aW;
                if (!this.aW) {
                    this.aY = true;
                }
            }

            if ((this.aW || this.aY) && (this.fM > this.e10 - var2 || this.aY)) {
                if (this.aY) {
                    var5 = 7;
                }

                this.fM += var5;
                if (this.fM < this.e10 - var2) {
                    this.fM = this.e10 - var2;
                }

                if (this.fM >= this.e10) {
                    this.fM = this.e10;
                    this.aY = false;
                    this.aW = false;
                }
            }

            int var3;
            if ((var3 = this.ck[this.fy][this.fQ] - 1) >= 0 && var3 < this.cU && this.ch[0][var3] > 0 && this.ch[8][var3] == 1 && (!this.eV || var3 != this.eW)) {
                if (this.eV) {
                    this.aQ.f2 = true;
                }

                this.aQ.L = true;
                this.eV = true;
                this.eW = var3;
            }

            if (var3 != this.eW) {
                this.eW = var3;
                if (this.eV) {
                    this.aQ.f2 = true;
                    this.eV = false;
                }
            }

            this.fz = this.fy;
            this.fR = this.fQ;
        } catch (Exception var4) {
        }
    }

    private static int a(byte var0) {
        int var1 = var0;
        if (var0 < 0) {
            var1 = 256 + var0;
        }

        return var1;
    }

    private final void n(int var1) {
        if (var1 >= 0 && this.ch[10][var1] > 0) {
            try {
                int var2 = this.ch[1][var1];
                int var3 = this.ch[2][var1];
                int var4 = this.ch[3][var1];
                int var5 = this.ch[4][var1];
                if (var4 >= this.ek) {
                    ++var2;
                }

                if (var4 <= -this.ek) {
                    --var2;
                }

                if (var5 >= this.eh) {
                    ++var3;
                }

                if (var5 <= -this.eh) {
                    --var3;
                }

                if (this.ci != null && (this.ci[var2][var3] == 0 || this.ci[var2][var3] == 127)) {
                    this.H(var1);
                }

            } catch (Exception var6) {
            }
        }
    }

    private void a(Graphics var1, d var2) {
        boolean var3 = false;
        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
        var1.setClip(0, 0, this.e10, this.c10);
        int var4;
        int var5;
        if (this.G != null && this.G.length > 0 && (this.bL != 5 && this.bL != 6 || b10 == null || n.s)) {
            var3 = true;
            var4 = var2.b();
            var5 = this.G.length * var4 + 2;
            a.a(var1, 0, 0, this.e10, var5, 0, 128);
            int var6 = 1;

            for(int var7 = 0; var7 < this.G.length; ++var7) {
                if (this.G[var7] != null) {
                    var2.a(var1, this.G[var7], 1, var6, 20);
                }

                var6 += var2.b();
            }
        }

        if (this.I != null && this.I[0] != null && this.I[1] != null && var3) {
            var4 = 0;
            if (b10 != null) {
                if (n.g12) {
                    var4 = 1;
                } else if ((this.bL == 1 || this.bL == 0) && n.s) {
                    ++this.J;
                    if (this.J > 3) {
                        this.J = 0;
                        ++this.L;
                        if (this.L > 1) {
                            this.L = 0;
                        }
                    }

                    var4 = this.L;
                }
            }

            var5 = this.e10 - this.I[var4].getWidth();
            if (var4 == 0 && this.bL == 5) {
                this.M += this.K;
                if (this.M >= this.I[var4].getWidth()) {
                    this.K = -Math.abs(this.K);
                    this.M += this.K;
                }

                if (this.M < 0) {
                    this.K = Math.abs(this.K);
                    this.M += this.K;
                }

                var5 += this.M;
            }

            if (var5 < this.e10) {
                var1.drawImage(this.I[var4], var5, 0, 20);
            }
        }

    }

    final byte c() {
        ++this.ab;
        return j(this.ab, 1);
    }

    private static int a(int var0, int var1, int var2) {
        if (var1 > 0) {
            var0 *= 2;
        }

        if (var1 > 1) {
            var0 *= 2;
        }

        if (var2 == 20) {
            if (var0 == 3) {
                var0 = 2;
            } else if (var0 == 4) {
                var0 = 5;
            } else if (var0 >= 5) {
                if (var0 < 8) {
                    var0 = 5;
                } else {
                    var0 = 10;
                }
            }
        } else if (var2 == 24) {
            if (var0 == 3) {
                var0 = 4;
            } else if (var0 == 5) {
                var0 = 6;
            } else if (var0 >= 6) {
                if (var0 < 8) {
                    var0 = 6;
                } else {
                    var0 = 12;
                }
            }
        } else if (var2 == 36) {
            if (var0 == 1) {
                var0 = 2;
            } else if (var0 == 2) {
                var0 = 3;
            } else if (var0 == 3) {
                var0 = 6;
            } else if (var0 == 4) {
                var0 = 6;
            } else if (var0 == 5) {
                var0 = 9;
            } else if (var0 >= 6) {
                if (var0 < 8) {
                    var0 = 9;
                } else {
                    var0 = 18;
                }
            }
        }

        return var0;
    }

    private final boolean o(int var1) {
        return !cy ? true : this.f(2, var1, 8, 10);
    }

    private final boolean p(int var1) {
        if (!cy) {
            return true;
        } else {
            int var2 = 5;
            byte var3 = 26;
            if (this.ch[12][var1] >= 0) {
                var3 = 44;
            }

            if (this.m10 + var3 > ac.length) {
                return false;
            } else {
                boolean var4 = true;
                if (this.ch[12][var1] >= 0) {
                    int var5;
                    if ((var5 = this.ch[12][var1]) + 5 > this.cf.length) {
                        var2 = this.cf.length - var5;
                    }

                    var4 = (var4 = true & this.f(3, var1, var5, var2)) & this.f(4, var1, var5, var2);
                }

                return var4 & this.f(1, var1, 0, 15) & this.f(1, var1, 27, 3);
            }
        }
    }

    private final boolean q(int var1) {
        if (!cy) {
            return true;
        } else {
            boolean var2 = this.f(1, var1, 12, 3);
            boolean var3 = this.f(1, var1, 7, 1);
            return var2 && var3;
        }
    }

    private final void E() {
        byte[] var1;
        int var2 = (var1 = ac).length;
        if (this.m10 < var2) {
            int var3 = this.m10 - 1;
            int var4 = -1;

            while(true) {
                ++var3;
                if (var3 >= var2) {
                    break;
                }

                ++var4;
                if (var4 >= 8) {
                    break;
                }

                var1[var3] = 0;
            }
        }

    }

    final void d() {
        if (cy) {
            boolean var1 = false;
            if (b10 != null && n.g12 && !n.b12) {
                long var2 = System.currentTimeMillis();

                while(n.g12) {
                    if (n.r && n.g12) {
                        b10.i12[0] = 125;
                        n.r = false;
                        var1 = true;
                    }

                    try {
                        Thread.sleep(7L);
                    } catch (Exception var5) {
                    }

                    if (System.currentTimeMillis() - var2 > 777L) {
                        break;
                    }
                }
            }

            if (b10 != null) {
                b10.h12[0] = 0;
                b10.i12[0] = 0;
            }

            this.F();
            if (var1) {
                this.c(-1);
            }

        }
    }

    private void F() {
        if (n.g12) {
            this.c(3);
        }

        b10.a();
        b10.w = null;
        n.c12 = null;
    }

    private final void G() {
        for(int var1 = 0; var1 < this.Y.length; ++var1) {
            this.Y[var1] = 0;
            this.dV[var1] = 0;
            this.ef[var1] = true;
            this.az[var1] = true;
        }

        this.eR = System.currentTimeMillis();
        this.aU();
    }

    private final void a(Graphics var1) {
        int var2 = this.getWidth();
        int var3 = this.getHeight();
        int var4 = var1.getTranslateX();
        int var5 = var1.getTranslateY();
        var1.translate(-var4, -var5);
        var1.setClip(0, 0, var2, var3);
        d var6 = j.A;
        String var11 = r[5][0];
        boolean var12 = false;
        int var13 = r[2].length;
        int var7;
        int var8;
        if (this.as <= 0) {
            var12 = true;

            for(var7 = 0; var7 < var13; ++var7) {
                if ((var8 = var6.a(r[2][var7])) > this.as) {
                    this.as = var8;
                }
            }

            if ((var8 = var6.a(var11)) > this.as) {
                this.as = var8;
            }
        }

        if (this.at == 0) {
            this.at = this.as;
        }

        int var15;
        if (var12) {
            if ((var8 = var6.a(r[11][0] + r[11][1] + "  ")) > this.as) {
                this.as = var8;
            }

            var15 = var6.a("   ");
            if (this.as + var15 < var2 - (var15 >> 1)) {
                this.as += var15;
            }
        }

        var15 = var6.b() - var6.f3 + 4;
        if (this.v()) {
            var15 = 2 * (var6.b() - var6.f3) + 6;
        }

        if (var3 > 320) {
            var15 += 2;
        }

        int var16 = this.V;
        int var17;
        if ((var17 = cS.length) < var16) {
            var17 = var16;
        }

        boolean[] var18 = new boolean[var17];
        if (!dK) {
            var18[6] = true;
        }

        if (aw < 1) {
            var18[3] = true;
        }

        if (cR) {
            var18[2] = true;
        }

        if (dS > 1) {
            var18[5] = true;
        }

        for(var7 = 0; var7 < var18.length; ++var7) {
            if (cy && var7 < cS.length && cS[var7]) {
                var18[var7] = true;
            }

            if (var18[var7]) {
                --var16;
            }
        }

        if (this.ah) {
            var16 = 1;
        }

        int var19 = var3 >> 4;
        int var20 = var3 >> 1;
        int var22 = 5;
        if (this.x != null && this.x[2] != null) {
            var22 = this.x[2].getHeight() >> 1;
        }

        int var21;
        if ((var21 = var3 - var22 * 4) > var3 - 2 * var19 - var22 * 4) {
            var21 = var3 - 2 * var19 - var22 * 4;
        }

        if (var21 > var20) {
            var21 = var20;
        }

        int var23;
        if ((var23 = var21 / var15) < 2) {
            var23 = 2;
        }

        if (this.bB > var23) {
            this.bB = var23;
        }

        if (var16 > this.bB) {
            var16 = this.bB;
        }

        int var24 = var15 * var16;
        int var25 = this.as;
        if (var24 >= var3) {
            var24 = (var15 = var6.b() + 2) * var16;
        }

        var24 += 0;
        int var29 = this.fT + (var3 - var24) / 2;
        var1.setFont(j.defaultFont);
        var1.setClip(0, this.fT, var2, var3);
        int var30 = var1.getColor();
        int var33 = 5;
        if (this.x != null && this.x[2] != null) {
            var33 = this.x[2].getHeight() >> 1;
        }

        var33 *= 2;
        int var34 = var29 - 7 - 1 - var33;
        int var35 = var29 - 7 + var24 + 7 + 7 - 1 + 1 - var34 + var33;
        if (this.cr != null && this.cr.f()) {
            a.a(var1, 0, var34, var2, var35, 0, 128);
        } else if (this.cr != null) {
            j.a(var1, 0, var34, var2, var35, 0, 128);
        }

        int var39;
        int var40;
        if (!this.ah) {
            this.a(var1, var29 - 7 - 1, 5, false, false);
            this.a(var1, var29 - 7 + var24 + 7 + 7 - 1 + 1, 5, false, true);
            int var36 = var29 - 7 - 1;
            int var37 = var29 - 7 + var24 + 7 + 7 - 1 + 1;
            int var38 = var25 + 7 + 7;
            var39 = var2 - var38 >> 1;
            var40 = var2 / 3;
            if (var39 < var40) {
                var39 = var40;
                var38 = var2 - var40 - var40;
            }

            if (!this.ah) {
                if (d(var39, o(), var38, var36 - o())) {
                    this.fc = true;
                    this.x(50);
                }

                boolean var41 = false;
                if (d(var39, var37, var38, var3 - var37)) {
                    this.fc = true;
                    this.x(56);
                }
            }
        }

        var1.setClip(0, 0, var2, var3);
        var1.setColor(j.z);
        if (!this.ah) {
            if (this.eo > this.ad) {
                this.eo = this.ad;
            }

            if (this.eo < 0) {
                this.eo = 0;
            }

            --this.eo;

            label336:
            do {
                ++this.eo;
                var40 = 0;

                for(var7 = this.eo; var7 < this.V && var40 < var16; ++var7) {
                    if (var7 == this.ad) {
                        break label336;
                    }

                    if (var7 < 0 || var7 > var18.length || !var18[var7]) {
                        ++var40;
                    }
                }
            } while(this.eo < this.V);

            if (this.eo > 0) {
                ++this.eo;

                do {
                    --this.eo;
                    var40 = 0;

                    for(var7 = this.eo; var7 < this.V && var40 < var16; ++var7) {
                        if (var7 < 0 || var7 > var18.length || !var18[var7]) {
                            ++var40;
                        }
                    }
                } while(var40 < var16);
            }
        }

        var39 = 0;
        var40 = this.eo;
        if (this.ah) {
            var40 = 0;
        }

        int var42;
        String var43;
        for(var7 = var40; var7 < this.V && var39 < var16; ++var7) {
            if (var7 < 0 || var7 > var18.length || !var18[var7]) {
                ++var39;
                var8 = var7;
                String var44 = "";
                if (var7 == 1 && !AssetManager.l1) {
                    var8 = var13 - 1 - 4;
                }

                if (var7 == 2 && !AssetManager.h1) {
                    var8 = var13 - 2 - 4;
                }

                if (var7 == 5 && ax) {
                    var8 = var13 - 3 - 4;
                }

                var1.setColor(0);
                var43 = r[2][var8] + var44;
                if (this.ah) {
                    var43 = var11;
                }

                if (var7 == 3 && av > 0) {
                    var43 = r[2][var13 - 1 - 2 + av];
                }

                if (var7 == 4 && ec > 0) {
                    var43 = r[2][var13 - 1 - 4 + ec];
                }

                if (this.ag && this.Q) {
                    for(int var10 = -1; var10 <= 1; ++var10) {
                        for(int var9 = -1; var9 <= 1; ++var9) {
                            if ((var9 != 0 || var10 != 0) && (!this.P || var9 == 0 || var10 == 0)) {
                                var6.a(var1, var43, this.f10 - (var6.a(var43) >> 1) + var9, var29 + var10, 20);
                            }
                        }
                    }
                }

                if (var7 == this.ad || this.ah) {
                    var42 = 0;
                    if (this.v()) {
                        var42 = 1;
                    }

                    if (var3 > 320) {
                        ++var42;
                    }

                    var1.setColor(16777215);
                    var1.fillRect(0, var29 - 2 - 1 + 1 - var42, var2, var6.b() - var6.f3 + 4 + 1 + 2 * var42);
                    var1.setColor(0);
                    var1.fillRect(0, var29 - 1 - 1 + 1 - var42, var2, var6.b() - var6.f3 + 2 + 1 + 2 * var42);
                }

                var42 = var15 - (j.x.b() - j.x.f3) >> 1;
                if (b(0, var29 - 2 + 1 - var42, var2, var15) && var7 != this.ad && !this.ah) {
                    this.ad = var7;
                }

                if (c(0, var29 - 2 + 1 - var42, var2, var15)) {
                    if (var7 != this.ad && !this.ah) {
                        this.ad = var7;
                    }

                    this.G(53);
                }

                var1.setColor(j.z);
                var6.a(var1, var43, this.f10 - (var6.a(var43) >> 1), var29, 20);
                var29 += var15;
                this.af = var15;
            }
        }

        var43 = r[1][7];
        int var45 = var6.b() - var6.f3 + 4;
        if (this.dJ > 0) {
            var45 = this.dJ - 1;
        }

        var42 = var45 - (var6.b() - var6.f3) >> 1;
        if (!cy) {
            var6.a(var1, var43, this.f10 - (var6.a(var43) >> 1), var42, 20);
        }

        var1.setColor(var30);
        this.ag = false;
        var1.translate(var4, var5);
    }

    final boolean e() {
        if (!cy) {
            return false;
        } else {
            if (!n.s && n.c12 != null) {
                n.b12 = false;
                b10.m12 = 0;
                b10.b();
                if (!n.b12) {
                    if (cq && this.cr != null) {
                        this.cr.N = 0;
                        this.cr.T = true;
                        this.cr.U = false;
                    } else {
                        this.aa();
                    }

                    while(true) {
                        try {
                            Thread.sleep(7L);
                        } catch (Exception var2) {
                        }

                        if (b10.m12 == 1) {
                            if (cq && this.cr != null) {
                                this.cr.N = 0;
                                this.cr.T = true;
                                this.cr.U = false;
                            } else {
                                this.aa();
                            }
                            break;
                        }

                        int var1 = this.br;
                        if (cq && this.cr != null) {
                            var1 = this.cr.N;
                        }

                        if (var1 == 35 || var1 == -7) {
                            this.d();
                            this.c(-1);
                            return false;
                        }

                        if (b10.m12 == -1) {
                            return false;
                        }
                    }
                }
            }

            return n.g12;
        }
    }

    private final void H() {
        int[][] var1 = this.ch;
        short[][] var2 = this.ck;
        if (this.fw > this.fE) {
            this.fw = 0;
        }

        if (this.fO > this.fX) {
            this.fO = 0;
        }

        if (this.fx > this.fE) {
            this.fx = 0;
        }

        if (this.fP > this.fX) {
            this.fP = 0;
        }

        int var3 = 0;

        while(true) {
            ++var3;
            if (var3 >= 4) {
                if (this.bX[this.fw][this.fO] >= -12 && this.bX[this.fw][this.fO] < -8) {
                    if (this.bX[this.fw][this.fO] != -12 && this.bX[this.fw][this.fO] != -10) {
                        this.bX[this.fw][this.fO] = 0;
                    } else {
                        this.bX[this.fw][this.fO] = (byte)(a(this.bX[this.fw][this.fO]) + 1);
                    }
                }

                if (this.bX[this.fw][this.fO] == -13 || this.bX[this.fw][this.fO] == -69) {
                    this.bX[this.fw][this.fO] = 0;
                }

                ++this.fw;
                if (this.fw > this.fE) {
                    this.fw = 0;
                    ++this.fO;
                    if (this.fO > this.fX) {
                        this.fO = 0;
                    }
                }

                return;
            }

            short var4;
            if ((var4 = this.ck[this.fx][this.fP]) > 0 && var4 <= this.cU) {
                int var5 = var4 - 1;
                int var6 = var1[1][var5];
                int var7 = var1[2][var5];
                int var8 = var1[9][var5];
                if (1 < Math.abs(var6 - this.fx) || 1 < Math.abs(var7 - this.fP) || (var6 != this.fx || var7 != this.fP) && var8 < 8) {
                    var2[this.fx][this.fP] = 0;
                }

                if (var1[0][var5] <= 0) {
                    var2[this.fx][this.fP] = 0;
                }
            }

            ++this.fx;
            if (this.fx > this.fE) {
                this.fx = 0;
                ++this.fP;
                if (this.fP > this.fX) {
                    this.fP = 0;
                }
            }

            if (var4 < 0) {
                var2[this.fx][this.fP] = 0;
            }
        }
    }

    private final void e(int var1, int var2) {
        try {
            if (this.bV[var1][var2] == -15 && this.bV[var1 - 1][var2] == -14) {
                this.bV[var1][var2] = 0;
                this.bV[var1 - 1][var2] = 0;
            }

            if (this.bV[var1 + 1][var2] == -15 && this.bV[var1][var2] == -14) {
                this.bV[var1][var2] = 0;
                this.bV[var1 + 1][var2] = 0;
            }

        } catch (Exception var4) {
        }
    }

    private final void I() {
        for(int var1 = 0; var1 < this.cU; ++var1) {
            if (this.ch[0][var1] > 0 && this.ch[15][var1] > 0) {
                if (this.ch[8][var1] == 1) {
                    this.ff = 120;
                } else {
                    this.ch[15][var1] = 0;
                }
            }
        }

    }

    private final void a(int[][] var1, int var2, int var3) {
        if (this.el != this.ej) {
            int var4 = var1[var2][var3];
            if (this.bp <= 0) {
                this.bp = this.ej * 65536 / this.el;
            }

            boolean var5 = false;
            if (var4 < 0) {
                var5 = true;
                var4 = -var4;
            }

            var4 = var4 * this.bp + 30000 >> 16;
            if (var5) {
                var4 = -var4;
            }

            var1[var2][var3] = var4;
        }
    }

    private final void J() {
        if (cy) {
            if (!n.b12) {
                for(int var1 = 0; var1 < this.cU; ++var1) {
                    if (this.ch[0][var1] > 0) {
                        if (this.ch[8][var1] == 1) {
                            this.ch[8][var1] = 2;
                        } else if (this.ch[8][var1] == 2) {
                            this.ch[8][var1] = 1;
                        }
                    }
                }

                for(int var2 = 0; var2 < this.bg; ++var2) {
                    if (this.bZ[0][var2] > 0) {
                        if (this.bZ[5][var2] == 1) {
                            this.bZ[5][var2] = 2;
                        } else if (this.bZ[5][var2] == 2) {
                            this.bZ[5][var2] = 1;
                        }
                    }
                }

                int var3 = this.cv[2];
                this.cv[2] = this.cv[1];
                this.cv[1] = var3;
            }

        }
    }

    private static boolean a(char var0, char var1, boolean var2) {
        if (var0 == var1) {
            return true;
        } else {
            if (var2) {
                if (var0 >= 'A' && var0 <= 'Z' && var1 >= 'a' && var1 <= 'z' && var0 - 65 == var1 - 97) {
                    return true;
                }

                if (var0 >= 'a' && var0 <= 'z' && var1 >= 'A' && var1 <= 'Z' && var0 - 97 == var1 - 65) {
                    return true;
                }

                if (var0 >= 1040 && var0 <= 1071 && var1 >= 1072 && var1 <= 1103 && var0 - 1040 == var1 - 1072) {
                    return true;
                }

                if (var0 >= 1072 && var0 <= 1103 && var1 >= 1040 && var1 <= 1071 && var0 - 1072 == var1 - 1040) {
                    return true;
                }
            }

            return false;
        }
    }

    private final void b(int var1, int var2, int var3) {
        if (cy && this.A()) {
            this.f(18, var1, var2, var3);
        }

        this.c(var1, var2, var3);
    }

    private final void c(int var1, int var2, int var3) {
        if (this.bW == null) {
            this.bW = new int[14][this.t];
        }

        boolean var4 = false;

        byte var8;
        for(var8 = 0; var8 < this.t && this.bW[0][var8] > 0; ++var8) {
        }

        if (var8 < this.t) {
            for(int var5 = 0; var5 < this.bW.length; ++var5) {
                this.bW[var5][var8] = 0;
            }

            short var6 = 91;
            int var7 = var1;
            if (var1 >= 8) {
                var6 = 99;
                var7 = var1 - 8;
            }

            if (var1 >= 16) {
                var6 = 103;
                var7 = var1 - 16;
            }

            if (var1 >= 24) {
                var6 = 174;
                var7 = var1 - 24;
            }

            if (var1 >= 32) {
                var6 = 177;
                var7 = var1 - 36;
            }

            if (var1 >= 48) {
                var6 = 168;
                var7 = var1 - 48;
            }

            if (var1 >= 64) {
                var6 = 171;
                var7 = var1 - 64;
            }

            this.bW[0][var8] = var6;
            this.bW[1][var8] = var2;
            this.bW[2][var8] = var3;
            this.bW[3][var8] = 0;
            this.bW[4][var8] = 0;
            this.bW[6][var8] = 4;
            if (var6 == 168) {
                this.bW[6][var8] = 3;
            }

            if (var6 == 171) {
                this.bW[6][var8] = 1;
            }

            if (var6 >= 174) {
                this.bW[6][var8] = 3;
            }

            this.bW[8][var8] = 2;
            if (var6 >= 99) {
                this.bW[8][var8] = 3;
            }

            if (var1 >= 48) {
                this.bW[11][var8] = this.fV * this.eg * 2;
                this.bW[13][var8] = this.eg;
                this.bW[10][var8] = this.bW[11][var8] / 2;
                this.bW[12][var8] = this.bW[10][var8] / (this.bW[11][var8] / this.bW[13][var8]);
                if (this.bW[10][var8] > 0 && this.bW[12][var8] < 1) {
                    this.bW[12][var8] = 1;
                }
            }

            this.bW[9][var8] = var7;
        }
    }

    private final void K() {
        if (this.w == null) {
            this.w = new Image[2];

            for(int var1 = 0; var1 < this.w.length; ++var1) {
                try {
                    this.w[var1] = AssetManager.readImageFromFilePNG("/ar0" + var1 + ".png");
                } catch (Exception var3) {
                }
            }

        }
    }

    final void c(int var1) {
        int var2;
        if (this.I == null) {
            this.I = new Image[2];

            for(var2 = 0; var2 < this.I.length; ++var2) {
                try {
                    this.I[var2] = AssetManager.readImageFromFilePNG("/bt" + var2 + ".png");
                } catch (Exception var5) {
                }
            }
        }

        this.bL = var1;
        if (var1 < 0) {
            this.G = null;
        } else {
            var2 = var1 + 60;

            try {
                int var3 = this.e10 - 4;
                if (this.I != null && this.I[0] != null) {
                    var3 -= this.I[0].getWidth();
                }

                this.G = AssetManager.instanceHandler.a(r[var2][0], j.x, var3 - 4, true);
            } catch (Exception var4) {
                this.G = null;
            }
        }
    }

    private final void L() {
        if (this.R == null) {
            int var4 = 110;
            byte[] var5 = AssetManager.instanceHandler.readDataChunkFromFile("cc", -1);
            if (110 < var5.length / 8) {
                var4 = var5.length / 8;
            }

            if (this.bC < var4) {
                this.bC = var4;
            }

            this.R = new short[8][var4 + 2];
            int var3 = 0;

            label54:
            for(int var2 = 0; var2 < var4; ++var2) {
                for(int var1 = 0; var1 < 8; ++var1) {
                    this.R[var1][var2] = (short)var5[var3];
                    ++var3;
                    if (var3 >= var5.length) {
                        break label54;
                    }
                }

                short[] var10000;
                if (this.R[0][var2] < 0) {
                    var10000 = this.R[0];
                    var10000[var2] = (short)(var10000[var2] + 256);
                }

                if (this.R[1][var2] < 0) {
                    var10000 = this.R[1];
                    var10000[var2] = (short)(var10000[var2] + 256);
                }

                if (this.R[2][var2] < 0) {
                    var10000 = this.R[2];
                    var10000[var2] = (short)(var10000[var2] + 256);
                }

                if (this.R[3][var2] < 0) {
                    var10000 = this.R[3];
                    var10000[var2] = (short)(var10000[var2] + 256);
                }
            }

            if (this.R[2][0] != this.ej) {
                this.ej = this.R[2][0];
                this.eg = this.ej;
                this.el = this.ej;
                this.ek = this.ej / 2;
                this.eh = this.eg / 2;
                this.ei = this.eg / 4;
                this.aF();
            }

        }
    }

    private final void M() {
        if (this.am == null) {
            int var1 = (this.bt + 1) * this.bs;
            this.am = new short[7][var1];
            byte[] var3 = AssetManager.instanceHandler.readDataChunkFromFile("cu", -1);
            if (var1 < var3.length / 7) {
                var1 = var3.length / 7;
            }

            int var4 = 0;

            try {
                for(int var5 = 0; var5 < var1; ++var5) {
                    for(int var6 = 0; var6 < 7; ++var6) {
                        this.am[var6][var5] = (short)var3[var4];
                        ++var4;
                        if (var4 >= var3.length) {
                            return;
                        }
                    }

                    short[] var10000;
                    if (this.am[0][var5] < 0) {
                        var10000 = this.am[0];
                        var10000[var5] = (short)(var10000[var5] + 256);
                    }

                    if (this.am[1][var5] < 0) {
                        var10000 = this.am[1];
                        var10000[var5] = (short)(var10000[var5] + 256);
                    }
                }

            } catch (Exception var7) {
            }
        }
    }

    private static void a(String var0) {
        if (b10 != null && var0 != null && var0.length() > 0) {
            char[] var1 = new char[var0.length()];

            for(int var2 = 0; var2 < var1.length; ++var2) {
                int var3;
                if ((var3 = var0.charAt(var2)) < 48) {
                    var3 = 48;
                }

                if (var3 >= 65 && var3 <= 70) {
                    var3 = var3 - 65 + 97;
                }

                if (var3 > 102) {
                    var3 = 102;
                }

                if (var3 > 57 && var3 < 97) {
                    var3 = 97;
                }

                var1[var2] = (char)var3;
            }

            String var4;
            if ((var4 = new String(var1)).length() > 32) {
                var4 = var4.substring(0, 32);
            }

            b10.a12 = b10.a12.substring(0, b10.a12.length() - var4.length()) + var4;
        }
    }

    final void f() {
        a("99");
    }

    private final void N() {
        try {
            bA = new int[6][2];
            bF = new int[this.bu][2];
            ee = 5;
            boolean var1 = false;
            if (this.cd[20] > 0) {
                ee = this.cd[20];
            }

            int var2 = 2 + (ee - 1 >> 2);

            for(int var3 = 0; var3 < bA.length; ++var3) {
                bA[var3][0] = 20;
                bA[var3][1] = var2;
                if (cy) {
                    bA[var3][1] = bA[var3][0];
                }
            }

            int var4 = 36 + ee * 2;

            for(int var5 = 0; var5 < bF.length; ++var5) {
                bF[var5][0] = 54;
                bF[var5][1] = var4;
                if (cy) {
                    bF[var5][1] = bF[var5][0];
                }
            }

            this.cv = new int[]{1, 7700 - ee * 10, 5000 + (ee - 1) * 1000};
            c.N = (long)('袸' * (bP - ee));
            int var6 = this.n10;

            for(int var7 = 0; var7 < 3; ++var7) {
                int var8 = a(this.cd[var6]);
                ++var6;
                var8 = (var8 <<= 8) + a(this.cd[var6]);
                ++var6;
                var8 = (var8 <<= 8) + a(this.cd[var6]);
                ++var6;
                if (var7 < 2 && var8 > 0) {
                    if (var8 < 10) {
                        var8 = 0;
                    }

                    this.cv[var7 + 1] = var8;
                }

                if (var7 == 2 && var8 > 0) {
                    c.N = (long)var8;
                }
            }

            this.ew = new int[]{1, 1};
            this.et = new int[]{0, 0};
            byte var12 = 21;
            byte var13 = this.cd[21];
            byte var9 = this.cd[22];
            int var10;
            if ((var10 = this.cd[23]) < 0) {
                var10 = -var10;
                var9 = 2;
            }

            if (var10 >= 32) {
                var10 = var10 - 32 + 64;
            }

            if (var10 > 0 && var9 > 0) {
                this.ew[var9 - 1] = var10;
                this.et[var9 - 1] = var13;
            }

            var6 = var12 + 3;
            var13 = this.cd[24];
            var9 = this.cd[25];
            if ((var10 = this.cd[26]) < 0) {
                var10 = -var10;
                var9 = 2;
            }

            if (var10 >= 32) {
                var10 = var10 - 32 + 64;
            }

            if (var10 > 0 && var9 > 0) {
                this.ew[var9 - 1] = var10;
                this.et[var9 - 1] = var13;
            }

            var6 += 3;
            if (cy) {
                this.ew[1] = this.ew[0];
                this.et[1] = this.et[0];
                this.cv[2] = this.cv[1];
            }

            while(true) {
                if (var6 >= this.cd.length) {
                    return;
                }

                var13 = this.cd[var6];
                var9 = this.cd[var6 + 1];
                if ((var10 = this.cd[var6 + 2]) < 0) {
                    var10 = -var10;
                    var9 = 2;
                }

                if (var10 >= 32) {
                    var10 = var10 - 32 + 64;
                }

                if (var9 == 0 && var10 == 0) {
                    this.p = var6 + 3;
                    break;
                }

                if (var10 > 0 && var9 > 0) {
                    if (var10 < 64) {
                        bF[var10 - 1][var9 - 1] = var13;
                        if (cy) {
                            bF[var10 - 1][1] = bF[var10 - 1][0];
                        }
                    } else {
                        var10 -= 64;
                        bA[var10 - 1][var9 - 1] = var13;
                        if (cy) {
                            bA[var10 - 1][1] = bA[var10 - 1][0];
                        }
                    }
                }

                var6 += 3;
            }
        } catch (Exception var11) {
        }

    }

    final void g() {
        this.bS = 5;
        this.fN = this.e10 >> 4;
        this.fq = this.e10 - 2 * this.fN;
        if (this.bk == null || this.bl == null) {
            try {
                this.bk = AssetManager.readImageFromFilePNG(a(this.aH[16]));
                this.bl = AssetManager.readImageFromFilePNG(a(this.aH[17]));
            } catch (Exception var4) {
                this.bk = null;
                this.bl = null;
            }
        }

        if (this.bm == null) {
            try {
                this.bm = AssetManager.readImageFromFilePNG(a(this.aH[18]));
            } catch (Exception var3) {
            }
        }

        if (this.bk != null && this.bl != null) {
            this.fq = this.bk.getHeight();
        }

        this.fN = (this.e10 - this.fq) / 2;
        this.fs = -10;
        this.fr = 0;
        this.bJ = 0;
        boolean var2 = false;
        this.bJ = 0;
        int var5 = 0;
        if (this.cV == null) {
            var5 = 0 + this.bC;
        }

        if (this.eX == null) {
            var5 += this.bt * this.bs;
        }

        this.bR = var5;
        this.ev = true;
        this.eq = System.currentTimeMillis();
    }

    private final void O() {
        this.L();
        if (this.cV == null || this.cW == null) {
            c.g2 = 0;
            c.n2 = null;
            if (this.cW != null) {
                this.cW = null;
            }

            int var1 = this.bC;
            if (this.cV == null) {
                this.cV = new Image[var1];
            }

            if (this.cW == null) {
                this.cW = new Image[16];
            }

            this.r(var1);
            this.S();
        }
    }

    private final void r(int var1) {
        Image var2 = null;
        short var3 = 0;
        int var5 = 0;

        for(int var6 = 0; var6 < 16; ++var6) {
            var2 = null;

            try {
                var2 = AssetManager.readImageFromFilePNG("/l" + var6 + ".png");
            } catch (Exception var23) {
            }

            for(int var7 = 0; var7 < var1; ++var7) {
                try {
                    short var8 = this.R[0][var7];
                    short var9 = this.R[1][var7];
                    short var10 = this.R[2][var7];
                    short var11 = this.R[3][var7];
                    boolean var25 = false;
                    if ((var3 = this.R[6][var7]) == var6) {
                        if (var10 > 0 && var11 > 0 && var2 != null) {
                            if (var6 == 8 || var6 >= 11 || var6 == 10 && av > 0) {
                                this.cV[var7] = null;
                                this.cW[var6] = var2;
                            } else {
                                this.cV[var7] = Image.createImage(var10, var11);
                                Graphics var12 = this.cV[var7].getGraphics();
                                if (var6 == 10) {
                                    int var13 = 1;
                                    int var14 = 1;

                                    try {
                                        var13 = 1 + (this.R[2][var7] - 1) / this.ej;
                                        var14 = 1 + (this.R[3][var7] - 1) / this.eg;
                                    } catch (Exception var22) {
                                    }

                                    int var15 = var13 * this.ej;
                                    int var16 = var14 * this.eg;
                                    int var18 = this.R[2][var7] - var15 >> 1;

                                    for(int var20 = this.R[3][var7] - var16 >> 1; var20 < this.R[3][var7]; var20 += this.R[3][0]) {
                                        for(int var21 = var18; var21 < this.R[2][var7]; var21 += this.R[2][0]) {
                                            var12.drawImage(this.cV[0], var21, var20, 20);
                                        }
                                    }
                                }

                                var12.drawImage(var2, -var8, -var9, 20);
                            }
                        } else {
                            this.cV[var7] = null;
                        }

                        if (this.dX != null && !this.dX[var7]) {
                            this.cV[var7] = null;
                        }
                    }
                } catch (Exception var24) {
                    this.cV[var7] = null;
                    System.out.println("Err obg=" + var7 + " a=" + var6 + " an=" + var3 + " " + var24);
                }

                ++var5;
                if (var5 >= 16) {
                    this.p();
                    var5 = 0;
                }
            }
        }

    }

    private void P() {
        try {
            if (this.s == null) {
                this.s = AssetManager.instanceHandler.a(AssetManager.instanceHandler.f("tlk"), j.x, this.e10, false);
            }

        } catch (Exception var2) {
        }
    }

    private final void Q() {
        try {
            try {
                if (!this.hasPointerEvents()) {
                    return;
                }
            } catch (Exception var4) {
                return;
            }
        } catch (Throwable var5) {
            return;
        }

        if (this.bo == null) {
            this.bo = new Image[12];
        }

        if (this.cN == null) {
            this.cN = new boolean[this.bo.length];
        }

        for(int var1 = 0; var1 < this.bo.length; ++var1) {
            if (this.bo[var1] == null && !this.cN[var1]) {
                try {
                    this.bo[var1] = AssetManager.readImageFromFilePNG("/mm" + var1 + ".png");
                } catch (Exception var3) {
                }

                if (this.bo[var1] == null) {
                    this.cN[var1] = true;
                }
            }
        }

    }

    private final void R() {
        this.M();
        if (this.eX == null) {
            if (this.dR != null) {
                this.dR = null;
            }

            this.eX = new Image[this.bt];
            this.dR = new Image[this.bt];
            boolean var5 = false;

            try {
                try {
                    var5 = Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 2;
                } catch (Exception var13) {
                }
            } catch (Throwable var14) {
            }

            for(int var3 = 0; var3 < this.bt; ++var3) {
                try {
                    this.eX[var3] = AssetManager.readImageFromFilePNG("/u" + var3 + ".png");
                } catch (Exception var12) {
                }

                if (this.eX[var3] != null && av > 0 && var5) {
                    if (var3 >> 1 << 1 == var3) {
                        try {
                            this.dR[var3] = AssetManager.readImageFromFilePNG("/w" + var3 + ".png");
                        } catch (Exception var11) {
                        }
                    } else {
                        this.dR[var3] = this.dR[var3 - 1];
                    }
                } else {
                    this.dR[var3] = null;
                }

                for(int var4 = 0; var4 < this.bs; ++var4) {
                    try {
                        boolean var6 = false;
                    } catch (Exception var10) {
                    }

                    this.p();
                }
            }

        }
    }

    private final void S() {
        if (this.cW == null) {
            this.cW = new Image[16];
        }

        try {
            Image var1 = AssetManager.readImageFromFilePNG("/l11.png");
            this.cW[11] = var1;
            this.cW[12] = a.a(var1, 0);
        } catch (Exception var2) {
        }
    }

    private final void T() {
        int var1 = this.d(this.fy, this.fQ);
        boolean var2 = false;
        boolean var3;
        int var4;
        if (this.ff < 0) {
            if (var1 <= 0 || var1 > this.cU) {
                var3 = true;
                if (var1 >= 64 && var1 < 128) {
                    var4 = var1 - 64;
                    if (this.bZ[0][var4] > 0 && this.bZ[5][var4] == 1 && this.bZ[17][var4] <= 0 && (this.bZ[12][var4] <= 0 || this.bZ[0][var4] > 1) && this.ce[0][this.bZ[0][var4]] > 0) {
                        this.co = 0;
                        this.ff = 122;
                        this.A = var4;
                        this.B = this.bZ[0][var4];
                        if (this.B >= 32) {
                            this.B = this.B - 32 + 64;
                        }
                    }

                    var3 = false;
                }

                if (var3) {
                    this.fH = this.fy;
                    this.gb = this.fQ;
                    this.ff = 77;
                }

                return;
            }

            int var11 = var1 - 1;
            if (this.ch[0][var11] > 0 && this.ch[8][var11] == 1) {
                this.ff = var11;
                this.ch[15][var11] = 1;
                this.U = false;
            }
        } else {
            int var5;
            int var6;
            if (this.ff < this.cU) {
                var3 = false;
                if (var1 - 1 == this.ff) {
                    if (this.ch[0][this.ff] != 8) {
                        for(var4 = 0; var4 < this.cU; ++var4) {
                            if (this.ch[0][var4] > 0 && this.ch[0][var4] == this.ch[0][this.ff] && this.ch[8][var4] == this.ch[8][this.ff]) {
                                var5 = this.ch[1][var4] - this.fJ;
                                var6 = this.ch[2][var4] - this.gd;
                                if (var5 >= 0 && var6 >= 0 && var5 < this.fB && var6 < this.fU) {
                                    this.ch[15][var4] = 1;
                                }
                            }
                        }

                        this.ff = 120;
                        this.U = false;
                        return;
                    }

                    this.a(this.ff, false);
                    var3 = true;
                }

                this.ch[13][this.ff] = this.fy;
                this.ch[14][this.ff] = this.fQ;
                this.ch[12][this.ff] = -10;
                c.b2 = this.ff;
                if (var3 || !this.dN) {
                    this.ch[15][this.ff] = 0;
                }

                this.o(this.ff, var1);
                if (this.M(this.ch[8][this.ff])) {
                    this.q(this.ff);
                }

                if (var3 || !this.dN) {
                    this.ff = -1;
                }

                return;
            }

            int var12;
            if (this.ff < 100) {
                var12 = this.fH;
                var4 = this.gb;
                if (this.fy < var12) {
                    var12 = this.fy;
                }

                if (this.fQ < var4) {
                    var4 = this.fQ;
                }

                var5 = Math.abs(this.fy - this.fH);
                var6 = Math.abs(this.fQ - this.gb);
                int var7 = var12 + var5;
                int var8 = var4 + var6;
                boolean var9 = false;

                for(int var10 = 0; var10 < this.cU; ++var10) {
                    if (this.ch[0][var10] > 0 && this.ch[8][var10] == 1 && this.ch[1][var10] >= var12 && this.ch[1][var10] <= var7 && this.ch[2][var10] >= var4 && this.ch[2][var10] <= var8) {
                        this.ch[15][var10] = 1;
                        var9 = true;
                    }
                }

                this.ff = -1;
                if (var9) {
                    this.ff = 120;
                    this.U = false;
                }

                this.fH = -1;
                this.gb = -1;
                return;
            }

            if (this.ff < 121) {
                for(var12 = 0; var12 < this.cU; ++var12) {
                    if (this.ch[0][var12] > 0 && this.ch[8][var12] == 1 && this.ch[15][var12] > 0) {
                        this.ch[13][var12] = this.fy;
                        this.ch[14][var12] = this.fQ;
                        this.ch[12][var12] = -10;
                        if (!this.dN) {
                            this.ch[15][var12] = 0;
                        }

                        this.o(var12, var1);
                        if (this.M(this.ch[8][var12])) {
                            this.q(var12);
                        }
                    }
                }

                c.b2 = -100;
                if (!this.dN) {
                    this.ff = -1;
                }

                this.fH = -1;
                this.gb = -1;
                return;
            }

            if (this.ff < 123) {
                this.ff = 123;
                this.aY = true;
                this.fA = this.fy - 1;
                return;
            }

            if (this.a(-1, this.bj, 1, this.fy, this.fQ, false)) {
                this.ff = -1;
                this.fH = -1;
                this.gb = -1;
            }

            this.r();
            this.V();
        }

    }

    private final void U() {
        ++this.aq;
        if (this.aq >= this.cU) {
            this.aq = 0;
        }

        while(this.aq < this.cU && (this.ch[0][this.aq] <= 0 || this.ch[8][this.aq] != 1)) {
            ++this.aq;
        }

        if (this.aq >= this.cU) {
            for(this.aq = 0; this.aq < this.cU && (this.ch[0][this.aq] <= 0 || this.ch[8][this.aq] != 1); ++this.aq) {
            }
        }

        if (this.ch[0][this.aq] > 0 && this.ch[8][this.aq] == 1) {
            this.fy = this.ch[1][this.aq];
            this.fQ = this.ch[2][this.aq];
        }
    }

    private final void V() {
        if (this.fy != this.fA || this.fQ != this.fS || this.fJ != this.fK || this.gd != this.ge) {
            int var1 = Math.abs(this.fy - this.fA);
            int var2 = Math.abs(this.fQ - this.fS);
            int var3 = Math.abs(this.fJ - this.fK);
            int var4 = Math.abs(this.gd - this.ge);
            if (var1 >= 2 || var2 >= 2 || var3 >= 2 || var4 >= 2) {
                int var5 = this.fy;
                int var6 = this.fQ;
                this.fy = this.fA;
                this.fQ = this.fS;
                this.fJ = this.fK;
                this.gd = this.ge;

                while(this.fy != var5 || this.fQ != var6) {
                    if (this.fy < var5) {
                        ++this.fy;
                    }

                    if (this.fy > var5) {
                        --this.fy;
                    }

                    if (this.fQ < var6) {
                        ++this.fQ;
                    }

                    if (this.fQ > var6) {
                        --this.fQ;
                    }

                    this.r();
                    this.a();
                }
            }

            this.fA = this.fy;
            this.fS = this.fQ;
            this.fK = this.fJ;
            this.ge = this.gd;
        }

    }

    private final void b(Graphics var1) {
        if (!this.ae) {
            if (this.ff != 122 && this.ff != 121 && !this.aY) {
                int var2 = var1.getColor();
                boolean var4 = false;
                int var5;
                int var6;
                int var7;
                int var15;
                if (this.ff > this.cU && this.ff < 100) {
                    if (this.fH >= 0 && this.gb >= 0) {
                        var5 = (this.fH - this.fJ) * this.ej + this.cm;
                        var6 = (this.gb - this.gd) * this.eg + this.cn;
                        var7 = (this.fy - this.fJ) * this.ej + this.cm + this.ao;
                        var15 = (this.fQ - this.gd) * this.eg + this.cn + this.ap;
                        int var16 = var5;
                        int var17 = var6;
                        if (var7 < var5) {
                            var16 = var7;
                        }

                        if (var15 < var6) {
                            var17 = var15;
                        }

                        var1.setColor(0);
                        if (!this.c(var1, var16, var17, Math.abs(var7 - var5) + this.ej, Math.abs(var15 - var6) + this.eg, 0)) {
                            var1.drawRect(var16 + 1, var17 + 1, Math.abs(var7 - var5) + this.ej, Math.abs(var15 - var6) + this.eg);
                            var1.setColor(255, 255, 50);
                            var1.drawRect(var16, var17, Math.abs(var7 - var5) + this.ej, Math.abs(var15 - var6) + this.eg);
                        }

                        this.z = true;
                    }
                } else {
                    var4 = this.ff >= 0;
                    var5 = (this.fy - this.fJ) * this.ej + this.ao;
                    var6 = (this.fQ - this.gd) * this.eg + this.ap;
                    if (this.ff >= 123) {
                        var5 += this.cm;
                        var6 += this.cn;
                        var7 = this.bh - 128 + this.bc - 1;
                        if (this.bc != c.g2) {
                            Image var8 = this.cW[this.R[6][var7]];
                            short var9 = this.R[0][var7];
                            short var10 = this.R[1][var7];
                            int var11 = this.R[2][var7];
                            int var12 = this.R[3][var7];
                            if (var8 == null) {
                                var8 = this.cV[var7];
                                var9 = 0;
                                var10 = 0;
                                if (var8 != null) {
                                    var11 = var8.getWidth();
                                    var12 = var8.getHeight();
                                }
                            }

                            c.a(var8, var9, var10, var11, var12);
                            c.g2 = this.bc;
                        }

                        if (this.bi) {
                            c.a(var1, var5 + this.R[4][var7] + (this.bd * this.ej >> 1), var6 + this.R[5][var7] + (this.be * this.eg >> 1));
                        }

                        var1.setColor(0);

                        for(int var3 = 0; var3 < 2; ++var3) {
                            if (var3 == 1) {
                                if (this.bi) {
                                    var1.setColor(0, 255, 0);
                                } else {
                                    var1.setColor(255, 0, 0);
                                }
                            }

                            var15 = 1;
                            if (this.bi) {
                                ++var15;
                            }

                            if (!this.c(var1, var5 + var3, var6 + var3, this.bd * this.ej - var3 - var3, this.be * this.eg - var3 - var3, var15)) {
                                var1.drawRect(var5 + var3, var6 + var3, this.bd * this.ej - var3 - var3, this.be * this.eg - var3 - var3);
                            } else {
                                var3 = 3;
                            }

                            this.ct = null;
                            if (this.ct == null) {
                                if (this.cM) {
                                    this.a(var1, r[4][8]);
                                } else {
                                    this.a(var1, r[4][6]);
                                }
                            }
                        }

                        this.z = true;
                        return;
                    }

                    try {
                        var7 = this.ck[this.fy][this.fQ] - 64;
                        if ((!s() || this.ci == null || this.ci[this.fy][this.fQ] > 0) && var7 >= 0 && var7 <= 64 && this.bZ[0][var7] > 0) {
                            this.a(var1, var7, this.fy, this.fQ, true);
                        }
                    } catch (Exception var14) {
                    }

                    if (this.fi) {
                        return;
                    }

                    if (this.cA > 0) {
                        this.d(var1, 120 + this.cA, var5, var6, 20);
                        this.z = true;
                        return;
                    }

                    var7 = 127;
                    if (var4) {
                        ++var7;
                    }

                    try {
                        if (this.cB >= 0 && this.R[1][this.cB] < this.cW[this.R[6][this.cB]].getHeight()) {
                            var7 = this.cB;
                        }
                    } catch (Exception var13) {
                    }

                    this.b(var1, var7, var5 + this.cm, var6 + this.cn);
                }

                var1.setColor(var2);
            } else {
                this.e(var1);
            }
        }
    }

    private static byte[] d(byte[] var0) {
        int var1 = var0.length;
        byte[] var2 = new byte[4096];
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;

        while(var3 < var1) {
            byte var7;
            byte var10;
            if ((var7 = var0[var3]) >= 0) {
                ++var3;
                if (var3 >= var1) {
                    break;
                }

                var10 = var0[var3];
                ++var3;
            } else {
                var7 = (byte)(-var7);
                ++var3;
                var10 = 1;
            }

            for(var6 = var4 + var10; var4 < var6; ++var4) {
                var2[var4] = var7;
            }
        }

        byte[] var8 = new byte[var6];

        for(int var9 = 0; var9 < var6; ++var9) {
            var8[var9] = var2[var9];
        }

        return var8;
    }

    final void a(int var1, boolean var2) {
        if (cy && this.M(this.ch[8][var1])) {
            this.f(16, var1, 1, 0);
        } else {
            this.c(var1, var2);
        }
    }

    private void c(int var1, boolean var2) {
        int var3 = this.ch[1][var1];
        int var4 = this.ch[2][var1];
        boolean var5;
        if (!(var5 = !var2) || var2 || this.ch[29][var1] <= 0) {
            for(int var6 = 0; var6 < this.cU; ++var6) {
                if (var6 != var1 && this.ch[0][var6] != 8 && this.ch[29][var6] == var1 + 1) {
                    int[] var10000 = this.ch[27];
                    var10000[var1] -= d(this.ch[0][var6]);
                    if (this.ch[7][var6] == var1 + 1) {
                        this.ch[7][var6] = 0;
                    }

                    this.ch[29][var6] = 0;
                    int var8;
                    if (var2) {
                        if ((var8 = this.ch[10][var6] - 80) < 0) {
                            var8 = 0;
                        }

                        this.ch[10][var6] = var8;
                        if (var8 <= 0) {
                            this.b(var6, false, false);
                            continue;
                        }
                    }

                    int var7 = 5;
                    var8 = 0;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = var3;
                    int var12 = var4;

                    label83:
                    for(int var13 = this.ch[0][var6]; var7 > 0; --var7) {
                        for(int var14 = var12 - var8; var14 <= var12 + var8; ++var14) {
                            for(int var15 = var11 - var8; var15 <= var11 + var8; ++var15) {
                                try {
                                    if (this.d(var15, var14, var13) <= 0) {
                                        var9 = var15;
                                        var10 = var14;
                                        break label83;
                                    }
                                } catch (Exception var17) {
                                }
                            }
                        }

                        ++var8;
                    }

                    if (var9 >= 0 && var10 >= 0) {
                        this.ch[1][var6] = var9;
                        this.ch[2][var6] = var10;
                        this.ch[13][var6] = var9;
                        this.ch[14][var6] = var10;
                        this.ck[var9][var10] = (short)((byte)(var6 + 1));
                    } else {
                        this.b(var6, false, false);
                    }

                    if (var5) {
                        if (this.ch[27][var1] > 0) {
                            this.ch[29][var1] = 3;
                            return;
                        }
                        break;
                    }
                }
            }

        }
    }

    // TODO: decode byte array to String
    static final String a(byte[] var0) {
        char[] var1 = new char[var0.length];

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (char)var0[var2];
        }

        return new String(var1);
    }

    private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        int var5 = var3 >> 1;
        int var6 = var4 >> 1;
        var0.fillRect(var1, var2, var5, 1);
        var0.fillRect(var1, var2, 1, var6);
        var0.fillRect(var1 + var3 - var5 + 1, var2 + var4, var5, 1);
        var0.fillRect(var1 + var3, var2 + var4 - var6 + 1, 1, var6);
    }

    private final void c(Graphics var1) {
        var1.setClip(0, this.fT, this.e10, this.aM);
    }

    private final void d(Graphics var1) {
        int var3;
        int var4 = var3 = this.getHeight();
        var1.setClip(0, this.fT, this.e10, var4);
        var1.setColor(0);

        try {
            if (this.aA == null) {
                this.cV = null;
                this.eX = null;

                try {
                    try {
                        String var6 = "ils";
                        if (this.victory) {
                            var6 = "iwn";
                        }

                        this.aA = AssetManager.readImageFromFilePNG("/" + var6 + ".png");

                        try {
                            this.aA = AssetManager.a(this.aA);
                        } catch (OutOfMemoryError var16) {
                        }

                        if (this.aA != null && this.aA.getWidth() != this.e10 && this.aA.getHeight() != var3) {
                            try {
                                this.aA = AssetManager.a(this.aA, 0, 0, this.aA.getWidth(), this.aA.getHeight(), this.e10, var3, 0, false, true);
                            } catch (OutOfMemoryError var15) {
                            }
                        }
                    } catch (Exception var17) {
                        this.aA = null;
                        this.aA = Image.createImage(1, 1);
                    }
                } catch (OutOfMemoryError var18) {
                    this.aA = null;
                    this.aA = Image.createImage(1, 1);
                }

                this.aG = var3 - (var3 >> 2);
                this.aF = 0;
                if (!this.aL) {
                    var1.fillRect(0, 0, this.e10, var3);
                }

                if (!this.aL) {
                    this.dB = false;
                }

                for(int var20 = 1; var20 < this.ch[0].length; ++var20) {
                    this.ch[0][var20] = 0;
                    this.ch[1][var20] = Math.abs(this.randomGenerator.nextInt() % this.e10);
                    this.ch[2][var20] = Math.abs(this.randomGenerator.nextInt() % var4);
                    this.ch[13][var20] = this.randomGenerator.nextInt() % this.ek >> 1;
                    this.ch[14][var20] = 2 + Math.abs(this.randomGenerator.nextInt() % this.eh);
                }
            }

            int var7 = this.f10;
            var1.setColor(0);
            var1.fillRect(0, 0, this.e10, var3);
            if (this.aA != null && this.aA.getWidth() > 1) {
                var1.drawImage(this.aA, this.f10, var3 >> 1, 3);
            }

            var1.setColor(178, 1, 1);   // Color allies
            if (this.victory) {
                var1.setColor(1, 89, 198);  // Color enemies
            }

            d var8;
            int var9 = (var8 = j.x).b() - var8.f3 + 4;
            if (this.cr != null && this.cr.f() && this.bT > 0) {
                if (this.bT > 0 && this.bT <= 255) {
                    a.a(var1, 0, 0, this.e10, var3, 0, this.bT);
                }

                this.bT -= 16;
            } else {
                this.aF += 2;
            }

            if (this.aF > var9) {
                this.aF = var9;
                if (!this.aD) {
                    this.eO = System.currentTimeMillis();
                    this.fi = true;
                    this.aQ.b();
                }

                this.aD = true;
                this.dB = true;
            }

            int var10 = this.aG - (this.aF >> 1);
            if (this.aF > 0) {
                var1.setColor(0, 247, 255); // Cyan
                boolean var11 = false;
                var1.fillRect(0, var10 - 1, this.e10, 1);
                var1.fillRect(0, var10 + this.aF, this.e10, 1);
                a.a(var1, 0, var10, this.e10, this.aF, 0, 128);
            }

            if (this.aL) {
                for(int var21 = 1; var21 < 20; ++var21) {
                    if (this.ch[13][var21] != 0 || this.ch[14][var21] != 0) {
                        this.d(var1, 122, this.ch[1][var21], this.ch[2][var21] + this.fT, 3);
                        int[] var10000 = this.ch[1];
                        var10000[var21] += this.ch[13][var21];
                        var10000 = this.ch[2];
                        var10000[var21] += this.ch[14][var21];
                        if (this.ch[2][var21] < 0) {
                            var10000 = this.ch[2];
                            var10000[var21] += var4;
                        }

                        if (this.ch[2][var21] > var4) {
                            var10000 = this.ch[2];
                            var10000[var21] -= var4;
                        }

                        if (this.ch[1][var21] < 0) {
                            var10000 = this.ch[1];
                            var10000[var21] += this.e10;
                        }

                        if (this.ch[1][var21] > this.e10) {
                            var10000 = this.ch[1];
                            var10000[var21] -= this.e10;
                        }
                    }
                }
            }

            int var12 = 0;
            if (this.victory) {
                var12 = 1;
                if (this.aL) {
                    ++var12;
                }
            }

            String var13 = r[3][var12];
            int var14 = 4 + var8.a(var13);
            var7 -= var14 >> 1;
            var1.setColor(0);
            var1.setFont(j.defaultFont);
            if (this.aF > var8.b() - var8.f3) {
                var8.a(var1, var13, var7 + 2, var10 + (this.aF - (var8.b() - var8.f3) >> 1), 20);
            }

            if (c(0, 0, this.e10, this.getHeight())) {
                this.x(53);
            }

        } catch (Exception var19) {
        }
    }

    private void a(Graphics var1, int var2, int var3) {
        int var4 = this.ej;
        int var5 = this.eg;
        if (this.aT()) {
            a.a(var1, var2, var3, var4, var5, 0, 128);
        } else {
            int var8 = var1.getTranslateX();
            int var9 = var1.getTranslateY();
            var1.translate(-var8, -var9);
            var2 += var8;
            var3 += var9;

            try {
                int var10 = 0 + (128 << 24);
                boolean var11 = true;

                try {
                    if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 2) {
                        if (this.aI == null || this.aI.length != var4 || this.aI[0] != var10) {
                            if (this.aI == null || this.aI.length != var4) {
                                if (this.aI != null) {
                                    this.aI = null;
                                }

                                this.aI = new int[var4];
                            }

                            for(int var12 = 0; var12 < this.aI.length; ++var12) {
                                this.aI[var12] = var10;
                            }
                        }

                        var11 = false;
                        var1.drawRGB(this.aI, 0, 0, var2, var3, var4, var5, true);
                    }
                } catch (Exception var17) {
                }

                if (var11) {
                    if (this.aI == null || this.aI.length != var4 * var5) {
                        if (this.aI != null) {
                            this.aI = null;
                        }

                        this.aI = new int[var4 * var5];
                        boolean var19 = false;
                        boolean var13 = false;
                        int var14 = 0;

                        for(int var15 = 0; var15 < var5; ++var15) {
                            var13 = var19;

                            for(int var16 = 0; var16 < var4; ++var16) {
                                if (var13) {
                                    this.aI[var14] = 0;
                                } else {
                                    this.aI[var14] = -16777216;
                                }

                                ++var14;
                                var13 = !var13;
                            }

                            var19 = !var19;
                        }
                    }

                    var1.drawRGB(this.aI, 0, var4, var2, var3, var4, var5, true);
                }
            } catch (Exception var18) {
                a.a5 = null;
            }

            var1.translate(var8, var9);
        }
    }

    static final void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var4 >> 1;
        int var8;
        int var9 = (var8 = var0.getColor()) >> 16 & 255;
        int var10 = var8 >> 8 & 255;
        int var11 = var8 & 255;
        int var12 = 0;
        byte var13 = 1;

        for(int var18 = var2; var18 < var2 + var4; ++var18) {
            int var14 = var12 * var5 / var7 + var6;
            int var15;
            if ((var15 = var9 * var14 >> 7) > 255) {
                var15 = 255;
            }

            int var16;
            if ((var16 = var10 * var14 >> 7) > 255) {
                var16 = 255;
            }

            int var17;
            if ((var17 = var11 * var14 >> 7) > 255) {
                var17 = 255;
            }

            var0.setColor(var15, var16, var17);
            var0.fillRect(var1, var18, var3, 1);
            if ((var12 += var13) >= var7) {
                var13 = -1;
            }
        }

    }

    private static void b(Graphics var0, int var1, int var2, int var3, int var4) {
        b(var0, var1, var2, var3, var4, 96, 96);
    }

    final boolean h() {
        if (!cy) {
            return false;
        } else if (!n.s) {
            this.c(1);
            n.b12 = false;
            b10.w = null;
            n.c12 = null;
            b10.l12 = true;
            b10.b();
            return true;
        } else {
            this.c(5);
            return false;
        }
    }

    private final void f(int var1, int var2) {
        if (cy) {
            if (!this.w()) {
                return;
            }

            this.f(14, var1, var2, 0);
        }

        this.g(var1, var2);
    }

    private final void g(int var1, int var2) {
        this.n(var1);
        this.f(var1, (this.ch[1][var2] - this.fJ) * this.ej + this.ch[3][var2] + this.ek, (this.ch[2][var2] - this.gd) * this.eg + this.ch[4][var2] + this.eh);
        int var3 = this.ch[8][var1];
        int var4 = this.b(var1, this.ch[0][var2]) * (ed + 1);
        if (aS && !cy && var3 == 2) {
            var4 = 0;
        }

        this.n(var2, var4);
    }

    private final void h(int var1, int var2) {
        if (cy) {
            if (!this.w()) {
                return;
            }

            this.f(15, var1, var2, 0);
        }

        this.i(var1, var2);
    }

    private final void i(int var1, int var2) {
        int var3 = this.ch[8][var1];
        int var4 = this.b(var1, this.bZ[0][var2] + 64) * (ed + 1);
        if (aS && !cy && var3 == 2) {
            var4 = 0;
        }

        this.n(var1);
        this.e(var1, var2, var4);
    }

    private final void s(int var1) {
        if (AssetManager.h1) {
            this.P();

            try {
                String var2 = null;
                var2 = new String(this.s[var1]);

                int var5;
                try {
                    char[] var4 = var2.toCharArray();

                    for(var5 = 0; var5 < var4.length; ++var5) {
                        if (var4[var5] == '=') {
                            var4[var5] = '\r';
                        }
                    }

                    var2 = new String(var4);
                } catch (Exception var9) {
                }

                if ((var5 = j.x.a(var2) / 3) < this.f10) {
                    var5 = this.f10;
                }

                if (var5 > this.g10) {
                    var5 = this.g10;
                }

                this.cs = AssetManager.instanceHandler.a(var2, j.x, var5, true);
                boolean var6 = false;
                int var7 = 0;

                for(int var8 = 0; var8 < this.cs.length; ++var8) {
                    int var11 = j.x.a(this.cs[var8]);
                    if (var7 < var11) {
                        var7 = var11;
                    }
                }

                this.fp = var7;
                this.en = 0;
            } catch (Exception var10) {
                this.cs = null;
            }
        }
    }

    private final void W() {
        for(int var1 = 0; var1 < this.cU; ++var1) {
            if (this.ch[0][var1] > 0) {
                this.a((int[][])this.ch, 3, var1);
                this.a((int[][])this.ch, 4, var1);
            }
        }

    }

    final void i() {
        l();
        a.a5 = null;
        this.eX = null;
        this.dR = null;
        this.ar = null;
        cq = false;
        this.aJ = false;
        this.ad = 0;
    }

    final void runGameThread() {
        Display.getDisplay(NET_Lizard.app).setCurrent(this);
        aP = NET_Lizard.game;
        this.S = true;
        if (this.ez == null) {
            this.ez = new Thread(this);
        }

        this.ez.start();
        if (this.ez.getPriority() != 10) {
            this.ez.setPriority(10);
        }

    }

    static int d(int var0) {
        byte var1 = 1;
        switch(var0) {
            case 3:
                var1 = 6;
                break;
            case 4:
            case 5:
                var1 = 2;
                break;
            case 6:
                var1 = 4;
                break;
            case 7:
                var1 = 10;
        }

        return var1;
    }

    private final void a(long var1) {
        if (!ey) {
            this.B();
            if (this.aO && this.cs == null && this.dB) {
                if (var1 > 1277L) {
                    try {
                        int var3 = -1;
                        if (this.ff == 122 || this.ff == 121 || this.aY) {
                            if (this.bf > 0 && this.bf <= 8) {
                                var3 = this.bf;
                            }

                            if (this.bf >= 64 && this.bf - this.bf <= 7) {
                                var3 = this.bf - 64 + 11;
                            }
                        }

                        if (var3 < 0 && (this.cC || this.cE)) {
                            var3 = this.cK + 21;
                        }

                        int var4;
                        if (var3 < 0 && !this.fi && (!s() || this.ci == null || this.ci[this.fy][this.fQ] > 0) && (var4 = this.d(this.fy, this.fQ)) > 0) {
                            int var5;
                            if (var4 <= this.cU) {
                                var5 = var4 - 1;
                                if (this.ch[0][var5] > 0 && this.ch[8][var5] == 1) {
                                    var3 = this.ch[0][var5];
                                }
                            }

                            if (var4 >= 64 && var4 - 64 < this.bg) {
                                var5 = var4 - 64;
                                if (this.bZ[0][var5] > 0 && this.bZ[5][var5] == 1) {
                                    var3 = this.bZ[0][var5] + 11;
                                }
                            }
                        }

                        if (var3 >= 0 && var3 < 80) {
                            this.P();
                            if (AssetManager.a1[var3 + 32] <= 0) {
                                this.s(var3);
                                AssetManager.a1[var3 + 32] = 1;
                                this.eP = System.currentTimeMillis() + 333L;
                            }
                        }

                        return;
                    } catch (Exception var6) {
                    }
                }

            }
        }
    }

    public final void hideNotify() {
        if (!cy) {
            this.cu = true;
        }

        this.br = 0;
        this.by = true;
        this.bz = false;

        try {
            this.cr.N = 0;
            this.cr.T = true;
            this.cr.U = false;
        } catch (Exception var2) {
        }

        if (this.aO && !cq && !this.ae && this.cs == null) {
            this.ae = true;
            this.ad = 0;
            this.ah = false;
            this.cs = null;
            if (this.fi) {
                this.fi = false;
            }
        }

        t();
        super.hideNotify();
    }

    final boolean a(int var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8) {
        if (var1 < 0) {
            for(var1 = 0; var1 < this.bg && this.bZ[0][var1] > 0; ++var1) {
            }
        }

        int var9 = 1;
        int var10 = 1;

        int var11;
        try {
            var11 = this.bh - 128 + var2 - 1;
            var9 = 1 + (this.R[2][var11] - 1) / this.ej;
            var10 = 1 + (this.R[3][var11] - 1) / this.eg;
        } catch (Exception var18) {
        }

        if (var3 == 1) {
            this.bd = var9;
            this.be = var10;
            this.bc = var2;
            this.bi = false;
            this.cM = var1 >= this.bg;
        }

        if (var7) {
            var9 += 2;
            var10 += 2;
            --var4;
            --var5;
        }

        int var13;
        try {
            for(var11 = var5; var11 < var5 + var10; ++var11) {
                for(int var12 = var4; var12 < var4 + var9; ++var12) {
                    if (!var7 || var12 != var4 && var11 != var5 && var12 != var4 + var9 - 1 && var11 != var5 + var10 - 1 || this.ck[var12][var11] > this.cU) {
                        if (this.ck[var12][var11] > 0) {
                            return false;
                        }

                        if ((var13 = this.bV[var12][var11]) < 0) {
                            var13 += 256;
                        }

                        if (var13 >= 128 && this.R[7][var13 - 128] > 0) {
                            return false;
                        }
                    }
                }
            }
        } catch (Exception var21) {
            return false;
        }

        if (var7) {
            var9 -= 2;
            var10 -= 2;
            ++var4;
            ++var5;
        }

        int var15;
        int var16;
        int var17;
        if (var2 > 1 && var8) {
            boolean var22 = true;
            boolean var14 = false;

            label188:
            for(var15 = var5 - 3; var15 < var5 + var10 + 3; ++var15) {
                for(var16 = var4 - 3; var16 < var4 + var9 + 3; ++var16) {
                    try {
                        if ((var17 = this.ck[var16][var15] - 64) >= 0 && var17 < this.bg && this.bZ[0][var17] > 0 && this.bZ[5][var17] == var3) {
                            var22 = false;
                            break label188;
                        }
                    } catch (Exception var20) {
                    }
                }
            }

            if (var22) {
                return false;
            }
        }

        if (this.ck[var4][var5] > 0) {
            return false;
        } else {
            if ((var13 = this.bV[var4][var5]) < 0) {
                var13 += 256;
            }

            if (var13 >= 128 && this.R[7][var13 - 128] > 0) {
                return false;
            } else if (var1 >= this.bg) {
                return false;
            } else {
                if (var3 == 1) {
                    this.bi = true;
                }

                if (var6) {
                    return true;
                } else {
                    if (var2 == 1 && var3 == 1) {
                        this.D = (byte)(this.D | 1);
                    }

                    for(var13 = 0; var13 < this.bZ.length; ++var13) {
                        this.bZ[0][var1] = 0;
                    }

                    this.bZ[0][var1] = var2;
                    this.bZ[1][var1] = var4;
                    this.bZ[2][var1] = var5;
                    this.bZ[3][var1] = var9;
                    this.bZ[4][var1] = var10;
                    this.bZ[5][var1] = var3;
                    this.bZ[6][var1] = 1;
                    this.bZ[8][var1] = -1;
                    this.a(var2 + 64, var1);
                    if (var2 == 3) {
                        this.bZ[8][var1] = this.bb;
                    }

                    this.bZ[10][var1] = 20;
                    int var23;
                    if ((var15 = (var23 = 100 - this.bZ[10][var1]) / this.bZ[16][var1]) * this.bZ[16][var1] < var23) {
                        ++var15;
                    }

                    if (var15 < 1) {
                        var15 = 1;
                    }

                    if (!var8) {
                        this.bZ[12][var1] = 0;
                        this.bZ[10][var1] = 100;
                        var15 = 0;
                    } else {
                        try {
                            var16 = -1;

                            for(var17 = 0; var17 < this.bg; ++var17) {
                                if (this.bZ[0][var17] == 1 && this.bZ[5][var1] == this.bZ[5][var17]) {
                                    var16 = var17;
                                    this.a(var2 + 64, var17);
                                    break;
                                }
                            }

                            if (var16 < 0) {
                                this.bZ[0][var1] = 0;
                            }
                        } catch (Exception var19) {
                        }
                    }

                    this.bZ[14][var1] = var9 * this.ej / 2;
                    this.bZ[15][var1] = var10 * this.eg / 2;
                    this.bZ[17][var1] = var15;
                    if (this.aO && cy && this.w()) {
                        this.f(2, var1, 0, this.bZ.length);
                    }

                    this.t(var1);
                    return true;
                }
            }
        }
    }

    private boolean a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        boolean var7 = var6;
        if (this.aO && cy && this.M(var3) && !var6) {
            var7 = true;
            int var8 = var2;
            if (var3 == 2) {
                var8 = -var2;
            }

            this.f(11, var8, var4, var5);
        }

        return this.a(var1, var2, var3, var4, var5, var7, true, true);
    }

    private final void d(int var1, boolean var2) {
        if (var1 >= 0 && var1 < this.bg) {
            int[][] var3 = this.bZ;
            short[][] var4 = this.ck;
            byte[][] var5 = this.cj;
            if (this.aO && this.w()) {
                this.f(2, var1, 0, 1);
            }

            int var7 = var3[1][var1];

            int var8;
            for(int var9 = var8 = var3[2][var1]; var9 < var8 + var3[4][var1]; ++var9) {
                for(int var10 = var7; var10 < var7 + var3[3][var1]; ++var10) {
                    if (var10 >= 0 && var10 <= this.fE && var9 >= 0 && var9 <= this.fX) {
                        try {
                            if (var3[0][var1] > 0 && !var2) {
                                this.e(var10, var9);
                                var4[var10][var9] = (short)(64 + var1);
                            } else if (var4[var10][var9] == (short)(64 + var1)) {
                                var4[var10][var9] = 0;
                                if (!var2) {
                                    this.e(var10, var9);
                                    this.bV[var10][var9] = -93;
                                }
                            }

                            if (!var2) {
                                var5[var10][var9] = 0;
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            }

        }
    }

    private final void t(int var1) {
        this.d(var1, false);
    }

    private final void X() {
        for(int var1 = 0; var1 < this.bg; ++var1) {
            this.t(var1);
        }

    }

    final void a(int var1, int var2) {
        int var3 = J(var1);
        this.bZ[12][var2] = var3;
        this.bZ[16][var2] = var3;
    }

    private final void u(int var1) {
        int var2 = this.bZ[10][var1];
        int var3 = this.bZ[3][var1] >> 1;
        int var4 = this.bZ[4][var1] >> 1;
        if (var2 <= 0) {
            if (this.bZ[0][var1] == 1 && this.bZ[5][var1] == 1 && this.ff == 123) {
                this.ff = -1;
                this.fH = -1;
                this.gb = -1;
            }

            if (this.w()) {
                this.f(2, var1, 10, 1);
            }

            if (this.bZ[5][var1] == 1) {
                this.eY = true;
            }

            this.fl = 7;
            this.fm = 4;
            if (this.bZ[0][var1] == 1) {
                this.fl = 10;
                this.fm = 6;
            }

            this.bZ[0][var1] = 0;
            this.m(var1);
            this.t(var1);
            this.b(16, this.bZ[1][var1] + var3, this.bZ[2][var1] + var4);
            this.I(2);
            this.eZ = System.currentTimeMillis() + 1377L;
        }

    }

    private final boolean Y() {
        boolean var1 = false;
        if (this.aV < 0 || this.aV >= this.bg) {
            this.aV = 0;
        }

        if (this.bZ[0][this.aV] > 0 && this.w()) {
            if (this.bZ[12][this.aV] > 0 && (this.bZ[0][this.aV] == 1 || this.bZ[17][this.aV] > 0 || this.k(this.bZ[5][this.aV]))) {
                int var10002 = this.bZ[12][this.aV]--;
                int[] var10000;
                int var10001;
                if (this.bZ[0][this.aV] > 1 || this.bZ[17][this.aV] > 0) {
                    if (this.cv[this.bZ[5][this.aV]] >= this.al) {
                        var10000 = this.cv;
                        var10001 = this.bZ[5][this.aV];
                        var10000[var10001] -= this.al;
                        var10000 = this.bZ[10];
                        var10001 = this.aV;
                        var10000[var10001] += this.bZ[17][this.aV];
                        if (this.bZ[10][this.aV] > 100) {
                            this.bZ[10][this.aV] = 100;
                        }
                    } else {
                        var10002 = this.bZ[12][this.aV]++;
                    }
                }

                if (this.bZ[12][this.aV] == 0 && this.bZ[17][this.aV] > 0) {
                    this.bZ[17][this.aV] = 0;
                    if (this.bZ[10][this.aV] > 100) {
                        this.bZ[10][this.aV] = 100;
                    }

                    if (this.bZ[5][this.aV] == 1) {
                        this.I(7);
                    }

                    if (this.bZ[5][this.aV] == 2 && cy && this.A()) {
                        this.f(25, 7, 0, 0);
                    }
                }

                if (this.bZ[12][this.aV] == 0 && this.bZ[0][this.aV] > 2) {
                    if (this.k(this.bZ[5][this.aV])) {
                        int var2 = this.bZ[8][this.aV];
                        if ((var1 = this.a(this.bZ[8][this.aV], this.bZ[5][this.aV], true, this.bZ[1][this.aV], this.bZ[2][this.aV])) && this.bZ[5][this.aV] == 1) {
                            if (var2 < 3) {
                                this.I(8);
                            } else {
                                this.I(6);
                            }
                        }

                        if (var1 && this.bZ[5][this.aV] == 2 && cy && this.A()) {
                            if (var2 < 3) {
                                this.f(25, 8, 0, 0);
                            } else {
                                this.f(25, 6, 0, 0);
                            }
                        }
                    }

                    if (!var1 && this.bZ[8][this.aV] > 0) {
                        var10002 = this.bZ[12][this.aV]++;
                        if (this.bZ[0][this.aV] > 1) {
                            var10000 = this.cv;
                            var10001 = this.bZ[5][this.aV];
                            var10000[var10001] += this.al;
                        }
                    }

                    if (var1 && this.bZ[8][this.aV] > 0) {
                        if (this.bZ[9][this.aV] > 0) {
                            var10002 = this.bZ[9][this.aV]--;
                        }

                        if (this.bZ[9][this.aV] > 0) {
                            this.a(this.bZ[8][this.aV], this.aV);
                        }
                    }
                }
            }

            if (this.bZ[12][this.aV] <= 0) {
                this.bZ[12][this.aV] = -1;
            }
        }

        ++this.aV;
        return var1;
    }

    private final void Z() {
        for(int var1 = 0; var1 <= ed; ++var1) {
            if (!this.Y()) {
                this.Y();
            }
        }

    }

    static final int[] e(int var0) {
        boolean var1 = false;
        int var4 = 64 + var0 * 2;
        int var2;
        if ((var2 = AssetManager.a1[var4]) < 0) {
            var2 += 256;
        }

        int var3;
        if ((var3 = AssetManager.a1[var4 + 1]) < 0) {
            var3 += 256;
        }

        return new int[]{var2, var3};
    }

    static final String a(int[] var0) {
        char[] var1 = new char[var0.length];

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (char)var0[var2];
        }

        return new String(var1);
    }

    private static byte v(int var0) {
        int var1 = var0;
        if (var0 > 127) {
            var1 = var0 - 256;
        }

        return (byte)var1;
    }

    private final int w(int var1) {
        if (var1 == -1) {
            var1 = 50;
        }

        if (var1 == -2) {
            var1 = 56;
        }

        if (var1 == -3) {
            var1 = 52;
        }

        if (var1 == -4) {
            var1 = 54;
        }

        if (var1 == -6 || var1 == -5) {
            var1 = 53;
        }

        if (var1 == -7) {
            var1 = this.d10;
        }

        return var1;
    }

    protected final void keyPressed(int var1) {
        try {
            var1 = a.standardizeKeyCodes(var1);
        } catch (Exception var3) {
        }

        this.cu = false;
        this.bN = false;
        if (!h.a(var1)) {
            if (cq) {
                if (this.cr != null) {
                    this.cr.a(var1);
                }

            } else {
                if (var1 == -1) {
                    var1 = 50;
                }

                if (var1 == -2) {
                    var1 = 56;
                }

                if (var1 == -3) {
                    var1 = 52;
                }

                if (var1 == -4) {
                    var1 = 54;
                }

                if (var1 == -6 || var1 == -5) {
                    var1 = 53;
                }

                if (var1 == -7) {
                    var1 = this.d10;
                }

                boolean var2 = false;
                if (var1 != 53 && var1 != 42 && var1 != this.d10 && var1 != 48 && !this.ae && !this.cC && !this.aW) {
                    this.bq = true;
                } else {
                    this.bq = false;
                }

                this.a(var1, this.cb);
                this.a(var1, this.ca);
                this.dl = System.currentTimeMillis();
                this.by = false;
                this.br = var1;
            }
        }
    }

    private final void x(int var1) {
        this.bN = true;
        this.bq = false;
        this.a(var1, this.cb);
        this.a(var1, this.ca);
        this.a(var1, this.cc);
        this.dl = System.currentTimeMillis();
        this.by = false;
        this.br = var1;
        this.by = false;
        this.br = var1;
        this.bz = true;
        this.bq = false;
    }

    protected final void keyReleased(int var1) {
        try {
            var1 = a.standardizeKeyCodes(var1);
        } catch (Exception var3) {
        }

        if (!h.b()) {
            if (cq) {
                if (this.cr != null) {
                    this.cr.b();
                }

            } else {
                this.a(var1, this.cc);
                if (this.by) {
                    this.br = 0;
                } else {
                    this.bz = true;
                }
            }
        }
    }

    private final void aa() {
        this.br = 0;
        this.by = true;
        this.bz = false;
        this.af();
    }

    private final void ab() {
        this.aO = false;
        if (!this.ah || this.br != 50 && this.br != 56) {
            switch(this.br) {
                case 50:
                    --this.ad;

                    while(cy && this.ad >= 0 && this.ad < cS.length && cS[this.ad]) {
                        --this.ad;
                    }

                    if (this.ad == 6 && !dK) {
                        --this.ad;
                    }

                    if (this.ad == 5 && dS > 1) {
                        --this.ad;
                    }

                    if (this.ad == 3 && aw < 1) {
                        --this.ad;
                    }

                    if (this.ad == 2 && cR) {
                        --this.ad;
                    }

                    if (this.ad < 0) {
                        this.ad = this.V - 1;
                        return;
                    }
                case 51:
                case 55:
                default:
                    break;
                case 52:
                case 53:
                case 54:
                    this.dM = true;
                    switch(this.ad) {
                        case 0:
                            this.ae = false;
                            break;
                        case 1:
                            AssetManager.l1 = !AssetManager.l1;
                            if (!AssetManager.l1) {
                                t();
                            } else {
                                C(AssetManager.e1 - 1);
                            }

                            aE();
                            break;
                        case 2:
                            AssetManager.h1 = !AssetManager.h1;
                            aE();
                            break;
                        case 3:
                            ++av;
                            if (this.br == 52) {
                                av = (byte)(av - 2);
                            }

                            if (av > aw) {
                                av = 0;
                            }

                            if (av < 0) {
                                av = aw;
                            }

                            this.cV = null;
                            this.eX = null;
                            this.g();
                            this.O();
                            this.R();

                            for(int var1 = 0; var1 <= this.fX; ++var1) {
                                for(int var2 = 0; var2 <= this.fE; ++var2) {
                                    this.bX[var2][var1] = 0;
                                }
                            }

                            aE();
                            break;
                        case 4:
                            if (this.br == 52) {
                                --ec;
                            } else {
                                ++ec;
                            }

                            ec = (byte)(1 & ec);
                            break;
                        case 5:
                            if (dS <= 1) {
                                ax = !ax;
                                if (s() && this.ci == null) {
                                    this.ci = new byte[this.fE + 1][this.fX + 1];
                                }
                            }
                            break;
                        case 6:
                            if (this.ah) {
                                this.ae = false;
                                this.ah = false;
                                this.aw();
                                this.aC();
                            } else {
                                this.ah = true;
                            }
                            break;
                        case 7:
                            if (this.ah) {
                                this.ae = false;
                                this.ah = false;
                                this.a(false);
                            } else {
                                this.ah = true;
                            }
                            break;
                        case 8:
                            if (this.ah) {
                                this.ae = false;
                                this.ah = false;
                                this.aw();
                                AssetManager.c1 = 0;
                                aE();
                                this.a(false);
                            } else {
                                this.ah = true;
                            }
                            break;
                        case 9:
                            if (this.ah) {
                                this.aw();
                                this.aC();
                                this.dA = false;
                                this.ae = false;
                                this.aO = true;
                                this.ao();
                                this.c(-1);
                            } else {
                                this.ah = true;
                            }
                            break;
                        case 10:
                            if (this.ah) {
                                this.aC();
                                this.S = false;
                                return;
                            }

                            this.ah = true;
                            return;
                    }

                    this.dB = true;
                    break;
                case 56:
                    ++this.ad;

                    while(cy && this.ad >= 0 && this.ad < cS.length && cS[this.ad]) {
                        ++this.ad;
                    }

                    if (this.ad == 2 && cR) {
                        ++this.ad;
                    }

                    if (this.ad == 3 && aw < 1) {
                        ++this.ad;
                    }

                    if (this.ad == 5 && dS > 1) {
                        ++this.ad;
                    }

                    if (this.ad == 6 && !dK) {
                        ++this.ad;
                    }

                    if (this.ad >= this.V) {
                        this.ad = 0;
                        return;
                    }
            }
        }

    }

    private final void ac() {
        this.by = true;
        if (ey && this.br == 53) {
            ++this.cG;
            this.a(true);
        }

        if (this.cs != null) {
            if (this.br == 53 && System.currentTimeMillis() > this.eP) {
                this.au();
            }

        } else if (this.aC) {
            if (this.aE && (this.br == 53 || this.br == this.d10)) {
                if (j.p) {
                    h.d();
                    h.G = 8L;
                    return;
                }

                if (this.victory) {
                    if (!this.dA) {
                        this.ao();
                        if (this.aL) {
                            this.cr.aU = 1;
                            this.cr.d();
                        }

                        return;
                    }

                    this.a(true);
                } else {
                    if (cy && !this.dA) {
                        this.ao();
                        return;
                    }

                    this.a(false);
                }
            }

        } else {
            if ((this.fi || this.fk) && (this.br == 53 || this.br == this.d10)) {
                if (!this.fi) {
                    return;
                }

                this.br = 42;
            }

            boolean var2 = (this.br == 53 && this.cC && this.ff > this.cU && this.ff < 100) | (this.br == 53 && this.cC && this.ff >= 123);
            if (this.br == this.d10 || var2) {
                if (this.ff >= 0) {
                    if (this.ff == 123) {
                        try {
                            this.bZ[12][this.A] = 0;
                            if (this.M(this.bZ[5][this.A])) {
                                this.f(2, this.A, 8, 2);
                                this.f(2, this.A, 12, 6);
                            }
                        } catch (Exception var11) {
                        }
                    }

                    if (this.ff == 121) {
                        try {
                            if (this.bZ[9][this.A] > 0 && this.bZ[12][this.A] <= 0) {
                                this.bZ[9][this.A] = 0;
                                if (this.M(this.bZ[5][this.A])) {
                                    this.f(2, this.A, 9, 1);
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }

                    this.ff = -1;
                    this.fH = -1;
                    this.gb = -1;

                    for(int var3 = 0; var3 < this.cU; ++var3) {
                        this.ch[15][var3] = 0;
                    }
                } else if (this.cC) {
                    this.cC = false;
                    if (this.cH) {
                        this.ae = true;
                        this.cD = false;
                        this.cT = -this.eg;
                    }
                } else if (this.cA >= 0) {
                    this.cA = -1;
                } else {
                    if (this.dO) {
                        this.dO = false;
                        return;
                    }

                    if (this.ae) {
                        if (this.ae && this.ah) {
                            this.ah = false;
                            return;
                        }

                        this.ae = false;
                        this.dB = true;
                        return;
                    }

                    this.ae = true;
                    this.ah = false;
                }
            }

            if (this.ae || this.cC || this.aW) {
                this.I(5);
            }

            if (this.ae) {
                this.ab();
            } else {
                this.dB = true;
                if (this.br == 42) {
                    this.fi ^= true;
                    this.aQ();
                    if (this.fi) {
                        this.aQ.b();
                    }

                    if (this.fi && (this.ff == 122 || this.ff == 121)) {
                        this.fi = false;
                    }
                }

                if (this.cC) {
                    this.ae();
                } else {
                    if (this.br == 48) {
                        this.cC ^= true;
                        if (this.cC) {
                            this.cH = false;
                        }
                    }

                    boolean var12 = false;
                    boolean var4 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    switch(this.br) {
                        case 49:
                            var12 = true;
                            var5 = true;
                            break;
                        case 50:
                            var5 = true;
                            break;
                        case 51:
                            var4 = true;
                            var5 = true;
                            break;
                        case 52:
                            var12 = true;
                        case 53:
                        default:
                            break;
                        case 54:
                            var4 = true;
                            break;
                        case 55:
                            var12 = true;
                            var6 = true;
                            break;
                        case 56:
                            var6 = true;
                            break;
                        case 57:
                            var4 = true;
                            var6 = true;
                    }

                    if (this.L(50)) {
                        var5 = true;
                    }

                    if (this.L(56)) {
                        var6 = true;
                    }

                    if (this.L(52)) {
                        var12 = true;
                    }

                    if (this.L(54)) {
                        var4 = true;
                    }

                    if (this.br == 53 && (this.ff >= 0 && this.ff < this.cU || this.ff >= 100 && this.ff < 121)) {
                        this.U = true;
                    }

                    if (this.br == 53 && this.cA >= 0) {
                        this.at();
                        this.cA = -1;
                    } else {
                        int var7;
                        int var8;
                        if (this.ff == 122 || this.ff == 121) {
                            if (this.ff == 122) {
                                if (var5) {
                                    --this.co;
                                }

                                if (var6) {
                                    ++this.co;
                                }

                                if (this.co >= this.ce[0][this.B]) {
                                    this.co = 0;
                                }

                                if (this.co < 0) {
                                    this.co = this.ce[0][this.B] - 1;
                                }
                            }

                            if (this.ff == 121) {
                                var7 = this.bZ[9][this.A];
                                int var10002;
                                if (var5 && this.bZ[9][this.A] < 5) {
                                    var10002 = this.bZ[9][this.A]++;
                                }

                                if (var6 && this.bZ[9][this.A] > 0) {
                                    var10002 = this.bZ[9][this.A]--;
                                }

                                if (this.bZ[9][this.A] != var7 && cy && this.M(this.bZ[5][this.A])) {
                                    this.f(2, this.A, 9, 1);
                                    this.bZ[9][this.A] = var7;
                                }
                            }

                            if (this.br == 53) {
                                if ((var7 = this.ce[this.co + 1][this.B]) >= 32) {
                                    var7 = var7 - 32 + 64;
                                }

                                if (this.cv[1] < this.ak >> 2 && (var7 >= 64 || this.bZ[12][this.A] <= 0)) {
                                    this.q = true;
                                    return;
                                }

                                if (var7 < 64) {
                                    if (bF[var7 - 1][0] <= 0) {
                                        return;
                                    }

                                    if (this.bZ[12][this.A] > 0 && this.bZ[8][this.A] != var7) {
                                        return;
                                    }

                                    if (this.ff == 122) {
                                        if (this.bZ[9][this.A] < 1) {
                                            this.bZ[9][this.A] = 1;
                                            if (cy && this.M(this.bZ[5][this.A])) {
                                                this.f(2, this.A, 9, 1);
                                                this.bZ[9][this.A] = 0;
                                            }
                                        }

                                        this.ff = 121;
                                        return;
                                    }

                                    if (this.bZ[9][this.A] > 0) {
                                        if (this.bZ[12][this.A] <= 0) {
                                            this.a(var7, this.A);
                                            this.bZ[8][this.A] = var7;
                                        }

                                        if (this.M(this.bZ[5][this.A])) {
                                            this.f(2, this.A, 8, 2);
                                            this.f(2, this.A, 12, 6);
                                        }
                                    } else if (this.bZ[12][this.A] > 0 && this.bZ[16][this.A] > 0) {
                                        var8 = this.bZ[16][this.A] - this.bZ[12][this.A];
                                        this.bZ[12][this.A] = 0;
                                        int[] var10000 = this.cv;
                                        var10000[1] += var8 * (this.al * 2 >> 2);
                                        if (this.M(this.bZ[5][this.A])) {
                                            this.f(8, 0, 0, 0);
                                            this.f(2, this.A, 8, 2);
                                            this.f(2, this.A, 12, 6);
                                        }
                                    }

                                    this.ff = -1;
                                    this.fH = -1;
                                    this.gb = -1;
                                    return;
                                }

                                var8 = var7 - 64;
                                if (!this.p(var8, 1)) {
                                    return;
                                }

                                this.bj = var7 - 64;
                                if (this.M(this.bZ[5][this.A])) {
                                    this.f(2, this.A, 8, 2);
                                    this.f(2, this.A, 12, 6);
                                }
                            }
                        }

                        if ((var5 || var6 || var12 || var4) && this.L(53) && this.ff < 77) {
                            this.fH = this.fy;
                            this.gb = this.fQ;
                            this.ff = 77;
                        }

                        if (this.br == 53) {
                            this.T();
                        }

                        if (this.ff != 122 && this.ff != 121) {
                            var7 = 0;
                            var8 = 0;
                            if (this.fi) {
                                var7 = this.fC >> 1;
                                var8 = this.fV >> 1;
                                if (var7 < 1) {
                                    var7 = 1;
                                }

                                if (var8 < 1) {
                                    var8 = 1;
                                }
                            }

                            if (j.bD) {
                                if (this.br == 55) {
                                    this.b(48, this.fy, this.fQ);
                                }

                                if (this.br == 57) {
                                    this.b(64, this.fy, this.fQ);
                                }
                            }

                            if (var12) {
                                --this.fy;
                                this.fJ -= var7;
                            }

                            if (var5) {
                                --this.fQ;
                                this.gd -= var8;
                            }

                            if (var4) {
                                ++this.fy;
                                this.fJ += var7;
                            }

                            if (var6) {
                                ++this.fQ;
                                this.gd += var8;
                            }

                            if (this.fy < 0) {
                                this.fy = 0;
                            }

                            if (this.fQ < 0) {
                                this.fQ = 0;
                            }

                            if (this.fy > this.fE) {
                                this.fy = this.fE;
                            }

                            if (this.fQ > this.fX) {
                                this.fQ = this.fX;
                            }

                            if (this.ff >= 123) {
                                if (this.fy > this.fE - (this.bd - 1)) {
                                    this.fy = this.fE - (this.bd - 1);
                                }

                                if (this.fQ > this.fX - (this.be - 1)) {
                                    this.fQ = this.fX - (this.be - 1);
                                }
                            }

                            if (this.fJ < 0) {
                                this.fJ = 0;
                            }

                            if (this.gd < 0) {
                                this.gd = 0;
                            }

                            if (this.fJ + this.fC > this.fE + 1) {
                                this.fJ = this.fE + 1 - this.fC;
                            }

                            if (this.gd + this.fV > this.fX + 1) {
                                this.gd = this.fX + 1 - this.fV;
                            }

                            if (this.fi) {
                                this.fy = this.fJ + (this.fC >> 1);
                                this.fQ = this.gd + (this.fV >> 1);
                                this.fA = this.fy;
                                this.fS = this.fQ;
                                this.fK = this.fJ;
                                this.ge = this.gd;
                            }

                            if (this.ff >= 123) {
                                this.a(-1, this.bj, 1, this.fy, this.fQ, true);
                            }

                            if ((this.ff >= 0 && this.ff < this.cU || this.ff >= 100 && this.ff < 121) && this.br == 53 && this.U) {
                                this.ff = -1;
                                this.fH = -1;
                                this.gb = -1;

                                for(int var9 = 0; var9 < this.cU; ++var9) {
                                    this.ch[15][var9] = 0;
                                }

                                this.U = false;
                            }

                            this.U = false;
                            this.r();
                            this.V();
                        }
                    }
                }
            }
        }
    }

    private final void ad() {
        this.ac();
        if (this.bz) {
            this.br = 0;
            this.bz = false;
        }

    }

    private final void ae() {
        switch(this.br) {
            case 48:
                this.cC = false;
            case 49:
            case 51:
            case 55:
            default:
                break;
            case 50:
                if (this.cH) {
                    --this.cK;
                }
                break;
            case 52:
                if (!this.cH) {
                    --this.cK;
                }
                break;
            case 53:
                if (this.cK == 0) {
                    this.U();
                    this.r();
                    this.V();
                    return;
                }

                if (this.cK == 3) {
                    this.dd = System.currentTimeMillis();
                    this.cC = false;
                    return;
                }

                if (this.cK > 0) {
                    this.cA = this.cK;
                }

                this.cC = false;
                break;
            case 54:
                if (!this.cH) {
                    ++this.cK;
                }
                break;
            case 56:
                if (this.cH) {
                    ++this.cK;
                }
        }

        byte var1 = 2;
        if (es && !this.aO) {
            var1 = 3;
        }

        if (this.cK < 0) {
            this.cK = var1;
        }

        if (this.cK > var1) {
            this.cK = 0;
        }

    }

    private final void af() {
        boolean[] var1 = this.cb;
        boolean[] var2 = this.cc;
        boolean[] var3 = this.ca;

        for(int var4 = 0; var4 < var2.length; ++var4) {
            var3[var4] = false;
            var1[var4] = false;
            var2[var4] = false;
        }

    }

    private final void ag() {
        if (this.aY()) {
            this.ad();
            if (!this.bq) {
                this.br = 0;
                this.af();
            }
        }

        boolean[] var1 = this.cb;
        boolean[] var2 = this.cc;
        boolean[] var3 = this.ca;
        long var5;
        boolean var7 = (var5 = System.currentTimeMillis()) - this.eI < 50L;

        for(int var8 = 0; var8 < var2.length; ++var8) {
            if (var1[var8]) {
                if (var5 - this.dl >= 230L && !var7) {
                    var3[var8] = true;
                } else {
                    var3[var8] = false;
                }
            }

            if (var2[var8]) {
                var3[var8] = false;
                var1[var8] = false;
                var2[var8] = false;
            }
        }

        if (!var7) {
            this.eI = var5;
        }

    }

    private final void ah() {
        try {
            int var1 = this.getHeight();
            boolean var2 = true;
            this.r((Graphics)null);
            if (this.cO) {
                this.cO = false;
            } else if (this.eA - this.eD >= 500L) {
                if (ds) {
                    this.aJ = true;
                }

                if (this.aJ && !this.cO) {
                    int var3;
                    if ((var3 = j.x.b() * 2 + 2) < n()) {
                        var3 = n();
                    }

                    int var7 = this.dJ;
                    int var8 = var1 - var3 - var7;
                    int var9 = this.ej;
                    int var10 = 0;
                    int var11 = 0;
                    int var13;
                    int var14;
                    byte var15;
                    if (this.ae) {
                        if (ds) {
                            this.db = fF;
                            this.dc = fZ;
                        } else if (this.ae) {
                            var9 = this.af;
                            boolean var12 = false;
                            var13 = Math.abs(fZ - this.dc);
                            var14 = fZ - this.dc;
                            var15 = 1;
                            if (var14 < 0) {
                                var15 = -1;
                            }

                            if (this.ae) {
                                while(var13 >= var9 && var9 > 0) {
                                    var13 -= var9;
                                    this.dc += var15 * var9;
                                    if (!this.ah) {
                                        this.eo -= var15;
                                    }

                                    if (this.eo < 0) {
                                        this.eo = 0;
                                    }
                                }
                            }
                        }
                    }

                    int var18;
                    if (this.aO && this.dB && !this.cC && !this.ae && this.cs == null && (this.ff <= this.cU || this.ff >= 100) && this.ff < 123 && dr) {
                        if (ds) {
                            this.db = fF;
                            this.dc = fZ;
                        } else {
                            var18 = Math.abs(fF - this.db);
                            byte var19 = 1;
                            if (fF < this.db) {
                                var19 = -1;
                            }

                            while(var18 >= var9) {
                                var10 += var19;
                                var18 -= var9;
                            }

                            this.db += var10 * var9;
                            var14 = Math.abs(fZ - this.dc);
                            var15 = 1;
                            if (fZ < this.dc) {
                                var15 = -1;
                            }

                            while(var14 >= var9) {
                                var11 += var15;
                                var14 -= var9;
                            }

                            this.dc += var11 * var9;
                            this.fJ -= var10;
                            this.gd -= var11;
                            if (this.fJ < 0) {
                                this.fJ = 0;
                            }

                            if (this.gd < 0) {
                                this.gd = 0;
                            }

                            if (this.fJ + this.fC > this.fE + 1) {
                                this.fJ = this.fE + 1 - this.fC;
                            }

                            if (this.gd + this.fV > this.fX + 1) {
                                this.gd = this.fX + 1 - this.fV;
                            }

                            this.fz = this.fy;
                            this.fR = this.fQ;
                            this.fA = this.fy;
                            this.fS = this.fQ;
                            this.fK = this.fJ;
                            this.ge = this.gd;
                            this.r();
                        }
                    }

                    if (this.cs != null && c(0, var7, this.e10, var8)) {
                        var2 = false;
                        this.G(53);
                    } else if (this.aO && this.dB) {
                        if (this.cC && c(0, var7, this.e10, var8)) {
                            var2 = false;
                            this.G(this.d10);
                        } else if (!this.cC && !this.ae && this.cs == null && (this.ff == 122 || this.ff == 121) && c(0, var7, this.e10, var8)) {
                            var2 = false;
                            this.G(this.d10);
                        } else if (!this.cC && !this.ae && this.cs == null) {
                            if (d(0, var7, this.e10, var8)) {
                                this.fy = (this.fJ * this.ej + fF - this.cm) / this.ej;
                                this.fQ = (this.gd * this.eg + fZ - this.cn - var7) / this.eg;
                                if (this.ff >= 123) {
                                    if (this.fy > this.fE - (this.bd - 1)) {
                                        this.fy = this.fE - (this.bd - 1);
                                    }

                                    if (this.fQ > this.fX - (this.be - 1)) {
                                        this.fQ = this.fX - (this.be - 1);
                                    }

                                    if (this.fy > this.fJ + this.fC - this.bd) {
                                        this.fy = this.fJ + this.fC - this.bd;
                                    }

                                    if (this.fQ > this.gd + this.fV - this.be) {
                                        this.fQ = this.gd + this.fV - this.be;
                                    }

                                    this.a(-1, this.bj, 1, this.fy, this.fQ, true);
                                }

                                this.fz = this.fy;
                                this.fR = this.fQ;
                                this.fA = this.fy;
                                this.fS = this.fQ;
                            } else if ((this.ff > this.cU && this.ff < 100 || this.ff >= 123) && b(0, var7, this.e10, var8)) {
                                this.fy = (this.fJ * this.ej + fF - this.cm) / this.ej;
                                this.fQ = (this.gd * this.eg + fZ - this.cn - var7) / this.eg;
                                if (this.ff >= 123) {
                                    if (this.fy > this.fE - (this.bd - 1)) {
                                        this.fy = this.fE - (this.bd - 1);
                                    }

                                    if (this.fQ > this.fX - (this.be - 1)) {
                                        this.fQ = this.fX - (this.be - 1);
                                    }

                                    if (this.fy > this.fJ + this.fC - this.bd) {
                                        this.fy = this.fJ + this.fC - this.bd;
                                    }

                                    if (this.fQ > this.gd + this.fV - this.be) {
                                        this.fQ = this.gd + this.fV - this.be;
                                    }

                                    this.a(-1, this.bj, 1, this.fy, this.fQ, true);
                                }

                                this.fz = this.fy;
                                this.fR = this.fQ;
                                this.fA = this.fy;
                                this.fS = this.fQ;
                            }

                            if (c(0, var7, this.e10, var8)) {
                                var2 = false;
                                this.fy = (this.fJ * this.ej + fF - this.cm) / this.ej;
                                this.fQ = (this.gd * this.eg + fZ - this.cn - var7) / this.eg;
                                this.fz = this.fy;
                                this.fR = this.fQ;
                                this.fA = this.fy;
                                this.fS = this.fQ;
                                this.fK = this.fJ;
                                this.ge = this.gd;
                                byte var20 = 53;

                                try {
                                    if (this.ff == 121 && System.currentTimeMillis() - this.eQ <= this.eC && this.bZ[9][this.A] < 5) {
                                        var20 = 50;
                                    }
                                } catch (Exception var16) {
                                }

                                this.G(var20);
                                this.eQ = System.currentTimeMillis();
                                if (this.ff >= 0 && this.ff < this.cU || this.ff >= 100 && this.ff < 121) {
                                    this.U = true;
                                }
                            }
                        }
                    }

                    if (this.aO && this.dB && !this.cC && !this.ae && this.cs == null && dr && this.eA - eJ > 770L) {
                        var18 = 1;
                        var13 = 1;
                        if (this.ff >= 123) {
                            var18 = 1 + (this.bd - 1);
                            var13 = 1 + (this.be - 1);
                        }

                        if (this.fy <= this.fJ && this.fJ > 0) {
                            this.x(52);
                        }

                        if (this.fQ <= this.gd && this.gd > 0) {
                            this.x(50);
                        }

                        if (this.fy >= this.fJ + this.fC - var18 && this.fJ < this.fE + 1 - this.fC) {
                            this.x(54);
                        }

                        if (this.fQ >= this.gd + this.fV - var13 && this.gd < this.fX + 1 - this.fV) {
                            this.x(56);
                        }
                    }

                    (new StringBuffer()).append("").append(fF).append(" ").append(fZ).toString();
                    if (d(this.e10 / 3, var1 - var3, this.e10 / 3, var3)) {
                        this.x(this.br = 42);
                        this.eD = this.eA;
                    }

                    if (d(0, var1 - var3, this.e10 / 3, var3)) {
                        this.x(this.br = 53);
                        this.eD = this.eA;
                    }

                    if (this.ff == 122 || this.ff == 121) {
                        var3 = this.dH;
                    }

                    if (d(this.e10 - this.e10 / 3, var1 - var3, this.e10 / 3, var3)) {
                        this.x(this.br = 35);
                        this.eD = this.eA;
                        this.eD = this.eA;
                    }
                }

                this.cO = false;
                if (dt && var2) {
                    if (this.by) {
                        this.br = 0;
                    } else {
                        this.bz = true;
                    }

                    this.aa();
                }

            }
        } catch (Exception var17) {
        }
    }

    private int a(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = -1;
        int var13 = 2000;
        boolean var14 = false;

        for(int var8 = 0; var8 < this.cU; ++var8) {
            if (this.ch[0][var8] > 0 && this.ch[0][var8] != this.bb && this.ch[8][var8] == var3 && this.ch[17][var8] <= var4 && this.ch[28][var8] <= 0 && this.ch[0][var8] != var6 && this.l(var8) && (var5 < 0 || !this.s(var8, var5))) {
                int var9 = Math.abs(this.ch[1][var8] - var1);
                int var10;
                if ((var10 = Math.abs(this.ch[2][var8] - var2)) > var9) {
                    var9 = var10;
                }

                var14 = true;
                if (var4 > 0 && this.ch[17][var8] > 0 && (this.ch[12][var8] < -9 || this.ch[12][var8] >= 0)) {
                    int var11 = Math.abs(this.ch[1][var8] - this.ch[13][var8]);
                    int var12;
                    if ((var12 = Math.abs(this.ch[2][var8] - this.ch[14][var8])) > var11) {
                        var11 = var12;
                    }

                    if (var4 > 1) {
                        var11 *= 2;
                    }

                    if (var11 < var9) {
                        var14 = false;
                    }
                }

                if (this.ch[0][var8] < this.bb) {
                    var9 *= 2;
                }

                if (var14 && var9 < var13) {
                    var13 = var9;
                    var7 = var8;
                }
            }
        }

        return var7;
    }

    final int a(int var1, int var2, int var3, int var4, int var5) {
        return this.a(var1, var2, var3, var4, var5, -1);
    }

    final int a(int var1, int var2, int var3, int var4) {
        return this.a(var1, var2, var3, var4, -1);
    }

    private void ai() {
        N = AssetManager.getRecordFromRecordStore(this.cJ, N, false);
    }

    static void k() {
        AssetManager.e1 = N[9];
    }

    private final void aj() {
        long var1 = (long)(this.eF * 60 + this.eL);
        this.dC = System.currentTimeMillis();
        if (this.dL) {
            this.di = var1 * 1000L;
            this.fg = this.di / (long)(ec + 1);
        } else {
            this.fg = var1 * 1000L;
            this.di = this.fg * (long)(ec + 1);
        }
    }

    private final boolean e(byte[] var1) {
        try {
            if (this.bZ != null) {
                for(int var2 = 0; var2 < this.bg; ++var2) {
                    this.bZ[0][var2] = 0;
                }
            }

            if (this.ch != null) {
                for(int var3 = 0; var3 < this.cU; ++var3) {
                    this.ch[0][var3] = 0;
                }
            }

            int var4;
            int var5;
            if (this.ck != null) {
                for(var4 = 0; var4 <= this.fX; ++var4) {
                    for(var5 = 0; var5 <= this.fE; ++var5) {
                        this.ck[var5][var4] = 0;
                    }
                }
            }

            if (this.ci != null) {
                for(var4 = 0; var4 <= this.fX; ++var4) {
                    for(var5 = 0; var5 <= this.fE; ++var5) {
                        this.ci[var5][var4] = 0;
                    }
                }
            }

            this.D = 0;
            if (this.aQ != null) {
                this.aQ.h2 = false;
            }

            if (var1 == null) {
                return true;
            }

            if (var1[9] != AssetManager.e1 || var1[8] == 0 || cP) {
                return true;
            }

            var4 = 112;

            byte var6;
            byte var18;
            for(int var7 = 0; var7 < this.cv.length; ++var7) {
                var18 = var1[var4];
                ++var4;
                var6 = var1[var4];
                ++var4;
                this.cv[var7] = a(var18, var6);
            }

            boolean var8 = false;
            boolean var9 = false;

            int var19;
            int var20;
            for(var19 = 0; var19 < this.bg; ++var19) {
                for(var20 = 0; var20 < this.bZ.length; ++var20) {
                    this.bZ[var20][var19] = var1[var4];
                    ++var4;
                }
            }

            this.X();

            for(var19 = 0; var19 < this.cU; ++var19) {
                for(var20 = 0; var20 < this.ch.length; ++var20) {
                    this.ch[var20][var19] = var1[var4];
                    ++var4;
                }
            }

            this.aX();
            this.fJ = var1[var4];
            ++var4;
            this.gd = var1[var4];
            ++var4;
            this.fy = var1[var4];
            ++var4;
            this.fQ = var1[var4];
            ++var4;
            ec = var1[var4];
            ++var4;
            this.eL = var1[var4];
            if (this.eL < 0) {
                this.eL += 256;
            }

            ++var4;
            this.eF = var1[var4];
            if (this.eF < 0) {
                this.eF += 256;
            }

            ++var4;
            this.aj();
            var18 = var1[var4];
            ++var4;
            var6 = var1[var4];
            ++var4;
            int var10 = a(var18, var6);
            int var11 = var1.length - var4;
            if (var10 < var1.length) {
                var11 = var10 - var4;
            }

            byte[] var12 = new byte[var11 + 2];
            boolean var15 = false;

            int var21;
            for(var21 = 0; var21 < var11; ++var21) {
                var12[var21] = var1[var4];
                ++var4;
            }

            byte[] var16 = d(var12);
            var21 = 0;

            int var13;
            int var14;
            for(var14 = 0; var14 <= this.fX; ++var14) {
                for(var13 = 0; var13 <= this.fE && var21 < var16.length; ++var13) {
                    this.cj[var13][var14] = var16[var21];
                    ++var21;
                }
            }

            this.D = var1[var4];
            ++var4;
            if (this.aQ != null) {
                this.aQ.h2 = var1[var4] > 0;
            }

            ++var4;
            ax = var1[var4] > 0;
            ++var4;
            dS = var1[var4];
            ++var4;
            var18 = var1[var4];
            ++var4;
            var6 = var1[var4];
            ++var4;
            var10 = a(var18, var6);
            var11 = var1.length - var4;
            if (var10 < var1.length) {
                var11 = var10 - var4;
            }

            if (var11 > 0) {
                var12 = new byte[var11 + 2];

                for(var21 = 0; var21 < var11; ++var21) {
                    var12[var21] = var1[var4];
                    ++var4;
                }

                var16 = d(var12);
                var21 = 0;

                for(var14 = 0; var14 <= this.fX; ++var14) {
                    for(var13 = 0; var13 <= this.fE && var21 < var16.length; ++var13) {
                        if (this.ci != null) {
                            this.ci[var13][var14] = var16[var21];
                        }

                        ++var21;
                    }
                }
            }
        } catch (Exception var17) {
        }

        return false;
    }

    private final boolean ak() {
        AssetManager.a();
        byte[] var1 = AssetManager.a1;
        if (cy) {
            if (this.cx) {
                var1 = N;
            } else {
                var1 = null;
            }
        }

        return this.e(var1);
    }

    private void al() {
        if (cy) {
            if (this.aO && this.dB && !n.g12) {
                this.aD();
                this.ao();
                this.c(3);
            }

            if (n.r && n.g12) {
                if (b10.h12[0] == 125 && n.b12) {
                    this.d();
                    return;
                }

                byte[] var1;
                int var3;
                int var5;
                int var6;
                try {
                    int var2;
                    if ((var2 = (var1 = b10.h12).length) > ai) {
                        var2 = ai;
                    }

                    byte var4;
                    for(var3 = 0; var3 < var2 && (var4 = var1[var3]) != 0 && var4 < 120; ++var3) {
                        ++var3;
                        var5 = var1[var3];
                        ++var3;
                        var6 = var1[var3];
                        ++var3;
                        byte var7 = var1[var3];
                        ++var3;
                        int[][] var8 = null;
                        byte[][] var9 = null;
                        if (var4 == 1) {
                            var8 = this.ch;
                        }

                        if (var4 == 2) {
                            var8 = this.bZ;
                        }

                        if (var4 == 3) {
                            var9 = this.cf;
                        }

                        if (var4 == 4) {
                            var9 = this.cg;
                        }

                        if (var4 == 22) {
                            (var9 = new byte[1][])[0] = this.O;
                            if (var6 < 0) {
                                var6 += 256;
                            }

                            if (var5 < 0) {
                                var5 += 256;
                            }

                            if (var5 > 0) {
                                var6 += var5 * 256;
                            }
                        }

                        if (var4 == 3 || var4 == 4) {
                            this.ch[12][var5] = -1;
                            this.ch[13][var5] = this.ch[1][var5];
                            this.ch[14][var5] = this.ch[2][var5];
                        }

                        if (var4 == 5) {
                            this.eF = var5;
                            if (this.eF < 0) {
                                this.eF += 256;
                            }

                            this.eL = var6;
                            if (this.eL < 0) {
                                this.eL += 256;
                            }

                            this.aj();
                        }

                        if (var4 == 6) {
                            this.dg = (long)a((byte)var5, (byte)var6);
                        }

                        if (var4 == 7) {
                            this.cj[this.ch[1][var5]][this.ch[2][var5]] = (byte)var6;
                        }

                        if (var4 == 8) {
                            this.cv[2 - var5] = a((byte)var6, (byte)var7);
                        }

                        if (var4 == 9) {
                            this.ex = var5;
                            this.dq = var6;
                            this.doo = var7;
                        }

                        int var10;
                        if (var4 == 11) {
                            var10 = var5;
                            byte var11 = 2;
                            if (var5 < 0) {
                                var10 = -var5;
                                var11 = 1;
                            }

                            this.a(-1, var10, var11, var6, var7, false);
                        }

                        if (var4 == 12) {
                            this.g(var5);
                        }

                        if (var4 == 14) {
                            this.g(var5, var6);
                        }

                        if (var4 == 15) {
                            this.i(var5, var6);
                        }

                        if (var4 == 16) {
                            this.a(var5, var6 > 0);
                        }

                        if (var4 == 20) {
                            aj = a((byte)var5, (byte)var6);
                        }

                        int var32;
                        if (var4 == 21) {
                            this.bn = true;
                            this.m10 = 0;
                            this.bK = 0;
                            if (!this.A()) {
                                byte[] var31 = ac;

                                for(var32 = 0; var32 < var31.length; ++var32) {
                                    var31[var32] = 0;
                                }
                            }
                        }

                        var10 = var3;
                        int var12;
                        int var13;
                        int var15;
                        int var16;
                        if (var4 == 1 && var6 <= 4) {
                            var32 = var8[1][var5];
                            var12 = var8[2][var5];
                            var13 = var5 + 1;

                            try {
                                if (this.ck[var32][var12] == var13) {
                                    this.ck[var32][var12] = 0;
                                }
                            } catch (Exception var23) {
                            }

                            for(var15 = var12 - 2; var15 <= var12 + 2; ++var15) {
                                for(var16 = var32 - 2; var16 <= var32 + 2; ++var16) {
                                    try {
                                        if (this.ck[var16][var15] == var13) {
                                            this.ck[var16][var15] = 0;
                                        }
                                    } catch (Exception var22) {
                                    }
                                }
                            }
                        }

                        if (var4 == 2 && var6 <= 4) {
                            try {
                                if (var6 > 0 || var6 == 0 && var1[var3] != 0) {
                                    this.d(var5, true);
                                }
                            } catch (Exception var25) {
                            }
                        }

                        if (var4 == 1 || var4 == 2) {
                            for(; var3 < var10 + var7; ++var3) {
                                var32 = var6 + var3 - var10;
                                if (var4 != 1 || var32 != 15) {
                                    var8[var32][var5] = var1[var3];
                                }

                                if (var4 == 1 && (var32 == 3 || var32 == 4)) {
                                    this.a(this.ch, var32, var5);
                                }

                                if (var4 == 1 && var32 == 8) {
                                    if (var8[8][var5] == 1) {
                                        var8[8][var5] = 2;
                                    } else if (var8[8][var5] == 2) {
                                        var8[8][var5] = 1;
                                    }
                                }

                                if (var4 == 2 && var32 == 5) {
                                    if (var8[5][var5] == 1) {
                                        var8[5][var5] = 2;
                                    } else if (var8[5][var5] == 2) {
                                        var8[5][var5] = 1;
                                    }
                                }
                            }
                        }

                        if (var4 == 1 && var6 <= 4) {
                            try {
                                this.K(var5);
                            } catch (Exception var21) {
                            }
                        }

                        if (var4 == 1 && var6 == 10 && var8[10][var5] <= 0) {
                            this.a(var5, false, true);
                        }

                        if (var4 == 17) {
                            this.a(var5, var6 > 0, var7 > 0);
                        }

                        if (var4 == 18) {
                            this.c(var5, var6, var7);
                        }

                        if (var4 == 19) {
                            this.el = var5;
                        }

                        if (var4 == 23) {
                            this.dD = var5 == 0;
                            if (this.dD) {
                                this.O = new byte[bO];
                            }

                            if (!this.dD) {
                                var32 = this.fJ;
                                var12 = this.fL;
                                var13 = this.gd;
                                int var14 = this.gf;
                                var15 = this.fy;
                                var16 = this.fz;
                                int var17 = this.fQ;
                                int var18 = this.fR;
                                this.e(this.O);
                                this.O = null;
                                this.J();
                                this.W();
                                this.aH();
                                this.I();
                                this.fJ = var32;
                                this.fL = var12;
                                this.gd = var13;
                                this.gf = var14;
                                this.fy = var15;
                                this.fz = var16;
                                this.fQ = var17;
                                this.fR = var18;
                            }
                        }

                        if (var4 == 2 && var6 <= 4) {
                            try {
                                this.t(var5);
                            } catch (Exception var20) {
                            }
                        }

                        if (var4 == 2 && var6 == 10 && var8[10][var5] <= 0) {
                            this.u(var5);
                        }

                        if (var4 == 3 || var4 == 4) {
                            while(var3 < var10 + var7) {
                                var9[var6 + var3 - var10][var5] = var1[var3];
                                ++var3;
                            }
                        }

                        if (var4 == 22) {
                            while(var3 < var10 + var7) {
                                var9[0][var6 + var3 - var10] = var1[var3];
                                ++var3;
                            }
                        }

                        if (var4 == 25) {
                            this.I(var5);
                        }

                        if (var4 == 26) {
                            ec = (byte)var5;
                            ax = var6 > 0;
                        }

                        if (this.A() && var4 == 2 && var6 == 9) {
                            this.a(var4, var5, var6, var7, false);
                        }

                        --var3;
                    }
                } catch (Exception var26) {
                }

                try {
                    this.aL();
                    this.E();
                } catch (Exception var19) {
                }

                try {
                    var1 = b10.i12;
                    byte[] var27 = ac;
                    var3 = 0;
                    int var28;
                    if ((var28 = var1.length) > aj) {
                        var28 = aj;
                    }

                    int var29;
                    if ((var5 = var27.length) == var28) {
                        var3 = var28;

                        for(var6 = 0; var6 < var28; ++var6) {
                            var1[var6] = var27[var6];
                        }
                    } else {
                        var6 = 0;

                        for(var29 = 0; var29 < var28; ++var29) {
                            if (var6 == 0) {
                                if (var27[var29] == 0 || var27[var29] >= 120) {
                                    var3 = var29;
                                    break;
                                }

                                if ((var27[var29] >= 1 && var27[var29] <= 4 || var27[var29] == 22) && var29 + 3 < var28) {
                                    var6 += var27[var29 + 3];
                                }

                                var6 += 4;
                                if (var29 + var6 > var28) {
                                    var3 = var29;
                                    break;
                                }

                                var3 = var29 + var6;
                            }

                            var1[var29] = var27[var29];
                            --var6;
                        }
                    }

                    var6 = -1;

                    for(var29 = var3; var29 < var28; ++var29) {
                        ++var6;
                        if (var6 >= 8) {
                            break;
                        }

                        var1[var29] = 0;
                    }

                    if ((var6 = this.m10 - var3) > 0) {
                        byte[] var30 = new byte[var5];
                        System.arraycopy(var27, var3, var30, 0, var6);
                        ac = var30;
                    }

                    if (var3 == 0) {
                        this.m10 = 0;
                        this.bK = 0;
                    }

                    this.m10 -= var3;
                    if (this.m10 < 0) {
                        this.m10 = 0;
                    }

                    this.bK -= var3;
                    if (this.bK < 0) {
                        this.bK = 0;
                    }
                } catch (Exception var24) {
                }

                n.r = false;
            }

        }
    }

    private final void am() {
        if (this.aO && this.ch != null) {
            int[][] var1 = this.ch;
            int[][] var2 = this.bZ;

            for(int var3 = 0; var3 < 7; ++var3) {
                ++this.dW;
                if (this.dW >= this.cU) {
                    this.dW = 0;
                }

                if (var1[0][this.dW] > 0 && var1[8][this.dW] == 1) {
                    this.H(this.dW);
                }
            }

            for(int var4 = 0; var4 < 2; ++var4) {
                ++this.dU;
                if (this.dU >= this.bg) {
                    this.dU = 0;
                }

                if (var2[0][this.dU] > 0 && var2[5][this.dU] == 1) {
                    byte var5 = 2;
                    if (var2[0][this.dU] == 1) {
                        var5 = 3;
                    }

                    this.b(var2[1][this.dU], var2[2][this.dU], var2[3][this.dU], var2[4][this.dU], var5);
                }
            }

        }
    }

    private void an() {
        this.bp = 0;
        this.el = this.ej;
        this.m10 = 0;
        this.bK = 0;
        this.o = 0;
        aj = dz;
        ai = dz;
        this.bn = false;
        this.dD = false;
        this.aO = false;
        this.ab = 0;
        this.fw = 0;
        this.fO = 0;
        c.g2 = 0;
        c.n2 = null;
        this.bT = 255;
        this.aA = null;
        this.dA = false;
        this.dM = true;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.victory = false;
        this.aL = false;
        this.aF = 0;
        this.aG = 0;
        this.eO = 0L;
        this.aA = null;
        this.fi = false;
        this.cC = false;
        this.D = 0;
        this.A = 0;
        this.B = 0;
        this.bj = 2;
        this.co = 0;
        this.Z = 0;
        this.cK = 0;
        this.cT = -this.eg;
        this.v = null;
        this.au = null;
        this.ff = -1;
        this.fH = -1;
        this.gb = -1;
        this.cA = -1;
        this.dB = false;
        this.fi = false;
        if (this.aQ != null) {
            this.aQ.h2 = false;
        }

        this.aF();
        byte[] var3 = null;

        try {
            if (cy) {
                var3 = AssetManager.instanceHandler.readDataChunkFromFile("lm" + AssetManager.e1, -1);
            }
        } catch (Exception var22) {
        }

        try {
            if (var3 == null || var3.length <= 0) {
                var3 = AssetManager.instanceHandler.readDataChunkFromFile("ll" + AssetManager.e1, -1);
            }
        } catch (Exception var23) {
        }

        if (var3 != null && var3.length > 0) {
            try {
                Thread.sleep(17L);
            } catch (Exception var21) {
            }

            byte[] var4 = var3;
            var3 = AssetManager.instanceHandler.readDataChunkFromFile("mn", this.ce.length * this.ce[0].length);
            int var2 = 0;

            for(this.cT = 0; this.cT < this.ce[0].length; ++this.cT) {
                for(int var1 = 0; var1 < this.ce.length; ++var1) {
                    this.ce[var1][this.cT] = var3[var2];
                    ++var2;
                }
            }

            this.fE = a(var4[0]) - 1;
            this.fX = a(var4[1]) - 1;
            this.y = this.fE <= 0 || this.fX <= 0;
            if (this.y) {
                this.fE = 23 + AssetManager.e1 * 2;
                this.fX = 23 + AssetManager.e1 * 2;
            }

            if (ey) {
                this.fE = this.cX - 1;
                this.fX = this.cY - 1;
            }

            int var5 = this.fE + 1;
            int var6 = this.fX + 1;
            this.bV = new byte[var5][var6];
            this.bX = new byte[var5][var6];
            this.ck = new short[var5][var6];
            this.cj = new byte[var5][var6];
            this.ci = null;
            this.ci = new byte[var5][var6];
            this.ch = new int[30][this.cU + 2];
            this.bZ = new int[19][this.bg + 2];
            int var8 = 15 + var5 * var6;
            int var9 = var4.length - var8;
            boolean var10 = false;
            if (var9 < 45) {
                var9 = 45;
            }

            this.cd = new byte[var9];

            for(int var24 = 0; var24 < var9 && var24 + var8 < var4.length; ++var24) {
                this.cd[var24] = var4[var24 + var8];
            }

            this.cd[0] = (byte)this.fE;
            this.cd[1] = (byte)this.fX;
            this.L();
            this.M();
            this.N();
            this.g();
            this.a(0, 0, var5, var6, var4, 15, 128);
            this.O();
            this.dX = null;
            this.R();
            if (!ey && this.ak()) {
                this.aI();
            }

            this.J();
            this.I();
            this.aJ();
            this.fK = this.fA - this.fD / 2;
            this.ge = this.fS - this.fW / 2;
            if (this.fK < 0) {
                this.fK = 0;
            }

            if (this.ge < 0) {
                this.ge = 0;
            }

            this.dH = 0;
            this.dG = 0;
            this.dI = 0;
            this.dy = true;
            this.K();
            if (this.v == null) {
                try {
                    this.v = AssetManager.readImageFromFilePNG("/ar.png");
                } catch (Exception var20) {
                }
            }

            if (this.au == null) {
                try {
                    this.au = AssetManager.readImageFromFilePNG("/d.png");
                } catch (Exception var19) {
                }
            }

            if (this.ar == null) {
                this.ar = new Image[8];
            }

            for(int var11 = 0; var11 < this.ar.length; ++var11) {
                if (this.ar[var11] == null) {
                    try {
                        this.ar[var11] = AssetManager.readImageFromFilePNG("/crv" + var11 + ".png");
                    } catch (Exception var18) {
                    }
                }
            }

            if (this.dy) {
                try {
                    this.dH = j.x.b() + 5;
                    boolean var12 = false;
                    int var13 = j.x.b() - j.x.f3 + 4 + 2;

                    try {
                        if (this.R != null && var13 < this.R[3][130] + 2) {
                            var13 = this.R[3][130] + 2;
                        }
                    } catch (Exception var16) {
                    }

                    this.dJ = var13;
                    this.dH = var13;
                    this.dI = this.dH >> 1;
                    this.dG = this.dH / this.eg;
                } catch (Exception var17) {
                    this.dy = false;
                }
            }

            this.fA = this.fy - 1;
            this.fS = this.fQ - 1;
            this.r();
            this.V();
            this.fK = this.fJ;
            this.ge = this.gd;
            if (this.bR <= 0) {
                this.bJ = 0;
                this.bR = this.e10;
            }

            while(this.bJ < this.bR) {
                this.p();
            }

            if (cy) {
                this.dE = true;
                this.aM();
                this.dE = false;
            }

            if (!cy || n.g12 && this.er) {
                this.c(-1);
                this.br = 0;
                this.aa();
                this.eZ = System.currentTimeMillis() + 999L;
                this.de = System.currentTimeMillis();
                this.dd = this.de;
                this.aF();
                cP = false;
                this.dB = true;
                this.G();
                this.dh = 0L;
                C(AssetManager.e1 - 1);
            } else {
                this.ao();
            }
        } else {
            this.ao();
        }
    }

    private int d(int var1, int var2, int var3) {
        boolean var4 = false;

        try {
            int var7;
            if ((var7 = this.ck[var1][var2]) == 0 && var3 <= 6) {
                int var5;
                if ((var5 = this.bV[var1][var2]) < 0) {
                    var5 += 256;
                }

                if (var5 >= 128 && (var3 <= 2 || var5 - 128 != 54) && var5 - 128 != 47 && this.R[7][var5 - 128] > 0) {
                    var7 = var5;
                }
            }

            return var7;
        } catch (Exception var6) {
            return 250;
        }
    }

    private final void ao() {
        l();
        this.cs = null;
        c.g2 = 0;
        c.n2 = null;
        this.ae = false;
        this.cC = false;
        this.aW = false;
        this.cV = null;
        this.eX = null;
        this.dR = null;
        this.v = null;
        this.au = null;
        a.a5 = null;
        this.ar = null;
        if (b10 != null && n.g12) {
            this.d();
        }

        if (this.dM) {
            aE();
        }

        if (this.cr == null) {
            this.cr = new j(this);
        } else {
            j.g();
        }

        cq = true;
        this.aO = false;
    }

    private final void ap() {
        if (!cQ) {
            long var1;
            if ((var1 = System.currentTimeMillis()) - this.cw >= 2048L) {
                if (this.aO) {
                    if (!cy || b10 == null || this.A()) {
                        this.cw = var1;
                        byte var3 = 8;
                        if (cy) {
                            var3 = 9;
                        }

                        if (this.q() < var3) {
                            int var4 = 0;
                            int var5 = 0;
                            int var6 = 0;

                            while(true) {
                                ++var6;
                                if (var6 >= 100) {
                                    break;
                                }

                                if (this.q() < 7 && !cy) {
                                    var4 = this.fJ + Math.abs(this.randomGenerator.nextInt() % this.fC);
                                    var5 = this.gd + Math.abs(this.randomGenerator.nextInt() % this.fV);
                                } else {
                                    var4 = Math.abs(this.randomGenerator.nextInt() % this.fE);
                                    var5 = Math.abs(this.randomGenerator.nextInt() % this.fX);
                                }

                                try {
                                    if (this.r(var4, var5) && this.r(var4 - 1, var5)) {
                                        break;
                                    }
                                } catch (Exception var8) {
                                }
                            }

                            if (var6 > 90) {
                                return;
                            }

                            if (this.q() < 50) {
                                this.b(48, var4, var5);
                                return;
                            }

                            this.b(64, var4, var5);
                        }

                    }
                }
            }
        }
    }

    private final void e(Graphics var1) {
        boolean var2 = false;
        boolean var3 = false;
        int var4 = this.D(0);
        int var5 = this.D(1);
        int var6 = this.fM;
        boolean var7 = false;
        byte var8 = this.ce[0][this.B];
        int var9 = var4 >> 1;
        int var10 = var5 >> 1;
        int var23 = var5 * var8;
        int var24 = this.fY - 3 - var23;
        if (this.dy) {
            var24 = this.bx - var23;
        }

        --var24;
        int var11 = 0;
        int var12 = var8;

        while(var24 < 0) {
            var24 += var5;
            var23 -= var5;
            if (var11 < this.co) {
                ++var11;
            } else {
                --var12;
            }
        }

        while(var11 > 0 && this.co < var12 - 1) {
            --var11;
            --var12;
        }

        var1.setColor(0);
        var1.fillRect(var6, var24, var4, var23 + 1);
        var1.setColor(16340729);
        int var13 = var1.getTranslateY();

        for(int var14 = var11; var14 < var12; ++var14) {
            int var15;
            if ((var15 = this.ce[var14 + 1][this.B]) >= 32) {
                var15 = var15 - 32 + 64;
            }

            if (this.eA - this.eD > 7L) {
                if (d(var6, var24 + var13, var4, var5)) {
                    this.co = var14;
                    this.eD = this.eA;
                }

                if (c(var6, var24 + var13, var4, var5)) {
                    this.co = var14;
                    byte var16 = 53;

                    try {
                        if (this.ff == 121 && this.eA - this.eQ <= this.eC && this.bZ[9][this.A] < 5) {
                            var16 = 50;
                        }
                    } catch (Exception var20) {
                    }

                    this.eQ = this.eA;
                    this.eD = this.eA;
                    this.x(var16);
                } else if (this.bN && this.ff == 121 && this.v() && this.eA - this.eQ > this.eC) {
                    this.x(53);
                }
            }

            if (var15 >= 64) {
                this.d(var1, 135 + var15 - 64, var6 + var9, var24 + var10, 3);
            } else {
                int var25 = (2 * (var15 - 1) + (f(1) - 1)) * this.bs;
                boolean var17 = false;
                if (var15 > 2 && f(1) == 2) {
                    var25 -= this.bs;
                    this.e(var1, var25, var6 + 0 + var9 + this.am[4][var25], var24 + 0 + var10 + this.am[5][var25], 3);
                    var25 += this.bs;
                }

                this.e(var1, var25, var6 + 0 + var9 + this.am[4][var25], var24 + 0 + this.am[5][var25] + var10, 3);

                try {
                    if (this.bZ[12][this.A] > 0 && var15 != this.bZ[8][this.A]) {
                        if (this.cr != null && this.cr.f()) {
                            a.a(var1, var6, var24, var4, var5, 0, 128);
                        } else if (this.cr != null) {
                            j.a(var1, var6, var24, var4, var5, 0, 128);
                        }
                    }
                } catch (Exception var22) {
                }
            }

            if (var14 == this.co) {
                a(var1, var6 + 1, var24 + 1, var4 - 3, var5 - 2);
                this.bf = var15;
                if (this.ct == null) {
                    try {
                        if (var15 >= 64) {
                            var15 -= 64;
                            this.ak = this.j(var15 + 64);
                            if (!this.p(var15, 1)) {
                                var1.drawLine(var6 + 1, var24 + 1, var6 + var4 - 2, var24 + 1 + var5 - 3);
                                this.a(var1, r[4][4]);
                                this.bf = -1;
                            } else {
                                this.a(var1, r[5][var15] + " " + this.ak + "$");
                            }
                        } else {
                            this.ak = this.j(var15);
                            if (bF[var15 - 1][0] <= 0) {
                                var1.drawLine(var6 + 1, var24 + 1, var6 + var4 - 2, var24 + 1 + var5 - 3);
                                this.a(var1, r[4][4]);
                                this.bf = -1;
                            } else {
                                this.a(var1, r[6][var15] + " " + this.ak + "$");
                            }
                        }
                    } catch (Exception var21) {
                    }
                }
            }

            var24 += var5;
        }

    }

    private static byte e(int var0, int var1, int var2, int var3) {
        byte var4 = 0;
        if (var1 == var3 && var0 < var2) {
            var4 = 1;
        }

        if (var1 == var3 && var0 > var2) {
            var4 = 0;
        }

        if (var0 == var2 && var1 < var3) {
            var4 = 3;
        }

        if (var0 == var2 && var1 > var3) {
            var4 = 2;
        }

        if (var0 > var2 && var1 > var3) {
            if (Math.abs(var0 - var2) >= Math.abs(var1 - var3)) {
                var4 = 0;
            } else {
                var4 = 2;
            }
        }

        if (var0 < var2 && var1 > var3) {
            if (Math.abs(var0 - var2) >= Math.abs(var1 - var3)) {
                var4 = 1;
            } else {
                var4 = 2;
            }
        }

        if (var0 > var2 && var1 < var3) {
            if (Math.abs(var0 - var2) >= Math.abs(var1 - var3)) {
                var4 = 0;
            } else {
                var4 = 3;
            }
        }

        if (var0 < var2 && var1 < var3) {
            if (Math.abs(var0 - var2) >= Math.abs(var1 - var3)) {
                var4 = 1;
            } else {
                var4 = 3;
            }
        }

        if (var4 > 3) {
            var4 = (byte)(var4 - 4);
        }

        return var4;
    }

    private final void y(int var1) {
        int var2;
        if ((var2 = this.ch[9][var1]) > 7) {
            var2 -= 8;
            if (this.ch[6][var1] >= 64) {
                int var10002 = this.ch[6][var1]--;
                if (this.ch[6][var1] >= 64) {
                    return;
                }

                this.ch[6][var1] = 0;
            }

            if (this.ch[29][var1] <= 0) {
                int var3 = this.ch[1][var1];
                int var4 = this.ch[2][var1];
                int var5 = this.ch[3][var1];
                int var6 = this.ch[4][var1];
                int var7 = a(this.ch[11][var1], ed, this.ej);
                int var8 = 0;
                switch(var2) {
                    case 0:
                        var8 = var5;
                        break;
                    case 1:
                        var8 = var5;
                        break;
                    case 2:
                        var8 = var6;
                        break;
                    case 3:
                        var8 = var6;
                }

                var8 = Math.abs(var8);
                int var9;
                int var10;
                int var11;
                int var12;
                int var13;
                if (cy && this.el != this.ej && var7 > 0) {
                    var9 = 1000;
                    var10 = Math.abs(var8);
                    var11 = Math.abs(var8);

                    for(var12 = 0; var12 <= this.ej; var12 += var7) {
                        if ((var13 = Math.abs(var10 - var12)) < var9) {
                            var11 = var12;
                            var9 = var13;
                        }
                    }

                    if (var11 != var10) {
                        switch(var2) {
                            case 0:
                            case 1:
                                if (var5 < 0) {
                                    var5 = -var8;
                                } else {
                                    var5 = var8;
                                }
                                break;
                            case 2:
                            case 3:
                                if (var6 < 0) {
                                    var6 = -var8;
                                } else {
                                    var6 = var8;
                                }
                        }
                    }
                }

                for(var9 = 0; var9 < var7; ++var9) {
                    switch(var2) {
                        case 0:
                            --var5;
                            break;
                        case 1:
                            ++var5;
                            break;
                        case 2:
                            --var6;
                            break;
                        case 3:
                            ++var6;
                    }
                }

                this.A(var1);
                if (var5 < this.ej && var5 > -this.ej && var6 < this.eg && var6 > -this.eg) {
                    var2 += 8;
                } else {
                    var10 = var3;
                    var11 = var4;
                    var12 = var3 * this.ej + var5;
                    var13 = var4 * this.eg + var6;
                    var3 = var12 / this.ej;
                    var4 = var13 / this.eg;
                    var5 = var12 - var3 * this.ej;
                    var6 = var13 - var4 * this.eg;
                    if (this.ck[var10][var11] == var1 + 1) {
                        this.ck[var10][var11] = 0;
                    }

                    if (this.ch[0][var1] == 3 && av > 0) {
                        int var14 = -12 + (var2 >> 1 << 1);
                        this.bX[var10][var11] = (byte)var14;
                        this.bX[var3][var4] = (byte)var14;
                    }

                    this.H(var1);
                }

                this.ch[9][var1] = var2;
                this.ch[1][var1] = var3;
                this.ch[2][var1] = var4;
                this.ch[3][var1] = var5;
                this.ch[4][var1] = var6;
            }
        }
    }

    private final void z(int var1) {
        if (!this.aB) {
            int var10002;
            if (this.ch[29][var1] > 0) {
                if (this.ch[0][var1] == 8) {
                    var10002 = this.ch[29][var1]--;
                    if (this.ch[29][var1] <= 0) {
                        this.a(var1, false);
                    }
                }

            } else {
                int var2;
                if ((var2 = this.ch[8][var1]) != 2 || !aT || cy) {
                    if (this.ch[9][var1] <= 7) {
                        if (this.ch[6][var1] >= 64) {
                            var10002 = this.ch[6][var1]--;
                            if (this.ch[6][var1] >= 64) {
                                return;
                            }

                            this.ch[6][var1] = 0;
                        }

                        int var4 = this.ch[1][var1];
                        int var5 = this.ch[2][var1];
                        int var6 = var4;
                        int var7 = var5;
                        int var8 = -1;
                        boolean var9 = this.ch[7][var1] > 0 && this.ch[7][var1] <= this.cU && this.ch[12][var1] != -12;
                        if (this.ch[7][var1] <= 0 && this.ch[0][var1] != this.bb && this.ch[0][var1] != 8 && this.ch[8][var1] == 2 && this.ch[12][var1] < 0 && this.ch[12][var1] > -10 && this.ch[28][var1] <= 0 && this.q() < 3 && !cy) {
                            var6 = var4 + 2 * this.q() / 70 - 1;
                            var7 = var5 + 2 * this.q() / 70 - 1;
                        }

                        int var11;
                        int var12;
                        int var14;
                        int var15;
                        int var17;
                        if (var9) {
                            if (var9) {
                                var6 = var4;
                                var7 = var5;
                                var8 = this.ch[7][var1] - 1;
                                if (this.ch[0][var8] <= 0) {
                                    var8 = -1;
                                    this.ch[7][var1] = 0;
                                }
                            }

                            if (var8 >= 0) {
                                var11 = this.ch[1][var8] - var4;
                                var12 = this.ch[2][var8] - var5;
                                if (var11 < -1) {
                                    var11 = -1;
                                }

                                if (var11 > 1) {
                                    var11 = 1;
                                }

                                if (var12 < -1) {
                                    var12 = -1;
                                }

                                if (var12 > 1) {
                                    var12 = 1;
                                }

                                var6 = var4 + var11;
                                var7 = var5 + var12;
                                if (var6 >= 0 && var6 <= this.fE && var7 >= 0 && var7 <= this.fX && this.ck[var6][var7] == var8 + 1 && this.ch[0][var8] == 8 && this.ch[0][var1] != 8 && this.ch[8][var8] == this.ch[8][var1] && var11 >= -1 && var11 <= 1 && var12 >= -1 && var12 <= 1 && this.ch[27][var8] + d(this.ch[0][var1]) <= 8) {
                                    int[] var10000 = this.ch[27];
                                    var10000[var8] += d(this.ch[0][var1]);
                                    this.ch[7][var1] = 0;
                                    this.ch[29][var1] = var8 + 1;
                                    int var24 = var4;
                                    var14 = var5;
                                    var15 = var1 + 1;

                                    try {
                                        if (this.ck[var24][var14] == var15) {
                                            this.ck[var24][var14] = 0;
                                        }
                                    } catch (Exception var21) {
                                    }

                                    boolean var25 = false;

                                    for(var17 = var5 - 2; var17 <= var14 + 2; ++var17) {
                                        for(int var26 = var24 - 2; var26 <= var24 + 2; ++var26) {
                                            try {
                                                if (this.ck[var26][var17] == var15) {
                                                    this.ck[var26][var17] = 0;
                                                }
                                            } catch (Exception var20) {
                                            }
                                        }
                                    }

                                    if (this.ch[8][var1] == 1 && this.ch[8][var8] == 1) {
                                        if (this.ch[15][var1] > 0 && this.ff == 120) {
                                            this.ch[15][var8] = 1;
                                        }

                                        if (var1 == this.ff) {
                                            this.ff = 120;
                                            this.ch[15][var1] = 1;
                                            this.ch[15][var8] = 1;
                                        }
                                    }

                                    return;
                                }
                            }
                        }

                        if (this.ch[12][var1] == -10) {
                            var6 = this.ch[13][var1];
                            var7 = this.ch[14][var1];
                        }

                        var11 = 0;
                        var12 = 0;
                        boolean var13 = false;
                        var15 = var14 = this.ch[12][var1];
                        if (var2 < 3 && var14 >= 0) {
                            try {
                                var6 = this.cf[var14][var1];
                                var7 = this.cg[var14][var1];
                                if (var6 == var4 && var7 == var5) {
                                    ++var14;
                                    var6 = this.cf[var14][var1];
                                    var7 = this.cg[var14][var1];
                                }
                            } catch (Exception var22) {
                            }

                            if (var4 == this.ch[13][var1] && var5 == this.ch[14][var1]) {
                                var14 = -1;
                                this.ch[12][var1] = -1;
                                var6 = var4;
                                var7 = var5;
                            }

                            var11 = var6;
                            var12 = var7;
                            if (Math.abs(var6 - var4) > 1) {
                                var13 = true;
                            }

                            if (Math.abs(var7 - var5) > 1) {
                                var13 = true;
                            }
                        }

                        if (var6 > var4) {
                            var6 = var4 + 1;
                        }

                        if (var6 < var4) {
                            var6 = var4 - 1;
                        }

                        if (var7 > var5) {
                            var7 = var5 + 1;
                        }

                        if (var7 < var5) {
                            var7 = var5 - 1;
                        }

                        if (var2 < 3 && var14 >= 0) {
                            if (var6 != var4 && var7 != var5) {
                                var13 = true;
                            }

                            if (var13) {
                                if (var6 > var4) {
                                    var6 = var4 + 1;
                                }

                                if (var6 < var4) {
                                    var6 = var4 - 1;
                                }

                                if (var7 > var5) {
                                    var7 = var5 + 1;
                                }

                                if (var7 < var5) {
                                    var7 = var5 - 1;
                                }

                                if (var6 != var4 && var7 != var5) {
                                    if (this.a(var1, var4, var7, false) <= 0) {
                                        var6 = var4;
                                    } else {
                                        var7 = var5;
                                    }
                                }

                                if (var6 != var11 || var7 != var12) {
                                    --var14;
                                }
                            }

                            ++var14;
                            if (var6 == this.ch[13][var1] && var7 == this.ch[14][var1]) {
                                var14 = -1;
                                if (this.d(var6, var7) > 0 && this.a(var1, var6, var7, true) > 0) {
                                    if (var6 != var4 || var7 != var5) {
                                        this.ch[9][var1] = e(var4, var5, var6, var7);
                                    }

                                    var6 = var4;
                                    var7 = var5;
                                }
                            }

                            if (var14 >= 0 && this.d(var6, var7) >= 64 && (var4 != var6 || var5 != var7) && this.d(var6, var7) == this.d(this.ch[13][var1], this.ch[14][var1])) {
                                var14 = -1;
                            }

                            if (var14 < 0 || this.a(var1, var6, var7, false) <= 0 || var4 == var6 && var5 == var7) {
                                this.ch[6][var1] = 0;
                            } else {
                                int var16 = this.a(var1, var6, var7, false) - 1;
                                if (this.a(var1, var6, var7, true) > 0) {
                                    var17 = var14;
                                    var6 = var4;
                                    var7 = var5;

                                    try {
                                        if (this.cf[var17][var1] == this.ch[13][var1] && this.cg[var17][var1] == this.ch[14][var1]) {
                                            var14 = -1;
                                        } else {
                                            boolean var18 = true;
                                            if (var14 > 0 && var16 >= 0 && var16 < this.cU) {
                                                switch(this.ch[6][var1]) {
                                                    case 0:
                                                        this.ch[6][var1] = 5;
                                                        var18 = false;
                                                        break;
                                                    case 1:
                                                        var10002 = this.ch[6][var1]--;
                                                        break;
                                                    default:
                                                        var10002 = this.ch[6][var1]--;
                                                        var18 = false;
                                                }
                                            }

                                            if (var18) {
                                                var14 = -10;
                                            } else {
                                                --var14;
                                            }
                                        }
                                    } catch (Exception var23) {
                                        var14 = -10;
                                    }
                                }
                            }

                            this.ch[12][var1] = var14;
                        }

                        if (var2 < 3 && this.ch[12][var1] < -11) {
                            var6 = var4;
                            var7 = var5;
                            this.A(var1);
                        }

                        if (var6 < 0) {
                            var6 = 0;
                        }

                        if (var6 > this.fE) {
                            var6 = this.fE;
                        }

                        if (var7 < 0) {
                            var7 = 0;
                        }

                        if (var7 > this.fX) {
                            var7 = this.fX;
                        }

                        if (var4 != var6 && var5 != var7) {
                            if (this.a(var1, var4, var7, false) <= 0) {
                                var6 = var4;
                            } else {
                                var7 = var5;
                            }
                        }

                        if (var15 >= 0 || !cy || this.A()) {
                            if (this.a(var1, var6, var7, true) < 1 && (var4 != var6 || var5 != var7)) {
                                int var3 = 8 + e(var4, var5, var6, var7);
                                this.ch[9][var1] = var3;
                                this.ch[3][var1] = 0;
                                this.ch[4][var1] = 0;
                                this.ck[var6][var7] = (short)((byte)(var1 + 1));
                                this.ck[var4][var5] = (short)((byte)(var1 + 1));
                            } else if (var8 >= 0) {
                                var6 = var4;
                                var7 = var5;
                                if (Math.abs(this.ch[1][var8] - var4) + Math.abs(this.ch[2][var8] - var5) > 1) {
                                    this.ch[13][var1] = this.ch[1][var8];
                                    this.ch[14][var1] = this.ch[2][var8];
                                    this.ch[12][var1] = -10;
                                } else {
                                    this.ch[12][var1] = -1;
                                }
                            }
                        }

                        if (var6 == var4 && var7 == var5) {
                            this.ch[5][var1] = 0;
                        }

                    }
                }
            }
        }
    }

    private final void aq() {
        long var1;
        if ((var1 = System.currentTimeMillis()) >= this.fu + 533L) {
            this.fu = var1;
            this.fo ^= true;
        }
    }

    private final void ar() {
        long var1;
        if ((var1 = System.currentTimeMillis()) - this.df >= 135L) {
            this.fn = !this.fn;
            this.df = var1;
            this.aa = (byte)(this.aa + this.X);
            if (this.aa < 0) {
                this.aa = 1;
                this.X = Math.abs(this.X);
            }

            if (this.aa > 2) {
                this.aa = 1;
                this.X = -Math.abs(this.X);
            }
        }

    }

    private final void as() {
        long var1;
        if ((var1 = System.currentTimeMillis()) >= this.fv + 533L) {
            this.fv = var1;
            ++this.T;
            if (this.T > 2) {
                this.T = 0;
                ++this.bU;
                if (this.bU > 2) {
                    this.bU = 0;
                    this.q = !this.q;
                }
            }

        }
    }

    private final void A(int var1) {
        int var2;
        byte var3;
        if ((var2 = this.ch[5][var1]) != 0 && var2 != 2) {
            var3 = 2;
        } else {
            var3 = 1;
        }

        this.ch[5][var1] = var3;
    }

    private final void at() {
        try {
            int var2;
            if ((var2 = this.d(this.fy, this.fQ) - 64) >= 0 && var2 < this.bg && this.bZ[0][var2] > 0 && this.bZ[5][var2] == 1) {
                if (this.cA == 1) {
                    this.bZ[13][var2] = 1;
                    if (this.M(this.bZ[5][var2])) {
                        this.f(2, var2, 13, 1);
                    }
                }

                if (this.cA == 2) {
                    this.g(var2);
                }
            }

        } catch (Exception var3) {
        }
    }

    private final void f(Graphics var1) {
        boolean var2 = false;
        boolean var3 = false;
        int var4 = 0;
        int var5 = this.cT;
        byte var6 = 3;
        if (es && !this.aO) {
            var6 = 4;
        }

        int var7 = 21;
        int var8 = 21;
        if (this.R != null) {
            var7 = this.R[2][136] + 1;
            var8 = this.R[3][136] + 2;
        }

        int var9 = var7 >> 1;
        int var10 = var8 >> 1;
        int var15 = var8;
        int var14 = var7 * var6;
        if (this.cH) {
            var15 = var8 * var6;
            var14 = var7;
            var5 = this.aM - this.dH - var15 - this.cT * 3;
            var4 = this.e10 - var7;
        }

        var1.setClip(0, 0, this.e10, this.aM - this.dH);
        var1.setColor(0);
        var1.fillRect(var4, var5, var14, var15);
        var1.setColor(16340729);
        int var11 = this.bx;
        this.bx = this.c10;
        int var12 = var1.getTranslateY();
        ++var4;

        for(int var13 = 0; var13 < var6; ++var13) {
            if (this.eA - this.eD > 300L) {
                if (d(var4, var5 + var12, var7, var8)) {
                    this.cK = var13;
                }

                if (c(var4, var5 + var12, var7, var8)) {
                    this.cK = var13;
                    this.x(53);
                    this.eD = this.eA;
                }
            }

            this.d(var1, 136, var4 + var9, var5 + var10, 3);
            this.d(var1, 120 + var13, var4 + var9, var5 + var10, 3);
            if (var13 == this.cK) {
                a(var1, var4, var5 + 1, var7 - 2, var8 - 3);
            }

            if (this.cH) {
                var5 += var8;
            } else {
                var4 += var7;
            }
        }

        this.bx = var11;
    }

    private final void au() {
        try {
            this.en += this.ba / j.x.b() + this.av();
            if (this.en >= this.cs.length) {
                this.en = 0;
                this.cs = null;
            }

        } catch (Exception var2) {
            this.cs = null;
        }
    }

    static final void l() {
        if (dt) {
            dr = false;
        }

        ds = false;
        dt = false;
        cZ = true;
        if (dF) {
            h10 = false;
        }

    }

    private final void B(int var1) {
        int var2;
        if (var1 == this.dq || var1 == this.dq + 10 || var1 == this.dq + 20 || (var2 = var1 - 30) == this.dq || var2 == this.dq + 10 || var2 == this.dq + 20) {
            if (!cy || this.w()) {
                var2 = this.ch[1][var1];
                int var3 = this.ch[2][var1];
                int var4;
                if ((var4 = this.ch[8][var1]) <= 2) {
                    int var5 = this.ch[3][var1];
                    int var6 = this.ch[4][var1];
                    if (var5 >= this.ek) {
                        ++var2;
                    }

                    if (var5 <= -this.ek) {
                        --var2;
                    }

                    if (var6 >= this.eh) {
                        ++var3;
                    }

                    if (var6 <= -this.eh) {
                        --var3;
                    }

                    int var7;
                    if (this.ch[0][var1] <= 2 && (var4 == 1 || cy)) {
                        if ((var7 = this.bV[var2][var3]) < 0) {
                            var7 += 256;
                        }

                        if (var7 - 128 == 47 || var7 - 128 == 48) {
                            int var8 = 4;
                            if (var4 == 2 && !cy) {
                                var8 = 1;
                            }

                            if (this.ch[0][var1] <= 2) {
                                var8 *= 2;
                            }

                            if ((var8 *= ed + 1) < 1) {
                                var8 = 1;
                            }

                            this.n(var1, var8);
                        }
                    }

                    if (this.ch[0][var1] != this.bb && this.ch[29][var1] <= 0) {
                        var7 = this.dx;
                        if (this.ch[0][var1] == 4) {
                            var7 = 4;
                        }

                        if (this.ch[0][var1] == 5) {
                            var7 = 5;
                        }

                        int var9 = this.ch[9][var1];
                        boolean var10 = false;
                        if (var9 > 7) {
                            var9 -= 8;
                            var10 = true;
                        }

                        boolean var32 = !var10 && this.ch[12][var1] < 0;
                        boolean var11 = false;
                        boolean var12 = false;
                        boolean var13 = false;
                        this.ch[28][var1] = 0;
                        int var14 = -1;
                        int var15 = 0;
                        boolean var16 = this.ch[7][var1] > 0 && this.ch[7][var1] <= this.cU;
                        int var17 = this.ch[7][var1] - 1;
                        int var18 = 0;
                        int var19 = var9;

                        int var20;
                        int var21;
                        int var22;
                        for(int var34 = var3 - var7; var34 <= var3 + var7; ++var34) {
                            for(int var33 = var2 - var7; var33 <= var2 + var7; ++var33) {
                                if (var33 != var2 || var34 != var3) {
                                    var20 = var33 - var2;
                                    var21 = var34 - var3;
                                    var22 = Math.abs(var20);
                                    int var23 = Math.abs(var21);
                                    if (var22 != var23 || var22 < 2 || var22 < var7 - 1) {
                                        byte var24 = e(var2, var3, var33, var34);
                                        int var25;
                                        int var26;
                                        if (!var32 && var24 != var9) {
                                            var25 = Math.abs(var33 - var2);
                                            var26 = Math.abs(var34 - var3);
                                            if (var25 < var26) {
                                                var25 = var26;
                                            }

                                            int var27 = var7 >> 1;
                                            if (var19 == 0 && var24 == 1 && var25 > var27 || var19 == 1 && var24 == 0 && var25 > var27 || var19 == 2 && var24 == 3 && var25 > var27 || var19 == 3 && var24 == 2 && var25 > var27 || var25 > var7 * 3 >> 2) {
                                                continue;
                                            }
                                        }

                                        var9 = var24;
                                        int var35;
                                        if ((var35 = this.d(var33, var34)) > 0 && var35 - 1 != var1) {
                                            int var29;
                                            int var30;
                                            if ((var25 = var35 - 64) >= 0 && var25 < this.bg && this.bZ[0][var25] > 0 && this.bZ[5][var25] != var4 && var14 < 0) {
                                                int var28 = Math.abs(var2 - var33);
                                                var29 = Math.abs(var3 - var34);
                                                var30 = var7;
                                                if (var24 == var19) {
                                                    var30 = var7 + 1;
                                                }

                                                if (var28 == 0 || var29 == 0 || var28 < var30 && var29 < var30) {
                                                    var14 = var35;
                                                    var15 = var24;
                                                    this.dj[var18][0] = var35;
                                                    this.dj[var18][1] = var24;
                                                    if (var28 > var29) {
                                                        this.dj[var18][2] = var28;
                                                    } else {
                                                        this.dj[var18][2] = var29;
                                                    }

                                                    ++var18;
                                                }
                                            }

                                            if (var35 > 0 && var35 <= this.cU) {
                                                var26 = var35 - 1;
                                                if (this.ch[0][var26] > 0 && this.ch[8][var26] < 3 && this.ch[8][var26] != var4) {
                                                    var29 = Math.abs(var2 - var33);
                                                    var30 = Math.abs(var3 - var34);
                                                    int var31 = var7;
                                                    if (var24 == var19) {
                                                        var31 = var7 + 1;
                                                    }

                                                    if (var29 == 0 || var30 == 0 || var29 < var31 && var30 < var31) {
                                                        var14 = var35;
                                                        var15 = var24;
                                                        this.dj[var18][0] = var35;
                                                        this.dj[var18][1] = var24;
                                                        if (var29 > var30) {
                                                            this.dj[var18][2] = var29;
                                                        } else {
                                                            this.dj[var18][2] = var30;
                                                        }

                                                        if (var16 && var17 == var26) {
                                                            this.dj[var18][2] = 0;
                                                        }

                                                        ++var18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        if (var18 > 0) {
                            var14 = -1;
                            var20 = var7 * 3;

                            for(var21 = 0; var21 < var18; ++var21) {
                                if (this.dj[var21][0] > 0 && this.dj[var21][0] <= this.cU && this.dj[var21][2] < var20) {
                                    var14 = this.dj[var21][0];
                                    var15 = this.dj[var21][1];
                                    var20 = this.dj[var21][2];
                                }
                            }

                            if (var14 < 0) {
                                for(var22 = 0; var22 < var18; ++var22) {
                                    if (this.dj[var22][2] < var20) {
                                        var14 = this.dj[var22][0];
                                        var15 = this.dj[var22][1];
                                        var20 = this.dj[var22][2];
                                    }
                                }
                            }
                        }

                        if ((var20 = var14 - 64) >= 0 && var20 < this.bg) {
                            if (var32) {
                                this.ch[9][var1] = var15;
                            }

                            this.ch[28][var1] = 64 + var20;
                            if (this.bZ[5][var20] == 1) {
                                this.aU = true;
                            }

                            if (this.ch[0][var1] == 8) {
                                if (!var10 && var32 && (Math.abs(this.ch[13][var1] - this.ch[1][var1]) <= 1 && Math.abs(this.ch[14][var1] - this.ch[2][var1]) <= 1 || Math.abs(this.ch[13][var1] - this.bZ[1][var20]) <= 1 && Math.abs(this.ch[14][var1] - this.bZ[2][var20]) <= 1)) {
                                    this.a(var1, false);
                                    this.l(var1, var20);
                                }
                            } else {
                                this.h(var1, var20);
                                this.l(var1, var20);
                            }
                        }

                        if (var14 > 0 && var14 <= this.cU) {
                            var21 = var14 - 1;
                            if (var32) {
                                this.ch[9][var1] = var15;
                            }

                            this.ch[28][var1] = 1 + var21;
                            if (this.ch[0][var1] == 8) {
                                if (!var10 && var32 && (Math.abs(this.ch[13][var1] - this.ch[1][var1]) <= 1 && Math.abs(this.ch[14][var1] - this.ch[2][var1]) <= 1 || this.ch[7][var1] > 0 && this.ch[7][var1] - 1 == var21)) {
                                    this.a(var1, false);
                                    this.k(var1, var21);
                                }

                                return;
                            }

                            this.f(var1, var21);
                            this.k(var1, var21);
                        }

                    }
                }
            }
        }
    }

    private final int av() {
        int var1 = 0;

        try {
            if (this.c10 >= 127) {
                var1 = j.x.b() / 8;
            }
        } catch (Exception var3) {
        }

        return var1;
    }

    private static byte j(int var0, int var1) {
        boolean var2 = false;
        int var4 = (byte)((AssetManager.e1 ^ 1365) * AssetManager.e1 + (var0 ^ 1365) * var1 + (var1 ^ 1365) * var0);
        int var5 = Math.abs(var0 + var1);

        for(int var6 = 0; var6 <= var5; ++var6) {
            var4 ^= var6 ^ 1365;
        }

        int var7;
        if ((var7 = Math.abs((byte)var4)) > 100) {
            var7 = 11 * (var7 - 100) / 3;
        }

        if ((var4 = Math.abs(var7)) > 100) {
            var4 = 100;
        }

        byte var8;
        return var8 = (byte)var4;
    }

    private static byte[] f(byte[] var0) {
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            if (var0[var2] < 0) {
                var0[var2] = 0;
            }
        }

        byte[] var3 = new byte[2 * var1 + 7];
        int var4 = 0;
        int var5 = 0;

        int var6;
        for(var6 = 0; var4 < var1 && var5 < var1; var4 = var5) {
            byte var7;
            for(var7 = var0[var4]; var5 < var1 && var5 - var4 < 126 && var7 == var0[var5]; ++var5) {
            }

            if (var5 - var4 <= 1 && var7 != 0) {
                var3[var6] = (byte)(-var7);
                ++var6;
            } else {
                var3[var6] = var7;
                ++var6;
                var3[var6] = (byte)(var5 - var4);
                ++var6;
            }
        }

        byte[] var8 = new byte[var6];

        for(int var9 = 0; var9 < var6; ++var9) {
            var8[var9] = var3[var9];
        }

        return var8;
    }

    public final void paint(Graphics graphics) {
        if (!eu) {
            try {
                if (this.dQ < 0) {
                    this.dQ = 0;
                    if (this.aR() && !this.isDoubleBuffered()) {
                        this.dQ = 1;
                    }
                }

                if (this.dQ <= 0) {
                    this.g(graphics);
                    return;
                }

                if (this.dP == null) {
                    this.dP = Image.createImage(this.e10, this.c10);
                }

                if (this.aN == null) {
                    this.aN = this.dP.getGraphics();
                }

                this.g(this.aN);
                graphics.drawImage(this.dP, 0, 0, 20);
            } catch (Exception var3) {
            }

        }
    }

    private void g(Graphics var1) {
        if (!eu) {
            this.h(var1);
            l();
            if (cy) {
                try {
                    this.a(var1, j.x);
                    return;
                } catch (Exception var3) {
                }
            }

        }
    }

    private void h(Graphics var1) {
        if (!h.a(var1)) {
            try {
                var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
                var1.setClip(0, 0, this.e10, this.getHeight());
            } catch (Exception var6) {
            }

            try {
                if (this.ev || this.dn || this.dm) {
                    try {
                        if (this.dm) {
                            var1.setColor(0);
                            var1.fillRect(0, 0, this.e10, this.c10);
                            j.a(var1, r[3][3], false);
                        }

                        if (this.ev) {
                            j.a(var1);
                        }

                        if (this.dn) {
                            j.a(var1, r[1][6], false);
                        }
                    } catch (Exception var5) {
                    }

                    this.ev = false;
                    this.dn = false;
                    this.dm = false;
                    if (!this.dE) {
                        return;
                    }
                }

                if (this.dE) {
                    this.n(var1);
                    return;
                }

                if (cq && !this.aO) {
                    try {
                        this.cr.b(var1);
                        return;
                    } catch (Exception var3) {
                        return;
                    }
                }

                if (this.aB) {
                    return;
                }

                this.z = false;
                if (this.dB) {
                    this.i(var1);
                    if (this.cC || this.cE) {
                        this.f(var1);
                    }

                    if (this.fi || this.fk) {
                        try {
                            this.aQ.a(var1);
                        } catch (Exception var4) {
                        }
                    }
                }

                if (this.cs != null) {
                    this.q(var1);
                }

                if (this.ae) {
                    this.a(var1);
                }

                if (this.aC) {
                    this.d(var1);
                }

                if (this.aD) {
                    this.c(var1);
                }

                if (this.aE) {
                    this.p(var1);
                }

                this.k(var1);
                var1.setClip(0, 0, this.e10, this.c10);
                if (aR) {
                    j.x.a(var1, "" + this.dk, 1, this.bx - 1 - j.x.b(), 20);
                }
            } catch (Exception var8) {
            }

            if (cq && this.aO) {
                try {
                    this.cr.b(var1);
                    return;
                } catch (Exception var7) {
                }
            }

        }
    }

    private final void k(int var1, int var2) {
        if (this.ch[7][var1] > 0 && this.ch[7][var1] == var2 + 1) {
            this.ch[12][var1] = -1;
            this.ch[13][var1] = this.ch[1][var1];
            this.ch[14][var1] = this.ch[2][var1];
        }

    }

    private final void l(int var1, int var2) {
        int var3;
        if ((var3 = this.d(this.ch[13][var1], this.ch[14][var1]) - 64) >= 0 && var3 < this.bg && var3 == var2) {
            this.ch[12][var1] = -1;
            this.ch[13][var1] = this.ch[1][var1];
            this.ch[14][var1] = this.ch[2][var1];
        }

    }

    final void m() {
        this.dm = true;
        this.repaint();
        this.serviceRepaints();
    }

    private void aw() {
        this.dn = true;
        this.repaint();
        this.serviceRepaints();
    }

    private static void C(int var0) {
        if (AssetManager.l1) {
            if (m.y == null) {
                boolean var1 = cq;
                cq = false;
                aP.aw();
                cq = var1;
                m.a(NET_Lizard.game);
                if (m.u == null) {
                    m.a();
                }
            }

            m.a(var0);
        }
    }

    protected final void pointerDragged(int var1, int var2) {
        if (!eS) {
            a(var1, var2, false, false, true);
        }

    }

    protected final void pointerPressed(int var1, int var2) {
        if (!eS) {
            a(var1, var2, true, false, false);
        }

    }

    protected final void pointerReleased(int var1, int var2) {
        if (!eS) {
            a(var1, var2, false, true, false);
        }

    }

    private int ax() {
        boolean var1 = false;

        try {
            if (this.o <= 0) {
                return -1;
            } else {
                int var4 = this.dv[0] - 1;
                byte[] var2 = new byte[this.dv.length];
                System.arraycopy(this.dv, 1, var2, 0, this.dv.length - 1);
                this.dv = var2;
                this.dv[this.o] = 0;
                --this.o;
                this.dv[this.o] = 0;
                return var4;
            }
        } catch (Exception var3) {
            return -1;
        }
    }

    private final void m(int var1, int var2) {
        int var4;
        int var5 = (var4 = this.d(var1, var2)) - 64;
        --var4;
        if (var4 >= 0 && var4 < this.cU) {
            byte var6 = 50;
            if (this.ch[0][var4] <= 2) {
                var6 = 100;
            }

            if (this.ch[0][var4] == 3 || this.ch[0][var4] >= 6) {
                var6 = 20;
            }

            this.n(var4, var6);
        }

        if (var5 >= 0 && var5 < this.bg) {
            this.e(-1, var5, 10);
        }

    }

    private final void e(int var1, int var2, int var3) {
        int var4;
        if ((var4 = this.bZ[10][var2] - var3) < 0) {
            var4 = 0;
        }

        if (var1 >= 0) {
            this.bZ[18][var2] = var1 + 1;
        }

        int var5 = this.bZ[1][var2] - this.fJ;
        int var6 = this.bZ[2][var2] - this.gd;
        int var7 = this.bZ[3][var2] >> 1;
        int var8 = this.bZ[4][var2] >> 1;
        int var9 = (var5 + var7) * this.ej;
        int var10 = (var6 + var8) * this.eg;
        if (var7 * 2 < this.bZ[3][var2]) {
            var9 += this.ek;
        }

        if (var8 * 2 < this.bZ[4][var2]) {
            var10 += this.eh;
        }

        if (var1 >= 0) {
            this.f(var1, var9, var10);
        }

        if (cy) {
            if (!this.w()) {
                return;
            }

            this.bZ[10][var2] = var4;
            this.f(2, var2, 10, 1);
        }

        this.bZ[10][var2] = var4;
        this.u(var2);
    }

    final int b(int var1, int var2) {
        int var3 = this.ch[0][var1];
        int var4 = 1;
        switch(var3) {
            case 2:
                var4 = 2;
                break;
            case 3:
                var4 = 6;
                break;
            case 4:
                var4 = 2;
                break;
            case 5:
                var4 = 3;
                break;
            case 6:
                var4 = 6;
                break;
            case 7:
                var4 = 4;
                break;
            case 8:
                var4 = 4;
        }

        switch(var2) {
            case 1:
            case 2:
                var4 *= 9;
                break;
            case 3:
                var4 = var4 * 6 >> 2;
                break;
            case 4:
            case 5:
                var4 *= 6;
                break;
            case 6:
                var4 *= 2;
                break;
            case 7:
            case 8:
                var4 *= 4;
                break;
            case 65:
                var4 = var4 * 4 >> 3;
                break;
            case 66:
            case 68:
                var4 = var4 * 8 >> 3;
                break;
            case 67:
            case 69:
                var4 = var4 * 6 >> 3;
                break;
            case 70:
                var4 = var4 * 7 >> 3;
        }

        if (var3 >= 6) {
            if (var2 <= 2) {
                var4 = var4 * 6 >> 3;
            } else if (var2 < 64) {
                var4 = var4 * 10 >> 3;
            } else {
                var4 = var4 * 8 >> 3;
            }
        } else if (var2 <= 2) {
            var4 = var4 * 11 >> 3;
        } else {
            if (var2 < 64) {
            }

            var4 = var4 * 7 >> 3;
        }

        if (var4 < 1) {
            var4 = 1;
        }

        return var4;
    }

    private final void n(int var1, int var2) {
        int var3;
        if ((var3 = this.ch[10][var1] - var2) < 0) {
            var3 = 0;
        }

        if (cy) {
            if (!this.w()) {
                return;
            }

            this.ch[10][var1] = var3;
            this.f(1, var1, 10, 1);
        }

        this.ch[10][var1] = var3;
        if (var3 <= 0) {
            this.a(var1, false, true);
        }

    }

    private final void ay() {
        if (!this.aB) {
            if (this.aO) {
                for(int var1 = this.doo; var1 < this.cU; var1 += this.dp) {
                    if (this.ch[0][var1] > 0) {
                        this.z(var1);
                    }
                }

                for(int var2 = 0; var2 < this.cU; ++var2) {
                    if (this.ch[0][var2] > 0) {
                        this.y(var2);
                        this.B(var2);
                    }
                }

                this.H();
            }

            switch(this.ex) {
                case 0:
                    if (this.aO) {
                        this.Z();
                    }
                    break;
                case 1:
                    if (this.aO) {
                        this.aP();
                        this.aA();
                    }
            }

            ++this.ex;
            if (this.ex > 1) {
                this.ex = 0;
            }

            ++this.dq;
            if (this.dq >= 10) {
                this.dq = 0;
                this.aU = false;
            }

            ++this.doo;
            if (this.doo >= this.dp) {
                this.doo = 0;
            }

        }
    }

    private final void o(int var1, int var2) {
        if (var2 > 0 && var2 <= this.cU) {
            int var3 = var2 - 1;
            if (this.ch[0][var3] > 0) {
                this.ch[7][var1] = var3 + 1;
            }

        } else {
            this.ch[7][var1] = 0;
        }
    }

    static int f(int var0) {
        if (cy && !n.b12) {
            if (var0 == 1) {
                var0 = 2;
            } else if (var0 == 2) {
                var0 = 1;
            }
        }

        return var0;
    }

    static int c(int var0, int var1) {
        boolean var2 = false;
        int var3 = var0;
        int var4 = var1;
        boolean var5 = false;
        if (var1 > var0) {
            var3 = var1;
            var4 = var0;
        }

        int var6 = var3 - var4;
        return (var4 * 7 + var6 * 5) / 5;
    }

    private final int D(int var1) {
        short var2 = 56;
        if (this.B >= 6) {
            var2 = 196;
        }

        int var3 = 24;
        if (this.R != null) {
            var3 = this.R[2][136] + 2;
        }

        if (this.B >= 5) {
            var3 = var3 * 6 >> 2;
            if (this.am != null) {
                var3 = this.am[2][var2] + 4;
            }
        }

        if (var1 == 1) {
            var3 = 21;
            if (this.R != null) {
                var3 = this.R[3][136] + 1;
            }

            if (this.B >= 5) {
                var3 = var3 * 6 >> 4;
                if (this.am != null) {
                    var3 = this.am[2][var2] + 3;
                }
            }
        }

        return var3;
    }

    static final int n() {
        try {
            int var0 = j.x.b() + 2;
            if (NET_Lizard.game.v()) {
                int var1 = NET_Lizard.game.getHeight() >> 3;
                if (var0 < var1) {
                    var0 = var1;
                }
            }

            return var0;
        } catch (Exception var2) {
            return 0;
        }
    }

    static final int o() {
        return 0;
    }

    private final void a(boolean var1) {
        if (var1) {
            this.ev = true;
            if (!C) {
                this.dX = null;
                this.cV = null;
            }

            this.dB = false;
            this.aO = false;
        }

        this.an();
    }

    private final void a(Graphics var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8) {
        if (!this.aB) {
            for(int var10 = var3; var10 < var3 + var5; ++var10) {
                int var12;
                int var18;
                if ((var18 = (var12 = this.gd + var10) + 1) > this.fX) {
                    var18 = 0;
                }

                for(int var9 = var2; var9 < var2 + var4; ++var9) {
                    int var11;
                    int var17;
                    if ((var17 = (var11 = this.fJ + var9) + 1) > this.fE) {
                        var17 = 0;
                    }

                    if (var11 >= 0 && var11 <= this.fE && var12 >= 0 && var12 <= this.fX) {
                        if (var8) {
                            if (s() && this.ci != null) {
                                if (this.ci[var11][var12] == 0) {
                                    var1.setColor(0);
                                    var1.fillRect(var9 * this.ej + this.cm, var10 * this.eg + this.cn, this.ej, this.eg);
                                }

                                if (this.ci[var11][var12] == 127) {
                                    var1.setColor(0);
                                    this.a(var1, var9 * this.ej + this.cm, var10 * this.eg + this.cn);
                                }
                            }
                        } else if (!s() || this.ci == null || this.ci[var11][var12] != 0) {
                            short var13 = this.ck[var11][var12];
                            if (var6) {
                                int var14;
                                if ((var14 = this.bV[var11][var12]) < 0) {
                                    var14 += 256;
                                }

                                int var16;
                                if ((var16 = this.bX[var11][var12]) < 0) {
                                    var16 += 256;
                                }

                                byte var15 = 0;
                                if (this.cj[var11][var12] > 0) {
                                    var15 = 1;
                                }

                                if (this.cj[var11][var12] > 50) {
                                    var15 = 2;
                                }

                                if (this.cj[var11][var12] > 80) {
                                    var15 = 3;
                                }

                                ++this.bH;
                                if (var15 > 0) {
                                    this.a(var1, var15, var9, var10);
                                    var14 = var15 + 128;
                                } else if (var14 >= 128) {
                                    this.a(var1, var14 - 128, var9, var10);
                                } else {
                                    this.a(var1, 0, var9, var10);
                                }

                                if (var16 >= 128 && var16 < this.E) {
                                    if (var16 == em) {
                                        this.a(var1, 124, var9, var10);
                                    } else if (var16 != var14) {
                                        this.a(var1, var16 - 128, var9, var10);
                                    }
                                }

                                if (var13 >= 128 && var13 != var14) {
                                    this.a(var1, var13 - 128, var9, var10);
                                }
                            }

                            if (var7) {
                                if (var13 >= 64 && var13 < 128) {
                                    this.a(var1, var13 - 64, var11, var12, false);
                                }

                                if (var13 > 0 && var13 <= this.cU && var13 != this.ck[var11][var18] && var13 != this.ck[var17][var12]) {
                                    this.b(var1, var13 - 1);
                                }
                            }
                        }
                    } else {
                        var1.setColor(0);
                        var1.fillRect(var9 * this.ej + this.cm, var10 * this.eg + this.cn, this.ej, this.eg);
                    }
                }
            }

        }
    }

    private final void i(Graphics var1) {
        if (!this.aD || this.aL) {
            this.ag = true;
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY() + this.dJ);
            int var5 = this.fU + 2;
            int var6 = this.fB + 2;
            int var7 = var5 - this.dG;
            this.bx = this.c10 - this.dH;
            this.fY = this.bx - j.x.b();
            var1.setClip(0, 0, this.e10, this.c10);
            var1.setColor(191, 178, 177);
            if (this.R[2][0] < this.ej || this.R[3][0] < this.eg) {
                var1.fillRect(0, 0, this.e10, this.c10);
            }

            var1.setColor(0);
            if (this.dy) {
                var1.fillRect(0, this.bx, this.e10, this.dH);
                int var9 = this.bx;
                this.bx = this.c10;
                if (!this.ae) {
                    this.d(var1, 132, 3, var9 + this.dI + 1, 6);
                }

                this.bx = var9;
                this.dY = 0 + this.R[2][132];
                var1.setColor(249, 86, 249);
                var1.drawLine(0, this.bx, this.e10, this.bx);
                var1.setColor(105, 35, 105);
                var1.drawLine(0, this.bx + 1, this.e10, this.bx + 1);
            }

            var1.setColor(0);
            var1.setClip(0, 0, this.e10, this.bx);
            this.a(var1, -1, -1, var6, var7, true, false, false);
            this.a(var1, -1, -1, var6, var7, false, true, false);
            this.l(var1);
            this.j(var1);
            this.a(var1, -1, -1, var6, var7, true, false, true);
            var1.setColor(0);
            var1.setFont(j.defaultFont);
            this.b(var1);
            if (this.ct != null) {
                this.a(var1, this.ct);
            }

            this.Z = (byte)(this.Z + this.W);
            if (this.Z < 0) {
                this.Z = 1;
                this.W = Math.abs(this.W);
            }

            if (this.Z > 2) {
                this.Z = 1;
                this.W = -Math.abs(this.W);
            }

            this.o(var1);
            this.r(var1);
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            var1.setClip(0, 0, this.e10, this.c10);
        }
    }

    private final void az() {
        for(int var1 = 0; var1 < 3 && !this.dD && n.g12; ++var1) {
            this.f(33, 0, 0, 0);

            while(this.m10 > 0 && n.g12) {
                this.bK = 1;
                this.al();

                try {
                    Thread.sleep(3L);
                } catch (Exception var4) {
                }
            }
        }

        if (this.dD && n.g12) {
            this.aw();
        }

        while(this.dD && n.g12) {
            this.f(33, 0, 0, 0);

            while(this.m10 > 0 && n.g12) {
                this.bK = 1;
                this.al();

                try {
                    Thread.sleep(3L);
                } catch (Exception var3) {
                }
            }
        }

    }

    private final void aA() {
        if (this.aZ == 0) {
            this.aZ = 1;
        } else {
            this.aZ = 0;
        }

        for(int var1 = this.aZ; var1 < this.bg; var1 += 2) {
            if (this.bZ[0][var1] > 0) {
                if (this.w() && this.bZ[13][var1] > 0 && this.cv[this.bZ[5][var1]] >= this.ea * (ed + 1)) {
                    int[] var10000 = this.bZ[10];
                    var10000[var1] += this.ea * (ed + 1);
                    var10000 = this.cv;
                    int var10001 = this.bZ[5][var1];
                    var10000[var10001] -= this.ea * (ed + 1);
                    if (this.bZ[10][var1] >= 100) {
                        if (this.bZ[10][var1] > 100) {
                            var10000 = this.cv;
                            var10001 = this.bZ[5][var1];
                            var10000[var10001] += this.bZ[10][var1] - 100;
                        }

                        this.bZ[10][var1] = 100;
                        this.bZ[13][var1] = 0;
                    }
                }

                if (this.bZ[10][var1] > 0 && this.bZ[10][var1] < 100 && (this.bZ[12][var1] <= 0 || this.bZ[12][var1] * this.bZ[17][var1] + this.bZ[10][var1] < 100)) {
                    int var2;
                    int var3;
                    int var4;
                    boolean var5;
                    label135: {
                        var2 = this.bZ[10][var1];
                        var3 = this.bZ[3][var1] >> 1;
                        var4 = this.bZ[4][var1] >> 1;
                        var5 = var2 < 28;
                        boolean var6;
                        boolean var7;
                        if (var2 < 50) {
                            var6 = var5;
                            var7 = this.i10;
                        } else {
                            if (var2 < 70) {
                                var5 |= this.i10 && this.j10;
                                break label135;
                            }

                            if (var2 < 90) {
                                var5 |= this.i10 && this.j10 && this.k10;
                                break label135;
                            }

                            if (var2 >= 100) {
                                break label135;
                            }

                            var6 = var5;
                            var7 = this.i10 && this.j10 && this.k10 && this.l10;
                        }

                        var5 = var6 | var7;
                    }

                    if (var2 <= 18 && !this.i10) {
                        this.c(8, this.bZ[1][var1] + var3, this.bZ[2][var1] + var4);
                    }

                    if (var2 < 100 && var5) {
                        this.c(1, this.bZ[1][var1] + var3, this.bZ[2][var1] + var4);
                    }
                }
            }
        }

        if (this.aZ == 0) {
            this.i10 = !this.i10;
            if (!this.i10) {
                this.j10 = !this.j10;
                if (!this.j10) {
                    this.k10 = !this.k10;
                    if (!this.k10) {
                        this.l10 = !this.l10;
                    }
                }
            }
        }

    }

    private final void aB() {
        if (!ey) {
            long var1;
            if ((var1 = System.currentTimeMillis()) - this.eZ >= 777L && !this.cC && !this.aW && !this.ae && !this.aC && !this.aB) {
                this.eZ = var1;
                byte var3 = 0;
                byte var4 = 0;
                byte var5 = 0;
                byte var6 = 0;

                int var7;
                for(var7 = 0; var7 < this.cU; ++var7) {
                    if (this.ch[0][var7] > 0) {
                        if (this.ch[8][var7] == 1) {
                            ++var3;
                        }

                        if (this.ch[8][var7] == 2) {
                            ++var4;
                        }
                    }
                }

                for(var7 = 0; var7 < this.bg; ++var7) {
                    if (this.bZ[0][var7] > 0) {
                        if (this.bZ[5][var7] == 1) {
                            ++var5;
                        }

                        if (this.bZ[5][var7] == 2) {
                            ++var6;
                        }
                    }
                }

                if (aT && this.br == 55) {
                    var5 = 0;
                    var3 = 0;
                }

                if (aT && this.br == 57) {
                    var6 = 0;
                    var4 = 0;
                }

                if (var3 <= 0 && var5 <= 0 || var4 <= 0 && var6 <= 0) {
                    this.ae = false;
                    this.cC = false;
                    this.aW = false;
                    this.aC = true;
                    this.victory = var3 > 0;
                    this.dZ = -1;
                    if (cy) {
                        if (this.victory) {
                            this.F(AssetManager.e1);
                            this.h(3);
                        } else {
                            this.h(4);
                        }

                        this.dA = false;
                        this.aM();
                        b10.a();
                        b10.w = null;
                        n.c12 = null;
                    } else {
                        if (this.victory) {
                            this.F(AssetManager.e1);
                            AssetManager.k1 = true;
                            this.h(3);
                            ++AssetManager.e1;
                            if (AssetManager.e1 > AssetManager.f1) {
                                AssetManager.f1 = AssetManager.e1;
                            }

                            if (AssetManager.f1 > bP) {
                                AssetManager.f1 = bP;
                                AssetManager.e1 = AssetManager.f1;
                                AssetManager.c1 = 0;
                                AssetManager.e1 = 1;
                                AssetManager.g1 = 0;
                                this.aL = true;
                                this.dA = false;
                            } else {
                                this.aL = false;
                                this.dA = true;
                                this.dA = false;
                                this.i(AssetManager.e1);
                            }
                        } else {
                            this.h(4);
                            this.dA = true;
                        }

                        if (this.victory && !j.bD) {
                            AssetManager.k1 = true;
                        }

                        this.dM = true;
                        aE();
                    }
                }
            }
        }
    }

    private final void a(Graphics var1, int var2, int var3, boolean var4, boolean var5) {
        if (this.x[2] != null) {
            int var6 = this.x[2].getWidth();
            int var7 = this.x[2].getHeight() >> 1;
            int var8 = this.f10 - (var6 >> 1);
            int var9 = 0;
            Image var10 = this.x[2];
            if (var5) {
                var9 = var7;
                var2 += 0;
            } else {
                var2 = var2 - var7 - 0;
            }

            var1.setClip(var8, var2, var6, var7);
            var1.drawImage(var10, var8, var2 - var9, 20);
            var1.setClip(0, 0, this.e10, this.c10);
            if (d(var8, var2, var6, var7) && ds) {
                if (var5) {
                    this.G(56);
                } else {
                    this.G(50);
                }

                h10 = false;
            }

        } else {
            if (var4) {
                var1.setColor(10223442);
            } else {
                var1.setColor(35346);
            }

            if (!var5) {
                var2 -= var3;
            }

            j.a(var1, this.f10, var2, var3 << 1, var3, var5);
        }
    }

    private final void j(Graphics var1) {
        if (this.bW != null) {
            int[][] var2 = this.bW;
            int var3 = this.t;

            for(int var4 = 0; var4 < var3; ++var4) {
                if (var2[0][var4] >= 1) {
                    this.a(var1, var4);
                }
            }

        }
    }

    private final void a(Graphics var1, int var2) {
        try {
            if (this.aC || this.bW[0][var2] <= 0) {
                return;
            }

            int[][] var3;
            int var4 = (var3 = this.bW)[0][var2] + var3[5][var2];
            int var5 = (var3[1][var2] - this.fJ) * this.ej + var3[3][var2] + this.cm;
            int var6 = (var3[2][var2] - this.gd) * this.eg + var3[4][var2] + this.cn;
            if (var4 >= 168 && var4 <= 171) {
                short var7 = 172;
                if (var4 == 171) {
                    var7 = 173;
                }

                this.a(var1, var7, var5 + this.ek + (var3[10][var2] >> 2), var6 + this.eh - (var3[11][var2] >> 2), false, true, true);
            }

            var5 += var3[10][var2];
            var6 -= var3[11][var2];
            boolean var9 = false;
            if (var4 >= 168) {
                var9 = true;
            }

            if (var4 >= 99 && var4 <= 114) {
                this.a(var1, var4, var5 + this.ek - this.R[2][var4], var6 + this.eh - this.R[3][var4], false, false);
                this.a(var1, var4, var5 + this.ek, var6 + this.eh - this.R[3][var4], true, false);
                return;
            }

            this.a(var1, var4, var5 + this.ek, var6 + this.eh, false, true, var9);
        } catch (Exception var8) {
        }

    }

    private final void k(Graphics var1) {
        try {
            int var2 = var1.getTranslateX();
            int var3 = var1.getTranslateY();
            var1.translate(-var2, -var3);
            int var4 = this.bx;
            this.bx = this.aM;
            var1.setClip(0, this.fT, this.e10, this.aM);
            if (!this.z && !this.ae) {
                if (this.dB && !this.aC && !this.ae && !this.cC && this.ff != 122 && this.ff != 121 && !this.aY && !this.fi && !this.fk) {
                    this.d(var1, 142, this.e10 - this.R[2][142], this.fT + this.aM - this.dH - this.R[3][142], 20);
                }
            } else if (this.v != null) {
                if (this.ae) {
                    var1.drawImage(this.v, -(this.v.getWidth() >> 1), this.fT + this.aM - this.v.getHeight(), 20);
                }

                var1.drawImage(this.v, this.e10 - (this.v.getWidth() >> 1), this.fT + this.aM - this.v.getHeight(), 20);
            }

            this.bx = var4;
            var1.translate(var2, var3);
        } catch (Exception var6) {
        }
    }

    private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        int var7 = var0.getColor();
        var0.setColor(0);
        var0.fillRect(var3, var4, var5, 4);
        var0.setColor(var1);
        if (var2 > 100) {
            var2 = 100;
        }

        var0.fillRect(var3 + 1, var4 + 1, (var5 - 2) * var2 / 100, 2);
        var0.setColor(var7);
    }

    private final void l(Graphics var1) {
        for(int var2 = 0; var2 < this.cU; ++var2) {
            if (this.bY[0][var2] == 1) {
                this.c(var1, this.bY[1][var2], this.bY[2][var2], this.bY[3][var2], this.bY[4][var2]);
            }

            this.bY[0][var2] = 0;
        }

    }

    private final void f(int var1, int var2, int var3) {
        int var4 = this.ch[1][var1] - this.fJ;
        int var5 = this.ch[2][var1] - this.gd;
        int var6;
        if ((var6 = this.ch[9][var1]) > 7) {
            var6 -= 8;
        }

        int var8;
        int var9;
        if (this.an == null) {
            this.an = new byte[2][this.bu * 4];

            try {
                byte[] var7;
                if ((var7 = AssetManager.instanceHandler.readDataChunkFromFile("cufr", -1)) != null && var7.length > 0) {
                    var8 = 0;

                    for(var9 = 0; var9 < this.bu * 4; ++var9) {
                        for(int var10 = 0; var10 < 2; ++var10) {
                            this.an[var10][var9] = var7[var8];
                            ++var8;
                        }
                    }
                }
            } catch (Exception var13) {
            }
        }

        int var14 = (this.ch[0][var1] - 1) * 4 + var6;
        var8 = var4 * this.ej + this.ch[3][var1] + this.ek + this.an[0][var14];
        var9 = var5 * this.eg + this.ch[4][var1] + this.eh + this.an[1][var14];
        boolean var15 = var8 > 0 && var8 < this.e10 && var9 > 0 && var9 < this.bx;
        boolean var11 = var2 > 0 && var2 < this.e10 && var3 > 0 && var3 < this.bx;
        if (var15 || var11) {
            for(int var12 = 0; var12 < this.cU; ++var12) {
                if (this.bY[0][var12] <= 0) {
                    this.bY[0][var12] = 1;
                    this.bY[1][var12] = var8;
                    this.bY[2][var12] = var9;
                    this.bY[3][var12] = var2;
                    this.bY[4][var12] = var3;
                    return;
                }
            }
        }

    }

    private final void a(Graphics var1, int var2, int var3, int var4, boolean var5) {
        try {
            int var6 = this.bZ[1][var2] + this.bZ[3][var2] - 1 - this.fJ;
            int var7 = this.bZ[2][var2] + this.bZ[4][var2] - 1 - this.gd;
            byte var8 = -1;
            byte var9 = -1;
            int var10 = this.fU + 2;
            int var11 = this.fB + 2;
            int var12 = var10 - this.dG;
            if (ec > 0) {
                var8 = 0;
                var9 = 0;
                var11 -= 2;
                var12 -= 2;
            }

            int var13 = var8 + var11 - 1;
            int var14 = var9 + var12 - 1;
            if (var6 > var13) {
                var6 = var13;
            }

            if (var7 > var14) {
                var7 = var14;
            }

            if (var5 || var3 - this.fJ == var6 && var4 - this.gd == var7) {
                int var15 = this.bZ[1][var2];
                var12 = this.bZ[2][var2];
                var6 = this.bZ[1][var2] + this.bZ[3][var2] - 1;
                var7 = this.bZ[2][var2] + this.bZ[4][var2] - 1;
                boolean var16 = this.fy >= var15 && this.fy <= var6 && this.fQ >= var12 && this.fQ <= var7;
                int var17 = (this.bZ[1][var2] - this.fJ) * this.ej + this.cm;
                int var18 = (this.bZ[2][var2] - this.gd) * this.eg + this.cn;
                int var19 = this.bh - 128 + this.bZ[0][var2] - 1;
                int var20 = this.bZ[14][var2];
                int var21 = this.bZ[15][var2];
                if (!var5) {
                    this.d(var1, var19, var17 + var20 + this.R[4][var19], var18 + var21 + this.R[5][var19], 3);
                    if (this.bZ[13][var2] > 0 && this.fo) {
                        boolean var24 = false;
                        this.d(var1, 121, var17 + var20 + this.R[4][121], var18 + var21 + this.R[5][121], 3);
                    }

                    if (this.bZ[12][var2] > 0 && !this.fo) {
                        this.d(var1, 135, var17 + var20 + this.R[4][135], var18 + var21 + this.R[5][135], 3);
                    }

                } else {
                    int var22 = 16711680;
                    if (f(this.bZ[5][var2]) != 1) {
                        var22 = 8447;
                    }

                    if (this.ay || var16) {
                        if (this.bZ[12][var2] > 0) {
                            this.c(var1, var2, var17, var18);
                        }

                        a(var1, var22, this.bZ[10][var2], var17, var18 - 1, this.bZ[3][var2] * this.ej - 2);
                    }

                }
            }
        } catch (Exception var23) {
        }
    }

    private final void c(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setClip(0, 0, this.e10, this.bx);
        boolean var10 = false;
        boolean var11 = false;
        int var13 = 0 + this.cm;
        int var14 = 0 + this.cn;
        int var8 = var4 + this.randomGenerator.nextInt() % 5;
        int var9 = var5 + this.randomGenerator.nextInt() % 5;
        this.a(var1, 89, var2 + var13, var3 + var14, false, true);
        this.a(var1, 90, var8 + var13, var9 + var14, false, true);
    }

    final void p() {
        try {
            if (this.bR != 0) {
                this.fr = this.bJ * this.fq / this.bR;
            }

            boolean var1 = false;
            if (this.fr >= this.fs + 4 || this.bJ >= this.bR - 1) {
                this.dE = true;
                this.repaint();
                this.serviceRepaints();
                this.dE = false;

                try {
                    Thread.sleep(1L);
                } catch (Exception var9) {
                }

                try {
                    long var2 = System.currentTimeMillis();
                    if (this.bJ == 0) {
                        this.eq = var2;
                    } else {
                        long var4 = var2 - this.eq;
                        long var6 = (long)this.bJ * this.eE / (long)this.bR;
                        if (var4 < var6) {
                            Thread.sleep(var6 - var4);
                        }
                    }
                } catch (Exception var8) {
                }

                this.fs = this.fr;
            }

            if (this.bJ < this.bR) {
                ++this.bJ;
            }

        } catch (Exception var10) {
        }
    }

    private void m(Graphics var1) {
        if (this.bJ == 0) {
            this.fr = 0;
        }

        int var2 = this.getHeight();
        int var3 = this.bS;
        boolean var4 = false;
        var1.setClip(0, 0, this.e10, var2);
        int var5 = var2;
        if (this.cr != null && this.cr.aZ != null) {
            var5 = var2 - j.bM - this.cr.aZ.getHeight();
            var1.drawImage(this.cr.aZ, this.f10, var5, 17);
        }

        int var6;
        int var13;
        if (this.bk != null && this.bl != null) {
            boolean var14 = false;
            if (this.bm != null) {
                var6 = this.bm.getHeight() * 2;
            } else {
                var6 = j.A.b() * 2;
            }

            var13 = (var2 - (this.bk.getHeight() + var6) >> 1) - j.A.b();
            var1.setClip(0, 0, this.e10, var2);
            var1.drawImage(this.bk, this.f10, var13, 17);
            var1.setClip(0, var13 + this.fq - this.fr, this.e10, this.fr);
            var1.drawImage(this.bl, this.f10, var13, 17);
            var1.setClip(0, 0, this.e10, var2);
            j.a(var1, j.A, (var5 - (var13 + this.bk.getHeight()) >> 1) + var13 + this.bk.getHeight());
            if (this.bm != null) {
                var1.drawImage(this.bm, this.f10, var13 + this.bk.getHeight() + this.bm.getHeight(), 17);
            } else {
                j.A.a(var1, r[1][0], this.f10, var13 + this.bk.getHeight() + j.A.b(), 17);
            }
        } else {
            int var7 = (var13 = (var6 = var2 - j.A.b() * 2) - var3 * 2) - var3;
            if (this.bJ == 0) {
                a.a(var1, 0, var7, this.e10, var2 - var7, 0, 128);
            }

            j.a(var1, j.A, var6);
            var1.setClip(0, 0, this.e10, var2);
            var1.setColor(0, 188, 204);
            var1.fillRect(this.fN, var13, this.fq, var3);
            var1.setColor(0, 85, 99);
            b(var1, this.fN, var13 + 1, this.fq, var3 - 2);
            var1.setColor(0, 188, 204);
            b(var1, this.fN, var13, this.fr, var3);
            this.u = !this.u;
            if (this.u) {
                var1.setColor(0);
            } else {
                var1.setColor(16777215);
            }

            if (this.bJ >= this.bR) {
                e(var1, 1, var2 - 2, 5);
            }

            var1.setColor(13, 144, 0);
        }
    }

    private void n(Graphics var1) {
        this.m(var1);
    }

    private final void a(Graphics var1, int var2, int var3, int var4) {
        ++this.bG;
        this.d(var1, var2, var3 * this.ej + this.cm, var4 * this.eg + this.cn, 20);
    }

    private final void d(Graphics var1, int var2, int var3, int var4, int var5) {
        int var6 = var2;
        if (this.R[6][var2] == 11) {
            this.a(var1, var2, var3, var4, false, false);
        } else {
            try {
                var3 += this.R[4][var6];
                var4 += this.R[5][var6];
                int var7 = this.bx;
                int var8 = this.e10;
                if (var5 != 20) {
                    var7 += this.R[3][var6];
                    var8 += this.R[2][var6];
                }

                if (var4 < var7 && var3 < var8) {
                    if (this.R[6][var6] == 8 || this.R[6][var6] >= 11 || this.cW[this.R[6][var6]] != null) {
                        int var9 = this.R[2][var6];
                        int var10 = this.R[3][var6];
                        if (var5 != 20) {
                            if ((var5 & 32) > 0) {
                                var4 -= this.R[3][var6];
                            }

                            if ((var5 & 2) > 0) {
                                var4 -= this.R[3][var6] >> 1;
                            }

                            if ((var5 & 8) > 0) {
                                var3 -= this.R[2][var6];
                            }

                            if ((var5 & 1) > 0) {
                                var3 -= this.R[2][var6] >> 1;
                            }
                        }

                        if (var9 > this.e10 - var3) {
                            var9 = this.e10 - var3;
                        }

                        if (var10 > this.bx - var4) {
                            var10 = this.bx - var4;
                        }

                        int var11 = var1.getClipX();
                        int var12 = var1.getClipY();
                        int var13 = var1.getClipWidth();
                        int var14 = var1.getClipHeight();
                        int var15 = var3;
                        int var16 = var4;
                        if (var3 < var11) {
                            var9 -= var11 - var3;
                            var15 = var11;
                        }

                        if (var4 < var12) {
                            var10 -= var12 - var4;
                            var16 = var12;
                        }

                        if (var15 + var9 > var11 + var13) {
                            var9 = var11 + var13 - var15;
                        }

                        if (var16 + var10 > var12 + var14) {
                            var10 = var12 + var14 - var16;
                        }

                        if (var9 > 0 && var10 > 0) {
                            var1.setClip(var15, var16, var9, var10);
                            var1.drawImage(this.cW[this.R[6][var6]], var3 - this.R[0][var6], var4 - this.R[1][var6], 20);
                        }

                        var1.setClip(var11, var12, var13, var14);
                        return;
                    }

                    var1.drawImage(this.cV[var6], var3, var4, var5);
                }

            } catch (Exception var17) {
            }
        }
    }

    private final void b(Graphics var1, int var2, int var3, int var4) {
        this.d(var1, var2, var3, var4, 20);
    }

    private final void c(Graphics var1, int var2, int var3, int var4) {
        try {
            boolean var5 = false;
            int var7;
            int var8;
            int var9 = (var8 = (var7 = this.bZ[3][var2] * this.ej - 2) / 11) * this.bZ[12][var2] / this.bZ[16][var2];
            var9 = var8 - var9;
            var4 -= 2;
            var3 += var7 - 11 * var8 >> 1;
            var4 -= 6;

            for(int var12 = 0; var12 < var8; ++var12) {
                var1.setColor(0);
                var1.fillRect(var3, var4, 9, 5);
                var1.setColor(65280);
                if (var12 <= var9) {
                    var1.fillRect(var3 + 1, var4 + 1, 7, 3);
                }

                var3 += 11;
            }

        } catch (Exception var13) {
        }
    }

    private final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = (var3 - this.fJ) * this.ej;
        int var8 = (var4 - this.gd) * this.eg;
        int var9 = var5 + this.cm;
        int var10 = var6 + this.cn;
        int var11 = var7 + var9;
        int var12 = var8 + var10;
        this.d(var1, var2, var11, var12);
    }

    private final boolean a(Graphics var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, int var8, int var9) {
        boolean var10 = false;
        int var11 = var1.getClipX();
        int var12 = var1.getClipY();
        int var13 = var1.getClipWidth();
        int var14 = var1.getClipHeight();

        try {
            int var15 = 0;
            int var16 = var2;
            if (this.am.length > 6) {
                var15 = this.am[6][var2];
            } else {
                while(var16 >= this.bs) {
                    var16 -= this.bs;
                    ++var15;
                }
            }

            if (var5 == 3) {
                var3 -= this.am[2][var2] >> 1;
                var4 -= this.am[3][var2] >> 1;
            }

            if (var5 == 33) {
                var3 -= this.am[2][var2] >> 1;
                var4 -= this.am[3][var2];
            }

            boolean var17 = false;
            short var18 = this.am[3][var2];
            boolean var20 = false;
            boolean var21 = false;
            int var23;
            int var24;
            int var25;
            int var26;
            if (var6 && this.dR[var15] != null) {
                var4 += var18;
                if (var7) {
                    var4 -= (var18 >> 1) + (var18 >> 2);
                }

                var4 -= var9;
                var23 = this.am[2][var2];
                var24 = this.am[3][var2];
                var25 = var3;
                var26 = var4;
                if (var3 < var11) {
                    var23 -= var11 - var3;
                    var25 = var11;
                }

                if (var4 < var12) {
                    var24 -= var12 - var4;
                    var26 = var12;
                }

                if (var25 + var23 > var11 + var13) {
                    var23 = var11 + var13 - var25;
                }

                if (var26 + var24 > var12 + var14) {
                    var24 = var12 + var14 - var26;
                }

                if (var23 > 0 && var24 > 0) {
                    var1.setClip(var25, var26, var23, var24);
                    var1.drawImage(this.dR[var15], var3 - this.am[0][var2], var4 - this.am[1][var2], 20);
                }

                var10 = true;
            }

            var4 += var8;
            var23 = this.am[2][var2];
            var24 = this.am[3][var2];
            var25 = var3;
            var26 = var4;
            if (var3 < var11) {
                var23 -= var11 - var3;
                var25 = var11;
            }

            if (var4 < var12) {
                var24 -= var12 - var4;
                var26 = var12;
            }

            if (var25 + var23 > var11 + var13) {
                var23 = var11 + var13 - var25;
            }

            if (var26 + var24 > var12 + var14) {
                var24 = var12 + var14 - var26;
            }

            if (var23 > 0 && var24 > 0) {
                var1.setClip(var25, var26, var23, var24);
                var1.drawImage(this.eX[var15], var3 - this.am[0][var2], var4 - this.am[1][var2], 20);
            }
        } catch (Exception var22) {
        }

        var1.setClip(var11, var12, var13, var14);
        return var10;
    }

    private final boolean e(Graphics var1, int var2, int var3, int var4, int var5) {
        return this.a(var1, var2, var3, var4, var5, false, false, 0, 0);
    }

    private final void d(Graphics var1, int var2, int var3, int var4) {
        try {
            int var5 = this.ch[0][var2];
            int var6 = this.ch[8][var2];
            if (var5 > 0) {
                int var7;
                if ((var7 = this.ch[9][var2]) > 7) {
                    var7 -= 8;
                }

                int var8 = this.ch[5][var2];
                int var9;
                int var10 = (var9 = (2 * (var5 - 1) + f(var6) - 1) * this.bs + var7 * 3) + var8;
                if (this.am[2][var10] == 0 || this.am[3][var10] == 0) {
                    var10 = var9;
                }

                int var11 = 0;
                if (var6 == 1 && var8 == 0 && this.ch[15][var2] > 0) {
                    var11 = -this.Z;
                } else if (this.ch[0][var2] >= 7) {
                    var11 = -this.aa;
                }

                int var12 = 0;
                int var13 = 0;
                if (this.ch[0][var2] == 8) {
                    var12 = -2 + (this.ch[27][var2] >> 1);
                    var13 = 0 + (this.ch[27][var2] + 1 >> 1);
                }

                int var14 = var3 + this.ek;
                int var15;
                int var18;
                if ((var15 = var4 + this.eh + var11) < this.bx + this.eh) {
                    boolean var16 = true;
                    boolean var17 = this.ch[0][var2] >= 3 && this.ch[0][var2] <= 6;
                    if (var5 > 2 && f(var6) == 2) {
                        var10 -= this.bs;
                        this.a(var1, var10, var14 + this.am[4][var10], var15 + this.am[5][var10], 3, true, var17, var12, var13);
                        var16 = false;
                        var10 += this.bs;
                    }

                    if (var5 <= 2 && (this.dR == null || this.dR[this.am[6][var10]] == null)) {
                        var18 = var10;
                        var10 = (2 * (var5 - 1) + f(var6) - 1) * this.bs + 13;
                        this.e(var1, var10, var14 + this.am[4][var10], var4 + this.eg - 2 + this.am[5][var10], 33);
                        var10 = var18;
                    }

                    this.a(var1, var10, var14 + this.am[4][var10], var15 + this.am[5][var10], 3, var16, var17, var12, var13);
                }

                if (this.ch[15][var2] > 0 || this.ay || this.ch[1][var2] == this.fy && this.ch[2][var2] == this.fQ) {
                    int var24 = this.ch[10][var2];
                    var18 = this.ej - 2;
                    int var19 = var3 + 1;
                    int var20 = var4 + 2 - 4 + var11;
                    int var21 = 16711680;
                    if (f(this.ch[8][var2]) != 1) {
                        var21 = 8447;
                    }

                    if (this.ch[0][var2] <= 2) {
                        var20 -= 2;
                    }

                    if (this.ch[0][var2] == this.bb) {
                        var20 -= 4;
                    }

                    if (this.ch[0][var2] == 6) {
                        --var20;
                    }

                    if (this.ch[0][var2] == 7) {
                        var20 -= 2;
                    }

                    if (this.ch[0][var2] == 8) {
                        var20 -= 7;
                    }

                    a(var1, var21, var24, var19, var20, var18);
                    if (this.ch[0][var2] == this.bb || this.ch[0][var2] == 8) {
                        int var22 = this.ch[27][var2];
                        if (this.ch[0][var2] == 8) {
                            var22 = var22 * 100 / 8;
                        }

                        a(var1, 65280, var22, var19, var20 - 5, var18);
                    }
                }

            }
        } catch (Exception var23) {
        }
    }

    private final void o(Graphics var1) {
        int var5 = j.x.b() - j.x.f3 + 4 + 2;

        try {
            if (this.R != null && var5 < this.R[3][130] + 2) {
                var5 = this.R[3][130] + 2;
            }
        } catch (Exception var13) {
        }

        this.dJ = var5;
        if (!this.cC && d(0, 0, this.f10, var5) && !this.fi && !this.cC && this.eA - this.eD > 500L) {
            this.x(48);
            aV();
            this.eD = this.eA;
        }

        try {
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            this.c10 = this.getHeight();
            int var8 = this.bx;
            this.bx = this.c10;
            var1.setClip(0, 0, this.e10, this.c10);
            int var9 = var5 - 1 - (j.x.b() - j.x.f3) >> 1;
            var1.setColor(0);
            var1.fillRect(0, 0, this.e10, var5);
            var1.setColor(j.z);
            String var10 = String.valueOf(this.cv[1]);
            int var11 = j.x.a(var10);
            int var12 = this.e10 - 2 - var11;
            j.x.a(var1, var10, var12, var9, 20);
            var12 -= 3;
            this.d(var1, 130, var12 - this.R[2][130], var5 - 0 - this.R[3][130] >> 1, 20);
            if (this.eB == null || this.eL != this.eM || this.eF != this.eG) {
                this.eM = this.eL;
                this.eG = this.eF;
                this.eB = this.eF + ":";
                if (this.eF < 10) {
                    this.eB = "0" + this.eB;
                }

                if (this.eL < 10) {
                    this.eB = this.eB + "0";
                }

                this.eB = this.eB + String.valueOf(this.eL);
            }

            if (ey) {
                this.eB = "object-" + this.cG;
            }

            this.d(var1, 131, 2, var5 - 2 - this.R[3][131] >> 1, 20);
            var12 = 2 + this.R[2][131] + 2;
            j.x.a(var1, this.eB, var12, var9, 20);
            var1.setColor(249, 86, 249);
            var1.fillRect(0, var5 - 1, this.e10, 1);
            var1.setColor(105, 35, 105);
            var1.fillRect(0, var5 - 2, this.e10, 1);
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY() + var5);
            this.bx = var8;
        } catch (Exception var14) {
        }

        this.c10 = this.getHeight() - var5;
    }

    private final void a(Graphics var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7) {
        try {
            int var8 = var1.getClipX();
            int var9 = var1.getClipY();
            int var10 = var1.getClipWidth();
            int var11 = var1.getClipHeight();

            try {
                int var12 = this.R[2][var2];
                int var13 = this.R[3][var2];
                byte var14 = 0;
                if (this.R[6][var2] != 11) {
                    var5 = false;
                }

                if (var5) {
                    var14 = 1;
                }

                if (!var5) {
                    var3 += this.R[4][var2];
                } else {
                    var3 -= this.R[4][var2];
                }

                var4 += this.R[5][var2];
                if (var6) {
                    var3 -= this.R[2][var2] >> 1;
                    if (!var7) {
                        var4 -= this.R[3][var2] >> 1;
                    }
                }

                if (var7) {
                    var4 -= this.R[3][var2];
                }

                int var15 = this.R[0][var2];
                if (var5) {
                    var15 = this.cW[this.R[6][var2]].getWidth() - this.R[0][var2] - this.R[2][var2];
                }

                if (var4 + var13 > this.bx) {
                    var13 = this.bx - var4;
                }

                if (var3 + var12 > this.e10) {
                    var12 = this.e10 - var3;
                }

                if (var12 > 0 && var13 > 0 && var3 > -var12 && var4 > -var13) {
                    var1.setClip(var3, var4, var12, var13);
                    var1.drawImage(this.cW[this.R[6][var2] + var14], var3 - var15, var4 - this.R[1][var2], 20);
                }
            } catch (Exception var16) {
            }

            var1.setClip(var8, var9, var10, var11);
        } catch (Exception var17) {
        }
    }

    private final void a(Graphics var1, int var2, int var3, int var4, boolean var5, boolean var6) {
        this.a(var1, var2, var3, var4, var5, var6, false);
    }

    final int q() {
        return Math.abs(this.randomGenerator.nextInt() % 100);
    }

    private final void b(Graphics var1, int var2) {
        this.b(var1, var2, this.ch[1][var2], this.ch[2][var2], this.ch[3][var2], this.ch[4][var2]);
    }

    private static byte[] E(int var0) {
        byte[] var1 = new byte[2];
        int var2 = var0 / 256;
        int var3 = var0 - 256 * var2;
        var1[0] = v(var2);
        var1[1] = v(var3);
        return var1;
    }

    private static int a(byte var0, byte var1) {
        return 256 * a(var0) + a(var1);
    }

    public final void run() {
        this.S = true;
        aK = false;
        h.a(this, j.x);
        j.p = h.b(j.p);
        // TODO: Check the failure
        if (h.a()) {
            NET_Lizard.a();
        } else {
            this.Q();
            this.aG();
            this.aQ = new c(this);

            try {
                r = AssetManager.instanceHandler.e(a(this.aH[3]));
                cR = false;
            } catch (Exception ignore) {
            }

            try {
                bQ = AssetManager.instanceHandler.e(a(this.aH[5]));
            } catch (Exception var30) {
                bQ = null;
            }

            if (this.v == null) {
                try {
                    this.v = AssetManager.readImageFromFilePNG(a(this.aH[6]));
                } catch (Exception var29) {
                }
            }

            for(int var1 = 0; var1 < this.x.length; ++var1) {
                try {
                    this.x[var1] = AssetManager.readImageFromFilePNG(a(this.aH[7]) + var1 + a(this.aH[8]));
                } catch (Exception var28) {
                }
            }

            AssetManager.a();
            if (AssetManager.a1[12] == 7) {
                j.p = false;
            }

            this.aO = false;
            eu = false;
            aS();
            this.ai();

            try {
                AssetManager.readImageFromFilePNG(a(this.aH[9]));
            } catch (Exception var27) {
            }

            eu = false;
            j.al = true;
            if (cq) {
                this.dM = false;
                this.ao();
                this.dM = true;
                this.cr.e();
            }

            boolean var2 = cq;
            long var3 = 7L;
            boolean var7 = false;
            boolean var8 = false;
            long var9 = 0L;

            while(this.S) {
                if (AssetManager.e1 >= 0) {
                    this.an();
                }

                es = false;

                while(this.S) {
                    if (j.p && h.a(cq)) {
                        this.ao();
                    }

                    if (h.f()) {
                        this.z();
                        this.repaint();
                        this.serviceRepaints();

                        try {
                            Thread.sleep(7L);
                        } catch (Exception var26) {
                        }
                    } else {
                        if (aK) {
                            return;
                        }

                        if (cq) {
                            var2 = cq;
                            this.cr.e();
                        } else {
                            if (cq != var2) {
                                var2 = cq;
                                break;
                            }

                            try {
                                Thread.sleep(9L);
                            } catch (Exception var25) {
                            }

                            try {
                                Thread.sleep(var3);
                            } catch (Exception var24) {
                            }

                            var3 = 7L;
                            this.ag();
                            var7 = false;
                            if (!cq && !this.dB) {
                                var7 = true;
                            }

                            if (var7 != var8) {
                                if (var7) {
                                    var9 = System.currentTimeMillis() - h.G;
                                } else {
                                    h.G = System.currentTimeMillis() - var9;
                                }

                                var8 = var7;
                            }

                            if (var7) {
                                h.G = 0L;
                            }

                            if (!h.e()) {
                                if (AssetManager.e1 > 0 && this.ch != null && !h.f()) {
                                    this.aB();
                                }

                                this.aW = this.ff == 122 || this.ff == 121;
                                this.aO = true ^ (cq || this.ae && !cy || this.dO || this.aB || this.aC || this.aD || this.aE);
                                if (this.cs != null && !cy) {
                                    this.aO = false;
                                }

                                if (this.aO && es && System.currentTimeMillis() > this.dd + this.eN) {
                                    this.aO = false;
                                }

                                ed = ec;
                                if (es) {
                                    ++ed;
                                }

                                if (ed == 3) {
                                    ++ed;
                                }

                                if (this.aD) {
                                    this.aO = false;
                                    if (!this.aE && System.currentTimeMillis() > this.eO + 1777L) {
                                        this.aE = true;
                                    }
                                }

                                if (this.aB) {
                                    break;
                                }

                                if (AssetManager.e1 >= 0 && this.ch != null && !h.f()) {
                                    this.a();
                                } else {
                                    long var13 = System.currentTimeMillis();
                                    this.repaint();
                                    this.serviceRepaints();
                                    if (this.cr != null) {
                                        this.cr.c();
                                    }

                                    long var17 = System.currentTimeMillis() - var13;
                                    long var19 = 88L;
                                    if (var17 < var19) {
                                        try {
                                            Thread.sleep(var19 - var17);
                                        } catch (Exception var23) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (this.aB) {
                    break;
                }
            }

            this.ev = false;
            c.e2 = false;
            if (!aK) {
                this.aw();

                try {
                    Thread.sleep(7L);
                } catch (Exception var22) {
                }

                if (b10 != null && n.g12) {
                    this.d();
                }

                AssetManager.k1 = true;
                AssetManager.b();
                NET_Lizard.a();
            }
        }
    }

    final void g(int var1) {
        int var2 = this.bZ[10][var1];
        int var3;
        int var4 = var3 = this.j(this.bZ[0][var1] + 64) * this.bZ[10][var1] / 100 >> 1;
        int var5 = this.bZ[12][var1];
        int var6 = this.bZ[16][var1];
        int var7 = this.bZ[17][var1];
        if (var5 > 0 && var6 > 0 && var7 > 0) {
            var4 = this.j(this.bZ[0][var1] + 64) * (var6 - var5) / var6 >> 1;
        }

        if (var3 > var4) {
            var3 = var4;
        }

        int[] var10000 = this.cv;
        int var10001 = this.bZ[5][var1];
        var10000[var10001] += var3;
        int var8 = this.bZ[0][var1];
        int var9 = this.bZ[5][var1];
        this.bZ[0][var1] = 0;
        int var10 = this.bZ[1][var1] + (this.bZ[3][var1] >> 1);
        int var11 = this.bZ[2][var1] + (this.bZ[4][var1] >> 1);
        this.m(var1);
        this.t(var1);
        if (cy && this.M(this.bZ[5][var1])) {
            this.f(12, var1, 0, 0);
        } else {
            if (var5 > 0 && var6 > 0 && var7 > 0) {
                if (var5 >= var6 - 1) {
                    return;
                }

                if (var5 >= var6 - 2) {
                    this.a(1, var9, true, var10, var11, var2);
                    return;
                }
            }

            switch(var8) {
                case 1:
                    for(int var12 = 0; var12 < 2; ++var12) {
                        this.a(1, var9, true, var10, var11, var2);
                    }

                    for(int var13 = 0; var13 < 2; ++var13) {
                        this.a(2, var9, true, var10, var11, var2);
                    }

                    return;
                case 2:
                case 3:
                    this.a(1, var9, true, var10, var11, var2);
                    return;
                case 4:
                    this.a(2, var9, true, var10, var11, var2);
                    return;
                case 5:
                case 6:
                    for(int var14 = 0; var14 < 2; ++var14) {
                        this.a(2, var9, true, var10, var11, var2);
                    }
                default:
            }
        }
    }

    private final void g(byte[] var1) {
        this.dM = false;
        if (var1 != null) {
            try {
                for(int var2 = 112; var2 < var1.length; ++var2) {
                    var1[var2] = 0;
                }

                var1[8] = 1;
                var1[9] = (byte) AssetManager.e1;
                int var3 = 112;

                byte[] var4;
                for(int var5 = 0; var5 < this.cv.length; ++var5) {
                    var4 = E(this.cv[var5]);
                    var1[var3] = var4[0];
                    ++var3;
                    var1[var3] = var4[1];
                    ++var3;
                }

                boolean var6 = false;
                boolean var7 = false;

                int var16;
                int var17;
                for(var16 = 0; var16 < this.bg; ++var16) {
                    for(var17 = 0; var17 < this.bZ.length; ++var17) {
                        var1[var3] = (byte)this.bZ[var17][var16];
                        ++var3;
                    }
                }

                for(var16 = 0; var16 < this.cU; ++var16) {
                    if (this.ch[0][var16] > 0 && this.ch[12][var16] >= 0) {
                        this.ch[12][var16] = -10;
                    }

                    for(var17 = 0; var17 < this.ch.length; ++var17) {
                        var1[var3] = (byte)this.ch[var17][var16];
                        ++var3;
                    }
                }

                var1[var3] = (byte)this.fJ;
                ++var3;
                var1[var3] = (byte)this.gd;
                ++var3;
                var1[var3] = (byte)this.fy;
                ++var3;
                var1[var3] = (byte)this.fQ;
                ++var3;
                var1[var3] = ec;
                ++var3;
                var1[var3] = (byte)this.eL;
                ++var3;
                var1[var3] = (byte)this.eF;
                ++var3;
                int var8;
                byte[] var9 = new byte[(var8 = (this.fE + 1) * (this.fX + 1)) + 2];
                int var12 = 0;

                int var10;
                int var11;
                for(var11 = 0; var11 <= this.fX; ++var11) {
                    for(var10 = 0; var10 <= this.fE; ++var10) {
                        var9[var12] = this.cj[var10][var11];
                        ++var12;
                    }
                }

                byte[] var13 = f(var9);
                var4 = E(var3 + 2 + var13.length);
                var1[var3] = var4[0];
                ++var3;
                var1[var3] = var4[1];
                ++var3;

                for(var12 = 0; var12 < var13.length && var3 < var1.length; ++var12) {
                    var1[var3] = var13[var12];
                    ++var3;
                }

                var1[var3] = this.D;
                ++var3;
                var1[var3] = 0;
                if (this.aQ != null && this.aQ.h2) {
                    var1[var3] = 1;
                }

                ++var3;
                var1[var3] = 0;
                if (ax) {
                    var1[var3] = 1;
                }

                ++var3;
                var1[var3] = dS;
                ++var3;
                var9 = new byte[var8 + 2];
                var12 = 0;

                for(var11 = 0; var11 <= this.fX; ++var11) {
                    for(var10 = 0; var10 <= this.fE; ++var10) {
                        if (this.ci != null) {
                            var9[var12] = this.ci[var10][var11];
                        }

                        ++var12;
                    }
                }

                var13 = f(var9);
                var4 = E(var3 + 2 + var13.length);
                var1[var3] = var4[0];
                ++var3;
                var1[var3] = var4[1];
                ++var3;

                for(var12 = 0; var12 < var13.length && var3 < var1.length; ++var12) {
                    var1[var3] = var13[var12];
                    ++var3;
                }

                AssetManager.g1 = AssetManager.e1;
                AssetManager.c1 = 1;
            } catch (Exception var15) {
            }
        }
    }

    private final void aC() {
        if (cy && !this.aC) {
            this.aD();
        } else {
            byte[] var1 = AssetManager.a1;
            if (cy) {
                var1 = null;
            }

            this.g(var1);
            AssetManager.b();
        }
    }

    private void aD() {
        byte[] var1 = N;
        if (!n.b12) {
            var1 = null;
        }

        this.g(var1);
        if (var1 != null) {
            AssetManager.clearRecordStoreAndWriteRecord(this.cJ, var1);
        }

    }

    private static void aE() {
        AssetManager.b();
    }

    private final void F(int var1) {
        boolean var2 = false;
        int var7 = 64 + var1 * 2;
        int var3;
        if ((var3 = AssetManager.a1[var7]) < 0) {
            var3 += 256;
        }

        int var4;
        if ((var4 = AssetManager.a1[var7 + 1]) < 0) {
            var4 += 256;
        }

        int var5 = var3 * 60 + var4;
        int var6 = this.eF * 60 + this.eL;
        if (var5 == 0 || var6 < var5) {
            AssetManager.a1[var7] = (byte)this.eF;
            AssetManager.a1[var7 + 1] = (byte)this.eL;
        }

    }

    private final void aF() {
        this.o((Graphics)null);
        this.fD = this.e10 / this.ej;
        this.fW = (this.c10 - this.dH) / this.eg;
        this.fB = this.fD;
        this.fU = this.fW;
        this.bv = 0;
        this.bw = 0;
        if (this.fB * this.ej < this.e10) {
            ++this.fB;
            this.bv = this.e10 - this.fD * this.ej;
        }

        if (this.fU * this.eg < this.c10 - this.dH) {
            ++this.fU;
            this.bw = this.c10 - this.dH - this.fW * this.eg;
        }

        this.fC = this.fD;
        this.fV = this.fW;
    }

    private static boolean a(String var0, String var1, boolean var2) {
        if (var0 != null && var1 != null) {
            if (var0.length() < var1.length()) {
                return false;
            } else {
                int var3 = 0;

                for(int var4 = 0; var4 < var0.length() && var3 < var1.length(); ++var4) {
                    if (a(var0.charAt(var4), var1.charAt(var3), var2)) {
                        ++var3;
                        if (var3 >= var1.length()) {
                            return true;
                        }
                    } else {
                        var3 = 0;
                    }
                }

                return false;
            }
        } else {
            return false;
        }
    }

    private final boolean a(int var1, int var2, int var3, int var4, boolean var5) {
        if (!cy) {
            return true;
        } else {
            int[][] var6 = null;
            byte[][] var7 = null;
            if (var1 == 1) {
                var6 = this.ch;
            }

            if (var1 == 2) {
                var6 = this.bZ;
            }

            if (var1 == 3) {
                var7 = this.cf;
            }

            if (var1 == 4) {
                var7 = this.cg;
            }

            if (var1 == 22) {
                (var7 = new byte[1][])[0] = N;
                if (var3 >= 256) {
                    var2 = var3 / 256;
                }
            }

            if (var1 == 5) {
                var2 = this.eF;
                var3 = this.eL;
            }

            byte[] var8;
            if (var1 == 6) {
                var2 = (var8 = E((int)this.dk))[0];
                var3 = var8[1];
            }

            if (var1 == 7) {
                var3 = this.cj[this.ch[1][var2]][this.ch[2][var2]];
            }

            var8 = new byte[4 + var4];
            byte[] var9;
            if (var1 == 8) {
                var3 = (var9 = E(this.cv[1 + var2]))[0];
                var4 = var9[1];
            }

            if (var1 == 9) {
                var2 = this.ex;
                var3 = this.dq;
                var4 = this.doo;
            }

            if (var1 == 11) {
                var8 = new byte[4];
            }

            if ((var1 < 1 || var1 > 4) && var1 != 22) {
                var8 = new byte[4];
            }

            if (var1 == 20) {
                var2 = (var9 = E(ai))[0];
                var3 = var9[1];
            }

            var8[0] = (byte)var1;
            var8[1] = (byte)var2;
            var8[2] = (byte)var3;
            var8[3] = (byte)var4;
            if (var1 == 1 || var1 == 2) {
                for(int var12 = 0; var12 < var4; ++var12) {
                    var8[4 + var12] = (byte)var6[var3 + var12][var2];
                }
            }

            if (var1 == 3 || var1 == 4) {
                for(int var10 = 0; var10 < var4; ++var10) {
                    var8[4 + var10] = var7[var3 + var10][var2];
                }
            }

            if (var1 == 22) {
                for(int var11 = 0; var11 < var4; ++var11) {
                    var8[4 + var11] = var7[0][var3 + var11];
                }
            }

            return var5 ? this.c(var8) : this.b(var8);
        }
    }

    private final boolean f(int var1, int var2, int var3, int var4) {
        return this.a(var1, var2, var3, var4, false);
    }

    private final void aG() {
        if (this.cr == null) {
            this.cr = new j(this);
        }

        if (this.cr != null && !this.cr.f()) {
            av = 0;
        }

        if (AssetManager.instanceHandler.getFileSize("/w0.png") <= 0 && AssetManager.instanceHandler.getFileSize("/l13.png") <= 0) {
            aw = 0;
        }

        if (AssetManager.instanceHandler.getFileSize("/l14.png") <= 0) {
            cQ = true;
        }

        if (av > aw) {
            av = aw;
        }

    }

    private final void a(int var1, boolean[] var2) {
        if ((var1 = this.w(var1)) >= 0 && var2 != null && var1 < var2.length) {
            var2[var1] = true;
        }

    }

    private final void aH() {
        byte[][] var1 = this.ci;

        int var3;
        for(int var2 = 0; var2 <= this.fX; ++var2) {
            for(var3 = 0; var3 <= this.fE; ++var3) {
                var1[var3][var2] = 0;
            }
        }

        this.dW = 0;
        this.dU = 0;

        for(var3 = 0; var3 < 8; ++var3) {
            this.am();
        }

        int[][] var4 = this.ch;
        int[][] var5 = this.bZ;
        int var6 = -1;
        int var7 = -1;

        for(int var8 = 0; var8 < this.bg; ++var8) {
            if (var5[5][var8] == 1) {
                var6 = var5[1][var8];
                var7 = var5[2][var8];
                if (var5[0][var8] > 0) {
                    break;
                }
            }
        }

        boolean var9 = false;

        for(int var10 = 0; var10 < this.cU; ++var10) {
            if (var4[8][var10] == 1) {
                byte var13 = 3;
                if (var4[0][var10] > 0 && var4[0][var10] <= 2) {
                    var13 = 2;
                }

                this.b(var4[1][var10], var4[2][var10], 1, 1, var13);
                if (var6 >= 0 && var7 >= 0) {
                    int var11 = this.aQ.a(var10, var6, var7, false);

                    for(int var12 = 0; var12 < var11; ++var12) {
                        this.b(this.cf[var12][var10], this.cg[var12][var10], 1, 1, var13);
                    }
                }
            }
        }

    }

    private final void aI() {
        this.aN();
        this.aO();
        this.aK();
        this.X();
        this.aX();
        this.eL = 0;
        this.eF = 0;
        this.fg = 0L;
        this.di = 0L;
        this.dC = System.currentTimeMillis();
    }

    private final void a(int var1, int var2, int var3, int var4, byte[] var5, int var6, int var7) {
        try {
            int var8 = var6;

            for(int var9 = var2; var9 < var2 + var4; ++var9) {
                for(int var10 = var1; var10 < var1 + var3; ++var10) {
                    int var11;
                    if ((var11 = var5[var8]) < 0) {
                        var11 += 256;
                    }

                    var11 += var7 - 1;

                    try {
                        if (var11 != 0) {
                            if (var11 - 128 >= 0 && var11 - 128 < this.bE) {
                                if (var11 >= 128) {
                                    var11 -= 128;
                                }

                                this.cj[var10][var9] = (byte)(100 * var11 / (this.bE - 1));
                                if (this.cj[var10][var9] > 0) {
                                    this.bV[var10][var9] = 0;
                                    this.ck[var10][var9] = 0;
                                }
                            } else {
                                this.bV[var10][var9] = (byte)var11;
                                this.cj[var10][var9] = 0;
                                this.ck[var10][var9] = 0;
                            }
                        }
                    } catch (Exception var13) {
                    }

                    ++var8;
                }
            }

        } catch (Exception var14) {
        }
    }

    private void G(int var1) {
        this.a(var1, this.cb);
        this.a(var1, this.ca);
        this.dl = System.currentTimeMillis();
        this.a(var1, this.cc);
        this.br = var1;
    }

    private final void b(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        if (this.ci != null) {
            byte[][] var7 = this.ci;
            short[][] var8 = this.ck;
            if (var5 > 0) {
                var2 -= var5;
                var1 -= var5;
                var3 += var5 << 1;
                var4 += var5 << 1;
            }

            for(int var9 = var2; var9 < var2 + var4; ++var9) {
                for(int var10 = var1; var10 < var1 + var3; ++var10) {
                    if ((var5 < 2 || (var10 != var1 || var9 != var2 && var9 != var2 + var4 - 1) && (var10 != var1 + var3 - 1 || var9 != var2 && var9 != var2 + var4 - 1)) && var10 >= 0 && var10 <= this.fE && var9 >= 0 && var9 <= this.fX) {
                        if (var6 && var7[var10][var9] == 0 && var8[var10][var9] >= 64 && var8[var10][var9] - 64 < this.bg) {
                            int var11 = var8[var10][var9] - 64;
                            if (this.bZ[0][var11] > 0) {
                                this.b(this.bZ[1][var11], this.bZ[2][var11], this.bZ[3][var11], this.bZ[4][var11], 0, false);
                            }
                        }

                        if (var10 != var1 && var10 != var1 + var3 - 1 && var9 != var2 && var9 != var2 + var4 - 1) {
                            var7[var10][var9] = 1;
                        } else if (var7[var10][var9] == 0) {
                            var7[var10][var9] = 127;
                        }
                    }
                }
            }

        }
    }

    private final void b(int var1, int var2, int var3, int var4, int var5) {
        this.b(var1, var2, var3, var4, var5, true);
    }

    private final void H(int var1) {
        int[][] var2;
        if ((var2 = this.ch)[0][var1] > 0 && var2[8][var1] == 1) {
            byte var3 = 2;
            if (var2[0][var1] > 2) {
                var3 = 3;
            }

            this.b(var2[1][var1], var2[2][var1], 1, 1, var3);
        }

    }

    private final void aJ() {
        this.fy = -1;
        this.fQ = -1;

        for(int var1 = 0; var1 < this.cU; ++var1) {
            if (this.ch[0][var1] > 0 && this.ch[8][var1] == 1) {
                this.fy = this.ch[1][var1];
                this.fQ = this.ch[2][var1];
                break;
            }
        }

        if (this.fy < 0) {
            for(int var2 = 0; var2 < this.bg; ++var2) {
                if (this.bZ[0][var2] > 0 && this.bZ[5][var2] == 1) {
                    this.fy = this.bZ[1][var2];
                    this.fQ = this.bZ[2][var2];
                    break;
                }
            }
        }

        this.fA = this.fE / 2;
        this.fS = this.fX / 2;
        if (this.fy < 0) {
            this.fy = this.fA + 1;
            this.fQ = this.fS + 1;
        }

    }

    private final void aK() {
        try {
            for(int var1 = this.p; var1 < this.cd.length; var1 += 3) {
                byte var2 = 1;
                byte var3 = this.cd[var1];
                byte var4 = this.cd[var1 + 1];
                int var5;
                if ((var5 = this.cd[var1 + 2]) < 0) {
                    var5 = -var5;
                    var2 = 2;
                }

                if (var5 >= 32) {
                    var5 = var5 - 32 + 64;
                }

                if (var5 > 0) {
                    if (var5 >= 64) {
                        this.a(-1, var5 - 64, var2, var3, var4, false, true, false);
                    } else {
                        this.a(var5, var2, true, var3, var4);
                    }
                }
            }

        } catch (Exception var6) {
        }
    }

    final void r() {
        if (this.fy < this.fJ) {
            this.fJ = this.fy;
            this.cm = 0;
        }

        if (this.fQ < this.gd) {
            this.gd = this.fQ;
            this.cn = 0;
        }

        int var1 = 0;
        int var2 = 0;
        if (this.ff >= 123) {
            var1 = this.bd - 1;
            var2 = this.be - 1;
        }

        if (this.fy + var1 > this.fJ + this.fC - 1) {
            this.fJ = this.fy - this.fC + 1 + var1;
            this.cm = this.bv;
        }

        if (this.fQ + var2 > this.gd + this.fV - 1) {
            this.gd = this.fQ - this.fV + 1 + var2;
            this.cn = this.bw;
        }

        if (this.fJ == 0) {
            this.cm = 0;
        }

        if (this.gd == 0) {
            this.cn = 0;
        }

        if (this.fJ + this.fC >= this.fE + 1) {
            this.cm = this.bv;
        }

        if (this.gd + this.fV >= this.fX + 1) {
            this.cn = this.bw;
        }

    }

    public final void showNotify() {
        super.showNotify();
        this.cu = false;
        if (cq && this.cr != null) {
            b(bI, true);
        }

        if (this.ae) {
            this.dB = true;
        }

        try {
            this.a();
        } catch (Exception var2) {
        }
    }

    private final void aL() {
        if (this.bK <= 0 && !this.dD) {
            try {
                this.f(6, 0, 0, 0);
                if (!this.A()) {
                    ++this.cp;
                    if (this.cp > 3) {
                        this.cp = 0;
                    }

                    return;
                }

                if (this.cp == 1) {
                    this.f(5, 0, 0, 0);
                }

                if (this.cp == 2) {
                    this.f(8, 0, 0, 0);
                }

                if (this.cp == 3) {
                    this.f(8, 1, 0, 0);
                }

                long var1;
                if (this.cp == 4 && (var1 = System.currentTimeMillis()) - this.dh > 7000L) {
                    this.f(9, 0, 0, 0);
                    this.dh = var1;
                }
            } catch (Exception var13) {
            }

            ++this.cp;
            if (this.cp > 7) {
                this.cp = 0;
            }

            try {
                int[][] var15 = this.ch;
                int[][] var2 = this.bZ;
                int var3 = 0;
                int var4 = -1;
                int var5 = this.H;
                boolean var6 = false;
                boolean var7 = false;
                int var8 = -1;
                int var9 = this.F;
                boolean var10 = false;
                boolean var11 = false;

                int var12;
                while((var12 = this.ax()) < 0 || this.p(var12)) {
                    if (!var6) {
                        if (var7 && this.H >= var5) {
                            var6 = true;
                        }

                        while(var15[0][this.H] == 0) {
                            ++this.H;
                            if (this.H >= this.cU) {
                                this.H = 0;
                                var7 = true;
                            }

                            if (var7 && this.H >= var5) {
                                var6 = true;
                                break;
                            }
                        }

                        if (var15[0][this.H] > 0) {
                            if (var4 < 0) {
                                var4 = this.H;
                            } else if (this.H == var4) {
                                var6 = true;
                                --this.H;
                                if (this.H < 0) {
                                    this.H = this.cU - 1;
                                }
                            }

                            if (!this.p(this.H)) {
                                break;
                            }
                        }

                        ++this.H;
                        if (this.H >= this.cU) {
                            this.H = 0;
                            var7 = true;
                        }
                    }

                    if (!var10) {
                        if (var11 && this.F >= var9) {
                            var10 = true;
                        }

                        while(var2[0][this.F] == 0) {
                            ++this.F;
                            if (this.F >= this.bg) {
                                this.F = 0;
                                var11 = true;
                            }

                            if (var11 && this.F >= var9) {
                                var10 = true;
                                break;
                            }
                        }

                        if (var2[0][this.F] > 0) {
                            if (var8 < 0) {
                                var8 = this.F;
                            } else if (this.F == var8) {
                                var10 = true;
                                --this.F;
                                if (this.F < 0) {
                                    this.F = this.bg - 1;
                                }
                            }

                            if (!this.o(this.F)) {
                                break;
                            }
                        }

                        ++this.F;
                        if (this.F >= this.bg) {
                            this.F = 0;
                            var11 = true;
                        }
                    }

                    if (var6 && var10) {
                        break;
                    }

                    ++var3;
                    if (var3 >= 32) {
                        break;
                    }

                    ++var3;
                    if (var3 >= 4 && this.m10 >= aj) {
                        break;
                    }
                }

                this.bK = this.m10;
            } catch (Exception var14) {
            }
        }
    }

    private final void aM() {
        this.er = false;
        if (cq && this.cr != null) {
            this.cr.N = 0;
            this.cr.T = true;
            this.cr.U = false;
        } else {
            this.aa();
        }

        int var2;
        int var3;
        while(!n.g12 || !this.er) {
            var2 = this.br;
            if (cq && this.cr != null) {
                var2 = this.cr.N;
            }

            if (var2 == 35 || var2 == -7 || !n.s) {
                if (!n.s) {
                    this.c(3);
                } else {
                    this.c(-1);
                }
                break;
            }

            if (this.aC && !n.g12) {
                break;
            }

            if (n.g12 && n.r && n.g12) {
                for(var3 = 0; var3 < ac.length; ++var3) {
                    ac[var3] = 0;
                }

                for(int var4 = 0; var4 < b10.i12.length; ++var4) {
                    b10.i12[var4] = 0;
                }

                b10.i12[0] = 127;

                for(int var5 = 0; var5 < b10.i12.length; ++var5) {
                    b10.i12[var5] = 127;
                }

                if (b10.h12[0] == 127) {
                    this.er = true;
                    ai = b10.h12.length;

                    for(int var6 = 0; var6 < b10.h12.length; ++var6) {
                        if (b10.h12[var6] != 127) {
                            ai = var6;
                            break;
                        }
                    }
                }

                if (n.g12 && b10.h12[0] == 125 && n.b12) {
                    this.d();
                    break;
                }

                n.r = false;
            }

            this.ah();
            this.repaint();
            this.serviceRepaints();

            try {
                Thread.sleep(7L);
            } catch (Exception var10) {
            }
        }

        if (cq && this.cr != null) {
            this.cr.N = 0;
            this.cr.T = true;
            this.cr.U = false;
        } else {
            this.aa();
        }

        b10.h12[0] = 0;

        for(var2 = 0; var2 < b10.h12.length; ++var2) {
            b10.h12[var2] = 0;
        }

        ac[0] = 0;

        for(var3 = 0; var3 < ac.length; ++var3) {
            ac[var3] = 0;
        }

        if (n.g12 && ai < dz && !this.aC) {
            this.f(20, 0, 0, 0);
            if (!n.b12) {
                this.f(21, 0, 0, 0);
                this.bn = true;
            }

            this.bK = 1;
        }

        if (n.g12 && !this.aC) {
            while(this.m10 > 0 && n.g12) {
                this.bK = 1;
                this.al();

                try {
                    Thread.sleep(3L);
                } catch (Exception var9) {
                }
            }

            this.f(19, this.ej, 0, 0);

            while(this.m10 > 0 && n.g12) {
                this.bK = 1;
                this.al();

                try {
                    Thread.sleep(3L);
                } catch (Exception var8) {
                }
            }
        }

        if (n.g12 && !this.aC && this.cx) {
            this.aW();
        }

        if (n.g12 && !this.aC && !this.cx && !n.b12) {
            this.az();
        }

        if (n.g12 && !this.aC && n.b12) {
            byte var11 = 0;
            if (ax) {
                var11 = 1;
            }

            this.f(26, ec, var11, 0);
        }

        try {
            Thread.sleep(47L);
        } catch (Exception var7) {
        }
    }

    static final boolean s() {
        return dS > 1 || ax;
    }

    public static final void b(int var0, boolean var1) {
        if (AssetManager.e1 >= 1 || var0 >= bI) {
            if (var1 || var0 < bI) {
                if (AssetManager.l1) {
                    if (m.y == null) {
                        boolean var2 = cq;
                        cq = false;
                        aP.aw();
                        cq = var2;
                        m.a(aP);
                    }

                    if (du) {
                        m.a11 = 0;
                    } else {
                        m.a11 = -1;
                    }

                    if (var1) {
                        var0 = bI;
                    }

                    m.b(var0);
                }

            }
        }
    }

    public final void h(int var1) {
        if (!du || var1 == 0 || var1 == 3 || var1 == 4 || var1 >= bI) {
            this.dZ = -1;
            b(var1, false);
        }
    }

    private final void I(int var1) {
        if (!du && !this.aC && (this.dZ < 0 || var1 == 3 || var1 == 4 || var1 > this.dZ)) {
            this.dZ = var1;
        }

    }

    public static void t() {
        m.d();
    }

    private final void aN() {
        try {
            boolean var1 = false;
            byte var2 = this.cd[3];
            byte var3 = this.cd[4];
            byte var4;
            if ((var4 = this.cd[5]) > 0) {
                this.a(-1, 1, var4, var2, var3, false, true, false);
            }

            var2 = this.cd[6];
            var3 = this.cd[7];
            if ((var4 = this.cd[8]) > 0) {
                this.a(-1, 1, var4, var2, var3, false, true, false);
            }

        } catch (Exception var5) {
        }
    }

    private final void aO() {
        int[] var1 = new int[]{this.et[0], this.et[1]};
        int[] var2 = new int[2];
        int[] var3 = new int[]{this.ew[0], this.ew[1]};

        label34:
        for(int var4 = 1; var4 <= 2; ++var4) {
            for(int var5 = 0; var5 < this.bg; ++var5) {
                if (this.bZ[0][var5] > 0 && this.bZ[5][var5] == var4 && this.bZ[6][var5] > 0) {
                    int var6 = 0;

                    while(true) {
                        if (var6 >= var1[var4 - 1]) {
                            continue label34;
                        }

                        this.a(var3[var4 - 1], var4, true, this.bZ[1][var5], this.bZ[2][var5]);
                        ++var2[var4 - 1];
                        ++var6;
                    }
                }
            }
        }

    }

    final void i(int var1) {
        j.br = null;

        try {
            if (this.s == null) {
                this.P();
            }

            int var3 = var1 - 1 + 27;
            if (this.s != null && var3 < this.s.length) {
                j.br = " " + '\r' + this.s[var3];
            }

            if (j.br != null && j.br.length() < 5) {
                j.br = null;
            }

            if (j.br != null) {
                char[] var4 = j.br.toCharArray();

                for(int var5 = 0; var5 < var4.length; ++var5) {
                    if (var4[var5] == '=') {
                        var4[var5] = '\r';
                    }
                }

                j.br = null;
                j.br = new String(var4);
            }
        } catch (Exception var6) {
            j.br = null;
        }

        if (this.victory && j.br == null) {
            this.dA = true;
        }

    }

    final void u() {
        if (cy) {
            if (!n.s) {
                this.c(0);
                n.b12 = true;
                b10.b();
            } else {
                this.c(5);
            }
        }
    }

    private final boolean c(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            int var7 = var6 * 2;
            if (this.ar != null && this.ar[0 + var7] != null && this.ar[1 + var7] != null) {
                int var8 = var1.getClipX();
                int var9 = var1.getClipY();
                int var10 = var1.getClipWidth();
                int var11 = var1.getClipHeight();
                int var12 = 0;
                if (this.fn) {
                    --var12;
                }

                int var13 = var3 - 1;

                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                for(int var14 = 0; var14 < 2; ++var14) {
                    var15 = var4;
                    var16 = this.ar[0 + var7].getHeight();
                    var17 = var2;
                    var18 = var13;
                    if (var2 < var8) {
                        var15 = var4 - (var8 - var2);
                        var17 = var8;
                    }

                    if (var13 < var9) {
                        var16 -= var9 - var13;
                        var18 = var9;
                    }

                    if (var17 + var15 > var8 + var10) {
                        var15 = var8 + var10 - var17;
                    }

                    if (var18 + var16 > var9 + var11) {
                        var16 = var9 + var11 - var18;
                    }

                    if (var15 > 0 && var16 > 0) {
                        var1.setClip(var17, var18, var15, var16);

                        for(var19 = var2 + var12; var19 < var2 + var4; var19 += this.ar[0 + var7].getWidth()) {
                            var1.drawImage(this.ar[0 + var7], var19, var13, 20);
                        }
                    }

                    var13 += var5;
                }

                var15 = var2;

                for(var16 = 0; var16 < 2; ++var16) {
                    var17 = this.ar[1 + var7].getWidth();
                    var18 = var5;
                    var19 = var15;
                    int var20 = var3;
                    if (var15 < var8) {
                        var17 -= var8 - var15;
                        var19 = var8;
                    }

                    if (var3 < var9) {
                        var18 = var5 - (var9 - var3);
                        var20 = var9;
                    }

                    if (var19 + var17 > var8 + var10) {
                        var17 = var8 + var10 - var19;
                    }

                    if (var20 + var18 > var9 + var11) {
                        var18 = var9 + var11 - var20;
                    }

                    if (var17 > 0 && var18 > 0) {
                        var1.setClip(var19, var20, var17, var18);

                        for(int var21 = var3 + var12; var21 < var3 + var5; var21 += this.ar[1 + var7].getHeight()) {
                            var1.drawImage(this.ar[1 + var7], var15, var21, 20);
                        }
                    }

                    var15 += var4;
                }

                var1.setClip(var8, var9, var10, var11);
                return true;
            } else {
                return false;
            }
        } catch (Exception var22) {
            return false;
        }
    }

    private final void aP() {
        for(int var1 = 0; var1 < this.cU; ++var1) {
            if (this.ch[0][var1] > 0 && this.ch[0][var1] == this.bb && this.ch[27][var1] < 100 && this.cj[this.ch[1][var1]][this.ch[2][var1]] > 0) {
                byte[] var10000 = this.cj[this.ch[1][var1]];
                int var10001 = this.ch[2][var1];
                var10000[var10001] = (byte)(var10000[var10001] - this.eb * (ed + 1));
                int[] var2;
                if (this.w()) {
                    var2 = this.ch[27];
                    var2[var1] += this.eb * (ed + 1);
                }

                if (this.cj[this.ch[1][var1]][this.ch[2][var1]] < 0) {
                    if (this.w()) {
                        var2 = this.ch[27];
                        var2[var1] += this.cj[this.ch[1][var1]][this.ch[2][var1]];
                    }

                    this.cj[this.ch[1][var1]][this.ch[2][var1]] = 0;
                }

                if (cy && this.w() && this.cj[this.ch[1][var1]][this.ch[2][var1]] == 0) {
                    this.f(1, var1, 1, 4);
                    this.f(7, var1, 0, 0);
                }
            }
        }

    }

    private final void aQ() {
        try {
            if (dS > 0 && this.fi) {
                int[][] var1 = this.bZ;
                int var2 = this.bg;
                boolean var3 = true;
                int var4 = 0;

                while(true) {
                    if (var4 < var2) {
                        if (var1[0][var4] != 1 || var1[5][var4] != 1) {
                            ++var4;
                            continue;
                        }

                        var3 = false;
                    }

                    if (var3) {
                        this.fi = false;
                        this.ct = r[4][9];
                        this.T = 1;
                        return;
                    }

                    if (!this.k(1)) {
                        this.fi = false;
                        this.ct = r[4][10];
                        this.T = 1;
                    }
                    break;
                }
            }

        } catch (Exception var6) {
        }
    }

    private boolean aR() {
        if (this.eU < 0) {
            this.eU = 0;
            if (a("Nokia_S60.5_360x640_Touch", "Fly", false)) {
                this.eU = 1;
            }
        }

        return this.eU > 0;
    }

    private static void aS() {
        for(int var0 = 1; var0 <= 100; ++var0) {
            if (AssetManager.instanceHandler.getFileSize("ll" + var0) <= 0) {
                bP = var0 - 1;
                return;
            }
        }

    }

    private final boolean aT() {
        if (this.cF == 0) {
            this.cF = 60;

            try {
                Class.forName("com.nokia.mid.ui.DirectUtils");
                Class.forName("com.nokia.mid.ui.DirectGraphics");
                if (a.a5 == null) {
                    this.cF = 40;
                }
            } catch (Exception var2) {
            }
        }

        return this.cF == 40;
    }

    static final boolean b(int var0, int var1, int var2, int var3) {
        return h10 && fF >= var0 && fF < var0 + var2 && fZ >= var1 && fZ < var1 + var3;
    }

    static final boolean c(int var0, int var1, int var2, int var3) {
        return dt && fG >= var0 && fG < var0 + var2 && ga >= var1 && ga < var1 + var3 && fF >= var0 && fF < var0 + var2 && fZ >= var1 && fZ < var1 + var3 && Math.abs(fF - fG) <= 10 && Math.abs(fZ - ga) <= 10 && eK - eJ <= 410L;
    }

    static final boolean d(int var0, int var1, int var2, int var3) {
        return h10 && ds && fG >= var0 && fG < var0 + var2 && ga >= var1 && ga < var1 + var3;
    }

    final boolean v() {
        if (this.eT >= 0) {
            return this.eT > 0;
        } else {
            try {
                try {
                    this.eT = 0;
                    if (this.hasPointerEvents()) {
                        this.eT = 1;
                    }

                    return this.eT > 0;
                } catch (Exception var2) {
                    return false;
                }
            } catch (Throwable var3) {
                return false;
            }
        }
    }

    private final void aU() {
        long var1;
        if ((var1 = System.currentTimeMillis()) >= this.eR + 100L) {
            this.eR = var1;

            try {
                for(int var3 = 0; var3 < this.Y.length; ++var3) {
                    if (this.az[var3] && this.ef[var3]) {
                        int var10002 = this.Y[var3]++;
                        if (this.Y[var3] >= 32) {
                            var10002 = this.Y[var3]--;
                            var10002 = this.dV[var3]++;
                            if (this.dV[var3] >= 4) {
                                this.dV[var3] = 0;
                                this.ef[var3] = false;
                            }
                        }
                    }
                }

            } catch (Exception var4) {
            }
        }
    }

    private static void aV() {
        h10 = false;
        cZ = false;
        dF = false;
        ds = false;
        dt = false;
        dr = false;
        eJ = 0L;
    }

    private static final void a(int var0, int var1, boolean var2, boolean var3, boolean var4) {
        if (var2 || var4) {
            if (!dr) {
                var2 = true;
            }

            dr = true;
            fF = var0;
            fZ = var1 + dT;
            if (fZ < 0) {
                dT += -fZ;
                fZ = var1 + dT;
            }

            if (var2) {
                h10 = true;
                cZ = false;
                dF = false;
                ds = true;
            }

            if (var2) {
                fG = fF;
                ga = fZ;
                eJ = System.currentTimeMillis();
            }
        }

        if (var2) {
            NET_Lizard.game.fc = true;
        }

        if (var3) {
            dt = true;
            eK = System.currentTimeMillis();
            if (cZ) {
                h10 = false;
                return;
            }

            dF = true;
        }

    }

    final int j(int var1) {
        int var2 = this.al * J(var1);
        if (var1 == 65) {
            var2 = 4000;
        }

        return var2;
    }

    private static int J(int var0) {
        byte var1 = 3;
        switch(var0) {
            case 2:
                var1 = 4;
                break;
            case 3:
                var1 = 15;
                break;
            case 4:
                var1 = 7;
                break;
            case 5:
                var1 = 8;
                break;
            case 6:
                var1 = 14;
                break;
            case 7:
                var1 = 18;
                break;
            case 8:
                var1 = 15;
                break;
            case 65:
                var1 = 5;
                break;
            case 66:
                var1 = 7;
                break;
            case 67:
                var1 = 21;
                break;
            case 68:
                var1 = 9;
                break;
            case 69:
                var1 = 19;
                break;
            case 70:
                var1 = 17;
        }

        return var1;
    }

    private final void p(Graphics var1) {
        if (this.v != null) {
            var1.setClip(0, 0, this.e10, this.getHeight());
            a.a(var1, 0, this.getHeight() - this.v.getHeight(), this.e10, this.v.getHeight(), 0, 192);
            var1.drawImage(this.v, -(this.v.getWidth() >> 1), this.getHeight() - this.v.getHeight(), 20);
        }

    }

    private final void aW() {
        this.aw();
        this.f(23, 0, 0, 0);

        for(int var2 = 0; var2 < N.length && n.g12; var2 += 32) {
            int var3 = 32;
            if (var2 + 32 > N.length) {
                var3 = N.length - var2;
            }

            if (!this.f(22, 0, var2, var3)) {
                while(this.m10 > 0 && n.g12) {
                    this.bK = 1;
                    this.al();

                    try {
                        Thread.sleep(3L);
                    } catch (Exception var8) {
                    }
                }

                this.f(22, 0, var2, var3);
            }
        }

        while(this.m10 > 0 && n.g12) {
            this.bK = 1;
            this.al();

            try {
                Thread.sleep(3L);
            } catch (Exception var7) {
            }
        }

        this.f(23, 1, 0, 0);

        while(this.m10 > 0 && n.g12) {
            this.bK = 1;
            this.al();

            try {
                Thread.sleep(3L);
            } catch (Exception var6) {
            }
        }

        try {
            Thread.sleep(47L);
        } catch (Exception var5) {
        }
    }

    private static void e(Graphics var0, int var1, int var2, int var3) {
        if (var3 == var3 >> 1 << 1) {
            ++var3;
        }

        int var4 = 1;

        for(var1 += var3 >> 1; var4 <= var3; --var2) {
            var0.fillRect(var1, var2, var4, 1);
            var4 += 2;
            --var1;
        }

    }

    private final void a(Graphics var1, String var2) {
        if (!this.ae) {
            var1.setFont(j.defaultFont);
            int var3 = j.x.b() + 3;
            if (this.dy) {
                var3 = this.dH;
            }

            int var4 = this.c10 - var3;
            var1.setClip(0, 0, this.e10, this.c10);
            boolean var5 = false;
            int var11 = var3 - (j.x.b() - j.x.f3) >> 1;
            ++var11;
            int var6 = this.e10;
            if (this.ff == 121) {
                try {
                    String var7 = "" + this.bZ[9][this.A];
                    int var8 = this.e10 - 2 - j.x.a(var7);
                    if (this.w != null) {
                        int var9;
                        if (this.w[0] != null) {
                            var8 -= this.w[0].getWidth() + 1;
                            var9 = j.x.b() - j.x.f3 - this.w[0].getHeight() >> 1;
                            ++var9;
                            var1.drawImage(this.w[0], this.e10 - 1 - this.w[0].getWidth(), var4 + var11 + var9, 20);
                        }

                        var6 = var8;
                        if (this.w[1] != null) {
                            var9 = j.x.b() - j.x.f3 - this.w[1].getHeight() >> 1;
                            ++var9;
                            var1.drawImage(this.w[1], var8 - 2 - this.w[1].getWidth(), var4 + var11 + var9, 20);
                            var6 = var8 - 2 - this.w[1].getWidth();
                        }
                    }

                    j.x.a(var1, var7, var8, var4 + var11, 20);
                } catch (Exception var10) {
                }
            }

            int var12 = j.x.a(var2);
            j.x.a(var1, var2, (var6 - this.dY - var12 >> 1) + this.dY, var4 + var11, 20);
            this.fY -= j.x.b() + 5;
        }
    }

    private final void a(int var1, boolean var2, boolean var3) {
        int var4 = var1 + 1;
        if (this.ch[0][var1] == 8) {
            this.a(var1, true);
        }

        this.ch[10][var1] = 0;
        if (cy) {
            byte var5 = 0;
            if (var2) {
                var5 = 1;
            }

            byte var6 = 0;
            if (var3) {
                var6 = 1;
            }

            if (this.w()) {
                this.f(17, var1, var5, var6);
            }
        }

        int var20 = this.ch[1][var1];
        int var21 = this.ch[2][var1];
        if (this.ck[var20][var21] == var4) {
            this.ck[var20][var21] = 0;
        }

        int var9;
        for(int var8 = var21 - 2; var8 <= var21 + 2; ++var8) {
            for(var9 = var20 - 2; var9 <= var20 + 2; ++var9) {
                try {
                    if (this.ck[var9][var8] == var4) {
                        this.ck[var9][var8] = 0;
                    }
                } catch (Exception var19) {
                }
            }
        }

        try {
            if (var2 && this.ch[0][var1] <= 2) {
                if (av > 0) {
                    this.bX[var20][var21] = -13;
                } else {
                    this.bX[var20][var21] = -69;
                }
            }
        } catch (Exception var18) {
        }

        if (this.ch[0][var1] > 2) {
            this.b(8, var20, var21);

            try {
                if (var3) {
                    if ((var9 = this.bV[var20][var21]) < 0) {
                        var9 += 256;
                    }

                    if (var9 >= 128 && this.R[7][var9 - 128] <= 0) {
                        this.e(var20, var21);
                        this.bV[var20][var21] = -93;
                    }
                }
            } catch (Exception var17) {
            }

            this.I(1);
        } else {
            this.b(1, var20, var21);
        }

        this.ch[0][var1] = 0;
        int var11 = 5;
        int var12 = -1;

        for(int var13 = 0; var13 < this.cU; ++var13) {
            if (this.ch[0][var13] > 0 && this.ch[8][var13] == this.ch[8][var1]) {
                var9 = Math.abs(this.ch[1][var13] - this.ch[1][var1]);
                int var10 = Math.abs(this.ch[2][var13] - this.ch[2][var1]);
                if (var9 < var10) {
                    var9 = var10;
                }

                if (var9 < var11) {
                    var11 = var9;
                    var12 = var13;
                }
            }
        }

        for(int var14 = 0; var14 < this.cU; ++var14) {
            if (this.ch[0][var14] > 0 && this.ch[7][var14] == var1 + 1) {
                this.ch[7][var14] = 0;
                if (var12 >= 0 && var12 != var14) {
                    this.ch[7][var14] = var12 + 1;
                    this.ch[13][var14] = this.ch[1][var12];
                    this.ch[14][var14] = this.ch[2][var12];
                }
            }
        }

        if (this.ff == var1) {
            this.ff = -1;
        }

        if (this.ch[15][var1] > 0 && this.ff == 120) {
            boolean var15 = false;

            for(int var16 = 0; var16 < this.cU; ++var16) {
                if (this.ch[0][var16] > 0 && this.ch[15][var16] > 0) {
                    var15 = true;
                }
            }

            if (!var15) {
                this.ff = -1;
            }
        }

        this.eZ = System.currentTimeMillis() + 1377L;
        if (this.ch[8][var1] == 1) {
            this.eY = true;
        }

    }

    private final void b(int var1, boolean var2, boolean var3) {
        if (cy) {
            if (!this.w()) {
                return;
            }

            this.ch[10][var1] = 0;
            this.f(1, var1, 10, 1);
        }

        this.a(var1, var2, var3);
    }

    private final boolean a(int var1, int var2, boolean var3, int var4, int var5) {
        this.bM = -1;
        if (var1 >= 1 && var2 >= 1) {
            int var6 = 0;

            for(int var7 = 0; var7 < this.cU; ++var7) {
                if (this.ch[0][var7] > 0 && this.ch[8][var7] == var2) {
                    ++var6;
                }
            }

            if (var6 >= this.cU - 2) {
                return false;
            } else {
                int var8 = 0;
                int var9 = 0;
                boolean var10 = false;

                int var21;
                for(var21 = 0; var21 < this.cU && this.ch[0][var21] > 0; ++var21) {
                }

                if (this.ch[0][var21] > 0) {
                    return false;
                } else {
                    byte var11 = 1;
                    if (var1 > 5) {
                        var11 = 2;
                    }

                    if (var1 == 4 || var1 == 5) {
                        var11 = 3;
                    }

                    if (var1 == 5) {
                        var11 = 3;
                    }

                    if (var1 == 7 || var1 == 8) {
                        var11 = 3;
                    }

                    if (var1 == 8) {
                        var11 = 2;
                    }

                    int var15 = 100;
                    int var16;
                    if (var3) {
                        var15 = 7;

                        label91:
                        for(var16 = 0; var15 > 0; --var15) {
                            for(int var17 = var5 - var16; var17 <= var5 + var16; ++var17) {
                                for(int var18 = var4 - var16; var18 <= var4 + var16; ++var18) {
                                    try {
                                        if (this.d(var18, var17, var1) <= 0) {
                                            var8 = var18;
                                            var9 = var17;
                                            break label91;
                                        }
                                    } catch (Exception var20) {
                                    }
                                }
                            }

                            ++var16;
                        }
                    }

                    if (var15 <= 0) {
                        return false;
                    } else {
                        for(var16 = 0; var16 < this.ch.length; ++var16) {
                            this.ch[var16][var21] = 0;
                        }

                        this.ch[0][var21] = var1;
                        this.ch[1][var21] = var8;
                        this.ch[2][var21] = var9;
                        this.ch[3][var21] = 0;
                        this.ch[4][var21] = 0;
                        this.ch[5][var21] = 0;
                        this.ch[7][var21] = 0;
                        this.ch[8][var21] = var2;
                        this.ch[9][var21] = 0;
                        this.ch[10][var21] = 100;
                        this.ch[11][var21] = var11;
                        this.ch[12][var21] = -1;
                        this.ck[var8][var9] = (short)((byte)(var21 + 1));
                        this.bM = var21;
                        return true;
                    }
                }
            }
        } else {
            return false;
        }
    }

    private final boolean a(int var1, int var2, boolean var3, int var4, int var5, int var6) {
        if (var6 <= 0) {
            return false;
        } else if (this.a(var1, var2, var3, var4, var5) && this.bM >= 0) {
            int var7;
            int var8;
            if ((var8 = (var7 = var6 >> 1) + Math.abs(this.randomGenerator.nextInt() % (var6 - var7))) < 1) {
                var8 = 1;
            }

            if (var8 > var6) {
                var8 = var6;
            }

            this.ch[10][this.bM] = var8;
            return true;
        } else {
            return false;
        }
    }

    private final void K(int var1) {
        int[][] var7 = this.ch;
        short[][] var8 = this.ck;

        for(int var2 = 0; var2 < this.cU; ++var2) {
            if (var1 >= 0) {
                var2 = var1;
            }

            try {
                if (var7[0][var2] > 0 && (var7[29][var2] <= 0 || var7[0][var2] == 8)) {
                    byte var6 = (byte)(var2 + 1);
                    int var3 = var7[1][var2];
                    int var4 = var7[2][var2];
                    var8[var3][var4] = (short)var6;
                    int var5;
                    if ((var5 = var7[9][var2]) > 7) {
                        switch(var5 -= 8) {
                            case 0:
                                --var3;
                                break;
                            case 1:
                                ++var3;
                                break;
                            case 2:
                                --var4;
                                break;
                            case 3:
                                ++var4;
                        }

                        var8[var3][var4] = (short)var6;
                    }
                }
            } catch (Exception var10) {
            }

            if (var1 >= 0) {
                return;
            }
        }

    }

    private final void aX() {
        this.K(-1);
    }

    private final boolean p(int var1, int var2) {
        if (bA[var1 - 1][var2 - 1] <= 0) {
            return false;
        } else {
            return var1 <= 2 || this.k(var2);
        }
    }

    final boolean w() {
        if (cy && b10 == null) {
            return false;
        } else {
            return !cy || this.A();
        }
    }

    static boolean x() {
        byte[] var0;
        return (var0 = N)[9] > 0 && var0[8] != 0 && !cP;
    }

    final boolean k(int var1) {
        int[][] var2 = this.bZ;
        int var3 = this.bg;
        int var4 = 0;
        int var5 = 0;

        for(int var7 = 0; var7 < var3; ++var7) {
            if (var2[0][var7] > 0 && var2[5][var7] == var1) {
                if (var2[0][var7] == 2) {
                    if (dS <= 0) {
                        var5 += 133;
                    } else if (var2[12][var7] <= 0 || 100 * this.bZ[12][var7] / var2[16][var7] <= 20) {
                        if (var2[10][var7] >= 80) {
                            var5 += 100;
                        } else {
                            var5 += var2[10][var7] + 20;
                        }
                    }
                } else {
                    var4 += 100;
                }
            }
        }

        if (var5 * 3 >= var4) {
            return true;
        } else {
            return false;
        }
    }

    final int d(int var1, int var2) {
        short var3 = 250;

        try {
            var3 = this.ck[var1][var2];
        } catch (Exception var5) {
        }

        return var3;
    }

    private final boolean q(int var1, int var2) {
        for(int var3 = 0; var3 < this.bg; ++var3) {
            if (this.bZ[0][var3] == var1 && this.bZ[5][var3] == var2) {
                return true;
            }
        }

        return false;
    }

    private final boolean aY() {
        boolean[] var1;
        if ((var1 = this.ca) != null) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2]) {
                    return true;
                }
            }
        }

        return false;
    }

    private final boolean L(int var1) {
        return (var1 = this.w(var1)) >= 0 && this.ca != null && var1 < this.ca.length && this.ca[var1];
    }

    final int a(int var1, int var2, int var3, boolean var4, boolean var5) {
        boolean var6 = false;

        int var9;
        try {
            if ((var9 = this.d(var2, var3, this.ch[0][var1])) > 0 && var9 <= this.cU && this.ch[0][var9 - 1] <= 2 && (this.ch[0][var1] == 3 || this.ch[0][var1] == 6) && this.ch[8][var1] != this.ch[8][var9 - 1]) {
                int var7 = var9 - 1;
                var9 = 0;
                if (var4) {
                    this.b(var7, true, true);
                    this.ch[6][var1] = 66;
                }
            }

            if (var9 > 0 && var9 <= this.cU && var9 - 1 == var1) {
                var9 = 0;
            }

            if (var5 && !var4 && var9 > 0 && var9 <= this.cU && this.ch[0][var1] != this.bb && this.ch[8][var1] != this.ch[8][var9 - 1]) {
                var9 = 0;
            }
        } catch (Exception var8) {
            var9 = 250;
        }

        return var9;
    }

    private int a(int var1, int var2, int var3, boolean var4) {
        return this.a(var1, var2, var3, var4, false);
    }

    private final boolean r(int var1, int var2) {
        try {
            int var3;
            if ((var3 = this.bV[var1][var2]) < 0) {
                var3 += 256;
            }

            if (var3 >= 128 && this.R[7][var3 - 128] <= 0 && (var3 - 128 < 112 || var3 - 128 > 114)) {
                return true;
            }
        } catch (Exception var4) {
        }

        return false;
    }

    private boolean M(int var1) {
        if (cy && b10 == null) {
            return false;
        } else {
            return cy && !this.A() && var1 == 1;
        }
    }

    private boolean s(int var1, int var2) {
        int var3 = this.dx;
        if (this.ch[0][var1] == 4) {
            var3 = 4;
        }

        if (this.ch[0][var1] == 5) {
            var3 = 5;
        }

        int var4 = this.ch[1][var1];
        int var5 = this.ch[2][var1];
        int var6 = this.ch[3][var1];
        int var7 = this.ch[4][var1];
        if (var6 >= this.ek) {
            ++var4;
        }

        if (var6 <= -this.ek) {
            --var4;
        }

        if (var7 >= this.eh) {
            ++var5;
        }

        if (var7 <= -this.eh) {
            --var5;
        }

        boolean var8 = false;
        boolean var9 = false;

        for(int var11 = 0; var11 < 1; ++var11) {
            int var14 = var4;
            int var15 = var5;

            for(int var13 = 0; var13 < var3; ++var13) {
                --var14;
                if (this.d(var14, var15) == var2) {
                    return true;
                }
            }
        }

        return false;
    }

    final boolean l(int var1) {
        return this.ch[0][var1] != 8 || this.ch[27][var1] >= 5;
    }

    static void y() {
        if (AssetManager.o && fe) {
            try {
                m.e();
                return;
            } catch (Exception var1) {
            }
        }

    }

    final void z() {
        if (!this.aR()) {
            if (this.fc || this.fb || this.fa || this.fd) {
                short var1 = 36;
                if (this.fa) {
                    var1 = 77;
                }

                if (this.fd) {
                    var1 = 130;
                }

                if (AssetManager.o) {
                    try {
                        m.c(var1);
                    } catch (Exception var3) {
                    }
                }

                this.fc = this.fb = this.fa = this.fd = false;
            }

        }
    }

    private final void q(Graphics var1) {
        try {
            int var2 = j.x.b() + this.av();
            var1.setFont(j.defaultFont);
            boolean var3 = false;
            boolean var4 = false;
            int var5 = 0;
            int var6 = this.ba / var2;
            int var7;
            if ((var7 = this.cs.length - this.en) > var6) {
                var7 = var6;
            }

            int var8 = var2 * var7;
            int var9 = this.fp + 6;
            int var10 = var8 + 7;
            int var18 = this.e10 - this.fp >> 1;
            var18 += 6;
            int var17 = this.c10 - var8 >> 1;
            if (var18 - 4 < 0) {
                var18 = 4;
            }

            if (var18 + this.fp > this.e10) {
                var18 = this.e10 - this.fp;
            }

            if (var17 - 4 < 0) {
                var17 = 4;
            }

            if (var17 + var8 > this.c10) {
                var17 = this.c10 - var8;
            }

            int var11 = var18 - 1 - 3;
            int var12 = var17 - 4;
            var1.setColor(0);
            a.a(var1, var11, var12, var9, var10, 0, 180);
            var1.setColor(16777215);
            var1.drawRect(var11, var12, var9, var10);

            for(int var15 = this.en; var15 < this.cs.length && var5 < var6; ++var15) {
                j.x.a(var1, this.cs[var15], var18, var17, 20);
                var17 += var2;
                ++var5;
            }

        } catch (Exception var16) {
        }
    }

    private final void r(Graphics var1) {
        if (this.v()) {
            if (var1 != null || this.eA - this.eD >= 500L) {
                try {
                    boolean var2 = false;
                    boolean var3 = false;
                    int var4 = 0;
                    if (this.ef[0]) {
                        ++var4;
                    }

                    int var5 = this.dJ;
                    int var6 = 0;
                    int var7 = 0;
                    int var8 = 0;
                    int var9 = 0;
                    if (var1 != null) {
                        var6 = var1.getClipX();
                        var7 = var1.getClipY();
                        var8 = var1.getClipWidth();
                        var9 = var1.getClipHeight();
                        var5 = var1.getTranslateY();
                    }

                    if (!this.cC) {
                        if (var1 != null) {
                            var1.setClip(0, 0, this.bo[var4].getWidth(), this.bo[var4].getHeight());
                            var1.drawImage(this.bo[var4], 0 - (this.dV[0] * this.bo[var4].getWidth() >> 2), 0, 20);
                        }

                        var4 = (var4 >> 1 << 1) + 1;
                        if (var1 == null && d(0, 0 + var5, this.bo[var4].getWidth(), this.bo[var4].getHeight()) && !this.fi) {
                            this.x(48);
                            this.cO = true;
                            aV();
                            this.eD = this.eA;
                        }
                    }

                    var4 = 2;
                    if (this.ef[1]) {
                        ++var4;
                    }

                    int var11 = this.e10 - this.bo[var4].getWidth() >> 1;
                    int var12 = this.bx - this.bo[var4].getHeight();
                    if (var1 != null) {
                        var1.setClip(var11, var12, this.bo[var4].getWidth(), this.bo[var4].getHeight());
                        var1.drawImage(this.bo[var4], var11, var12 + (this.dV[1] * this.bo[var4].getHeight() >> 2), 20);
                    }

                    var4 = (var4 >> 1 << 1) + 1;
                    var12 = this.bx - this.bo[var4].getHeight();
                    if (var1 == null && d(var11, var12 + var5, this.bo[var4].getWidth(), this.bo[var4].getHeight())) {
                        this.x(42);
                        this.cO = true;
                        aV();
                        this.eD = this.eA;
                    }

                    if (var1 != null) {
                        var1.setClip(var6, var7, var8, var9);
                    }

                } catch (Exception var10) {
                }
            }
        }
    }
}
