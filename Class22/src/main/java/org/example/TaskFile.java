package org.example;
/*Create a class File that will have the following behaviors:
open(), edit(), close() and fields like name and size.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
  specific implementation of open behaviour:
  Example: to open java file we need notepad++ or sublime text,
  to open .doc file we need Microsoft word to be installed etc.
Create a tester class and call all of the methods from these classes. */
public abstract class TaskFile {
    private String name;
    private double size;

    public TaskFile(String name, double size){
        this.name=name;
        this.size=size;
    }
    public TaskFile(){} // extra COn to have flexibilty with child's matchingCon

    public abstract void open();
     public void edit(){
         System.out.println("implemented method of EDIT");
    }
     public void close(){
         System.out.println("implemented method of CLOSE");
    }
}

class JavaFile extends TaskFile{
    public JavaFile(){}                                              //matching empty CoN
    public void open(){
        System.out.println("open java file we need notepad++");
    }
}

class wordFile extends TaskFile{

    public wordFile(String name, double size){super(name,size);}  // matching paremeters CoN
    public void open(){
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class pdfFile extends TaskFile{
    public void open(){
        System.out.println("to open pdfFile we need Adobe to be installed");
    }
}

class FileTester{
    public static void main(String[] args) { //created object using ChildClass
        JavaFile jf= new JavaFile();
        jf.open();

        TaskFile [] arr={new JavaFile(),new wordFile("usedCon",2),new pdfFile()}; //did PolyMo and downCasting > big to small

        for(TaskFile tf:arr){
            tf.open();
            System.out.println("____________________________");
        }
    }
}


