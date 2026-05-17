class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(name + " lives in " + address.city);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address a = new Address("Delhi");
        Student s = new Student("Aman", a);

        s.display();
    }
}
