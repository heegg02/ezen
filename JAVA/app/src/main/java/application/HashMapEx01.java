package application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "홍길동");
//		map.put(2, "김길동");
//		map.put(3, "이길동");
//		System.out.println("총 인원수 : " + map.size());
//		System.out.println(map.get(3)); // map.get(key) key 를 불러와 값을 내보낸다.
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 75);
		map.put("김길동", 90);
		map.put("이길동", 96);
		map.put("박길동", 85);
		map.put("손길동", 80);
		
		System.out.println("**성적 현황표**");
		Set<String> key = map.keySet();
		
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			int score = map.get(name);
			System.out.println("이름 : " + name + ", 점수 : " + score);
		}
		
	}

}
