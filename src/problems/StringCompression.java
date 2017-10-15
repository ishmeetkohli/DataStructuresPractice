package problems;

public class StringCompression {

	public String compress(String input) {
		StringBuilder result = new StringBuilder();

		char lastChar = input.charAt(0);
		int lastCharCount = 1;
		result.append(lastChar);
		int i = 1;

		while (i < input.length()) {
			if (lastChar == input.charAt(i)) {
				lastCharCount++;
			} else {
				result.append(lastCharCount);
				lastChar = input.charAt(i);
				result.append(lastChar);
				lastCharCount = 1;
			}
			i++;
		}
		result.append(lastCharCount);
		return result.length() < input.length() ? result.toString() : input;
	}
}
