public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
   protected int end=0;
  protected   int start=0;
  private int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull() {
        return size==data.length-1;//ptr is at last index
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[start++];
        //shift the elemnts here to left
       start=start%data.length;
        size--;
        return removed;
    }//it takes only O(n) TC
    public void display(){
        if(isEmpty()){
            System.out.println("kuch nai hai bhai yaha pe");
            return;
        }
        int i=start;
      do{
          System.out.print(data[i]+"-> ");
          i++;
          i=i%data.length;
      }while(i!=end);
        System.out.println("end");
    }
}
