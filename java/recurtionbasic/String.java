import java.util.*;
public class String {
    public static void removeDuplicates(string str, int idx,StringBuilder newstr, boolean map[]){
        if(idx== str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']== true){
            //duplicate
            removeDuplicates(str,idx+1,newStr,map);

        }else{
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args) {
       
        String str = "sarthakcollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    // to be debuged 
}
