class Methods {

    static int logic(int x , int y){        // if static is removed then we have to make an object 
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y) * 5;
        }
        return z;
    }

    static void telljock(){       // use of Void with static
        System.out.println("To the guy who invented zero: Thanks for nothing!");
    }
    public static void main(String[] args) {
        
        int a = 5;
        int b = 7;
        int c;
        c = logic(a , b);
        // Methods obj = new Methods();  // we have to make an object
        // c = obj.logic(a , b);  // and call it 
        System.out.println(c);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1 , b1);
        // c1 = obj.logic(a1 , b1);
        System.out.println(c1);
        
        // printing the void without making the object
        telljock(); 

    }
}
