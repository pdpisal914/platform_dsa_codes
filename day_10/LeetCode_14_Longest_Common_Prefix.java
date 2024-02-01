/*
14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
*/
import java.util.*;
import java.io.*;
class Solution {
     static String common(String s1,String s2){
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(),s2.length())
        for(int i =0;i<n;i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            str = common(str,strs[i]);
        }
        return str;
    }

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Length of Array String static String common(String s1,String s2){
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(),s2.length())
        for(int i =0;i<n;i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            str = common(str,strs[i]);
        }
        return str;
    }");
	    String arr[] = new String[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The String");
	    for(int i=0;i<arr.length;i++){

		    arr[i] = br.readLine();

	    }

	    System.out.println("Longest String : "+ longestCommonPrefix(arr));
    }
}
