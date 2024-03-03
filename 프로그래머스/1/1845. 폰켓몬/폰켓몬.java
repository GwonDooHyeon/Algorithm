import java.util.*;
class Solution {
    public int solution(int[] nums) {
        // 중복을 제거한 Set의 크기가 max보다 크면 max를, 작으면 Set 사이즈를 리턴한다.
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() < max) {
            max = set.size();
        }
        
        return max;
    }
}