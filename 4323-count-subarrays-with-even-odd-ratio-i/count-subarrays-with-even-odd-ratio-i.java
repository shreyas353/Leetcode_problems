import java.util.HashMap;
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int prefix[]=new int[nums.length+1];
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum=sum+b;
            }
            else{
                sum=sum-a;
            }
            prefix[i+1]=sum;
            for(int j=0;j<=i;j++){
                if(prefix[j]>=sum){
                    ans++;
                }
            }
        }
        return ans;
    }
}