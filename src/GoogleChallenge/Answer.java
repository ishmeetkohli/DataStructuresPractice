package GoogleChallenge;
 
public class Answer {   
	public static String answer(int n) {
		int counter = 0;
		int i = 2;
		boolean isPrime = true;
// 		StringBuilder result = new StringBuilder();
		
		String result = "";

		while (result.length() < 5) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				counter++;
				if (counter > n) {
					result += i;
				}
			}

			i++;
			isPrime = true;
		}
		return result.substring(0, 5);
	}

	public static void main(String[] args) {
		System.out.println(answer(0));
	}
}
