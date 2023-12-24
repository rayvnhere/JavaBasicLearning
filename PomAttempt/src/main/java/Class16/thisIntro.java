package Class16;

public class thisIntro {
    private String name;
    private String color;
    private int age;
/*when we dont use THIS keyword for SAME INSTA & LOCAL then
 localVAr are given priority

THIS keywords only focuses on INSTAVAR
helps when there's same name for Insta and Local var name
 */
    public thisIntro(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void printInfo(){
        /*why didnt we need this keyword here?
becuz we arnt confusing java by creating a
        new var here here like String name="lolo".
        thats why in print I dont have to write this.name
        to focus on insta
         */
        System.out.println(name+" "+color+" "+age);
    }

    public static void main(String[] args){
        thisIntro ti=new thisIntro("kitti","black", 2);
        ti.printInfo();
    }
}
