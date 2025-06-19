package nahmed.string;

public class SwapStrings {

    /*
    1. For one input:
    It will remove values from 0th index to less then provided index

    2. For two inputs:
    It starts with first input index to less then provided second index
     */
    public static void main(String[] args) {
        // Initialize strings to swap
        String str1 = "Hello";
        String str2 = "My World";

        // Display original values
        System.out.println("Before swapping: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");

        // Step 1: Concatenate str1 and str2, store in str1
        str1 = str1 + str2;

        // Step 2: Extract the original str1 from the concatenated string
        str2 = str1.substring(0, str1.length() - str2.length());

        // Step 3: Extract the original str2 from the concatenated string
        str1 = str1.substring(str2.length());

        // Display swapped values
        System.out.println("After swapping: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
    }
}