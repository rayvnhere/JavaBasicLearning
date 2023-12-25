package org.example;
//MultiLevelInheritance
//Vehicle > Car > Audi
public class MultiLevelTester {
    public static void main(String[] args) {
    Audi a=new Audi();
    a.color="blue";
    }
}
class Vehicle{
String color;
//car and audi will inherit this instaVar
}

class Car extends Vehicle{
int noOfDoors=4;
}

class Audi extends Car{
//didnt wrote string color; here because it was inherited from vehicle
boolean badEngine=true;
}

