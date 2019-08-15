package com.laptrinhjavaweb.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class FormUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T toModel(Class<T> clazz, HttpServletRequest request) {
		T object = null;
		try {
			object = clazz.newInstance();
			BeanUtils.populate(object, request.getParameterMap());
		} catch (InstantiationException  e) {
			System.out.print(e.getMessage());
		}catch(IllegalAccessException e1) {
			System.out.print(e1.getMessage());
		}catch(InvocationTargetException e2) {
			System.out.print(e2.getMessage());
		}
		return object;
	}
}
