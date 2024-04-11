class QueueInt implements Queue{
    private Node head;
    private Node tail;

    public QueueInt(){
        this.head = null;
        this.tail = null;
    }

    public Integer peekFirst(){
        if (this.head == null) return null;
        else return this.head.data;
    }

    public Integer poll(){
        if (this.head == null) return null;
        else {
            Node temp = this.head;
            this.head = this.head.next;
            if (this.head.next == null) this.tail = this.head;
            return temp.data;
        }
    }

    public void push(int num){
        if (this.head == null){
            this.head = new Node(num);
            this.tail = this.head;
        } else {
            this.tail.next = new Node(num);
            this.tail = this.tail.next;
        }
    }
}
