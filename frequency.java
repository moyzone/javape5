import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap; 
import java.util.Map; 

public class frequency{
    public static void main(String[] args){
        File file1 = new File("file.txt");
        HashMap<String, Integer> map = new HashMap<>(); 
        StringBuffer sb=new StringBuffer();
        try{
            BufferedReader in = new BufferedReader(new FileReader(file1));
            int ch;
            try{
                while ((ch = in.read()) != -1)
                {
                    sb.append((char)ch);
                    // System.out.print((char)ch);
                }
                in.close();
            }catch(IOException e){
                System.out.println("IO");
            }             
        }
        catch(FileNotFoundException e){
            System.out.println("not found");
        }
        String s=sb.toString();
        System.out.println(s);
        String[] dummy=s.split("\\s*(=>|,|\\s)\\s*");
        for(int i=0;i<dummy.length;i++){
            String key=dummy[i];
            int value=1;
            if(map.containsKey(dummy[i])){
                map.put(dummy[i],map.get(dummy[i])+1);
            }
            else
            {
                map.put(key,value);
            }
        }
        System.out.print(map);
    }
}





// Map test = new HashMap();

// for (Map.Entry entry : test.entrySet()){
//   System.out.println(entry.getKey() + " " + entry.getValue());
// }