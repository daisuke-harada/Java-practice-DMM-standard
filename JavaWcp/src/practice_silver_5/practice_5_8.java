package practice_silver_5;

public class practice_5_8 {
	public static void main(String[] args) {
		String[][] array = {{"A","B"}, null, {"C", "D", "E"}};
		int total = 0;
		for(String[]tmp :array) {
			total += tmp.length;
		}
		System.out.println(total);
	}
}
