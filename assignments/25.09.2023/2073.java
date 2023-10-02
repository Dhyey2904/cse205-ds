import java.util.*;

class Solution {
  public int timeRequiredToBuy(int[] tickets, int k) {
    Queue<Integer> q = new LinkedList<>();
    int ans = 0;
    for(int i=0;i<tickets.length;i++)
    {
      q.add(i);
    }
    while(!q.isEmpty())
    {
      int j = q.poll();
      tickets[j]--;
      ans++;
      if(tickets[j]==0 && j==k)
      {
        return ans;
      }
      if(tickets[j]>0)
      {
        q.add(j);
      }
    }
    return ans;

    //     int ans=0;
    //     while(tickets[k]!=0){
    //        for(int i=0;i<tickets.length;i++){
    //            if(tickets[i]>0){
    //                tickets[i]=tickets[i]-1;
    //                ans++;
    //            }if(tickets[k]==0){
    //                break;
    //            }
    //        }
    //    }
    //    return ans;
    // }
  }
}
