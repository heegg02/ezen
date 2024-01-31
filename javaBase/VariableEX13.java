package javaBase;

public class VariableEX13 {

	public static void main(String[] args) {
		String str1="10";
		String str2="20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
		int num=10;
		System.out.println(String.valueOf(num));
		String name="김철수";
		int age=25;
		System.out.println("내 이름은 "+ name + "이고 나이는 "+ age + "세입니다.");
		System.out.printf("내 이름은 %s이고 나이는 %d세입니다.", name, age);
		
	}

}
