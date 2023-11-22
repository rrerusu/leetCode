class Solution(object):
    def twoSum(self, nums, target):
        numLocations = {};
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in numLocations:
                return [numLocations[complement], i]
            else:
                numLocations[nums[i]] = i;
        return []