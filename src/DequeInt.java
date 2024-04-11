class DequeInt implements Stack, Queue{
    private Node head;
    private Node tail;

    public DequeInt(){
        this.head = null;
        this.tail = null;
    }

    public Integer peekFirst(){
        if (this.head == null) return null;
        else return this.head.data;
    }

    public Integer peekLast(){
        if (this.tail == null) return this.head.data;
        else return this.tail.data; 
    }

    public Integer poll(){
        if (this.head == null) return null;
        else {
            Node temp = this.head;
            this.head = this.head.next;
            if (this.head == null) this.tail = null;
            else this.head.prev = null;
            return temp.data;
        }
    }

    public Integer pop(){
        if (this.tail == null) return null;
        else {
            Node temp = this.tail; 
            this.tail = this.tail.prev;
            if (this.tail == null) this.head = null;
            else this.tail.next = null;
            return temp.data;
        }
    }

    public void addFirst(int num){
        if (this.head == null){
            this.head = new Node(num);
            this.tail = this.head;
        } else {
            Node temp = this.head;
            this.head = new Node(num);
            this.head.next = temp;
            temp.prev = this.head;
        }
    }

    public void push(int num){
        if (this.tail == null){
            this.tail = new Node(num);
            this.head = this.tail;
        } else {
            this.tail.next = new Node(num);
            this.tail.next.prev = this.tail;
            this.tail = this.tail.next;
        }
    }
}