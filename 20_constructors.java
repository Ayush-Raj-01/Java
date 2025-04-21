class MyMainEmployee { 
    private int id;
    private String name;

    // constructor is made and it is called autometicaly 
    public MyMainEmployee(){
        id = 07;
        name = "Your name";
    }

    // parametrised
    public MyMainEmployee(String myname , int myid){
        id = myid;
        name = myname;
    }

    public void setName(String n){
        this.name = n ;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

class Constructors {
public static void main(String[] args) {
    // MyMainEmployee ayush = new MyMainEmployee();
    
    MyMainEmployee ayush = new MyMainEmployee("AAYU" , 01);
    
    //when this is removed constructor are autometialy called
    // ayush.setName("Ayush");
    // ayush.setId(78);

    System.out.println(ayush.getName());
    System.out.println(ayush.getId());
}
}