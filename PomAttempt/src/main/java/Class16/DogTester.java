package Class16;

public class DogTester {
    public static void main(String[] args) {
      /*  Dog d1=new Dog();
        d1.name="Jacky";
        d1.color="black";
        d1.age=2;                       <Wrong> this makes our class Vulnerable
        d1.breed="German";
        d1.printInfo();*/

        /*We should always make our fields private, make contructors and then
                initialize the fields*/
//Objects made from constructors are immutabel
        Dog d1=new Dog("Jackey", "germane","Black", 11);
        d1.printInfo();

/*after constructors my code has become;
1) I have more control, as others wont be to directly access em
2) more clean
3) more secure
4) can add more code but before in object I couldnt */

    }
}
