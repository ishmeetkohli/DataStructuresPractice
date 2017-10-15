package runner;
import problems.OneAway;

public class Runner {
	public static void main(String[] args) {
		OneAway problem = new OneAway();
		Boolean result = problem.isOneAway("bake", "pale");
		System.out.println(result);
	}
}
