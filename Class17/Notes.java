/*First Pillar of OOP, there are four.
//i think it deals with classes
Inheritance:
They help us to reuse the code instead of rewriting it again in another class
for the exact same code,logic,methhods,fields and properties.
e.g. children dont have to buy house again if they inherit house from parents.

     Inheritance allows us to build classes from
     EXISTING classes. We can inherit FIELDS and METHODS
     from existing classes if we need them in other classes.
     There are 5 major types of inheritance.
     1) Single Inheritance.
     2) Hierarchical Inheritance.  < most used
     3) Multilevel Inheritance.
     4) Not Java supported "Multiple Inheriance" python does
     5) Hybrid Inheritance (all inheritance mixed together)

1) Single Inheritance        (one parent one child)
2) Hierarchical Inheritance  (one parent several children)
3) Multilevel Inheritance.   (Grandparent > parents > child > grandchild)
                                                     child inherits from two levels
                                                          also grandchild inherits from all levels
Downside of Inheritance
1) They are "tightly coupled"; If we change smth in parentClass, then we have to change childClass too.

*The concept of "Composition" is prefered over inheritance. *QA dont need that*
*if anything field or method in ParentClass is Private then ChildClass cant access it.
*can have only one class as pUBLIC cant have two public classes in the CLASS?
                                             **Python**
Q: Can a class inherit from multiple other classes?
A: No for Java, yes for C++ and Python.
    Why does it become confusing because of Diamond Problem; If 0 gives to >A & B > both A&B gives to C then C cant decide
    which A or B to inherit from.

Q: If there are two Classes Animal 1 and Animal 2
   e.g. public class Cat extends Animal 1, Animal 2
      (how would childClass of Cat knows who to prioritize?
A: In Python the class that comes First infront of the single child class gets priority, so thats Animal 1.
   But for Java a single class cant inherit from two classes.
     in Java a child can have only one parent.

 */