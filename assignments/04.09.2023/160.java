class S160 {
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != pointerB) {
            pointerA = pointerA == null ? headB : pointerA.next;
            pointerB = pointerB == null ? headA : pointerB.next;
        }
        return pointerA;
    }
}
