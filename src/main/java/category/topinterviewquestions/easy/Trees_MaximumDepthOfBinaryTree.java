package category.topinterviewquestions.easy;

import category.topinterviewquestions.TreeNode;

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
}
