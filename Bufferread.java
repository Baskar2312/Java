import java.io.FileReader;
import java.io.BufferedReader;
public class Bufferread{
    public static void main(String[] args){
        try{
        FileReader fr=new FileReader("example.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
            br.close();
        }
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
