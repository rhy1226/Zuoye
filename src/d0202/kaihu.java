package d0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import d0202.Person_;

public class kaihu {
	public List<Person_> zhanghu = new ArrayList<Person_>();
	public ArrayList<String> card = new ArrayList<String>();

		// 开户
		public void kai() {
			Scanner t1 = new Scanner(System.in);
			System.out.println("开户业务");
			System.out.println("请输入你的姓名");
			String in2 = t1.next();
			System.out.println("请输入你的卡号");
			String in3 = t1.next();
			card.add(in3);
			System.out.println("请输入你的金额");
			Long in4 = t1.nextLong();
			Person_ p = new Person_(in3, in2, in4);
			zhanghu.add(p);

			System.out.println("开户成功");
			System.out.println(card.size());
			System.out.println(p.toString());
		}
		// 存钱
		public void cun() {
			System.out.println("存款业务");
			System.out.println(card);
			System.out.println(zhanghu);
			Scanner t1 = new Scanner(System.in);
			System.out.println("请输入你的卡号");
			String c1 = t1.next();
			if (card.contains(c1)) {
				System.out.println("该用户存在");
				
				for (int i = 0; i < card.size(); i++) {
					Person_ yonghu = zhanghu.get(i);
					if (c1.equals(yonghu.getId())) {
						System.out.println("请输入你要存入的金额");
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
				System.out.println("该用户不存在");
			}
		}
	
		//取款
		public void qu(){
			System.out.println("取款业务");
			Scanner t1 = new Scanner(System.in);
			System.out.println("请输入你的卡号");
			String c2 = t1.next();
			if(card.contains(c2)){
				for(int i=0;i<card.size();i++){
					Person_ yonghu = zhanghu.get(i);
					if(c2.equals(yonghu.getId())){
						System.out.println("输入你要取出的金额");
					    long in5=t1.nextLong();
					    if(in5>yonghu.getMoney()){
					    	System.out.println("余额不足");
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
		
	
	//转账
	   public void zhuan(){
		   System.out.println("取款业务");
		   System.out.println("请输入转出的账号");
		   Scanner t1 = new Scanner(System.in);
		   String c2=t1.next();
		   System.out.println("请输入转入的账号");
		   String c3=t1.next();
		 
		   if(card.contains(c2)&&card.contains(c3)){
			 
			   Long zhuan=null;
			  //转账人的操作
			   for(int i=0;i<card.size();i++){
				   Person_ p1=zhanghu.get(i);
				   if(c2.equals(p1.getId())){
					   System.out.println("输入转账金额");
					   zhuan=t1.nextLong();
					   Long money1=p1.getMoney();
					   if(zhuan<money1){
						  
						   Long money2=money1-zhuan;
						   p1.setMoney(money2);
					   }else{
						   System.out.println("余额不足");
					   }
				   }
			   }  
			   //收款人的操作
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
		   
	   
		//查询
	   public void cha(){
		   System.out.println("查询业务");
		   System.out.println("输入你要查询的账号");
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
			   System.out.println("该用户不存在");
		   }
		   
	   }
	
		
		public static void main(String[] args) {
			kaihu ren = new kaihu();
		while (true) {
			
			System.out.println("请选择你要办理的业务");
			System.out.println("1、开户");
			System.out.println("2、存钱");
			System.out.println("3、取钱");
			System.out.println("4、转账");
			System.out.println("5、查询");
			Scanner t1 = new Scanner(System.in);
			int in1 = t1.nextInt();

			// /*执行开户*/
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
				System.out.println("输入错误");
			}
		}
	}


}
