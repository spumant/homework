package AlgorithmHomework.Chapter03;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：使用分治发法出一个序列中的最大和最小值
 * 思路：一直递归知道只有一个元素的时候进行比较
 */
public class P116_10 {
    static int max=Integer.MIN_VALUE,min = Integer.MAX_VALUE;
    static int a[] ={1,5,6,3,9};
    public static void main(String[] args) {
        find(0,a.length-1);
        System.out.println(min+" " + max);

    }
    static void find(int low,int high){
        if(low ==high){
            min = Math.min(a[low],min);
            max = Math.max(a[low],max);
        }

        else {
            int mid = (low+high)/2;
            find(low,mid);
            find(mid+1,high);

        }
    }
}
