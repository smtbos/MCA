import java.util.Scanner;
class Publisher {
    int p_id;
    String p_name;
    Scanner in;

    public Publisher() {
        this.in = new Scanner(System.in);
    }

    void getData() {
        System.out.print("Enter Publisher ID   : ");
        this.p_id = in.nextInt();
        System.out.print("Enter Publisher Name : ");
        this.p_name = in.next();
    }

    void showData() {
        System.out.println("Publisher ID :   " + this.p_id);
        System.out.println("Publisher Name : " + this.p_name);
    }

    void showData(Book b) {
        this.showData();
        System.out.println("Book ID     : " + b.b_id);
        System.out.println("Book Name   : " + b.b_name);
        System.out.println("Book Author : " + b.b_author);
    }
}

class Book
{
    int b_id;
    String b_name;
    String b_author;
    Scanner in;

    public Book(){
        in = new Scanner(System.in);
    }

    void getData() {
        System.out.print("Enter Book ID     : ");
        this.b_id = in.nextInt();
        System.out.print("Enter Book Name   : ");
        this.b_name = in.next();
        System.out.print("Enter Book Author : ");
        this.b_author = in.next();
    }
}

class Main {
    public static void main(String args[]) {
        Publisher p = new Publisher();
        Book b = new Book();
        p.getData();
        b.getData();
        System.out.println();
        p.showData(b);
    }
}