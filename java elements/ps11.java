import java.util.Scanner;
class ps11{
	public static void main(){
		Scanner sc=new Scanner(System.in);
		int feet=sc.nextInt();
		System.out.println("The distance in yards is "+feet/3+" while the distance in miles is "+(feet/3)/1760);
	}
}