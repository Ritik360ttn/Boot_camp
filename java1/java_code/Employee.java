public class Employee {

    private String First_name;
    private String Last_name;

    private int age ;
    private  String designation ;

    public Employee(String first_name, String last_name, int age, String designation) {
        First_name = first_name;
        Last_name = last_name;
        this.age = age;
        this.designation = designation;
    }

    public Employee() {
    }


    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void display(){


    }

  
    public String toString() {
        return "Employee{" +
                "First_name='" + First_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", age=" + age +
                ", It's designation='" + designation + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Employee emp1= new Employee("yash" ,"raj",25,"Intern") ;
        Employee emp2 = new Employee("shobhit" ,"singh",29,"Software Engineer") ;
        Employee emp3= new Employee("nikhil" ,"rawat",35,"Senior executive") ;
        Employee emp4 = new Employee("naman" ,"saxena",21,"Ux Developer") ;

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp3.toString());

    }
}
