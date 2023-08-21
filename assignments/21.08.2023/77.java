import java.util.*;

class S77 {
  List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        getCombinations(n, k , 1 , ans);
        return result;
    }

    public void getCombinations(int n, int k, int start , List<Integer> ans){
        
        // if(start == n + 1) {
        //     if(ans.size() == k){
        //         result.add(new ArrayList<>(ans));
        //     }
        //     return;
        // }
        
        // ans.add(start);
        // getCombinations(n , k , start+1 , ans);

        // ans.remove(ans.size() - 1);
        // getCombinations(n , k , start+1 , ans);

        if (k == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for (int i = start; i <= n; i++) {
            ans.add(i);
            getCombinations(n, k - 1, i + 1, ans);
            ans.remove(ans.size() - 1);
        }
    }
}
