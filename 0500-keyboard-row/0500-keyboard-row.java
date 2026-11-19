class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";

        List<String> ans=new ArrayList<>();

        for (String word :words){
            String w=word.toLowerCase();

            boolean a=true,b=true,c=true;

            for (char ch:w.toCharArray()) {
                if (!row1.contains(ch+"")) a=false;
                if (!row2.contains(ch+"")) b=false;
                if(!row3.contains(ch+"")) c=false;
            }
            if (a||b||c) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}