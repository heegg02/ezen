package reference;

public class ArrayEx01 {

	public static void main(String[] args) {
		// byte, shot, int, long
		/*
		int score1 = 96;
		int score2 = 73;
		int score3 = 82;
		int sum = score1 + score2 + score3;
		double avg = sum / 3.0;
		*/
		
		// int[index]
		
		int[] scores = new int[3];
		scores[0] = 96;
		scores[1] = 73;
		scores[2] = 82;
		int sum = 0;
		
		for (int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = sum / 3.0;
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);
	}

}
