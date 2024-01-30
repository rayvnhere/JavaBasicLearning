package org.example;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        //recap of TypeCasting works in Primitive DataTypes
//when we move from Small to big dataType
// we dont have to do anything, it happens automaticlly/implicit
//e.g
        int number=10;
        double num=number;
        System.out.println(num);

//Big to small=loss of data//gotta force by storing desired dataTupe ()
//
        double num2=10.5;
        int num3=(int)num2;


    }
}
