import java.util.Stack;

public class StringReverser {
    public String reverse( String input){
        Stack<Character> stack = new Stack<>();
        for (char ch:input.toCharArray())
            stack.push(ch);
        StringBuffer reversed= new StringBuffer();
        while(!stack.empty())
            reversed.append(stack.pop());
        return reversed.toString();
    }

}

//Main Class
//        String str="abcd";
//        StringReverser reverser=new StringReverser();
//        var result= reverser.reverse(str);
//        System.out.println(result);
