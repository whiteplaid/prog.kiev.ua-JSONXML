package com.homework.JSONXML.homework2;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		J2J one = JSON.importJSON("c:\\Users\\white\\Documents\\JavaProAll\\json1\\json.txt",J2J.class);
		Field[] fields = J2J.class.getDeclaredFields();
		for (Field field : fields) {
			if(!field.isAccessible()) field.setAccessible(true);
			System.out.println(field.getName() + " : " + field.get(one));
		}
	}

}
