package reference;

public class ArrayEx12 {

	public static void main(String[] args) {
		int[][] magic = new int[3][3];		
		int row = 0; // 행
		int col;	 // 열
		int num = 1; // 넣을 값
		
		// 첫행에 중간열에 1을 넣는다.
		col = magic[0].length/2;
		magic[row][col] = num;
		
		for(num = 2; num <= magic.length*magic[0].length; num++) {
			// 대각선 위로 이동
			row--;
			col++;
			
			// 행과 열이 모두 존재하지 않으면
			if(row < 0 && col == magic[0].length) {
				row += 2;
				col -= 1;
			}
			
			// 행이 존재하지 않으면
			if(row < 0) {
				// 마지막 행으로 이동
				row = magic.length - 1;
			} 
			
			// 열이 존재하지 않으면
			if(col == magic[0].length) {
				// 첫번째 열로 이동
				col = 0;
			}
			
			// 이미 값이 있을 경우
			if(magic[row][col] != 0) {
				// 행 + 2, 열 -1
				row += 2;
				col -= 1;
			}
			// 값 저장
			magic[row][col] = num;
			
		}// for end
		
		// 출력
		for(int i = 0; i < magic.length; i++) {
			for(int j = 0; j < magic[0].length; j++) {
				System.out.print(magic[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
 