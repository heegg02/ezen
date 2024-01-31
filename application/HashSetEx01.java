package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// set 은 중복을 허용 안함
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("이길동");
		System.out.println("총 인원수 : " + set.size());
		for(String name : set) {
			System.out.println("이름 : " + name);
		}
		set.remove("김길동");
		System.out.println("제거 후 출력");
		
		// 엥
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println("이름 : " + name);
		}
		
	}

}
