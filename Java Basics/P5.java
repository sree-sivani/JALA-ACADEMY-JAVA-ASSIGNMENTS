class P5 {
    int num = 100; // Global variable

    void show() {
        int num = 50; // Local variable
        System.out.println("Local Variable: " + num);
        System.out.println("Global Variable: " + this.num);
    }

    public static void main(String[] args) {
        P5 obj = new P5();
        obj.show();
    }
}
