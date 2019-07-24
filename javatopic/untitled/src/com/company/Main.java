package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);
        Value v = new Value(x,y);
        swap(v);
        System.out.println(v.x);
        System.out.println(v.y);
    }
    /*
    有效的交换（通过引用的方式可以对x，y的值进行交换）
     */

    /*
    通过引入第三个变量的方法进行交换
     */
    private static void swap(Value value) {
        int temp = value.x;
        value.x = value.y;
        value.y = temp;
    }

    /*
    通过数学计算的方式，看看也就明白了
     */
    private static void swap1(Value v){
        v.x = v.x + v.y;
        v.y = v.x - v.y;
        v.x = v.x - v.y;
    }

    /*
    通过异或的方式（x^y^y） = x;
    */
    private static void swap2(Value v){
        v.x = v.x ^ v.y;
        v.y = v.x ^ v.y;
        v.x = v.x ^ v.y;
    }

    /*
    无效的交换（形参的改变无法作用于实参）
     */
    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

    }

    static class Value{
        int x;
        int y;

        public Value(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
