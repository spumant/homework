package AlgorithmHomework.Chapter02;


import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：使用递归算法去计算字符串Str的长度
 * 思路：递归出口：字符串为长度0，递归体：不断更新字符串
 */
public class P79_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        System.out.println(DiGui(s));
    }
    static int DiGui(StringBuilder t){
        if(t.isEmpty()) return 0;
        else {
            t.delete(0,1);
            return DiGui(t)+1;
        }
    }
}
