import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Louie Liu
 * Time: 2023/12/6 2:02
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution_6 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderTraversal(root, result, 0);
        return result;
    }

    void levelOrderTraversal(TreeNode node, List<List<Integer>> result, int level) {
        if (node == null) {
            return;
        }

        // 当前层级超出结果列表长度时，添加新列表用于存储当前层节点值
        if (level >= result.size()) {
            result.add(new ArrayList<>());
        }

        //将当前node值添加到对应层级列表中
        result.get(level).add(node.val);

        //遍历左子树，再右
        levelOrderTraversal(node.left, result, level + 1);
        levelOrderTraversal(node.right, result, level + 1);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        Solution_6 Solution = new Solution_6();
        List<List<Integer>> traversalResult = Solution.levelOrder(root);

        for (List<Integer> level : traversalResult) {
            System.out.println(level);
        }
    }
}
