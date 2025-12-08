package org.example.interfaces;
import java.lang.*;

interface Edhokati{
    int aMethod(int a, int b);
}

public class InterfacePractice {
    public static void main(String[] args){
        Edhokati x = Integer::sum;

        InterfacePractice anObject = new InterfacePractice();
        //anObject.aMethod(5,4); //not working
        x.aMethod(5,4);
    }
}
