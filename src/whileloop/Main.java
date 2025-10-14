package whileloop;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int sum=0;
    if(N!=0){
      int last=N%10;
      sum=sum+(last*last*last);
      N/=10;
    }
    if(N==sum){
      System.out.println("Armstrong");
    }
    else{
      System.out.println("Not Armstrong");
    }
    sc.close();
  }
}