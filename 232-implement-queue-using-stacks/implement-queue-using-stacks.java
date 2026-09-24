class MyQueue {
    Stack<Integer> front;
    Stack<Integer> rear;
    public MyQueue() {
        front = new Stack<>();
        rear = new Stack<>();
    }
    
    public void push(int x) {
        front.add(x);
    }
    
    public int pop() {
        while(!front.isEmpty()){
            int n = front.pop();
            rear.add(n);
        }
        int res = rear.pop();
        while(!rear.isEmpty()){
            int n = rear.pop();
            front.add(n);
        }
        return res;
    }
    
    public int peek() {
        while(!front.isEmpty()){
            int n = front.pop();
            rear.add(n);
        }
        int res = rear.peek();
        while(!rear.isEmpty()){
            int n = rear.pop();
            front.add(n);
        }
        return res;
    }
    
    public boolean empty() {
        return front.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */