class Solution {
    public String removeOuterParentheses(String s) {
      StringBuilder result = new StringBuilder();
           int count=0;
            for (int i=0; i<s.length(); i++) {
                char c=s.charAt(i);
                if(c=='('){
                    if(count>0)
                    result.append(c);
                    count++;
                }
                else{
                    if(count!=1){
                        result.append(c);
                    }
                    count--;
                }
                
                
            }
            return result.toString();  
    }
}