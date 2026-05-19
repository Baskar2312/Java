import java.util.Stack;

public class InfixToPrefix{
    public static void main(String[] args) {
        String infix = "a+b*c-d";
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);
    }
    public static String infixToPrefix(String s){
        StringBuilder rev=new StringBuilder(s).reverse();
		for(int i=0;i<rev.length();i++){
		    if(rev.charAt(i)=='('){
		        rev.setCharAt(i,')');
		    }
		    else if(rev.charAt(i)==')'){
		        rev.setCharAt(i,'(');
		    }
		}
		Stack<Character> st=new Stack<>();
		StringBuilder postFix=new StringBuilder();
		for(int i=0;i<rev.length();i++){
		    char c=rev.charAt(i);
		    if(Character.isLetterOrDigit(c)){
		        postFix.append(c);
		    }
		    else if(c=='('){
		        st.push(c);
		    }
		    else if(c==')'){
		        while(!st.isEmpty() && st.peek()!='('){
		            postFix.append(st.pop());
		        }
		        st.pop();
		    }
		    else{
		        while(!st.isEmpty() && st.peek() != '('&& precendence(c)<=precendence(st.peek())){
		            postFix.append(st.pop());
		        }
		        st.push(c);
		    }
		}
		while(!st.isEmpty()){
		    postFix.append(st.pop());
		}
		postFix=postFix.reverse();
		return postFix.toString();
    }
    public static int precendence(char c){
	    if(c=='^') return 3;
	    if(c=='+' || c=='-') return 1;
	    if(c=='*' || c=='/') return 2;
	    return -1;
	}
}