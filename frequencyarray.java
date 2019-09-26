import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
    public void FindFrequency(){
        String str="one one -one___two,,three,one @three*one?two";
        str=str.replaceAll("[,.@#!_^%$-?*]"," ");
        String[] splitString=str.split("\\s+");
        Map<String,Integer> findFreq=new HashMap<String,Integer>();
        for(int i = 0; i <splitString.length; i++){
            if(findFreq.containsKey(splitString[i])){
                findFreq.put(splitString[i],findFreq.get(splitString[i])+1);
            }
            else{
                findFreq.put(splitString[i],1);
            }
        }
        System.out.println(findFreq);
    }

    public static void main(String[] args) {
        StringFrequency stringFrequency=new StringFrequency();
        stringFrequency.FindFrequency();
    }
}
