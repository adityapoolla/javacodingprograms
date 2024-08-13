package java8project.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution496 {

	public static void main(String[] args) {
		int[] result = nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
		for(int i : result) {
			System.out.print(i + ',');
		}
	}
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) 
        {
        	int index = indexOf(nums2, nums1[i]);
        	if(index == -1 || index == nums2.length) {
        		result[i] = -1;
        		continue;
        	}
        	for(int j = index + 1; j < nums2.length; j++) {
        		if(nums2[j] > nums1[i]) {
        			result[i] = nums2[j];
        			break;
        		}
        	}
        	result[i] = -1;
        }
        return result;
    }
	
	public static int indexOf(int[] nums, int key) {
		for(int i = 0; i < nums.length ; i++) {
			if(i == key) {
				return i;
			}
		}
		return -1;
	}
}
