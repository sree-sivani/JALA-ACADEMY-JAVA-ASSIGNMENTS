class P6 {
    static int staticVar1 = 700;
    static int staticVar2 = 800;
    int instanceVar1 = 900;
    int instanceVar2 = 1000;

    public static void main(String[] args) {
        P6 obj = new P6();
        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }
}
