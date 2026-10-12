class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
         Arrays.sort(arr);
         String k=new String(arr);
          List<String> list=new ArrayList<>();
            if(!map.containsKey(k)){
               map.put(k,new ArrayList<String>());
            }

        
                  map.get(k).add(s);
            
        }

         List<List<String>> res=new ArrayList<>();

         for(List<String> s:map.values()){
                res.add(s);
         }


         return res;

    }
}
