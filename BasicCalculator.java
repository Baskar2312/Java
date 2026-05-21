import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String expression = "3+2*2";
        System.out.println("Result: " + evaluate(expression));
    }
    public static int evaluate(String s){
        Stack<Integer> st=new Stack<>();
		char sign='+';
		int num=0;
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(Character.isDigit(c)){
		        num=num*10+(c-'0');
		    }
		    if((!Character.isDigit(c) && !Character.isWhitespace(c)) || i==s.length()-1){
		        if(sign=='+') st.push(+num);
		        else if(sign=='-') st.push(-num);
		        else if(sign=='*') st.push(st.pop()*num);
		        else if(sign=='/') st.push(st.pop()/num);
		        sign=c;
		        num=0;
		    }
		}
		int res=0;
		while(!st.isEmpty()){
		    res+=st.pop();
		}
		return res;
    }
}
