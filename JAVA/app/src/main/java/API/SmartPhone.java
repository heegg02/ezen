package API;

// 스마트폰 클래스 생성
public class SmartPhone {
	// 필드 
	private String company;
	private String os;
	
	// 생성자
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// 매서드
	@Override
	public String toString() {
		return company + "에서 만들었으며 운영 체제는 " + os + "입니다.";
	}
	
	
}
 