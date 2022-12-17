public class LinkedLists {
    private int flag = 0;
    private int itemIndex = -1;
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
    }
    private boolean isEmpty(){
        return first == null;
    }

    public void indexOf(int item){
        int index = 0;
        var current = first;
        while(current!= null){
            if (current.value==item) {
                System.out.println(index);
                flag = 1;
                itemIndex = index;
            }
            current = current.next;
            ++index;
        }
        if (flag==0) System.out.println(-1);

        //System.out.println(-1);
    }
    /* public boolean contains(int item){
        indexOf(item);
    }*/
}
