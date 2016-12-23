import java.util.HashMap;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;		
		String str1="",str2="";
		//takeInput();
		System.out.println("Enter String 1");
		Scanner obj1 = new Scanner(System.in);
		 str1=obj1.next();

		System.out.println("Enter String 2");
		Scanner obj2 = new Scanner(System.in);
		 str2=obj2.next();
		//compareStrings(str1,str2);
		
		result = compareStrings(str1,str2);
		System.out.println(result);
	}

	private static boolean compareStrings(String s1, String s2) {
		// TODO Auto-generated method stub

		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    int count =1;
		        if(s1.length()!=s2.length())
		        {
		            return false;
		        }
		            for(Character c: s1.toCharArray())
		            {
		                if(!map.containsKey(c))
		                    map.put(c, count);

		                else
		                    map.put(c, count+1);

		            }
		            for(Character c: s2.toCharArray())
		            {
		                if(!map.containsKey(c))
		                    return false;

		                else
		                    map.put(c, count-1);
		            }
		            for(Character c: map.keySet())
		            {
		                if(map.get(c)!=0)
		                    return false;
		            }
		        return true;

	}

	

}
