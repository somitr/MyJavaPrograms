// This program will Show a demo of Depricated Anotations

import java.util.*;

class Rectangle{
    //old method
    @Deprecated
    public void showNameOfClass(){
        System.out.println("Rect");
    }

    public void printNameOfClass(){
        System.out.println("Rectangle");
    }
}


public class DepricatedAnotation{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.showNameOfClass();
        r.printNameOfClass();
    }
}