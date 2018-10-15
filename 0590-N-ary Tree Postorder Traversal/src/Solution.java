import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    private void postorder(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        for (Node child : node.children) {
            postorder(child, list);
        }
        list.add(node.val);
    }
}
