public class Wrapperclass{
    public static void main(String[] args){
        int i=10;
        Integer b=new Integer(i);  //Boxing
        int value=b.intValue();    //Unboxing
        Integer a=i;               //Autoboxing
        int k=a;                   //Autounboxing
        System.out.println(i);
        System.out.println(b);
        System.out.println(value);
        System.out.println(a);
        System.out.println(k);
    }
}
