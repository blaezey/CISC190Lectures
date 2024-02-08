package edu.sdccd.cisc190;

public class Main {
    public static void main(String[] args){
        int declarationTest;

        int integerDemo = 1;
        System.out.println(integerDemo);
        integerDemo++;
        System.out.println(integerDemo);

        long longDemo = 999999999L;
        System.out.println(longDemo);
        System.out.println(longDemo + 200);
        System.out.println(longDemo - 200);
        System.out.println(longDemo / 5);
        System.out.println(longDemo * 25);

        float floatDemo = 1.5F;
        System.out.println(floatDemo);
        double doubleDemo = 1.5;
        System.out.println(doubleDemo);

        System.out.println(integerDemo * integerDemo);
        System.out.println(integerDemo * doubleDemo);
        System.out.println(integerDemo * floatDemo);

        System.out.println(integerDemo % 25);

        String hello = "hello";
        String world = "world";
        System.out.println(hello);
        System.out.println(hello + ' ' + world);
    }
}
