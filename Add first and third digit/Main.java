import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       int fir=n/100;
       int sec=n%10;
       int sum=fir+sec;
       System.out.println(sum);// Type your code here
	}
}