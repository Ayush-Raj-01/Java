class MethodOverloading {

static void foo(){
    System.out.println("Good morning");
}
static void foo(int a ){
    System.out.println("Good morning " + a + " bro");
}
public static void main(String[] args) {
    foo();
    foo(50);
}  
}