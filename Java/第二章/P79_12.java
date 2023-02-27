package AlgorithmHomework.Chapter02;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：输出不带头结点的单链表逆序所有节点值
 * 思路：使用内置的LinkedList链表进行递归操作 递归出口：链表为空 递归体：操作更新链表（递归输出尾节点）
 */
public class P79_12 {
    static LinkedList<String> lin;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lin = new LinkedList<>();
        System.out.println("请输入链表中的元素个数(int范围内)：");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("请依次输入元素值：");
        String s[] =sc.nextLine().split(" ");
        for(int i =0;i<n;i++)  lin.addLast(s[i]);
        System.out.println("逆序的数据元素是：");
        System.out.print("[");
        DiGui(lin);
        System.out.println("]");

    }
    static void  DiGui(LinkedList<String> lin){
        if(lin.isEmpty()) return;
        else {
            System.out.print(lin.pollLast() + " ");
            DiGui(lin);
        }
    }
}
