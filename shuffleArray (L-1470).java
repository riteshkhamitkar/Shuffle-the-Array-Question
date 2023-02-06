class Solution {
  public int[] shuffle(int[] nums, int n) {
    var ans = new int[2*n];
    var j = 0;

    for (var i=0; i<n; i++) {
      ans[j++] = nums[i];
      ans[j++] = nums[i+n];
    }
    return ans;
  }
}
