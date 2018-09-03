public class Leaf_Similar_Trees {
    public static void main(String[] args){
        TreeNode r1=Ltree.mkTree("[1,2,5,3,4]");
        TreeNode r2=Ltree.mkTree("[3,4,6,5,null]");
        System.out.print(leafSimilar(r1,r2));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null)
            return root2==null? true:false;
        String r1=getleaf(root1,"");
        String r2=getleaf(root2,"");
        return r1.equals(r2);
    }
    public static String getleaf(TreeNode t,String s){
        if(t.left==null&&t.right==null){
            return  String.valueOf(t.val);
        }
        if(t.left!=null)
            s+=getleaf(t.left,"");
        if(t.right!=null)
            s+=getleaf(t.right,"");
        System.out.print(t.val);
        return s;
    }
}
