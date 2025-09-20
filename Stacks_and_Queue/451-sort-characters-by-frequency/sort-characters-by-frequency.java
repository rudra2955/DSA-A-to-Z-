class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i)))hm.put(s.charAt(i),1);
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        
        StringBuilder sb= new StringBuilder();
       
        List<Map.Entry<Character,Integer>>li= new ArrayList<>(hm.entrySet());
        li.sort((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer>e:li){
            for(int i=0;i<e.getValue();i++)sb.append(e.getKey());
        }
        return sb.toString();
    }
}