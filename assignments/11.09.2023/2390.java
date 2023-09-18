import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
           if(c=='*'){
            st.pop();
           }
           else{
            st.push(c);
           }
       }
       if(st.isEmpty())
       {
          return "";
       }
       StringBuilder str=new StringBuilder();
       for(char c:st){
           str.append(c);
       }
        return str.toString();
    }
}
