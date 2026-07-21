class Solution {
    public boolean isValid(String s) {
        Stack <Character> vp = new Stack<>();
        for (char ch : s.toCharArray() ){
            if(ch == '(' || ch == '{' || ch == '['){
                vp.push(ch);
            }
            else{
               if(vp.isEmpty()){
                return false;
                 }
                 char t = vp.pop();
                 if(ch ==')' && t != '(' || ch == '}' && t != '{' || ch ==']' && t != '[')
                 return false;
                

            }


        } 
        return vp.isEmpty();    
    }

}