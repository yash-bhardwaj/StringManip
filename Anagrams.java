public class Anagrams{
	public static void main(String ...s){
		String s1 = s[0];
		String s2 = s[1];
		if(s1.length() != s2.length()){
			System.out.println("Strings are NOT Anagrams!");
		}else{
			if(!checkAnagrams(s1,s2))
				System.out.println("Strings are NOT Anagrams!");
			else
				System.out.println("Strings are Anagrams!");
		}
	}


	public static boolean checkAnagrams(String s1, String s2){
		for(char c : s1.toCharArray() ){
			if(countChars(s1,c) != countChars(s2,c)){
				return false;
			}
		}
		return true;
	}


	public static int countChars(String s, char c){
		int count = 0;
		for(char e : s.toCharArray()){
			if(Character.toUpperCase(e) == Character.toUpperCase(c)){
				count++;
			}
		}
		return count;
	}
}
