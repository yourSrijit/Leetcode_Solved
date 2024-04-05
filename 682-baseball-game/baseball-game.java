class Solution {
    public int calPoints(String[] str) {
        int n = str.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (str[i].charAt(0) == '+') {
                ans.add(ans.get(ans.size() - 1) + ans.get(ans.size() - 2));
            } else if (str[i].charAt(0) == 'D') {
                ans.add(ans.get(ans.size() - 1) * 2);
            } else if (str[i].charAt(0) == 'C') {
                ans.remove(ans.size() - 1);
            } else {
                ans.add(Integer.parseInt(str[i]));
            }
        }
        int sum = 0;
        for (int num : ans) {
            sum += num;
        }
        return sum;
    }
}
