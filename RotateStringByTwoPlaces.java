public class RotateStringByTwoPlaces {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksforgeeks";
        
        System.out.println(isRotatedByTwo(s1, s2));
    }
    public static boolean isRotatedByTwo(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
		if(s1.length()==2 && s1.equals(s2)) return true;
		String temp1=s1.substring(2,s1.length())+s1.substring(0,2);
		String temp2=s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
		return temp1.equals(s2) || temp2.equals(s2);
    }
}
