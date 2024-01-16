/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
class Solution {
     int[] twoSum(int[] nums, int target) {

        for(int i=1; i<nums.length; i++){
            for (int j=0 ; i+j<nums.length; j++){
                if(nums[i+j]+nums[j] == target){
                   return new int[] {i+j,j} ;
                }
            }
        }
        return new int[]{};
    }
}
class Demo{
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array 1 Length");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		 System.out.println("Enter The Array 2 Length");
                int arr2[] = new int[Integer.parseInt(br.readLine())];

                System.out.println("Enter The Array 2 Elements");
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }

		Solution obj = new Solution();
		System.out.println("Enter The Target Sum Value : ");
		int target = Integer.parseInt(br.readLine());

		int  []ret = obj.twoSum(arr1,arr2,target);

		System.out.println(Arrays.toString(ret));

	}
}
