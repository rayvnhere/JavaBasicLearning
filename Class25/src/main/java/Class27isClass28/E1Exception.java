package Class27isClass28;
/*    Ways to overcome exception before it happens;
Try and Catch Block its like (If else statements)
* In 'Try block', we write the code which we think can cause issue (Plan B)
*
 */
public class E1Exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        try{
            //System.out.println(10 / 0);
            String name=null; //nothing is stored here
            System.out.println(name.length()); // null is empty there's no size to get

        } catch (ArithmeticException ae){
            System.out.println("math is wrong here");
        }//it says; TRY this piece of code and if it gives causes any issue,
        // CATCH that error and execute this line of code
        catch (NullPointerException npe){
            System.out.println("Make sure your object is initialed properly");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException ){
            System.out.println("Make sure you index is greater then 0 or less then the size");
        }catch (Exception e){
            System.out.println("Something went wrong"); //pretty generic
        }
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");

    }
}
