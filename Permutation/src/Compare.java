import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;		
		String str1="",str2="";
result = compareStrings(str1,str2);
	}

	private static boolean compareStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		
		takeInput();
		System.out.println(str1);
		System.out.println(str2);
		
		return false;
	}

	private static void takeInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter String 1");
Scanner obj1 = new Scanner(System.in);
String str1=obj1.next();

		System.out.println("Enter String 1");
		Scanner obj2 = new Scanner(System.in);
String str2=obj2.next();
compareStrings(Str1,str2);
	}

}
