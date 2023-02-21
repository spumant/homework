package AlgorithmHomework.Chapter01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：判断 在一个含有2个以上整数的数组中 判断是否存在出现次数超过所有元素一半的元素
 * 思路：使用java中hashmap去记录每一次输入（key对应输入的值，value对应出现的次数），最后遍历hashmap找出每个元素出现的次数即可
 */
public class P38_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n;
        do{
            System.out.println("请输入2以上的数字：");
            n =sc.nextInt();
        }while (n<=2);
        for(int  i = 0;i<n;i++){
            int m =sc.nextInt();
            int qu = hm.getOrDefault(m,0);
            if(qu==0)  hm.put(m,1);
            else  hm.put(m,++qu);
        }
        int ban = n/2;
        Set<Integer> integers = hm.keySet();
        for(Integer t:integers){
            if(hm.get(t)>=ban){
                System.out.println("存在");
                return;
            }
        }
        System.out.println("不存在");
    }
}
