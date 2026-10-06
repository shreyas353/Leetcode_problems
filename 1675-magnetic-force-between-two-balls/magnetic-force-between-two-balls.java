class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(MagneticForce(position,m,mid)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public boolean MagneticForce(int[] position,int m,int guess){
        int force=1;
        int pos=position[0];
        for(int i=1;i<position.length;i++){
            int dist=position[i]-pos;
            if(dist<guess){
                continue;
            }
            force++;
            pos=position[i];
        }
        if(force>=m){
            return true;
        }
        return false;
    }
}