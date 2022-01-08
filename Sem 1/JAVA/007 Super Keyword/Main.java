class Base {
    int x = 10;
}

class Main extends Base {
    int x = 20;

    public void show() {
        System.out.println("Value of X in Super Class " + super.x);
        System.out.println("Value of X in Sub Class " + this.x);
    }

    public static void main(String args[]) {
        Main m = new Main();
        m.show();
    }
}