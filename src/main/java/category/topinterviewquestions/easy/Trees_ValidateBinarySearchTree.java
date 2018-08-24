package category.topinterviewquestions.easy;

import java.util.Stack;
import java.util.stream.IntStream;

import category.topinterviewquestions.TreeNode;

public class Trees_ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode node = TreeNode.of(5
                , TreeNode.of(1, null, null)
                , TreeNode.of(9, TreeNode.of(6, null, null), TreeNode.of(12, null, null)));

        System.out.println(isValidBST1(node));
//        testStack();


    }

    public static boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                System.out.println("statck.push: "+root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println("stack.pop: "+root);

            if (pre != null) System.out.println("root.val: "+root.val+", pre.val: "+pre.val);

            if (pre != null && root.val <= pre.val) {
                return false;
            }
            pre = root;
            root = root.right;
            if (root == null) {
                System.out.println("root is null");
            } else {
                System.out.println("root: "+root);
            }
        }
        return true;
    }

    public static void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        IntStream.range(0, stack.size())
                .forEach(i -> System.out.println(stack.pop()));
    }

}
