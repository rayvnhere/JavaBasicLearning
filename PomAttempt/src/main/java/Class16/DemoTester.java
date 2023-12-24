package Class16;

public class DemoTester {
    public static void main(String[] args) {

        Demo d=new Demo();
 //based on the Con's Parameter/Arguments helps Java decides which Con to follow

        Demo d1=new Demo("zion lights",10);
/*based on Con's sequence Java will decide if it should be INT then String or
        STring then Int*/

/*How to make Object's Input more flexible?
    by creating another CoN BUT changing the arguments in it

How Java will know which CoN to Call when there are so many?
    based on the CoN's
       1) Number of Paramenter's
       2) Parameter's DataType
       3) Parameter's > DataType > Sequence
 */
    }
}
