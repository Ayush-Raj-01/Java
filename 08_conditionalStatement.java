import java.util.Scanner;

class Conditional {
    public static void main(String[] args) {

        int age ;
        System.out.println("enter your age:-");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        System.out.println("If else condition");
        if(age >= 18){
            System.out.println("Yes, you can drive");
        }
        else{
            System.out.println("No, you are under age!");
        }
        System.out.println("\n");

        System.out.println("Elseif condition");
        if (age>56) {
            System.out.println("You are experienced");
        }
        else if(age > 38){
            System.out.println("You are semi- experienced");
        }
        else if(age > 18){
            System.out.println("Your are semi-semi-experienced");
        }
        else{
            System.out.println("you are not experienced");
        }

        System.out.println("\n");

        System.out.println("Switch case");

        switch (age) {
            case 18:
                System.out.println("You are going to become Aduolt");
                break;
            case 22:
                System.out.println("You are going to join a job");
                break;
            case 28:
                System.out.println("You are about to be married");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
        
            default:
                System.out.println("ENJOY YOUR LIFE..!!");
        }
        
        sc.close();
    }
}
