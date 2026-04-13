import java.io.FileWriter;
import java.io.BufferedWriter;
public class Bufferwrite{
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("example.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Hey Hello...");
            bw.newLine();
            bw.write("What's Happening?");
            bw.close();
            System.out.println("THE END.");
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}