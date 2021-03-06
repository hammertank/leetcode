
public class Solution {
	public int trap(int[] height) {
		int left = 0, right = height.length - 1;
		int leftMax = 0, rightMax = 0;
		int res = 0;
		while (left <= right) {
			if (height[left] <= height[right]) {
				if (height[left] > leftMax) {
					leftMax = height[left];
				} else {
					res += leftMax - height[left];
				}

				left++;
			} else {
				if (height[right] > rightMax) {
					rightMax = height[right];
				} else {
					res += rightMax - height[right];
				}
				right--;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(new Solution().trap(height));
	}
}
