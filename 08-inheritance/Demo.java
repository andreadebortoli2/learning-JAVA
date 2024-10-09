public class Demo {
    public static void main(String[] args) {
        Calc d = new Calc();
        int r0 = d.add(6, 7);
        System.out.println(r0);

        AdvCalc c = new AdvCalc();
        int r1 = c.add(1, 6);
        int r2 = c.multi(2, 8);
        System.out.println(r1 + " | " + r2);

        VeryAdvCalc g = new VeryAdvCalc();
        int r3 = g.sub(9, 4);
        double r4 = g.power(5, 4);
        System.out.println(r3 + " | " + r4);

    }
}
