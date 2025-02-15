package nahmed.string;

public class ImmutableString {

	public static void main(String[] args) {
		// String literal will point to original string which is stored in memory if
		// value is same

		String a = "hello"; // string literal
		String b = "hello";

		// Immutable means it can not be altered or change and will remain constant
		a.concat("world");
		System.out.println(a);

		// if we create another string then only we can concatenate
		String c = a.concat("world");
		System.out.println(c);

		// String object will create new memory every time bcoz of object creation
		String s = new String("hello");
		String s1 = new String("hello");

		System.out.println(a.equals(b)); // true bcoz content is same
		System.out.println(a == b); // true bcoz memory of string literal is same
		System.out.println(a.equals(s)); // true bcoz equals operator checks for content
		System.out.println(a == s); // fail matching the references
		System.out.println(s == s1); // fail bcoz references are different as they are defined with string class

		// StringBuffer and StringBuilder is Mutable
		// These both classes are same except synchronization
		// StringBuffer is thread safe and synchronized
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "She"); // heShelloworld
		System.out.println(sb);
		sb.replace(5, 7, "aa"); // heSheaalloworld
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb);

		sb.reverse(); // reverse the string
		System.out.println(sb);

		// StringBuilder is not thread safe and non-synchronized
		// StringBuilder is faster
		StringBuilder sbb = new StringBuilder("hello");
		sbb.append("world");
		System.out.println(sbb);
	}

}
