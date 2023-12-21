public class TaskStaticMethod {
/*
Task:
    Create a static method with int return type call it dValue which takes a number as input
    multiples it by 2 and returns the value.
 */
    static int dValue(int num){

        return num*2;
    }

    public static void main(String[] args){
        System.out.println(TaskStaticMethod.dValue(10));

    }
}                                  //Following Note
/*
        //instanceMethod
        void printName(){

instanceMethod needs object



//StaticMethod
static void publicBus(){
                when we put Static(keyword)infront of the method then it
                becomes Static Method
            for StaticMethod we need nameofClass.nameOfMethod
            and they can be accessed without an Object or Instance Variable

UpSide:
    we can save a lot of space because for static only one memory location is used
    for all the object.

Downside:
    It occupies the memory for longest.
 */
