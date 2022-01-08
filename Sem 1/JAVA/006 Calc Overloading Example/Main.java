class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int add(String a, String b) {
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        return aa + bb;
    }
}

class Main {
    public static void main(String[] args) {
        Calc c = new Calc();

        System.out.println("Addition 10+22 = " + c.add(10, 22));
        System.out.println("Addition '8'+'9' = " + c.add("8", "9"));
    }
}