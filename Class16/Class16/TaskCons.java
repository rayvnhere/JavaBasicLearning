package Class16;
/*Write a java class that will have a constructor:
one with parameters and second without any parameters.
Create a separate Test class where you will execute
both of the constructors 1 by 1.*/
public class TaskCons {
    public TaskCons(){
        System.out.println("empty");
    }

    public TaskCons(String s){
        System.out.println("Wrote within the parathesis so there's a Parameter");
    }
}
