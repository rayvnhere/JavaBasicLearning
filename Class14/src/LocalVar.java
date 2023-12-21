public class LocalVar {
    public static void main(String[] args) {

        int age=10; //local Var

        if(10<5){
//can access age=10 in sout becuz age=10 & sout is inside main method

            System.out.println(age);
            String name="Jerry";//inside { } so local Var
        }

        if (10>5){
            //System.out.println(name);
            //sout has its own { } and name is in another { }

            System.out.println(age);
//can access age=10 in sout becuz age=10 & sout is inside main method

        }



    }
}
