package com.app.dto;

import java.util.List;

public class DndObject {
	
	List<Entry> rightList;
	List<Entry> leftList;
	
	class Entry {
		String key;
		String value;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}

	public List<Entry> getRightList() {
		return rightList;
	}

	public void setRightList(List<Entry> rightList) {
		this.rightList = rightList;
	}

	public List<Entry> getLeftList() {
		return leftList;
	}

	public void setLeftList(List<Entry> leftList) {
		this.leftList = leftList;
	}
	
}
