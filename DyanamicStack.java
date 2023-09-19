public class DyanamicStack extends CustomStack{
    public DyanamicStack(){
        super();//it will call CustomStack()
    }
    public DyanamicStack(int size){
        super(size);//it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
     if(this.isFull()){
         int[] temp=new int[data.length*2];
         //copy all previous item here
         for (int i = 0; i < data.length ; i++) {
             temp[i]=data[i];
         }
         data=temp;
     }
     //at this we know it is not full
        return super.push(item);
    }
}
