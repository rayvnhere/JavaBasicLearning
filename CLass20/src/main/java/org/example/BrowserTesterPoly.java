package org.example;

import org.checkerframework.checker.units.qual.C;

public class BrowserTesterPoly {
    public static void main(String[] args) {

        E3UseOfPolySelenium chrome=new E3UseOfPolySelenium();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closeBrowser();

        Safari s= new Safari();
        s.get("https://Amazon.com");
        s.performTest();
        s.closeBrowser();

        FireFox f= new FireFox();
        f.get("https://Amazon.com");
        f.performTest();
        f.closeBrowser();

        Edge e= new Edge();
        e.get("https://Amazon.com");
        e.performTest();
        e.closeBrowser();
        //all code above is STATIC POLYMO APPoarch//we use methodOverLoading here//nothing changes expect OBJECTs

//_____________________________________________notes_______________________________________________________
/*repeating the same codes again and again for 10x browsers
can be avoided by PolyM

    1) but needs common parent class

 *///        Using POlyMo I just have to do below code with the help of loop
//        and it will give the same output as above lengthy repeated code

/*  There are two ways;
  1) Static POlyMo Approach    >uses MethodOverLoading (MoL
  2) Dynamic PolyMO Approach   >only possible through INHERITANCE and MethodOverRidding (MoR exact same method except
                                                                                                         inside {parmeters}

        //  this is called dynamic polymo approach, here the only thing changed is object in (b) variable
        //  polymo(same methods perfoms differently depending on the object we use to call it
        //  polyMO is > "single action performed in many way"

 *///__________________________________________________notes______________________________________________

        //below is ARRAY THAT HOLDS the OBJECTS of all browsers
        Browser[] bArr={chrome,new FireFox(), new Safari(),new Edge()};
        //use loop to get above values one by one
        for (int i = 0; i < bArr.length; i++) {
            //in every loop iteration a new object gets picked and stored in b variable

            //polyMo starts from here and loop is helping to get different methods of objects
            Browser b=bArr[i];//above values will be stored in b one by one
            b.get("https");
            b.performTest();
            b.closeBrowser();
        }
    }
}
/* if i dont want to create objects of all browsers
then I need to do is this Browser[] bArr={chrome,new FireFox(), new Safari(),new Edge()};

this saved me from writing creating objects for each browser that I even called
Static Polymo Appoach (thats time consuimg appraoch) better is dynamic
and I can use dynamic without creating each browser object
with the help of creating object inside {new Chrome()} i just created object inside array
as for creating an object all i need is, new keyword nameOfClass with parenthesis ()
 */
