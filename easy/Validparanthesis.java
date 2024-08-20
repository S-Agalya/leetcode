import java.util.Stack;
class Validparanthesis {
    public boolean isValid(String s) {
      Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')'|| c=='}' || c==']'){
                if(stack.isEmpty() || !validPairs(stack.pop(),c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    private boolean validPairs(char open,char close){
        return (open=='('&& close==')')||
                (open=='{'&& close=='}')|| (open=='['&& close==']');
    }
    public static void main(String[] args){
        Validparanthesis pairs=new Validparanthesis() ;
        String s="()";
        System.out.println(pairs.isValid(s));
    }
}
