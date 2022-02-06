package com.w3schools.incl.test;

class  OuterClass
{
    int x = 10;

    static class InnerClass // static: acessado sem necessidade de criação do objeto da classe externa;
    {
        int y = 5;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();

        System.out.println(myOuter.x + myInner.y); // outputs 15 (10 + 5);
    }
}
