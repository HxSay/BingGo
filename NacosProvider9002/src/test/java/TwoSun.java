class Solution {
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,3},new int[]{2,4});
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] num = new int[m+n];
        int i =0,j=0,idx=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                num[idx++]=nums1[i++];
            }else{
                num[idx++]=nums2[j++];
            }
        }
        while(i<m){
            num[idx++]=nums1[i++];
        }
        while(j<n){
            num[idx++]=nums2[j++];
        }
        int mid = (m+n)/2;
        double ans = 0;
        if((m+n)%2==0){
            ans = (num[mid]+num[mid+1])/2;
        }else{
            ans = num[mid];
        }
        return ans;
    }
}