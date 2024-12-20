package Functions;

public class Max {
	public int getMax(int nums[]) {
		int max=nums[0];
		int max2=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max2=max;
				max=nums[i];
			}else if(nums[i]>max2) {
				max2=nums[i];
			}
		}
		return max2;
	}

}
