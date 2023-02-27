package AlgorithmHomework.Chapter02;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：输出不带头结点单链表中的最大值
 * 思路：使用内置的LinkedList链表进行递归操作 递归出口：链表为空 递归体：使用静态变量max记录每次递归的最大值
 *
 */
public class P79_13 {
    static LinkedList<Integer> lin;
    static int max =Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lin = new LinkedList<>();
        System.out.println("请输入链表中的元素个数(int范围内)：");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("请依次输入元素值：");
        String s[] = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) lin.addLast(Integer.parseInt(s[i]));
        System.out.println(DiDui(lin));
    }
    static  int DiDui(LinkedList<Integer> lin){
        if(lin.isEmpty()) return max;
        else {
            int t =lin.poll();
            max = Math.max(t,max);
            return DiDui(lin);
        }

    }
}
