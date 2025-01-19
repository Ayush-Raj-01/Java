import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        String name = "Ayush Raj";
        System.out.print("The name is: ");
        System.out.println(name);

        int a = 07;
        float b = 24.834f;
        System.out.printf("The value of a is %d and value of b is %f" , a , b);

        System.out.println("\n"); //adds new line 

        System.out.format("The value of a is %d and value of b is %f" , a , b);
        
        System.out.println(System.lineSeparator()); // this also adds the new line as "\n"

       System.out.println("user input");
        Scanner sc = new Scanner(System.in);
        // String St  = sc.next();
        //System.out.println(St);
        String Sp  = sc.nextLine();
        System.out.println(Sp);

        sc.close();
    }
}
