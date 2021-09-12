class MyQueue {
 Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        }
        return stack2.pop();
    }
    
    /** Get the front element. */
   public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        int i=stack2.pop();
        stack2.push(i);
        return i;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()){return true;}else return false;
    }
}
