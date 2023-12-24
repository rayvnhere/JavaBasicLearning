/*
Types Of variables:
    There are three types of variables in java
    with respect to scope/visibility/accessibility
    1) local 2) instance 3) static.
___________________________________________________________________________________
Local Variable:
    Local variables are the variables which are defined inside
    the block of code like IF-ELSE statement,LOOP,SWITCH-statement
    METHODS. They can only be accessed with-in that block of code { }, and cant be
    accessed by another block of code i.e inside of another curly brackets {  }
UpSide:
    They occupy the memory for least amount of time inside your computer.
    You should always try to go with local variables.
DownSide:
    BOB person....They can only be accessed with-in the same block where they are created....appears in system only
    when its called and gets destroys right after, we step into different method
___________________________________________________________________________________
Instance Variables:

    The variables which are defined INSIDE A CLASS but OUTSIDE a block of code
    like METHOD,IF-ELSE statement,LOOP,SWITCH etc., are called as instance variables.

    They can be accessed anywhere in the class except static methods.

Upside:
    They can be accessed anywhere inside a class other than static methods.
DownSide:
    Karimi....They occupy the memory for longer as compared to a local variable.....stays even when not called
___________________________________________________________________________________

                                     Priority
(both with SAME VARiBLE name for) local and insta variables are used together in the class, more PRIORITY is given to
local var

Why are there two varaibles? created?
1) memory occupation limitation
___________________________________________________________________________________
S T A T I C Variable

What is it?
using Static word as keyword, when we know the value of the variable is going to stay SAME throughout the obejct.
They are like public Bus, they are shared and have same memory location with instaVar.
They can be accessed,shared and available for every instaVar.
UpSide:
    we can save a lot of space because for static only one memory location is used
    for all the object.

Downside:
    It occupies the memory for longest.
     can hold only one copy for all objects, this isnt the case for instaVAr they have lots of copies

Why to USE Static Variable? Difference between Insta or Static Var's
Those variables that are going to stay same for all variables e.g everyone have eyes so rather then making it instaVar
who are private and occupies lots of space becuz of being private, its better to make them PUBLIC and save space.
Static has one location for each var and insta has seperate and private var for each object.

Where can be accessed?
1) Can only exist INSIDE a CLASS
            O R
2) OUTSIDE of a block of code

How to call them?
1) NameOfClass.NameOfStaticVariable    (recommended way)
2) objVariable.NameOfStaticVar         (weak way)
__________________________________________________________________________________________













































 */