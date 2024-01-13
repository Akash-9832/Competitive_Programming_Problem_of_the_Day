class Insertion_Sort_for_Singly_Linked_List
{
    public static Node insertionSort(Node head){
        if(head == null || head.next == null)return head;
        Node t = head;
        Node cur = head.next;
        while(cur != null)
        {
            while(cur != t)
            {
                if(t.data > cur.data)
                {
                    int rahee = t.data;
                    t.data = cur.data;
                    cur.data = rahee;
                }
                t = t.next;
            }
            t = head;
            cur = cur.next;
        }
        return t;
    }
}
