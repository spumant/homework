package AlgorithmHomework.Chapter03;

import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：使用分治法去求解x^n
 *思路：直接递归去循环相乘就行
 */
public class P116_11 {
    static int x,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x和n的值（均是正数，注意不能太大，防止超出int）：");
        x =sc.nextInt();
        n =sc.nextInt();
        System.out.println(find(x,n));

    }

    static int find(int x,int n){
        if(n==0) return 1;
        return x*find(x,n-1);
    }
}
