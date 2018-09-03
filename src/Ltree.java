import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class Ltree {
    public static void main(String[] args){
        String str="[3,4,5,5,4,null,7]";
        TreeNode test= mkTree(str);
        ArrayList<ArrayList<Integer>> res=printtree(test);
        System.out.print(res);
    }

    public static TreeNode mkTree(String str) {
        int []arr = StrToIntArray(str);
        TreeNode []nodes = new TreeNode[arr.length + 1];
        for (int i = 1; i < nodes.length; i++) {
            if (arr[i - 1] != Integer.MAX_VALUE) {
                nodes[i] = new TreeNode(arr[i - 1]);
            }else {
                nodes[i] = null;
            }
        }
        TreeNode node = null;
        for (int i = 1; i < nodes.length / 2; i++) {
            node = nodes[i];
            if (node == null) continue;
            node.left = nodes[2 * i];
            node.right = nodes[2 * i + 1];
        }
        return nodes[1];
    }

    private static int[] StrToIntArray(String str) {
        str = str.substring(1, str.length() - 1);
        String []strs = str.split(",");
        int []arr = new int[strs.length];
        for (int i = 0; i < arr.length; i++) {
            if (strs[i].equals("null")) {
                arr[i] = Integer.MAX_VALUE;
            } else {
                arr[i] = Integer.parseInt(strs[i]);
            }
        }
        return arr;
    }

    public static ArrayList<ArrayList<Integer>> printtree(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return list;
        int countLevel = 0;     // 二叉树的层数
        int countNodeToBePrinted = 1;   // 当前层尚未打印的节点数
        int countNodeNextLevel = 0;     // 下一层的节点数

        // 队列记录节点的左右子树节点
        // LinkedList实现了Queue和Stack接口
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(pRoot);
        while(!queue.isEmpty()) {
            // list的size小于层数，需要增加新的list，保存下一层
            if(list.size() <= countLevel)
                list.add(new ArrayList<Integer>());

            ArrayList<Integer> curList = list.get(countLevel);
            TreeNode pNode = queue.poll();
            curList.add(pNode.val);     // 相当于打印，则尚未打印的节点数减去1
            countNodeToBePrinted--;

            // 左右子节点不为空，则入队
            if(pNode.left != null) {
                queue.offer(pNode.left);
                countNodeNextLevel++;
            }
            if(pNode.right != null) {
                queue.offer(pNode.right);
                countNodeNextLevel++;
            }

            // 当前层全部打印完毕，转到下一层，更新变量
            if(countNodeToBePrinted == 0) {
                countLevel++;
                countNodeToBePrinted = countNodeNextLevel;
                countNodeNextLevel = 0;
            }
        }
        return list;
    }
}
