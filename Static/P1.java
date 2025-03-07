class P1 {
    // Static variables
    static int staticVar1 = 100;
    static int staticVar2 = 200;

    // Instance variables
    int instanceVar1 = 300;
    int instanceVar2 = 400;

    // Static methods
    static void staticMethod1() {
        System.out.println("Inside Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Inside Static Method 2");
    }

    // Instance methods
    void instanceMethod1() {
        System.out.println("Inside Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Inside Instance Method 2");
    }

    // Main method
    public static void main(String[] args) {
        P1 obj = new P1();
        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
        staticMethod1();
        staticMethod2();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
