/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {

        TreeNode current = root;

        while (current != null) {

            // No left subtree
            if (current.left == null) {

                process(current);

                current = current.right;
            }

            // Has left subtree
            else {

                TreeNode predecessor = current.left;

                // Find inorder predecessor
                while (predecessor.right != null
                        && predecessor.right != current) {

                    predecessor = predecessor.right;
                }

                // Create temporary link
                if (predecessor.right == null) {

                    predecessor.right = current;
                    current = current.left;

                } else {

                    // Remove temporary link
                    predecessor.right = null;

                    process(current);

                    current = current.right;
                }
            }
        }

        // Swap the incorrect values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void process(TreeNode current) {

        if (prev != null && prev.val > current.val) {

            if (first == null) {
                first = prev;
            }

            second = current;
        }

        prev = current;
    }
}