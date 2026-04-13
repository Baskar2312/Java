import java.util.Map;
import java.util.HashMap;
public class Mapexample{
    public static void main(String[] args){
        Map<String,Integer> students=new HashMap<>();
        students.put("Baskar",78);
        students.put("javagar",87);
        students.put("sasi",98);
        students.put("karthi",88);
        System.out.println(students);
        System.out.println(students.get("sasi"));
        System.out.println(students.keySet());
        for(String key:students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
}