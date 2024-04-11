interface Deque extends Stack, Queue{
    public abstract Integer peekFirst();
    public abstract Integer peekLast();
    public abstract Integer poll();
    public abstract Integer pop();
    public abstract void addFirst(int num);
    public abstract void push(int num);
}