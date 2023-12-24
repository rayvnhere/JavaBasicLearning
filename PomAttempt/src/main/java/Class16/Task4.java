package Class16;

public class Task4 {
static String name;
//purpose of cons is to initialize the instance fields
//static belongs to Class not objects
//instance belongs to objects
public Task4(String Cname){name=Cname;

    System.out.println(Cname);}

    public static void main(String[] args){
    Task4 ts=new Task4("Cyber");

    }
}

