package app_java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {
	public static void main(String[] args) {
		ADto a1 = new ADto();
		ADto a2 = new ADto();
		ADto a3 = new ADto();
		ADto a4 = new ADto();
		
		List<ADto> objects = Arrays.asList(a1, a2, a3, a4);
		
		System.out.println(objects);
		
		List<C> cObjects = objects.stream().map(m->mapToEntity(m)).collect(Collectors.toList());
		
		System.out.println(cObjects);
	}
	static C mapToEntity(ADto C) {
		return new C();
	}

}
