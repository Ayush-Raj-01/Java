class MyEmployee {
    // int id;
    // String name;

    // in private we have to make methods to access 
    private int id;
    private String name;

    public void setName(String n){
        name = n ;  
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
class AccessModifiers {
public static void main(String[] args) {
    MyEmployee ayush = new MyEmployee();
    //will retun error due to private access modifier.
    // ayush.id = 45;
    // ayush.name = "Ayush Raj";

    // for private access modifier
    ayush.setName("Ayush Raj");
    System.out.println(ayush.getName());
    ayush.setId(16);
    System.out.println(ayush.getId());
}
    
}
