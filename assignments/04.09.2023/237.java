class S237 {
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void deleteNode(ListNode node) {
        ListNode start = node.next;
        
        node.val = start.val;
        
        node.next = start.next;
        start.next = null;
    }
}
