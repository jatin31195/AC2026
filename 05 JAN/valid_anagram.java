class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length())
     return false;
     else{
         char a[]=s.toCharArray();
         Arrays.sort(a);
         char b[]=t.toCharArray();
         Arrays.sort(b);
         if(Arrays.equals(a,b))
         return true;
         }
      return false;
    }
}