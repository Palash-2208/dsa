class Solution {
    public String removeDuplicates(String s) {
       Stack<Character>stk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stk.isEmpty()&&stk.peek()==ch){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch1:stk){
            sb.append(ch1);
        }
       return sb.toString();

    }
}