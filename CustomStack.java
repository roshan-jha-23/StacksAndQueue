public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
public CustomStack(){
    this(DEFAULT_SIZE);
}
    public CustomStack(int size) {
        this.data = new int[size];
    }
    // we need a pointer for this
    //initially pointer=-1 it will increase by 1 when something is added
    //decrease by 1 when something is deleted
    //it always point at the last place where element is
    //added or removed
    public boolean push(int item){
    if(isFull()){
        System.out.println("Stack is Full Bro");
        return false;
    }
    ptr++;
    data[ptr]=item;
    return true;
    }
    public int pop() throws StackException{
    if(isEmpty()){
        throw new StackException("EmptyStackException error!");
    }
    return data[ptr--];
    }
    public int peek() throws StackException{
    if(isEmpty()){
        throw new StackException("EmptyStackException error!");

    }
        return data[ptr];
    }

    public boolean isFull() {
    return ptr==data.length-1;//ptr is at last index
    }
    public boolean isEmpty(){
    return ptr==-1;
    }
}
