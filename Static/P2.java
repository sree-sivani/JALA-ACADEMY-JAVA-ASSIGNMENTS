class P2 {
    int instanceVar1 = 50;
    int instanceVar2 = 60;

    static void printInstanceVars(P2 obj) {
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        P2 obj = new P2();
        printInstanceVars(obj);
    }
}
