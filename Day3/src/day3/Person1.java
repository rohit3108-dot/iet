package day3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person1
{
   private int perid;
   private String pname;
   private String mobile;
   private Date bdate;
   
	public Person1(int perid, String nm,String mob,Date dt) {
	   this.perid=perid;
	   this.pname=nm;
	   mobile=mob;
	   bdate=dt;
	   
   }
	   public Person1(int perid) {
		   this.perid=perid;
		   this.pname=null;
		   mobile=null;
		   bdate=null;
	   }
	   
	   public void setPname(String name) {
		   this.pname=name;
		   
	   }
	   public void setMobile(String mob) {
		   this.mobile=mob;
		   
	   }
	   public void setBdate(Date dt) {
		   this.bdate=dt;
		   
	   }
	   public int getPerid() {
		   return perid;
	   }
		   
	   public String getpname() {
		   return pname;
	   }
	   public String getmobile() {
		   return mobile;
	   }
	   public Date getBdate( ) {
		   return bdate;
	   }
	   
	   public String toString() {
		   
		   SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		   String dt=sdf.format(bdate);
		   return "Id: "+this.perid+"\n Name : "+pname+"\n Mobile : "+mobile+"\n BDate : "+dt;
		   
		   
	   }
	

	}


