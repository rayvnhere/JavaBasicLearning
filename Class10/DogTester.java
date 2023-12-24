public class DogTester {
    public static void main(String[] args) {
//When you want to execute the code then we use method
//here we are going to make the ACTUAL DOG with the use of DOG DESIGN

       //creating object of Dog Class

       Dog dog1= new Dog();

                /*
        Dog => Data type
        dog1=> is a variable that holds the object
        new Dog();=> main thing responsible for creating
                     the object of Dog class
         */

        //Following is the making of actual actual dog

        dog1.name="Jacky";
        dog1.breed="German";
        dog1.weight=15;
        dog1.color="Black";
        dog1.age=5;

        //PRINTING Attributes

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.age);

        //once we have assigned actual values to the Dog then we can also use the
        //behaviours that we made in the Dog Class

        //WRITING BEHAVIOUR's
        //its similar like scanner.nextInt();//which we didnt write or saw

        dog1.bark();
//doesnt need to do sout here, as in Class already did sout for bark


               // Creating Dog 2
           //attributes,printing,functions
        Dog dog2=new Dog();
        dog2.name="Leo";
        dog2.breed="Persian";
        dog2.weight=8;
        dog2.color="white";

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);

        dog2.eat();
        dog2.sleep();


       }

    }

