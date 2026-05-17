class Book {
    String name;

    Book(String name) {
        this.name = name;
    }

    Book(Book b) {
        this.name = b.name;
    }

    void display() {
        System.out.println(name);
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book(b1);

        b2.display();
    }
}
