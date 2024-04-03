package Switch;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda dia= Lambda.Friday;
		int numLetter =  switch (dia) {
			case Monday, Friday, Sunday ->6;
			case  Tuesday ->7;
			case Thursday, Saturday -> 8;
			case Wednesday -> 9;
			default -> 0;
			
		};
		System.out.println(numLetter);
	}

}
