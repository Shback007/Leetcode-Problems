class Solution {
public:
    string getPermutation(int n, int k) {

        set<int> nums;
        vector<int> factorial(n+1, 1);

        for (int i = 1; i <= n; i++) {
            nums.insert(i);
            factorial[i] = i*factorial[i-1];
        }

        --k;

        string perm;
        for (int i=n; i >= 1; i--) {
            int index = k/factorial[i-1];
            k%= factorial[i-1];
            auto it=nums.begin();
            advance(it, index);
            perm+= to_string(*it);
            nums.erase(it);
        }
        return perm;
    }
};
