class varargs {
    // static int sum(int a , int b){
    //     return  a + b;
    // }
    
    // static int sum(int a , int b , int c){
    //     return  a + b + c;
    // }
    
    // static int sum(int a , int b , int c , int d){
    //     return  a + b + c + d;
    // }

    // INSTEAD OF THIS ABOVE MAKING DIFFERENT METHODS WE CAN USE VARAGRS
    // in this '...' this dots makes all the argument into a array and this dots are varargs
    // AND IT IS AVAILABLE AS 'int [] arr'
    static int sum(int ...arr){
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is: " + sum(4,5));
        System.out.println("the sum of 4, 3 and 5 is: " + sum(4,3,5));
        System.out.println("the sum of 4 ,3 ,8 and 5 is: " + sum(4,3,8,5));
    }
}
