package org.example;
/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and
 override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
Loop through each object and execute available methods.*/
public class TaskComputer {
        private String name; //fields in parent class
        private int price;
        private int memory;
        public TaskComputer(String name, int price, int memory) { //creating CoN is mandatory cuz private fields
            this.name = name;
            this.price = price;
            this.memory = memory;
        }
        public void printInfo(){
            System.out.println(name+" "+price+" "+memory);
        }
        public void browseInternet(){
            System.out.println("Open the link");
        }
        public void playVideo(){
            System.out.println("Open the video");
        }
    }
    class Apple extends TaskComputer{
        public Apple(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void playVideo(){
            System.out.println("Open the video on Apple computer");
        }
    }
    class Lenovo extends TaskComputer{
        public Lenovo(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void browseInternet(){
            System.out.println("Open the link on Lenovo");
        }
    }
    class HP extends TaskComputer{
        public HP(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void browseInternet(){
            System.out.println("Open the link on HP");
        }
    }
    class Dell extends TaskComputer{
        public Dell(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void playVideo(){
            System.out.println("Open the video on Dell computer");
        }
}

class ComputerTester{
/*Create objects of child classes and store them into array.
Loop through each object and execute available methods.*/
 public static void main(String[] args){
     TaskComputer[] arr={new Apple(),  }; //there's red here cuz object's class has CoN and it needs input

     for(TaskComputer ct:arr){
         /*for (subject variable : iterable/loop) {
            //code to be executed for each element/computer*/

         ct.browseInternet(); //executing methods

      }
 }
}
/*
    public class TaskComputer {
        public static void main(String[] args) {
            TaskComputer [] arr={new Apple("Apple",1000,250)
                    ,new Dell("Dell",2000,250),
                    new HP("HP",1000,250),
                    new Lenovo("Lenovo",1000,250)};

                    enchanced forLoop, c(holder) is the variable

            for (Computer c: arr){
                c.printInfo();
                c.playVideo();
                c.browseInternet();
            }
        }
    }









 */