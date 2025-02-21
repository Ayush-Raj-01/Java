class Employee {
    int id;
    String name;

    // 
    void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}
class Custom_Class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee ayush = new Employee();    // Instantiating a new Employee Object

        // Setting Attributes
        ayush.id = 16;
        ayush.name = "Ayush Raj";

        // Printing the Attributes
            // Instead of this we can also use another way by making methods
        System.out.println(ayush.id);
        System.out.println(ayush.name);

        // calling the method
        ayush.printDetails(); 
    }
}
