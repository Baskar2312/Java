import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String decodedString = decodeString(s);
        System.out.println("Decoded string: " + decodedString);
    }

    public static String decodeString(String s) {
        Stack<Integer> countSt=new Stack<>();
        Stack<StringBuilder> stringSt=new Stack<>();
        StringBuilder current=new StringBuilder();
        int num=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                stringSt.push(current);
                countSt.push(num);
                current=new StringBuilder();
                num=0;
            }
            else if(c==']'){
                StringBuilder previous=stringSt.pop();
                int count=countSt.pop();
                for(int j=0;j<count;j++){
                    previous.append(current);
                }
                current=previous;
            }
            else if(Character.isLetter(c)){
                current.append(c);
            }
        }
        return current.toString();
    }
}
