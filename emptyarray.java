import java.util.Scanner;
import java.util.ArrayList;

public class emptyarray{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> gfg = new ArrayList<String>(); 
        for(int i=0;i<5;i++){
            String input=scanner.nextLine();
            gfg.add(input);
        }
        String userinput=scanner.nextLine();
        gfg.set(1,userinput);
        
        System.out.println(gfg);
    }   
}