public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(){
        System.out.println("empty constructor");
    }
    public Person(String name, String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }


    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
