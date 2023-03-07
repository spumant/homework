package AlgorithmHomework.Chapter03;


/**
 * @author 冀玉博
 * @version 1.0
 * 题目：求出一个二叉链表数的高度
 *思路：自己手写二叉树，写出相关操作（虽然我也不咋会）
 */
public class P116_12 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode().createTree();//创建二叉树
        System.out.println(root.getHeight(root));

    }

}
//树的基本定义
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    //创建一个二叉树
    public TreeNode createTree(){

        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D= new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        return A;
    }
    int getHeight(TreeNode root){
        if(root == null){
            return  0;
        }
        int leftTree = getHeight(root.left);
        int rightTree = getHeight(root.right);
        return ((leftTree > rightTree) ? leftTree + 1 : rightTree + 1);
    }


}

