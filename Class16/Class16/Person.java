package Class16;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double salary;
    private String favPLanguage;
//COntructors should be PUBLIC//
    public Person (String Pname,int Page, double Pweight, double Psalary, String PfavPLan){

        name=Pname;
        age=Page;
        weight=Pweight;
        salary=Psalary;
        favPLanguage=PfavPLan;
    }
    public Person (String Pname,int Page, double Pweight, double Psalary){

        name=Pname;
        age=Page;
        weight=Pweight;
        salary=Psalary;
    }
    public Person (String Pname,int Page, double Pweight){

        name=Pname;
        age=Page;
        weight=Pweight;
    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "+salary);
    }

/*    why methods should be public?
    so that they can be accessed from anywhere\
    same is the case with CONSTRUCTOr's they should be PUBLIC*/

}
