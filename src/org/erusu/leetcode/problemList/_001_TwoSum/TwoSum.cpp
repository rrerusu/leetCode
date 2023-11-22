#include <map>
#include <vector>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::map<int, int> * numLocations = new std::map<int, int>();
        for(int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            if(numLocations->find(complement) != numLocations->end())
                return {numLocations->at(complement), i};
            numLocations->insert(std::pair<int, int>(nums[i], i));
        }
        return {};
    }
};