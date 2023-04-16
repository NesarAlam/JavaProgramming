import java.util.*;

public class String_excercises {
	
//	How to find the maximum occurring character in a given String?

	static char getMaxChar(String str) {
		
		HashMap<Character, Integer> mp = new HashMap<>();
		
		int string_length = str.length();
		
		char ans = 0;
		int count = 0;
		
		for(int i=0;i< string_length;i++)
		{
			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0) + 1);
			
			if(count<mp.get(c))
			{
				ans = c;
				count = mp.get(c);
			}
		}
		
		return ans;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Choose from options:\n1.Get maximum occuring character in a given String");
		
		Scanner scanner = new Scanner(System.in);
		int menuOption = scanner.nextInt();
		String n = scanner.nextLine();
		
		switch(menuOption)
		{
		case 1: 
			System.out.println("Type your string:");
			Scanner sc = new Scanner(System.in);
			String sample_string = sc.nextLine();
			System.out.println("Maximum occuring char:" + getMaxChar(sample_string));
			
		}

	}

}
