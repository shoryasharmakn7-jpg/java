class ParentClass {
    ParentClass() {
        System.out.println("Parent Constructor");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super();
        System.out.println("Child Constructor");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        new ChildClass();
    }
}