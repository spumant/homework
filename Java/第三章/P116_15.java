package AlgorithmHomework.Chapter03;

/**
 * @author 冀玉博
 * @version 1.0
 * 题目：一个序列是递增的并且数据都不相同，而且只会存在一个下标和元素值相同的元素，请你求出这个元素
 * 思路：根据题意，递增并且要求复杂度，可以看出来使用二分刚刚好
 */
public class P116_15 {
    public static void main(String[] args) {
        int a[] = {-2,-1,2,4,6,8,9};
        int l =0,r =a.length-1,mid=0;
        while (l<r){
            mid = (l+r)/2;
            if(a[mid]>mid)
                r=mid;
            else
                l =mid+1;
        }
        System.out.println(mid);
    }
}

