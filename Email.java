package emailApp;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int mailboxCapacity=800;
  private int defaultPasswordLength=10;
  private String alternateEmail;
  private String companySuffix="xyz.com";
  
  public Email(String firstName, String lastName) {
	  this.firstName= firstName;
	  this.lastName= lastName;
	  System.out.println("Email Created: "+this.firstName+" "+this.lastName);
  
  
  this.department=setDepartment();
  
  this.password=randomPassword(defaultPasswordLength);
  System.out.println("Your password is: "+this.password);
  
  email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
  }
  
  private String setDepartment() {
	  System.out.print("Department Code\n1 for Sales\n2 for Developement\n3 for Accounting\n0 for none\nEnter department code: ");
      Scanner sc=new Scanner(System.in);
      int depChoice=sc.nextInt();
      if(depChoice ==1) {
    	  return "Sales";
      }
      else if(depChoice==2) {
    	  return "dev";
      }
      else if(depChoice==3) {
    	  return "acct";
      }
      else {
    	  return "";
      }
  }
  
   private String randomPassword(int length) {
	 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	 char[] password=new char[length];
	 for(int i=0;i<length;i++) {
		 int rand =(int)(Math.random()*passwordSet.length());
		 password[i]=passwordSet.charAt(rand);
	 }
	 return new String(password);
   }
   
   public void setMailboxCapacity(int capacity) {
	   this.mailboxCapacity=capacity;
   }
   
   public void setAlternateEmail(String altEmail) {
	   this.alternateEmail=altEmail;
   }
   
   public void changePassword(String password) {
	   this.password=password;
   }
   
   public int getMailboxCapacity() {
	   return mailboxCapacity;
   }
   public String getAlternateEmail() {
	   return alternateEmail;
   }
   public String getpassword() {
	   return password;
   }
   public String showInfo() {
	   return "Display Name: "+firstName+" "+lastName+
			   "\nCompany Email: "+email+
			   "\nMailbox Capacity: "+mailboxCapacity+"mb";
   }
}
