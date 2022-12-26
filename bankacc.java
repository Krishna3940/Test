
public class bankacc {
   public String name;
   public int account_number;
   public double rate;
   public double balance=0.0;
   
   

public bankacc(String name, int account_number, double rate, double balance) {
	super();
	this.name = name;
	this.account_number = account_number;
	this.rate = rate;
	this.balance = balance;
}
   public void deposit_amount(double money)
   {
	   balance=balance + money;
	   System.out.println(balance);
   }
   public void withdraw_amount(double money)
   {
	   balance=balance-money;
	   if(balance<5000) {
		   System.out.println("you are unable to withdraw money");
	   }
   }
   
   public double getRate() {
		return rate;
	}
   public void display() {
	   System.out.println("name="+name);
	   System.out.println("account number="+account_number);
	   System.out.println("balance="+balance);
   }
   public static void main(String args[]) {
	   bankacc obj=new bankacc("krishna jha",55555555,6,8000);
	   obj.deposit_amount(11000);
	   obj.withdraw_amount(3000);
	   double roi=obj.getRate();
	   System.out.println(roi);
	   obj.display();
   }
}
