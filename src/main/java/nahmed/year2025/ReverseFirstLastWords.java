package nahmed.year2025;

public class ReverseFirstLastWords {

    public static void main(String[] args) {

        String str = "    my name is gaurav             ";
        String[] arr = str.trim().split(" ");
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            String ele = arr[i];
            if (i == firstIndex || i == lastIndex) {
                char[] charArr = ele.toCharArray();
                String blank = "";
                for (int j = charArr.length - 1; j >= 0; j--) {
                    blank = blank + charArr[j];
                }
                sb.append(blank + " ");
                continue;
            }
            sb.append(ele + " ");
        }
        System.out.println(sb);

    }

}
