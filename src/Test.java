class Test{
    public static void StackIntPrint(StackInt stack){
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop() == 2);
        System.out.println(stack.pop() == 1);
    }

    public static void QueueIntPrint(QueueInt queue){
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.poll() == 1);
        System.out.println(queue.poll() == 2);
        System.out.println(queue.peekFirst() == 3);
    }

    public static void DequeIntPrint(DequeInt deque){
        deque.addFirst(1);
        deque.push(2);
        deque.addFirst(3);
        deque.push(4);
        System.out.println(deque.pop() == 4);
        System.out.println(deque.poll() == 3);
        System.out.println(deque.peekFirst() == 1);
        System.out.println(deque.peekLast() == 2);
    }
}