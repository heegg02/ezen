package objectClass;

public class Rectangle {
	// 필드 (맴버 변수)
	// private 접근제한자 다른 객체에서의 접근을 제한한다.
	private int width; // 넓이
	private int height; // 높이

	// 생성자
	// 
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("넓이와 높이는 양수 값이여야 합니다.");
		}
		this.width = width;
		this.height = height;
	}

	// 면적 메서드
	int getArea() {
		return width * height;
	}

	// getter 는 변수의 값을 보내주는 매서드
	// setter 는 변수의 값을 저장하는 매서드
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
