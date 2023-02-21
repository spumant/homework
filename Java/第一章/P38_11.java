package AlgorithmHomework.Chapter01;

import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：分解质因数，输出一个数的质因数和出现的次数
 * 思路：数论，直接分解即可
 */
public class P38_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int  t =0;
        for(int i =2;i<=n/i;i++){
            t=0;
            if(n%i==0){
                while (n%i==0){
                    n /=i;
                    t++;
                }
                System.out.println(i + ":" + t);
            }
        }
        if(n>1){
            System.out.println(n + ":" + 1);
        }
    }
}
