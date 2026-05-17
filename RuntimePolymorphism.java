class RBI {
    void interest() {
        System.out.println("RBI Interest");
    }
}

class SBI extends RBI {
    void interest() {
        System.out.println("SBI Interest Rate: 7%");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        RBI bank = new SBI();
        bank.interest();
    }
}