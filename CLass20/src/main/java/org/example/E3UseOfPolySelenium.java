package org.example;

class Browser{
    void get(String url){
        System.out.println("loading Chrome Browser......"+url);
    }
    void performTest(){
        System.out.println("checking if website is working" +
                "properly in chrome");
    }
    void closeBrowser(){
        System.out.println("closing chrome browser");
    }

}

public class E3UseOfPolySelenium extends Browser {
    void get(String url){
        System.out.println("loading Chrome Browser......"+url);
    }
    void performTest(){
        System.out.println("checking if website is working" +
                "properly in chrome");
    }
    void closeBrowser(){
        System.out.println("closing chrome browser");
    }
}
class FireFox extends Browser{
    void get(String url){
        System.out.println("loading FireFox Browser......"+url);
    }
    void performTest(){
        System.out.println("checking if website is working" +
                "properly in FireFox");
    }
    void closeBrowser(){
        System.out.println("closing FireFox browser");
    }
}

class Edge extends Browser{
    void get(String url){
        System.out.println("loading Edge Browser......"+url);
    }
    void performTest(){
        System.out.println("checking if website is working" +
                "properly in Edge");
    }
    void closeBrowser(){
        System.out.println("closing Edge browser");
    }
}

class Safari extends Browser{
    void get(String url){
        System.out.println("loading Safari Browser......"+url);
    }
    void performTest(){
        System.out.println("checking if website is working" +
                "properly in Safari");
    }
    void closeBrowser(){
        System.out.println("closing Safari browser");
    }

}
