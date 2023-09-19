public class DyanamicCircularQueue extends CircularQueue {
    public DyanamicCircularQueue() {
        super();
    }

    public DyanamicCircularQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            //copy all previous item here
            for (int i =0 ; i < data.length; i++) {
                temp[i] = data[(start+i)% data.length];
            }
            start=0;
            end=end% data.length;
            data = temp;

        }//this is the O(N)
        return super.insert(item);
    }
}
