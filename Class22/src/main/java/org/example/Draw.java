package org.example;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Draw {
    public static void main(String[] args) {
/* Frontend GUI
JFrame is used to draw on screen */
        JFrame jf=new JFrame();
        jf.setSize(2000,2000);
        MyDrawing m=new MyDrawing();
        jf.add(m);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
    }
}

class MyDrawing extends Canvas{
//childClass of abstract, it was template and I overrided any
    @Override
    public void paint(Graphics g){ //paint: to paint smth on screen
        g.setColor(Color.BLACK);
        for (int i = 100; i <600 ; i=i+50) { //loop caused animation
                g.fillOval(i,200,500,500);
            }/*4 things need to specify;
        1) where on screen need to draw = 200
        2) where on screen we want to draw it = 200
         */
        }
    }


