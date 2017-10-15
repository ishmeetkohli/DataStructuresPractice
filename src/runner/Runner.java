package runner;
import problems.StringCompression;

public class Runner {
	public static void main(String[] args) {
		// OneAway problem = new OneAway();
		// Boolean result = problem.isOneAway("bake", "pale");
		// System.out.println(result);

		StringCompression compressor = new StringCompression();
		String result = compressor.compress("aabccccccab");
		System.out.println(result);
	}
}
