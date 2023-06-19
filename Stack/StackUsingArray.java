package Stack;
public class StackUsingArray{
    int maxSize;
    int[] stack_arr;
    int top;

    // parameterized constructor of class
    public StackUsingArray(int size){
        maxSize = size;
        stack_arr = new int[maxSize];
        top=-1;  //index of the top element
    }
    // function to push an element in the stack

    public void push(int value){
        if(isfull()){
            System.out.println("Stack is full; Stack Overflow; Cannot push element");
        } else{
        top++;  // increment the top of stack
        stack_arr[top]= value;
        System.out.println("Pushed element: "+ value);}
    }

    // function to pop an element from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty; Stack Underflow; Cannot pop the given stack");
            return -1;
        } else{
        int popValue = stack_arr[top];  //put the value to be pop in the stack
        top --;  // decrement the top 
        System.out.println("Poped Element: "+popValue);
        return popValue;} // return poped element        
    }

    //pick an element in stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } 
        return stack_arr[top];  // to show the top element
    }

    // is full(): to check the case of overflow/ stack is full
    public boolean isfull(){
        return top == maxSize - 1; 
    }

    //is empty(): to check the case of underflow/ stack is empty 
    public boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        // push an element in the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("********************");
        
        System.out.println("Top element is: "+ stack.peek());     

        System.out.println("Poped Element are: ");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}