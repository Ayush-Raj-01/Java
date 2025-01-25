class Loops {
    public static void main(String[] args) {
        
        // WHILE LOOP -> it will first check the condition before printing
        System.out.println("WHILE LOOP");
        int i = 0;
        while (i<=5) {
            System.out.println(i);
            i++;
        }

        // DO-WHILE LOOP -> it will first print then check the condition
        System.out.println("\nDO-WHILE LOOP");
        int  a = 0;
        do {
            System.out.println(a);
            a++;
        }while(a<5);
        
        // FOR LOOP        
        System.out.println("\nFOR LOOP");
        for(int h = 1; h<=10; h++){
            System.out.println(h);
        }
        
        // BREAK AND CONTINUE IN LOOPS
                // BREAK
        System.out.println("\nBREAK IN LOOP");
        for(int s =0 ;s<5;s++){
            System.out.println(s);
            System.out.println("Java is good");
            if (s==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        
                // CONTINUE ->  it skips that no. which is been put for condition in continue 
        System.out.println("\nCONTINUE IN LOOP");
        for(int s =0 ;s<5;s++){
            if (s==2){
                System.out.println("Number is been skipped");
                continue;
            }
            System.out.println(s);
            System.out.println("Java is good");
        }

    }
}
