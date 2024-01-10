class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length())
       return false;
       else if(s.equals(goal))
       return true;
       else{
           for(int i=0;i<s.length()-1;i++){
            
            s=s.substring(1)+s.charAt(0);
            if(s.equals(goal)){
            System.out.println("True");
            return true;}
            
            
        }
       }
       return false; 
    }
}