public class BothLocalAndInstaVar {
    String name="kitti";
    //instaVar

    void printName(){ //instanceMethod
        //created method
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args){
        //created object for the class
        BothLocalAndInstaVar BLI= new BothLocalAndInstaVar();
        BLI.printName();//createdMethod
//above method will print Pishak cuz local is the PRIORITY
//but when there's no localVar then its kitti cuz InstaVar gets secondPriority
    }
}