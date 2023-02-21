package AlgorithmHomework.Chapter01;

import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：判断一个字符串是否是回文串
 * 思路：直接首尾移动比较就行
 */
public class P38_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pre = 0,last = s.length()-1;
        while (pre<last){
            if(s.charAt(pre) !=s.charAt(last)){
                System.out.println("不是回文串");
                return;
            }
            else {
                pre++;
                last--;
            }

        }
        System.out.println("是回文串");
    }
}
