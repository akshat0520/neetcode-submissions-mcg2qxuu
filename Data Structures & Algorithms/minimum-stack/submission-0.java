class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;
    public MinStack() {
        stack=new Stack();
        minstack=new Stack();
    }
    
    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(val);
            minstack.push(val);
        }
        
        else
        {
            stack.push(val);
            if(val<minstack.peek())
            {
                minstack.push(val);
            }
            else
            {
                minstack.push(minstack.peek());
            }
        }
    }
    
    public void pop() {
        if(stack.isEmpty())
            return;
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
