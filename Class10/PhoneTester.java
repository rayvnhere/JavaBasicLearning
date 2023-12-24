public class PhoneTester {
    public static void main(String[] args) {

        //creating objects from the class
        Phone p1= new Phone ();

        //creating objects from the Classes Attributes
        p1.name="Samsung";
        p1.model="old";
        p1.color="black";

        //printing attributes
        System.out.println(p1.name);
        System.out.println(p1.model);
        System.out.println(p1.color);

        //writing and printing methods
        p1.Resolution();
        p1.RingTone();
    }
}
