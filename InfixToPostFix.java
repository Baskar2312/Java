import java.util.Stack;

public class InfixToPostFix{
    public static void main(String[] args) {
        String infix = "a+b*c-d";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
    }
    public static String infixToPostfix(String s){
        // String s="a * (b + c) / d";
	    Stack<Character> st=new Stack<>();
	    String res="";
	    for(int i=0;i<s.length();i++){
	        char c=s.charAt(i);
	        if (c == ' ') {
                continue;
            }
	        if(c=='('){
	            st.push(c);
	        }
	        else if(Character.isLetterOrDigit(c)){
	            res+=c;
	        }
	        else if(c==')'){
	            while(!st.isEmpty() && st.peek()!='('){
	                res+=st.pop();
	            }
	            st.pop();
	        }
	        else{
	            while(!st.isEmpty() && precendence(c)<=precendence(st.peek())){
	                res+=st.pop();
	            }
	            st.push(c);
	        }
	    }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    	public static int precendence(char ch){
	    if(ch=='^') return 3;
	    if(ch=='*' || ch=='/') return 2;
	    if(ch=='+' || ch=='-') return 1;
	    return -1;
	}
}