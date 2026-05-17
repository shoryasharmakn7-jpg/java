final class FinalClass {
    void show() {
        System.out.println("Final class method");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}