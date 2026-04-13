import java.io.FileWriter;
public class Writefile{
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("output.txt");
            fw.write("Hello World...");
            fw.close();
            System.out.println("Successfully writed into a file.");
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
