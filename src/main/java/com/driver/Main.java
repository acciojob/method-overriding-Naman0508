package com.driver;

class A{
    String meth(){
        return " method from class A";
    }
}
class B extends A{
    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}

public class Main {
    public static void main(String[]args) {
        B obj = new B();
        obj.meth();
        obj.meth();
    }
  
}