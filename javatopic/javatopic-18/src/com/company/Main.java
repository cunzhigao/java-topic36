package com.company;

/*
 *String 对象
 *  1. 不可以修改  2. final类型, 无法继承  3. 所有成员对象都是private的, 并且没有提供可以修改变量的public方法
 *  3. 所有对于String对象的操作, 并没有修改该对象, 而是新建了一个。
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        System.out.println(s1);
        s1 = s2;
        /*
         * 这一步并没有对s1所指的对象A进行修改, 而是想s1对A的引用变成了对B的引用
         *
         */
        System.out.println(s1);

        s1 = s2 + s3;
        /*
         * 还记得上次写的StringBuilder类吗，这里就用到了，
         * 这时 这个会新建一个临时对象, 用来连接s2和s3所指的对象, 并使用toString方法，将这个String类型的变量对象的引用赋值给s1，
         * 此时s1会指向这个这个新的对象。
         *
         */

        System.out.println(s1);

    }
}
