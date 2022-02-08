package com.designPatern.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	
	public static volatile DateUtil instance;
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		if(instance == null) {
			synchronized (DateUtil.class) {
				if(instance == null) {
					return new DateUtil();
				}
			}
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
