class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n:stones){
            pq.add(n);//added all the elements in pq
        }
        while(pq.size() > 1){

            int a = pq.poll();//for excessing the element which will remove the element too
            int b = pq.poll();

            if(a==b) continue;
            else {
                pq.add(Math.abs(a-b));
            }
        }

        if(pq.size() == 0){
            return 0;
        } else {
            return pq.peek();
        }
    }
}