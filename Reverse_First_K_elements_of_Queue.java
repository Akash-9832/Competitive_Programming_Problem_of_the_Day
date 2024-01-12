class Reverse_First_K_elements_of_Queue{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> temp=new Stack<>();
        for(int i=0;i<k;i++){
            temp.add(q.poll());
        }
        for(int i=0;i<k;i++){
            q.add(temp.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        return q;
    }
}
