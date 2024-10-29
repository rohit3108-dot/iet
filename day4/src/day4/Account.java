package day4;

public class Account {
	private static int cnt;
	public static float int_rate;
	public static float min_balance;
	static {
		cnt=1;
		int_rate=0.05f;
		min_balance=1000;
		
	}
	
	
	private String acid;
	private String name;
	private double balance;
	private String type;
	
	
	 public Account()
     {
     	this.acid=generatecode(name);
     	this.name=null;
     	this.balance=0;
     	this.type=null;
     	
     }
	private static String generatecode(String name)
	{
		String code=" ";
		if(name!=null)
		{
			code=name.substring(0,3)+cnt;
		}
	else
		code="xxx"+cnt;
		
		cnt++;
		return code;
	}
			
	
	public Account(String name, double balance, String type) {
		super();
		this.acid =generatecode(name);
	    cnt++;
		this.name = name;
		this.balance = balance;
		this.type = type;
	
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setType(String type) {
		this.type = type;
	}


	public static int getCnt() {
		return cnt;
	}


	public static float getInt_rate() {
		return int_rate;
	}


	public static float getMin_balance() {
		return min_balance;
	}


	public String getAcid() {
		return acid;
	}


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}


	public String getType() {
		return type;
	}


	@Override
	public String toString() {
		return "Account [acid=" + acid + ", name=" + name + ", balance=" + balance + ", type=" + type + "]";
	}
	
		
	}
	

