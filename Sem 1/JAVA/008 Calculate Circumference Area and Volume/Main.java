interface BoxShape {
    public int l = 0;
    public int w = 0;

    public void setData(int l, int w);

    public void Circumference();

    public void Area();

    public void Volume();

}

abstract class NotSquare {
    public int h = 0;

    abstract public void setData(int l, int w, int h);
}

class Square implements BoxShape {
    public int l;
    public int w;

    public void setData(int l) {
        this.l = l;
    }

    public void setData(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public void Circumference() {
        System.out.println("Square's Circumference = " + (l * 4));
    }

    public void Area() {
        System.out.println("Square's Area          = " + (l * l));
    }

    public void Volume() {
        System.out.println("Square's Volume        = " + (l * l * l));
    }
}

class Rectangle extends NotSquare implements BoxShape {
    public int l;
    public int w;

    public void setData(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public void setData(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void Circumference() {
        System.out.println("Rectangle's Circumference = " + (l + l + w + w));
    }

    public void Area() {
        System.out.println("Rectangle's Area          = " + (l * w));
    }

    public void Volume() {
        if (this.h > 0) {
            System.out.println("Rectangle's Volume        = " + (l * w * h));
        } else {
            System.out.println("\033[0;31m" + "E : Hight of Rectangle is Haven't Initialized" + "\033[0m");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.setData(10);
        s.Circumference();
        s.Area();
        s.Volume();

        System.out.println();

        Rectangle r = new Rectangle();
        r.setData(10, 20, 5);
        r.Circumference();
        r.Area();
        r.Volume();

    }
}