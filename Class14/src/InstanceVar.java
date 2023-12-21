public class InstanceVar {
    String name;
    //InstanceVar not inside method BUT INSIDE CLASS

    void printInfo(){
        System.out.println(name);
        //String name; can be accessed in sout as InstaVar
        //can be accessed ANYWHERE inside the class
    }

    public static void main(String[] args){
        InstanceVar IV=new InstanceVar();
        //technical term for above code is below;
        // created an object for InstanceVar Class
        IV.name="Jacki";
        IV.printInfo();//called this method

        /*IMPORTANT***
        InstaVar can be accessed anywhere inside the Class
        BUT with the help of OBJ VAR i.e IV here */
    }

}
