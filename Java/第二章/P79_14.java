package AlgorithmHomework.Chapter02;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：输出不带头结点单链表中的指定值的第一次出现位置
 * 思路：使用内置的LinkedList链表进行递归操作 递归出口：链表为空 递归体：更新递归并进行比较
 */
public class P79_14 {
    static LinkedList<Integer> lin = new LinkedList<>();
    static int f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入链表中元素的个数（int范围内）：");
        int n =sc.nextInt();
        sc.nextLine();
        System.out.println("请输入链表中的元素：");
        String s[] = sc.nextLine().split(" ");
        System.out.println("请输入要查找的元素：");
        f =sc.nextInt();
        for(int i =0;i<n;i++) lin.add(Integer.parseInt(s[i]));
        System.out.println(DiGui(1));




    }
    static String DiGui(int i){
        if(lin.isEmpty()) return "NULL";
        else {
            int m =lin.pollFirst();
            if( m==f) return String.valueOf(i);
            return DiGui(i+1);
        }

    }
}
