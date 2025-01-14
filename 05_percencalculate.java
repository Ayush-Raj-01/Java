import java.util.Scanner;

class Percencalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Marks: ");
        float marks = sc.nextInt();
        System.out.println("Enter Marks of English:");
        float a = sc.nextInt();
        System.out.println("Enter Marks of Maths:");
        float b = sc.nextInt();
        System.out.println("Enter Marks of Science:");
        float c = sc.nextInt();
        System.out.println("Enter Marks of Social Science:");
        float d = sc.nextInt();
        System.out.println("Enter Marks of Hindi:");
        float e = sc.nextInt();
        float sum = a+b+c+d+e;
        float mult = marks*5;
        float x = (sum*100 / mult);
        System.out.println("The percentage are:");
        System.out.println(x); 
        sc.close();
    }
}
