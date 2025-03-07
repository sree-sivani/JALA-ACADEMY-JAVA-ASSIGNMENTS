class P7 {
    static void staticMethod() {
        System.out.println("Inside Static Method");
    }

    void instanceMethod() {
        System.out.println("Inside Instance Method");
    }

    public static void main(String[] args) {
        P7 obj = new P7();
        staticMethod();
        obj.instanceMethod();
    }
}
