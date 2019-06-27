package com.io.testException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;





public class MapTest {
	
	public static Map<String, Student> Students;
	
	public MapTest() {
		 this.Students = new HashMap<String, Student>();
	}

	public void MapAdd() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		while(i < 3) {
			System.out.println("请输入学生ID:");
			String id = scan.next();
			Student student = Students.get(id);
			if(student == null) {
				System.out.println("请输入学生姓名：");
				String name  = scan.next();
				Student stu = new Student(id, name);
				Students.put(id, stu);
				System.out.println("学生录入成功"+ name);
				i++;
			}else {
				System.out.println("该学生之前已录入！！！");
				
			}
		}
	}
	
	public void getKeySet() {
		Set<String> ids = Students.keySet();
		System.out.println("共有学生"+ Students.size());
		for (String id : ids) {
			System.out.println("学生："+ Students.get(id).name);
		}
	}
	
	public void getEntrySet() {
		Set<Entry<String,Student>> entrys = Students.entrySet();
		System.out.println("共有学生"+ entrys.size());
		for (Entry<String,Student> id : entrys) {
			System.out.println("学生："+ id.getValue().id+ ":" + id.getValue().name);
		}
	}
	public void removeMap(String id) {
		Students.remove(id);
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapTest test = new MapTest();
		test.MapAdd();
		test.getKeySet();
		test.removeMap("1");
		
		test.getEntrySet();
		

		
		
	}

}
