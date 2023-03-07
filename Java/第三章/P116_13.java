package AlgorithmHomework.Chapter03;

/**
 * @author 冀玉博
 * @version 1.0
 */
public class P116_13 {
    public static void main(String[] args) {
        TreeNode2 tree = new TreeNode2().createTree();
        System.out.println(tree.du(tree));
    }
}
//树的基本定义
class TreeNode2{
    public int val;
    public TreeNode2 left;
    public TreeNode2 right;

    public TreeNode2() {
    }

    public TreeNode2(int val) {
        this.val = val;
    }

    //创建一个二叉树
    public TreeNode2 createTree() {

        TreeNode2 A = new TreeNode2(1);
        TreeNode2 B = new TreeNode2(2);
        TreeNode2 C = new TreeNode2(3);
        TreeNode2 D = new TreeNode2(4);
        TreeNode2 E = new TreeNode2(5);
        TreeNode2 F = new TreeNode2(6);
        TreeNode2 G = new TreeNode2(7);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        return A;
    }
    int du(TreeNode2 t){
        int n =0;
        if(t==null) return 0;
        if(t.left!=null&&t.right!=null)
            n =1;
        return du(t.left)+du(t.right)+n;
    }
}
