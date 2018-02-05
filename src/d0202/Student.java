package d0202;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import d0202.User;

public class Student {
//	public Map<String, User> user;
//
//	public Student() {
//		this.user = new HashMap<String, User>();
//	}

	Map<String, User> user=new HashMap<String, User>();
	// 增加用户的方法
	public void add() {
		Scanner in = new Scanner(System.in);
		System.out.println("增加用户");
		System.out.println("请输入你的id");
		String inid = in.next();
		User us = user.get(inid);
		if (us == null) {
			System.out.println("请输入你的姓名");
			String inname = in.next();
			System.out.println("请输入你的性别");
			String insex = in.next();
			User users = new User(inname, inid, insex);
			user.put(inid, users);
			System.out.println("添加成功");
			System.out.println(users);
		} else {
			System.out.println("此用户已存在！");
		}
	}

	// 删除用户的方法
	public void del() {
		Scanner in = new Scanner(System.in);
		// System.out.println("删除用户");

		System.out.println("输入你的id");
		String inid = in.next();
		User us = user.get(inid);

		if (us == null) {
			System.out.println("该用户不存在");
		} else {
			user.remove(inid);
			System.out.println("删除用户成功");
			System.out.println("学生ID为" + inid + "的用户已被删除！");
		}
	}

	// 修改用户的属性

	public void change() {
		Scanner in = new Scanner(System.in);
		// System.out.println("修改用户");

		System.out.println("输入你的id");
		String inid = in.next();
		User us = user.get(inid);

		if (us == null) {
			System.out.println("该用户不存在");
		} else {
			System.out.println("原姓名:" + us.getName() + "请输入新的姓名");
			String name = in.next();
			System.out.println("请输入性别");
			String sex = in.next();
			us.setName(name);
			us.setSex(sex);
			System.out.println("修改成功");
		}

	}

	// 查询用户的方法
	public void find() {
		Scanner in = new Scanner(System.in);
		// System.out.println("查询用户");

		System.out.println("输入你的id");
		String inid = in.next();
		User us = user.get(inid);

		if (us == null) {
			System.out.println("该用户不存在");
		} else {
			String name = us.getName();
			String sex = us.getSex();
			System.out.println(us.toString());
		}
	}

	public static void main(String[] args) {
		Student p = new Student();
		while (true) {
			System.out.println("请选择要进行的操作");
			System.out.println("1-增加" + "****" + "2-删除" + "****" + "3-修改" + "****" + "4-查询");
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			if (i == 1) {
				p.add();
			} else if (i == 2) {
				p.del();
			} else if (i == 3) {
				p.change();
			} else if (i == 4) {
				p.find();
			} else {
				System.out.println("输入错误");
			}
		}

	}
}
