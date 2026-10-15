class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                int count=0;
                for(int k=i;k<=j;k++) {
                    boolean found=false;
                    for(int l=i;l<k;l++){
                        if(nums.get(k).equals(nums.get(l))){
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        count++;
                    }
                }
                sum=sum+count*count;
            }
        }
        return sum;
    }
}