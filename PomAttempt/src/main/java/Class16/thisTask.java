package Class16;
/*
Write a Teacher class that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given Teacher using displayInfo method.
 */
public class thisTask {
    private String name;
    public thisTask(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public thisTask(String name, String address, int age) {
        this.name = name;
        this.address = address;
        age=age;
    }

    private String address;



    public void displayInfo(){
        System.out.println(name+" is the teacher's name and their address is "+address);
    }

//                               OBJECT

   public static void main(String[] args){
        thisTask ts=new thisTask("Maria","9922 Albany 2323");
        ts.displayInfo();
   }
}

