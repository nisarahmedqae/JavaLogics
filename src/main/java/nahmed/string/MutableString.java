package nahmed.string;

public class MutableString {

    // StringBuffer and StringBuilder is Mutable
    // These both classes are same except synchronization
    // StringBuffer is thread safe and synchronized

    // StringBuilder is not thread safe and non-synchronized
    // StringBuilder is faster

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb); // HelloWorld

        sb.insert(5, "New");
        System.out.println(sb); // HelloNewWorld

        sb.replace(5, 8, "Amazing");
        System.out.println(sb); // HelloAmazingWorld

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); // reverse the string

    }

}
