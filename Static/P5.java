class P5 {
    static void staticMethod() {
        System.out.println("Inside Static Method");
    }

    void instanceMethod() {
        System.out.println("Calling Static Method from Instance Method...");
        staticMethod();
    }

    public static void main(String[] args) {
        P5 obj = new P5();
        obj.instanceMethod();
    }
}
