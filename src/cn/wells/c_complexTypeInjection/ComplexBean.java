package cn.wells.c_complexTypeInjection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ComplexBean {
	private Object[] arr;//��������ע��
	private List list;//list/set ����ע��
	private Map map;//map����ע��
	private Properties prop;//properties����ע��
	
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list + ", map=" + map + ", prop=" + prop
				+ "]";
	}
	
	
}