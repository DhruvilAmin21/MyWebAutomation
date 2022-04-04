
public class Stringlearn {

	public static void main(String[] args) {
		//String As an object //String literal
		String s = "Dhruvil Amin";
		s.split(" ");
		System.out.println(s);
		
		//String using new memory operator
		String s1= new String("Welcome");
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
