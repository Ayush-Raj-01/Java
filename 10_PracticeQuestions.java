class PracticeQuestions {
    public static void main(String[] args) {
        
     /*Write a program to print following patteern
         * * * *
         * * *
         * *
         * 
     */
    System.out.println("\nProblrm - 1\n");

    int n =4;
    for (int i = n ; i>0 ; i--){
        for (int j = 0 ; j<i;j++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }


    // Write a program  to sum first n even numbers 
    System.out.println("\nProblrm - 2\n");

    int y = 4;
    int sum = 0;
    for(int i = 0;i<y ; i++){
            sum = sum +(i*2);

    }
    System.out.println("sum of first n even numbers: " + sum);

    
    // Write a program to print multiplication table 
    System.out.println("\nProblrm - 3\n");

    int m = 15;
    for(int i =1;i<=10;i++){
        System.out.printf("%d X %d = %d\n", m , i , m*i);
    }
    
    
    // Write a program to print multiplication table of 10 in reverse order
    System.out.println("\nProblrm - 4\n");

    int x = 10;
    for(int i =10;i>0;i--){
        System.out.printf("%d X %d = %d\n", x , i , x*i);
    }

    // Write a program to find Factorial of a number
    System.out.println("\nProblrm - 5\n");

    int a = 5;
    int p = 1;
    int factorial = 1;
    while (p<=a) {
        factorial *= p;
        p++;
    }
    System.out.println("Factorial is: " + factorial);
    }
}