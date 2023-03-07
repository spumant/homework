package AlgorithmHomework.Chapter03;

/**
 * @author 冀玉博
 * @version 1.0
 */
public class P116_14 {
    public static void main(String[] args) {
        TreeNode3 tree = new TreeNode3().createTree();
        System.out.println(tree.find(tree,52));

    }

}
//树的基本定义
class TreeNode3{
    public int val;
    public TreeNode3 left;
    public TreeNode3 right;

    public TreeNode3() {
    }

    public TreeNode3(int val) {
        this.val = val;
    }

    //创建一个二叉树(满足条件)
    public TreeNode3 createTree() {

        TreeNode3 A = new TreeNode3(7);
        TreeNode3 B = new TreeNode3(5);
        TreeNode3 C = new TreeNode3(9);
        TreeNode3 D = new TreeNode3(4);
        TreeNode3 E = new TreeNode3(6);
        TreeNode3 F = new TreeNode3(8);
        TreeNode3 G = new TreeNode3(10);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        return A;
    }
    int find(TreeNode3 t,int x){
        if(t==null) return  -1;
        if(t.val<x) return find(t.right,x);
        else if(t.val>x) return find(t.left,x);
        else return t.val;
    }
}