package Class27isClass28;

public class E6FinallyExample {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(2);
            // System.out.println(10/0); //when there's arithmetic exception, java will stop here and jump to catchBlock
            System.out.println(3);      // this line will be skipped cuz of above error and catchBlock jump
//catchBlock only gets executed when there's arithmetic exception, if there's not then it will be SKIPPED
        }catch (ArithmeticException e){
            System.out.println(4);
            // System.out.println(10/0);//when there's arithmetic exception, java will stop here and jump to catchBlock
            System.out.println(5);     // this line will be skipped cuz of above error and catchBlock jump
        }finally {
            System.out.println(10/0);//here is error so need exception here as well or program will be terminated and finallyBlock won't be executed
//BUT comment-out above line cuz in finallyBlock DOESN'T have code in it, it just close() or clean up stuffs
            System.out.println("Will always be executed");
        }
        System.out.println(8);
    }
    }

/*
* catchBlock won't ever be executed if there's no error in tryBlock
* finallyBlock will always be executed, we don't write code in it, its specific use is close(); to free up or clean resources
* after Java 8, finally was replaced with "try-with-resources" it cleans the resource automatically
we don't need to write code



 */