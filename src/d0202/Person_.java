package d0202;

public class Person_ {
      private String id;
      private String name;
      private Long money;
      
     
      public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
	public Person_(){
    	  
      }
    
	public Person_(String id, String name, Long money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	
      
}
