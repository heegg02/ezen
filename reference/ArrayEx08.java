package reference;

public class ArrayEx08 {

	public static void main(String[] args) {
		int[][] nums = {{78, 96, 80, 66, 74}, {50, 90, 80}} ;
		
		int sum;
		double avg;
		for(int i=0; i<nums.length; i++) {
			sum=0;
			avg=0.0;
			
			for(int j=0; j<nums[i].length; j++) {
				sum+=nums[i][j];	
			}
			
			avg = (double)sum/nums[i].length;
			
			System.out.println((i+1) + " 반");
			System.out.println("학생들의 총점 = " + (int)sum);
			System.out.println("학생들의 평균 = " + (int)avg);
			
		}
		
		
	}

}
 