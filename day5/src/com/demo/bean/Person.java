package com.demo.bean;

import java.time.LocalDate;

public class Person
{
     private int pid;
     private String pname;
     private String address;
     private LocalDate bdate;
     public Person() 
        {
    	 super();
    	 System.out.println("in person default constructor");
    	 }
     
     public Person(int pid, String pname, String address, LocalDate bdate ) 
     {
    	 super();
    	 System.out.println("in person parameterized constructor");
         this.pid= pid;
         this.pname= pname;
         this.address= address;
         this.bdate= bdate;
         
         
}
    public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getBdate() {
		return bdate;
	}
	
	public String toString() {
		return "Person [pid="+pid+", pname="+pname+", address="+address+", bdate="+bdate+"]";
	}
	
	
}