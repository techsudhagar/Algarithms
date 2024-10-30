import java.util.*;

class RemoveNthNode {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
         LinkedListNode left = head;
         LinkedListNode right = head;
        
        int i=0;
        while(i < n ) {
          right = right.next;
          i++;
        }
        
        if (right == null){
          return head.next;
        }
        
        
          while(right.next != null) {
            right = right.next;
            left = left.next;
          }
        
         left.next = left.next.next;
        
        return head;
    }
}