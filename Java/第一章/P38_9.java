package AlgorithmHomework.Chapter01;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：判断一个序列中是否刚好存在两个元素之和是k
 *思路：使用hashmap记录当前值应该对应的值，然后去遍历hashmap寻找即可
 */
public class P38_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入序列个数：");
        int n =sc.nextInt();
        System.out.println("请输入K值：");
        int k =sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        System.out.println("请输入序列：");
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            int value = k -key;
            hm.put(key,value);
            Integer orDefault = hm.getOrDefault(value, Integer.MIN_VALUE);
            if(orDefault !=Integer.MIN_VALUE){
                System.out.println("存在");
                return;
            }

        }
        System.out.println("不存在");

    }
}
