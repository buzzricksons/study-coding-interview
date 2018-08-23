package category.topinterviewquestions.easy;

public class Trees_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public int maxDepthByAnswer(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = root.left == null ? 0 : maxDepthByAnswer(root.left);
        int rightMax = root.right == null ? 0 : maxDepthByAnswer(root.right);
        return 1 + Math.max(leftMax, rightMax);
    }


    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }
}