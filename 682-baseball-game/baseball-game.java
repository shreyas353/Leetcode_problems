class Solution {
    public int calPoints(String[] operations) {
        List<String> res=new ArrayList<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if (s.matches("-?[0-9]+")){
                res.add(s);
            }
            else if(s.equals("D")){
                int last = Integer.parseInt(res.get(res.size()-1));
                res.add(String.valueOf(last*2));
            }
            else if(s.equals("C")){
                res.remove(res.size()-1);
            }
            else if(s.equals("+")){
                int a=Integer.parseInt(res.get(res.size()-1));
                int b=Integer.parseInt(res.get(res.size()-2));
                res.add(String.valueOf(a+b));
            }
        }
        for(int i=0;i<res.size();i++){
            sum=sum+Integer.parseInt(res.get(i));
        }
        return sum;
    }
}