package mutablestring;

public class StringBuilderConcept {
	public static void main(String[] args) {
		String st1="Gomathi";
		StringBuilder sb= new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(st1);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Gomathi selvi");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.reverse();System.out.println(sb);
		sb.delete(0, 4);
		System.out.println(sb);
		sb.replace(0,2,"my");
		System.out.println(sb);
		sb.insert(16,"has ");
		System.out.println(sb);
		
	}

}


