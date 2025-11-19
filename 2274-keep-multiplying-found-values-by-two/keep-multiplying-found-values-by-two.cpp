class Solution {
public:
    int findFinalValue(vector<int>& nums, int ori) {
         unordered_set<int>st(nums.begin(), nums.end());

        while(st.find(ori) != st.end()) ori = ori*2;

        return ori;
    }
};