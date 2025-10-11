package stringconcept;

public class ProgramForUppertoLowerCase {
	public static void main(String[] args) {
		String str="I aM GomAtHI";
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=97&&ch<='z') {
				ch=(char)(ch-32);
			}
			else if(ch>=65&&ch<='Z') {
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		System.out.println(res);
	}
}
