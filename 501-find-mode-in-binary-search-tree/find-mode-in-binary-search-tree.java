class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int maxFrequency = 0;

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);

        int val = root.val;
        map.put(val, map.getOrDefault(val, 0) + 1);
        maxFrequency = Math.max(maxFrequency, map.get(val));

        inOrder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inOrder(root);

        ArrayList<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;
    }
}
