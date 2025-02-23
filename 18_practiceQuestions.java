class Employee {
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

class PracticeQuestions {
    public static void main(String[] args) {
        
        // PRPBLEM 1
        Employee ayush = new Employee();
        ayush.setName("Ayush Raj");
        System.out.println(ayush.getname());
        ayush.salary=12343400;
        System.out.println(ayush.getsalary());
    }
}