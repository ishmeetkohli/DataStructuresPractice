package problems;

public class OneAway {

	public boolean isOneAway(String input1, String input2) {
		int i = 0, j = 0;
		boolean diffFound = false;

		if (Math.abs(input1.length() - input2.length()) > 1) {
			return false;
		}

		while (i < input1.length() && j < input2.length()) {
			if (input1.charAt(i) != input2.charAt(j)) {
				if(diffFound) {
					return false;
				}
				
				if (input1.length() > input2.length()) {
					i++;
				} else if (input2.length() > input1.length()) {
					j++;
				} else {
					i++;
					j++;
				}
				diffFound = true;
			} else {
				i++;j++;
			}
		}
		return true;
	}

}
