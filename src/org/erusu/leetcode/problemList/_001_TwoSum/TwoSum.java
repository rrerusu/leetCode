package org.erusu.leetcode.problemList._001_TwoSum;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numLocation = new HashMap<Integer, Integer>();

        for(int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int complement = target - nums[currentIndex];
            if(!numLocation.containsKey(complement))
                numLocation.put(nums[currentIndex], currentIndex);
            else
                return new int[]{(int) numLocation.get(complement), currentIndex};
        }

        return new int[]{};
    }
}