import java.util.HashSet;
import java.util.Set;

public class LongestNice {
    public static void main(String[] args) {
        String s = "YazaAay";
        System.out.println(new LongestNice().longestNiceSubstring(s));
    }
    public String longestNiceSubstring(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isNice(sub)){
                    if(sub.length()>result.length()){
                        result=sub;
                    }
                }
            }
        }
        return result;
    }
    public boolean isNice(String word){
        Set<Character> set=new HashSet<>();
        for(char ch:word.toCharArray()){
            set.add(ch);
        }
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                if(!set.contains(Character.toUpperCase(ch))) return false;
            }
            else{
                if(!set.contains(Character.toLowerCase(ch))) return false;
            }
        }
        return true;
    }
}
