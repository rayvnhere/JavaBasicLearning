package Class16;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;

/*going to make the fields private and as private can only be accessed
within the class it was created it, now only COnstructor can help us.
    How to make a constructor?
The name of Constructor should be named exactly like the name of the Class.Always
       e.g.   Dog(){
    and a Constructor will never have a returntype not even void.

    Next we need to initilize the Private fields of the class, thats why constructor was made
 */
    Dog(String dname, String dcolor, String dbreed, int dage){
//after initizing ASSIGN its VALUES to use them in OBJECT
//name from private made it equal to contructor's varaible
     //as after initilizing we need to ASSIGN the Constructors parameter to the
        //actual actual instanceVar's field
       name=dname;
       color=dcolor;
       breed=dbreed;
       age=dage;


   }

    void printInfo(){
//void means null
    // printInfo is the Name of the Method

        System.out.println(name+" "+breed+" "+color+" "+age);

    }
}
