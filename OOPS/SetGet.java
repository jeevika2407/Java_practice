package com.oops;

public class SetGet {
	private int _id;
	private String _name;
	
	public void setId(int id) {
		_id=id;
	}
	public void setName(String name) {
		_name=name;
	}
	public int getId() {
		return _id;
	}
	public String getName() {
		return _name;
	}
	public static void main(String args[]) {
		SetGet obj=new SetGet();
		obj.setId(9);
		obj.setName("jeev");
		System.out.println("employee id: "+obj.getId());
		System.out.println("employee name: "+obj.getName());
	}
}
