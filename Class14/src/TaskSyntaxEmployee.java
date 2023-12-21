public class TaskSyntaxEmployee {
    int employID;
    int salary;
    static String ceo="Sumair";

    void printInfo(){
        System.out.print(employID+" "+salary+" "+ceo);
    }
//                        Creating Object from the CLass

    public static void main(String[] args){
        TaskSyntaxEmployee Asghar= new TaskSyntaxEmployee();

        Asghar.employID=0000;
        Asghar.salary=100000;

        //NOT using void from Class
        System.out.println(Asghar.employID);
        System.out.println(Asghar.salary);
        System.out.println(TaskSyntaxEmployee.ceo);//staticVar
                                                  //nameOfClass.nameOfVar

        TaskSyntaxEmployee Asel= new TaskSyntaxEmployee();

        Asel.employID=1111;
        Asel.salary=200000;
        Asghar.printInfo(); //using Void from Class

    }
}
/*
. Create a Class called SyntaxEmployee:
• Create three variables empID, salary and set the CEO to "Sumair"
· Create two objects of the class SyntaxEmployee
· Set the value of eID, salary for each of the objects
· Print out the eID, salary and CEO for each of the objects
 */