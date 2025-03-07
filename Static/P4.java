class P4 {
    void instanceMethod() {
        System.out.println("Inside Instance Method");
    }

    static void callInstanceMethod(P4 obj) {
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        P4 obj = new P4();
        callInstanceMethod(obj);
    }
}

