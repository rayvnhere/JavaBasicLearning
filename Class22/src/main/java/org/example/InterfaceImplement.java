package org.example;

// e.g. companies create interface like below
interface FileReader{  //has abstract & public by default
    //this is how commom interface are created by companies
    public void read (); //commom method of interface created by companies
    //above method will be used by excel, intellj etc
}

//                                EXCEL
class ExcelFile implements FileReader {
    //created by Microsoft
    public void read(){//read method was written by MicroSoft
        System.out.println("reading excelFile");
    }
}

//                          This is how InterFaces are used
class ReadData {
    public static void main(String[] args) {
// created by SunMicro System
        ExcelFile ef= new ExcelFile();
        ef.read();
    }
}







//class TxtFile implements FileReader{
    //void read(){  //ERROR
/* by default interface access modifier is PUBLIC
 * by default a class access modifier is DEFAULT*/


