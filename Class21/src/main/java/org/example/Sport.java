package org.example;

public class Sport {
    //Syntax of Variable/Fields
    /*  MUST       MUST
      DataType      Name
     */
    String type, teamName;
    String location;
    String coach;

    static boolean fun; // static/class Variable
    int numOfPlayers;

    public Sport(String type,String teammate){
        this.coach=coach;
        this.teamName=teamName;
    }
    //Below CoN is overloaded
    public Sport(int numOfPlayers, String location){
        this.numOfPlayers=numOfPlayers;
        this.location=location;
    }

    //Syntax of Method
    /*  MUST       MUST
     reTurnType     Name
     */

    //void means myMethod doesn't return anything
    //nameOfMethod is play()

    void play(){ //Method with no parameters
        System.out.println("we play "+type);
    }

    void watch(String stream ){//Method with Parameters
//String stream is a LocalVar thats why only visible/accessible by the method it was created it
        System.out.println("");
    }

}
/*                                               Creating Object
                                            Also known as "Instances"

    instances are made by new (keyword) Sport (nameOfClass)  and () is calling Constructor's
                      Created Instance        new Sport (calling CoN);
 */

class SportTester{
    public static void main(String[] args) {

        Sport s=new Sport("Messi", "Man City");
        System.out.println(s.type+" and team name is "+ s.teamName);
        System.out.println(s.numOfPlayers);

        new Sport(22,"Ronaldo");
    }
    }


