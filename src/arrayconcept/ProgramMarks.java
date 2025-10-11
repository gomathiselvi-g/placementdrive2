package arrayconcept;
import java.util.Scanner;
public class ProgramMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String subject[]= {"Tamil","English","Maths","Physics","Chemistry","COmputer"};
		int marks[]=new int[6];
		for(int j=0;j<subject.length;j++) {
		System.out.println(subject[j]+"=");
		}
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
			sum=sum+marks[i];
		}
		float average=sum/marks.length;
		System.out.println(sum);
		System.out.println(average);
		sc.close();
		
	}
}
