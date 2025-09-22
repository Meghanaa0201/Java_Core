package org.tnsif.sf.interfacedemo;

class hello implements example {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}

public class demo_example {

    public static void main(String[] args) {

        example obj = new hello();

        System.out.println( obj.add(2, 3));
        System.out.println( obj.sub(3, 4));
        System.out.println(obj.mul(3, 2));
        System.out.println( obj.div(6, 3));
    }
}
