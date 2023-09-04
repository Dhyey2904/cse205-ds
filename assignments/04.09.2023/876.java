class S876 {
  public ListNode middleNode(ListNode head) {
        ListNode start = head, end = head;
        while(end!=null && end.next!=null){
            start = start.next;
            end = end.next.next;
        }
        return start;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
