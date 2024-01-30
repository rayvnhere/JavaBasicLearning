package Class27isClass28;

import java.util.Scanner;

public class E3Exception {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter the numbers that you want to divide");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num2==0){
            System.out.println("We can't divide b y zero");
        }else{
            System.out.println(num1/num2);
        }
    }
    }
/* Example of 'Unchecked Exception' these arent important, cuz they are controllable
and not so complicated, they are easily fixable without 'try and catch' block

 */
