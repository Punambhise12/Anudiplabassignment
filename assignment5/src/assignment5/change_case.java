package assignment5;

public class change_case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HeLlo";
		String changedCase = "";
		for(int i = 0; i< s.length(); i++ )
		{
			char c = s.charAt(i); 
			if(Character.isUpperCase(c)) {
				changedCase = changedCase + Character.toLowerCase(c);
				
			}
			else {
				changedCase = changedCase + Character.toUpperCase(c);
			}
		}
		System.out.println(changedCase);

	}

}


