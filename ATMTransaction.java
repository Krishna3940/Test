import java.util.Scanner;

public class ATMTransaction {
	

	private void execute(String trans_Type) throws UnsupportedTransactionException {  
		try
		{
			switch(trans_Type){    
		
		case "credit":
			System.out.println("credit is working");
		 break;
		 
		case "debit":    
			System.out.println("debit is working");
		 break; 
		 
		case "balanceInquiry" : 
			System.out.println("balanceInquiry is working");
			 break; 
			 
		case "pinChange":    
			System.out.println("pinChange is working");
			 break;  

		default:     
			throw new UnsupportedTransactionException("choice is not valid !!");
		} 
		}catch(UnsupportedTransactionException e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)throws UnsupportedTransactionException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter transciption type");
		String str=sc.next();
		ATMTransaction obj  = new ATMTransaction();
		
		obj.execute(str);
	}
}