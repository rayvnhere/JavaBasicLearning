package Class16;
/*Write a java Class Students that have a constructor
 which takes students name and 3 subject grades.
Inside your class also have a METHOD to CALCULATE Average Grade.
Test Student class for 2 different students with different marks.
Your program should print an average mark of each students name.
 */
public class Task2 {
    private String name;
    private double math, english, science;

    public Task2(String Cname, double Cmath, double Cenglish, double Cscience){
        name=Cname;
        math=Cmath;
        english=Cenglish;
        science=Cscience;
    }
    public void calavg(){
        double avg=(math+english+science)/3;
        //dataType that it should return//avg is the var//logic
        System.out.println(name+"'s average mark is "+avg);

    }
}
