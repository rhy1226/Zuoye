package d0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import d0202.Person_;

public class kaihu {
	public List<Person_> zhanghu = new ArrayList<Person_>();
	public ArrayList<String> card = new ArrayList<String>();

		// ����
		public void kai() {
			Scanner t1 = new Scanner(System.in);
			System.out.println("����ҵ��");
			System.out.println("�������������");
			String in2 = t1.next();
			System.out.println("��������Ŀ���");
			String in3 = t1.next();
			card.add(in3);
			System.out.println("��������Ľ��");
			Long in4 = t1.nextLong();
			Person_ p = new Person_(in3, in2, in4);
			zhanghu.add(p);

			System.out.println("�����ɹ�");
			System.out.println(card.size());
			System.out.println(p.toString());
		}
		// ��Ǯ
		public void cun() {
			System.out.println("���ҵ��");
			System.out.println(card);
			System.out.println(zhanghu);
			Scanner t1 = new Scanner(System.in);
			System.out.println("��������Ŀ���");
			String c1 = t1.next();
			if (card.contains(c1)) {
				System.out.println("���û�����");
				
				for (int i = 0; i < card.size(); i++) {
					Person_ yonghu = zhanghu.get(i);
					if (c1.equals(yonghu.getId())) {
						System.out.println("��������Ҫ����Ľ��");
						long money_c = t1.nextLong();
						long money_y = yonghu.getMoney();
						long money = money_c + money_y;
						yonghu.setMoney(money);
						System.out.println(zhanghu);
					}else{
						continue;
					}
				}

			} else {
				System.out.println("���û�������");
			}
		}
	
		//ȡ��
		public void qu(){
			System.out.println("ȡ��ҵ��");
			Scanner t1 = new Scanner(System.in);
			System.out.println("��������Ŀ���");
			String c2 = t1.next();
			if(card.contains(c2)){
				for(int i=0;i<card.size();i++){
					Person_ yonghu = zhanghu.get(i);
					if(c2.equals(yonghu.getId())){
						System.out.println("������Ҫȡ���Ľ��");
					    long in5=t1.nextLong();
					    if(in5>yonghu.getMoney()){
					    	System.out.println("����");
					    }else{
					    	long money_y=yonghu.getMoney();
					    	long money=money_y-in5;
					    	yonghu.setMoney(money);
					    	System.out.println(zhanghu);
					    }
					}
				}
				
			}

		}
		
	
	//ת��
	   public void zhuan(){
		   System.out.println("ȡ��ҵ��");
		   System.out.println("������ת�����˺�");
		   Scanner t1 = new Scanner(System.in);
		   String c2=t1.next();
		   System.out.println("������ת����˺�");
		   String c3=t1.next();
		 
		   if(card.contains(c2)&&card.contains(c3)){
			 
			   Long zhuan=null;
			  //ת���˵Ĳ���
			   for(int i=0;i<card.size();i++){
				   Person_ p1=zhanghu.get(i);
				   if(c2.equals(p1.getId())){
					   System.out.println("����ת�˽��");
					   zhuan=t1.nextLong();
					   Long money1=p1.getMoney();
					   if(zhuan<money1){
						  
						   Long money2=money1-zhuan;
						   p1.setMoney(money2);
					   }else{
						   System.out.println("����");
					   }
				   }
			   }  
			   //�տ��˵Ĳ���
				   for(int j=0;j<card.size();j++){
					   Person_ p2=zhanghu.get(j);
					   if(c3.equals(p2.getId())){  
							   Long money3=p2.getMoney();
							   Long money4=money3+zhuan;
							   p2.setMoney(money4);
						   
					   }	  
			   }
		  }
			   System.out.println(zhanghu);
	    }
		   
	   
		//��ѯ
	   public void cha(){
		   System.out.println("��ѯҵ��");
		   System.out.println("������Ҫ��ѯ���˺�");
		   Scanner t1 = new Scanner(System.in);
		   String in8=t1.next();
		   if(card.contains(in8)){
			   for(int k=0;k<card.size();k++){
				   Person_ p3=zhanghu.get(k);
				   if(in8.equals(p3.getId())){
					   System.out.println(p3);
				   }
			   }
		   }else{
			   System.out.println("���û�������");
		   }
		   
	   }
	
		
		public static void main(String[] args) {
			kaihu ren = new kaihu();
		while (true) {
			
			System.out.println("��ѡ����Ҫ�����ҵ��");
			System.out.println("1������");
			System.out.println("2����Ǯ");
			System.out.println("3��ȡǮ");
			System.out.println("4��ת��");
			System.out.println("5����ѯ");
			Scanner t1 = new Scanner(System.in);
			int in1 = t1.nextInt();

			// /*ִ�п���*/
			if (in1 == 1) {
				ren.kai();
			} else if (in1 == 2) {
				ren.cun();
			} else if (in1 == 3) {
				 ren.qu();
			} else if (in1 == 4) {
				 ren.zhuan();
			} else if(in1==5){
				ren.cha();
			}else {
				System.out.println("�������");
			}
		}
	}


}
