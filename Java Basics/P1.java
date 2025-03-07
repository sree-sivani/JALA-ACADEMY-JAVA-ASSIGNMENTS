class P1 {
    void display() {  // Method signature: return type + method name + parameters (if any)
        System.out.println("This is a method inside a class.");
    }
    public static void main(String[] args) {
        Example obj = new Example();  // Creating an object
        obj.display();  // Calling method
    }
}
