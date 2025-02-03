class Arrays {
    public static void main(String[] args) {
        // There are three main ways to create an array in jave
        // 1. declaration and memory allocation
        // int [] marks = new int[5];
        
        // 2. declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // initilisation
            // marks[0] = 100;
            // marks[1] = 40;
            // marks[2] = 24;
            // marks[3] = 12;
            // marks[4] = 15;

        // 3. declaration , memory allocation and initialization together
            // int [] marks = {84 , 21 , 23 , 14 , 07};


        int [] marks = {84 , 21 , 23 , 14 , 07};
         System.out.println("length of the Array:- " + marks.length);

        // Displaying the Array (Naive way)
            System.out.println("Printing using Naive way ");
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);

        // Displaying an Array (for loop)
            System.out.println("Printing using for loop ");
            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
        }

        // Displaying an Array (for loop) in reverse
            System.out.println("Printing using for loop in reverse order ");
            for (int i = marks.length - 1; i >= 0; i--) {
               System.out.println(marks[i]);
            }

        // Displaying an Array (for-each loop)
        System.out.println("Printing using for-each loop ");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
