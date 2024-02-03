package statement;

public class ForStatement11 {

	public static void main(String[] args) {
		int sum; //전체 보물 무게
		for (int g2=0; g2<=30; g2++) {
			for (int g3=0; g3<=30; g3++) {
				sum = g2*2 + g3*3;
				if(sum == 30) {
					System.out.println("2kg 보물 "+ g2 +" 개 + 3kg 보물 " + g3 + " 개 = " +sum);
				}
			}
		}
		
	}
}
