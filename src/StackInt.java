class StackInt implements Stack{
    private Node head;

    public StackInt(){
        this.head = null;
    }

    public Integer peekLast(){
        if (this.head == null) return null;
        else return this.head.data;
    }

    public Integer pop(){
        if (this.head == null) return null;
        else {
            Node temp = this.head;
            this.head = this.head.next;
            return temp.data;
        }
    }

    public void push(int num){
        Node temp = this.head;
        this.head = new Node(num);
        this.head.next = temp;
    }
}
