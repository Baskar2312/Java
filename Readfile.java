import java.io.FileReader;
public class Readfile{
    public static void main(String[] args){
        try{
            FileReader fr=new FileReader("example.txt");
            int c=fr.read();
            System.out.print((char)c);
            c=fr.read();
            System.out.print((char)c);
            c=fr.read();
            System.out.print((char)c);
            fr.close();
            //while(c!=-1){
            //System.out.print((char)c;)
            //c=fr.read();}
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
        }
    }
}