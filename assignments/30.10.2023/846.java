class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : hand){
            pq.add(n);
        } while(!pq.isEmpty()){
            int head = pq.poll();
            for(int i = 1 ; i<groupSize ; i++){
                if(!pq.remove(head+i)) return false;
            }
           
        }
        if(hand.length % groupSize != 0){
            return false;
        }    
        return true;
    }
}