import java.util.Scanner;
class ps10{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int fees=sc.nextInt();
		int discount=sc.nextInt();
		int discount_fee=fees*(1-discount/100);
		System.out.println("The discount amount is INR "+fees-discount_fee+" and final discounted fee is INR "+discount_fee);
	
	}
}