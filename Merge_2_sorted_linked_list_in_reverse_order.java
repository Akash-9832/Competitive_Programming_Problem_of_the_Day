class Merge_2_sorted_linked_list_in_reverse_order
{
    Node mergeResult(Node node1, Node node2){
        Node n1 = reverse(node1);
        Node n2 = reverse(node2);
        
        return mergeRecur(n1,n2);
        
    }
    Node mergeRecur(Node A, Node B){
 
        if (A == null) return B;
        if (B == null) return A;
 
        if (A.data > B.data) {
            A.next = mergeRecur(A.next, B);
            return A;
        }
        else {
            B.next = mergeRecur(A, B.next);
            return B;
        }
    }
    
    Node reverse(Node node){
        Node prv = null;
        Node cur = node;
        
        while(cur!=null){
            Node next = cur.next;
            cur.next = prv;
            prv = cur;
            cur = next;
        }
        return prv;
    }
