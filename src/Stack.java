import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private int[] items= new int[5];
    private int count=0;
    public void push(int item){
        if (count==items.length)
            throw new StackOverflowError();
        items[count++]=item;
    }
    public int pop(){
        if(count==0)
            throw new EmptyStackException();
        return items[count];
    }

    public String tostring(){
        return Arrays.toString(items);
    }
}
//Main Class
//Stack stack=new Stack();
//stack.push(10);
//stack.push(20);
//System.out.println(stack);
