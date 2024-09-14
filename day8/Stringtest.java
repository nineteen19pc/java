package day8;

public class Stringtest {
	public static String operateOnString(StringFilter filter, String n) {
		return filter.apply(n);
	}

	public static String toUpper(String str) {
		return str.toUpperCase();
	}

	public static String reverse(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		return rev;
	}

	public static void main(String[] args) {

		String sresult = operateOnString(Stringtest::toUpper, "Moh Maya");
		System.out.println(sresult);

		String rev_result = operateOnString(Stringtest::reverse, "Carrot is sweet");
		System.out.println(rev_result);

		System.out.println("---------------------------------------------");
		StringFilter upper = (s) -> {
			String str = s.toUpperCase();
			return str;
		};
		String str = upper.apply("Lambda Block");
		System.out.println(str);

		StringFilter upper2 = (s) -> s.toUpperCase();
		str = upper2.apply("Lambda");
		System.out.println(str);

		StringFilter reverse = (s) -> {
			String rev = "";
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				rev = ch + rev;
			}
			return rev;
		};
		str = reverse.apply("OLD method");
		System.out.println(str);
	}
}