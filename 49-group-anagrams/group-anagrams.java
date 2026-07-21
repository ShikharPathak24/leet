class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for( String word : strs){
            char [] arr = word.toCharArray();
            Arrays.sort(arr);
            String a = new String(arr);
            if(! map.containsKey(a)){
                map.put(a,new ArrayList<>());
            }
            map.get(a).add(word);

        }
        return new ArrayList<>(map.values());
        
    }
}