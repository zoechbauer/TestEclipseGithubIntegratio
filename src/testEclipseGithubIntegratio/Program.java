package testEclipseGithubIntegratio;

public class Program {

	public static void main(String[] args) {
		testIntendationInGithub();

	}
	
	public static void testIntendationInGithub() {
		anotherMethod();
		if (true) {
			andOneMore();
			if (false) {
				lastMethod();
			} else {
				for(int i=0;i< 10; i++) {
					System.out.println(i);
				}
			}
		}
		
	}
	
	public static void anotherMethod() {
		System.out.println("anotherMethod");
		
		 
	}
	
	public static void andOneMore() {
		System.out.println("andOneMore");
		
	}
	
	public static void lastMethod() {
		System.out.println("lastMethod");
	}

}
