package Functions;

public class Max2 {
	public int getMax(int nums[]) {
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		return max;
	}
	public int getMax2(int nums[]) {
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
	public int total(int nums[]) {
		int total=0;
		for(int i=0;i<nums.length;i++) {
			total=total+nums[i];
		}
		return total;
	}
	public int stringmaxlength(String names[]) {
		String max=names[0];
		int length = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>max.length()) {
				max=names[i];
				 length=max.length();
			}
			
		}
		return max.length();
	}
	public int maxvar() {
		int a=100;
		int b=20;
		int c=30;
		if(a>b && a>c) {
			System.out.println("test");
			return a;
//			System.out.println("test");
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
	}
	public String middile(String names) {
		String middle=names.substring(names.length()/2-1,names.length()/2+1);
		return middle;
	}

}
