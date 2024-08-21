import java.util.Stack;
class Stackdemo{
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(3);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack);
        
    }
}