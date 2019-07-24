package com.company;

import java.awt.*;

/*
    switch 类型整合  看介绍

    case 0-n
    default 0-1



 */
public class Main {

    enum Color {
        GREEN, RED, BLUE
    }

    public static void main(String[] args) {
	// write your code here
        byte b = 1;
        short s = 2;
        char c  = 'A';
        int i = 4;
        long lo = 5;
        Byte bBox = new Byte(b);
        Short sBox = new Short(s);
        Character cBox = new Character(c);
        Integer iBox = new Integer(i);
        String str = "Java";
        Color color = Color.GREEN;
        //Switch括号中的类型
        switch (b){};
        switch (s){};
        switch (c){};
        switch (i){};
        switch (bBox){};
        switch (sBox){};
        switch (cBox){};
        switch (iBox){};
        switch (color){};//枚举类型
        switch (str){};

        //switch (lo){};不允许为long类型


        /*
         *
         * 这里面的ibox为Integer类型, 本来是无法进行与int的比较, switch 将integer转化成为了int
         * 此时会进行switch(iBox.intValue())
         * Byte Short Character 一致
         *
         */

        switch (iBox){
            case 4:
                System.out.println("class : 4");
                break;

            case 10:
                System.out.println("class : 10");
                break;
        }

        /*
         *对枚举类型的处理
         * switch 将这个枚举类型变成一个虚拟类, 通过value方法, 生成一个含有数据类型的数组,
         * 这是也可以通过不同的数组下标进行访问
         * switch(SwitchEnum$1.$switchMap$chapter2$Color[color.ordinal()]){
         *  case 1:
         *      System.out.println("color:GREEN")
         *
         */

        switch (color){
            case GREEN :
                System.out.println("color : green");
                break;
            case RED :
                System.out.println("color : red");
                break;
            case BLUE :
                System.out.println("color : blue");
                break;
        }

        /*
         *对String类型数据处理，通过两个switch实现，第一个switch 根据对象的哈希码来对一个临时变量进行赋值，
         * 第二个根据该变量的值来匹配case 表达式的值
         *
         */



    }



}
