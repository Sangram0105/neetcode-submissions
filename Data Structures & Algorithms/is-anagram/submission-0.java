class Solution {
    public boolean isAnagram(String s, String t) {
 
         HashMap<Character,Integer>map =new HashMap();


       if(s.length()!=t.length())return false;

        char arr[]=s.toCharArray();
         for(int i=0;i<arr.length;i++){
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
         }

         for(char c:t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

         
              map.put(c, map.get(c)-1);
               if (map.get(c) == 0) {
                map.remove(c);
            }
         }


         return  map.isEmpty();
    }
}
