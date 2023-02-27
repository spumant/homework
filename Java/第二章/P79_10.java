package AlgorithmHomework.Chapter02;

import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：使用递归算法判断字符串是否回文
 * 思路：设置两个指针从字符串的最前方和最后方同时移动比较。
 * 递归出口：当两个字符不同或者遍历过了一遍（start >= end），递归体：更新指针的位置
 */
public class P79_10 {
    static  String Str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Str = sc.next();
        System.out.println(Hui(0,Str.length()-1));


    }
    static boolean Hui(int start,int end){
        if(Str.charAt(start) !=Str.charAt(end)) return false;
        else if(start>=end) return  true;
        else  return Hui(++start, --end);
    }
}
