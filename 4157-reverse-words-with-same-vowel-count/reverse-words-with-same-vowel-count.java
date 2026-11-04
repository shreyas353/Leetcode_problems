class Solution {
    public String reverseWords(String s){
        String[] arr=s.split(" ");
        int count=countvowels(arr[0]);
        String res="";
        for(int i=0;i<arr.length;i++){
            if(i>0 && countvowels(arr[i])==count){
                arr[i]=new StringBuilder(arr[i]).reverse().toString();
            }
            res=res+arr[i]+" ";
        }
        return res.trim();
    }
    public int countvowels(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}