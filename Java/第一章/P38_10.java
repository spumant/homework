package AlgorithmHomework.Chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：求两个整数序列的公共元素
 * 思路：排序之后进行寻找就行
 */
public class P38_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();

        System.out.println("请输入第一列元素：");
        String s[] = sc.nextLine().split(" ");
        System.out.println("请输入第二列元素：");
        String s2[] = sc.nextLine().split(" ");
        for(int i =0;i<s.length;i++)
            a.add(Integer.parseInt(s[i]));
        for(int i =0;i<s2.length;i++)
            b.add(Integer.parseInt(s2[i]));
        Collections.sort(a);
        Collections.sort(b);
        int i =0,j =0;
        while (i<a.size()&&j<b.size()){
            if(a.get(i)<b.get(j))
                i++;
            else if(a.get(i)>b.get(j))
                j++;
            else if(a.get(i)==b.get(j)){
                c.add(a.get(i));
                i++;
                j++;
            }
        }
        System.out.println(c.toString());
    }
}
