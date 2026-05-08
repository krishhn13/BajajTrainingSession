class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : nums2) {
            set2.add(i);
        }
        for(int i : set) {
            if(set2.contains(i)) {
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        int idx = 0;
        for(int i : list) {
            ans[idx] = i;
            idx++;
        }
        return ans;
    }
}