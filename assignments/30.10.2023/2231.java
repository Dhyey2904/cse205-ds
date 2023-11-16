class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<Integer>();
        PriorityQueue<Integer> odd = new PriorityQueue<Integer>();

        int temp = num;
        
        while(num > 0)
        {
            int d = num % 10;
            if(d % 2 == 0)
                even.add(d);
            else
                odd.add(d);
            num /= 10;
        }

        int ans = 0;
        int cnt = 0;

        while(temp > 0)
        {
            int d = temp%10;
            if(d % 2 == 0)
                ans += (even.poll())*Math.pow(10,cnt);
            else
                ans += (odd.poll())*Math.pow(10,cnt);
            temp /= 10;
            cnt++;
        }

        return ans;
    }
}
