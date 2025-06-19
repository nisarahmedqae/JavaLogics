package nahmed.string;

public class MutableString {

    // StringBuffer and StringBuilder is Mutable
    // These both classes are same except synchronization
    // StringBuffer is thread safe and synchronized

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);

        sb.insert(5, "New"); // HelloNewWorld
        System.out.println(sb);

        sb.deleteCharAt(12);
        System.out.println(sb);

        sb.replace(5, 7, "Amazing"); // heSheaalloworld
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
