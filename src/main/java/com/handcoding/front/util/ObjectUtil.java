package com.handcoding.front.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObjectUtil {

	public Map<String, Object> convertObjectToMap(Object obj) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			if(fields[i].get(obj) != null) {
				map.put(fields[i].getName(), fields[i].get(obj));
			}
		}
		return map;
	}

	public Object convertMapToObject(Map<String, Object> map, Object obj) throws Exception {
		String keyAttribute = null;
		String setMethodString = "set";
		String methodString = null;
		Iterator<String> itr = map.keySet().iterator();

		while (itr.hasNext()) {
			keyAttribute = (String) itr.next();
			methodString = setMethodString + keyAttribute.substring(0, 1).toUpperCase() + keyAttribute.substring(1);
			Method[] methods = obj.getClass().getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				if (methodString.equals(methods[i].getName())) {
					methods[i].invoke(obj, map.get(keyAttribute));
				}
			}
		}
		return obj;
	}
}
