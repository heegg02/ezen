package objectClass;

public class RectangleEx01 {

	public static void main(String[] args) {
		try {
			Rectangle rect1 = new Rectangle(20, 30);
			int area = rect1.getArea();
	
			System.out.println("사각형의 넓이 = " + rect1.getWidth());
			System.out.println("사각형의 높이 = " + rect1.getHeight());
			System.out.println("사각형의 면적 = " + area);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
