package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + s2);
        /*
         *"+"在进行连接时，Java通过创建stringbuilder类，使用它的append方法，将字符串连接起来的，在通过调用tostring方法，
         * 将自己所需要的字符串变成string类型
         *
         */

        int i = 3;
        int[] array = new int[1];
        Boy[] boy = new Boy[1];
        boy[0] = new Boy();
        String s3 = "-string";
        System.out.println(i + s3);
        System.out.println(array + s3);
        System.out.println(boy + s3);
        System.out.println(boy[0] + s3);
        System.out.println(s1 + s2 + s3);

        /*
        *在使用 + 进行连接时，如果需要连接的字符串过多，可以通过调用stringbuilder的方法进行使用，效率会大大提高
         */
        String s ="";
        long start;
        long end;
        long time;
        start = System.nanoTime();
        for(int j = 0; j < 10000; j++){
            s += 'a';
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println("+ 连接字符串的时间： " + time);
        StringBuilder sb = new StringBuilder(10000);
        start = System.nanoTime();
        for(int j = 0; j < 10000; j++){
            sb.append("a");

        }
        s = sb.toString();
        end = System.nanoTime();
        time = end - start;
        System.out.println("StringBuilder 连接字符串的时间：" + time);

    }
}
