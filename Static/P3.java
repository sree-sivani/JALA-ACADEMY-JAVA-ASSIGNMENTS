class P3 {
    static int staticVar1 = 500;
    static int staticVar2 = 600;

    void printStaticVars() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
        P3 obj = new P3();
        obj.printStaticVars();
    }
}
