public class Merge_Two_Binary_Trees {
    public static void main(String[] args){
        TreeNode t1=Ltree.mkTree("[1,3,2,5]");
        TreeNode t2=Ltree.mkTree("[2,1,3,null,4,null,7]");
        TreeNode res=mergeTrees(t1,t2);

        System.out.print(Ltree.printtree(t2));
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode res=t1;
        if (t1 != null && t2 != null) {
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            t1.val += t2.val;
            return t1;
        }
        return t1 == null ? t2 : res;
    }
}
