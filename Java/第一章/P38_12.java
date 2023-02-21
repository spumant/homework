package AlgorithmHomework.Chapter01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：给定一个整数序列，输出最小差值的数对
 * 思路：排序之后比较相邻的元素就可以
 */
public class P38_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int n =s.length;
        int v[] = new int[n];
        for(int i =0;i<n;i++)
            v[i] =Integer.parseInt(s[i]);
        Arrays.sort(v);
        int min =v[1]-v[0];
        int ans =1;//记录最小差的对数
        for(int i =2;i<n;i++){
            if(v[i]-v[i-1]<min){
                ans =1;
                min = v[i]-v[i-1];
            }
            else if(v[i]-v[i-1]==min){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
