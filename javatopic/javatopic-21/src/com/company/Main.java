package com.company;

/*
 * 1. equals 和 == 的区别
 *
 * equals 方法是在object中声明的, 在 object 中
 * public boolean equals（object obj）{
 *      return (this == obj)
 *  }
 *  此时你会发现 equals 也是使用 == 来进行判断的, 所以它的区别在
 *
 *            在String类中，equals 方法是进行了复写，
 *
 *  所以才可以去比较里面的内容是否一致
 *
 * 2. equals 的 Override           eg: x != null
 *
 * x.equals(x) = true;
 *
 * if x.equals(y) = true ,    y.equals(x) = true;
 *
 * if x.equals(y) = true  y.equals(z) = true ,  x.equals(z) = true;
 *
 * 假设对象上equals比较中的信息没有被修改，则多次调用x.equals(y) 始终返回true或者false
 *
 * x.equals(null) = false
 *
 *
 *
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
            box1 和 box2 均为 batch 为 1 的box对象
            == 表示比较的是地址，
            而两个false也表明，equals 在没有经过复写的情况下，是一致的。

         */
        Box box1 = new Box(1);
        Box box2 = new Box(1);
        System.out.println(box1.equals(box2));
        System.out.println(box1 == box2);
        System.out.println();
        /*
            以String举例

         */
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        StringBuilder builder1 = new StringBuilder("ABC");
        StringBuilder builder2 = new StringBuilder("ABC");
        StringBuffer buffer1 = new StringBuffer("ABC");
        StringBuffer buffer2 = new StringBuffer("ABC");

        System.out.println(s1.equals(s2));
        System.out.println(buffer1.equals(builder2));
        System.out.println(buffer1.equals(buffer2));

        /*
            equals 的五个性质
         */
        Box box3 = new Box(1);
        System.out.println("自反性: "+ box1.equals(box1));
        System.out.println("对称性: " + box1.equals(box2)+"  "+box2.equals(box1));
        System.out.println("传递性: " + box1.equals(box2) + "  "+ box2.equals(box3)+"   "+ box3.equals(box1));
        System.out.print("一致性: ");
        for(int i = 1; i < 100; i++){
            if(box1.equals(box2) != box2.equals(box1)){
                System.out.println("equals 没有遵守一致性");
                break;
            }
        }
        System.out.println("equals 遵守一致性");
        System.out.println("null: " + box1.equals(null));

    }

}
