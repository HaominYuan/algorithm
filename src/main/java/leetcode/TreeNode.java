package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = this;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                result.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return result.toString();
    }
}
