public class StackMain {
    public static void main (String args[]) throws StackException{
        DyanamicStack stack=new DyanamicStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(89);
        stack.push(78);
        stack.push(112);
        stack.push(115);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
