package leetcode;
//[1,2,3,4,5] [3,4,5,1,2]
//[4-1,5-2,1-3,2-4,3-5] => [3,3,-2,-2,-2] => 4-2+3+3-2-2

//[2,3,4] [3,4,3]
//[4-2,3-3,3-2] => [2,0,-1]
public class lc134 {
    public static void main(String[] args) {
//        canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2});
//        isCanOverTrip(2,new int[]{2,3,4},new int[]{3,4,3});
    }

    public static int canCompleteCircuitV2(int[] gas,int[] cost){
        int n = gas.length;
        int[] arr = new int[n];
        for(int i=0;i<n;++i){

        }
        return 0;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;
        for(int i=0;i<n;++i){
            if(isCanOverTrip(i,gas,cost)) return i;
        }
        return -1;
    }

    public static boolean isCanOverTrip(int startIndex,int[] gas,int[] cost){
        int n = gas.length;
        int tank = gas[startIndex];
        for(int i = startIndex;i<n;++i){
            if(tank < cost[i]) return false;
            if(i >= n-1){
                tank = tank - cost[i]+gas[0];
            }else{
                tank = tank - cost[i]+gas[i+1];
            }
        }
        for(int i=0;i<startIndex+1;++i){
            if(tank < cost[i]) return false;
            if(i+1<n){
                tank = tank - cost[i] + gas[i+1];
            }
        }
        return true;
    }
}
