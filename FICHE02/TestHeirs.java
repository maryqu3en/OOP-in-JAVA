public class TestHeirs {
    public static void main(String[] args)
    {
        C1 a = new C1();
        a.greet();
        C2 b = new C2();
        b.greet();
        C3 c = new C3();
        c.greet();
        C4 d = new C4();
        d.greet();
        C5 e = new C5();
        e.greet();
        C6 f = new C6();
        f.greet();
        C7 g = new C7();
        g.greet();


        // C1 a = new C5();
        // C1 b = new C3();
        // C2 c = a;

        // C4 d = new C1(); // cannot convert from C1 to C4 cuz its not a subclass
        // b = a; // no
        // b = new C6(); // yes
        // c = b;

        // d = b;
        // C4 e;
        // b = new C5();
        // e = (C4) b; 
    }
}