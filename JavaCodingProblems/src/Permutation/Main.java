package Permutation;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * String s = "Every Good Boy Does File"; String s1 = s.substring(11,14);
		 * System.out.println("boy: "+s1);
		 */
		permuteAndPrint("ABC");
		
	}
	
	private static void permuteAndPrint(String str) {
		permuteAndPrint("", str);
	}
	
	private static void permuteAndPrint(String prefix, String str) {
		int n = str.length();
		if(n == 0) {
			System.out.println(prefix+" ");
		}
		else {
			for(int i = 0; i < n; i++) {
				permuteAndPrint(prefix+str.charAt(i),
					str.substring(i+1,n) + str.substring(0,i)
					);
			}
		}
		
	}

}
