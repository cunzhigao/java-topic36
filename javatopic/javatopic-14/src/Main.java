import java.util.Arrays;

/*

Java - 运算顺序
1. 大体遵循遵循从左向右的运算法则
2.

 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {


//      System.out.println("Hello World!");
        int a[] = new int[] {
                0, 0, 0, 0, 0
        };
        int i = 1;
        a[++i] = i++;
        System.out.println("i=" + i);
        System.out.println(Arrays.toString(a));
        /*
        i=3
        [0, 0, 2, 0, 0]
        赋值运算符的结合是从右向左 "=", 而操作数的确定是在从左向右确定的"++i", 操作数的确定在赋值运算之前, 此时a[j]变成a[2].
        进行赋值运算 a[2] = 2,在进行i++;
         */
        int j = 3;
        a[j] = j = 4;
        System.out.println("j=" + j);
        System.out.println(Arrays.toString(a));
        /*
        j=4
        [0, 0, 2, 4, 0]
        先确定左侧操作数即a[j] = a[3], 此时变成a[3] = j = 4;

         */
        int b [] = new int [] {
                9, 9, 9, 9, 9, 9
        };
        int k = 5;
        int c[] = a;
        a[--k] = (a=b)[k];
        System.out.println("k=" + k);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        /*
        k=4
        [9, 9, 9, 9, 9, 9]
        [9, 9, 9, 9, 9, 9]
        [0, 0, 2, 4, 9]
        --k;
        int[] temp = a;
        a = b;
        temp [4] = b[4]; 不太明白？
        a在堆中创建了一个数组, c建立了一个指向这个数组的地址, a = b只是将首地址变成了b, 与c没有关系。

        按照逻辑, a[4] = 9, 此时a的初始地址还没有进行改变，这里是进行地址引用,
         */


    }
}
