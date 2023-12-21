public class CarTester {
    public static void main(String[] args) {

//creating an OBJECT from the CLass
        Car c1= new Car();
        c1.model="17";
       c1.make="Ford";
       c1.color="black";
       c1.price=120000;

        System.out.println(c1.model);
        System.out.println(c1.make);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println();

       c1.honk();
       c1.ApplyBrake();
       c1.drive();


        }





    }
