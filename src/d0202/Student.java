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
	// �����û��ķ���
	public void add() {
		Scanner in = new Scanner(System.in);
		System.out.println("�����û�");
		System.out.println("���������id");
		String inid = in.next();
		User us = user.get(inid);
		if (us == null) {
			System.out.println("�������������");
			String inname = in.next();
			System.out.println("����������Ա�");
			String insex = in.next();
			User users = new User(inname, inid, insex);
			user.put(inid, users);
			System.out.println("��ӳɹ�");
			System.out.println(users);
		} else {
			System.out.println("���û��Ѵ��ڣ�");
		}
	}

	// ɾ���û��ķ���
	public void del() {
		Scanner in = new Scanner(System.in);
		// System.out.println("ɾ���û�");

		System.out.println("�������id");
		String inid = in.next();
		User us = user.get(inid);

		if (us == null) {
			System.out.println("���û�������");
		} else {
			user.remove(inid);
			System.out.println("ɾ���û��ɹ�");
			System.out.println("ѧ��IDΪ" + inid + "���û��ѱ�ɾ����");
		}
	}

	// �޸��û�������

	public void change() {
		Scanner in = new Scanner(System.in);
		// System.out.println("�޸��û�");

		System.out.println("�������id");
		String inid = in.next();
		User us = user.get(inid);

		if (us == null) {
			System.out.println("���û�������");
		} else {
			System.out.println("ԭ����:" + us.getName() + "�������µ�����");
			String name = in.next();
			System.out.println("�������Ա�");
			String sex = in.next();
			us.setName(name);
			us.setSex(sex);
			System.out.println("�޸ĳɹ�");
		}

	}

	// ��ѯ�û��ķ���
	public void find() {
		Scanner in = new Scanner(System.in);
		// System.out.println("��ѯ�û�");

		System.out.println("�������id");
		String inid = in.next();
		User us = user.get(inid);

		if (us == null) {
			System.out.println("���û�������");
		} else {
			String name = us.getName();
			String sex = us.getSex();
			System.out.println(us.toString());
		}
	}

	public static void main(String[] args) {
		Student p = new Student();
		while (true) {
			System.out.println("��ѡ��Ҫ���еĲ���");
			System.out.println("1-����" + "****" + "2-ɾ��" + "****" + "3-�޸�" + "****" + "4-��ѯ");
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
				System.out.println("�������");
			}
		}

	}
}
