class Solution {
    public int removeDuplicates(int[] arr) {
    
	    int cntInd = 1;
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]!=arr[i-1]){
	            arr[cntInd]=arr[i];
	            cntInd++;
	       	 }
	    }
	    return cntInd;
    }
}
