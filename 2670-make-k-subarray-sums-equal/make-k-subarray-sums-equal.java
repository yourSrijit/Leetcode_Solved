class Solution {
   public long makeSubKSumEqual(int[] arr, int k) {
    long res = 0;
    for (int i = 0; i < k; ++i) {
        List<Integer> cycle = new ArrayList<>();
        for (int j = i; arr[j] != 0; j = (j + k) % arr.length) {
            cycle.add(arr[j]);
            arr[j] = 0;
        }
        Collections.sort(cycle);
        for (int n : cycle)
            res += Math.abs(n - cycle.get(cycle.size() / 2));
    }
    return res;
}
}