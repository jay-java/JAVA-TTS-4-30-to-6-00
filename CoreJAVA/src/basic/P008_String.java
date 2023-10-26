package basic;
//	String -> is sequence of characters.
// -> String is immutable in java(cannot change value of string)
// -> to change value of String there are two classes available in java.
//	1. StringBuffer and 2.StringBuilder
public class P008_String {
	public static void main(String[] args) {
		char name[] = {'j','a','v','a'};
		System.out.println(name);
		String s = "hello java how are you?";//24
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(11));
		System.out.println(s.contains(" hwo "));
		System.out.println(s.startsWith(""));
		System.out.println(s.endsWith(""));
		String s1 = "java";
		System.out.println(s1.toUpperCase());
		String s2 = "JAVA";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		String s3 = "	ja     va	";
		System.out.println(s3.trim());
		String s4 = "     ";
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		
	}
}
