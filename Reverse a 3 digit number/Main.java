import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int fir=n/100;
    int sec=(n/10)%10;
    int thr=n%10;
    int rev=(thr*100+sec*10+fir);
    System.out.println(rev);//Type your code here
  }
}