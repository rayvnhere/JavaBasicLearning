public class CreateMethodTester {
    public static void main(String[] args) {
        //CreateMethod has become a datatype
        CreateMethod holdingVar =new CreateMethod();
        holdingVar.add(10,10);

    /* limitation of Void; 1) No DAta is stored  2) no DAta is returned

    Whenever you have a returnType as VOID you wont be able to store the result
    from the method in a variable in the object
       cant do this   int result = cm.add(10,10);  cuz we said VOID

     */
    }
}
