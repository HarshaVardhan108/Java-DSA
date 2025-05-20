package Strings;

public class toggleCharacters {
    public static void main(String[] args) {
        String s = "sTRinG";

        StringBuilder output = new StringBuilder();

        char[] var = s.toCharArray();

        for (char var7 : var) {
            if (Character.isUpperCase(var7)) {
                output.append(Character.toLowerCase(var7));
            } else if (Character.isLowerCase(var7)) {
                output.append(Character.toUpperCase(var7));
            } else {
                output.append(var7);
            }
        }

        System.out.println(String.valueOf(output));
    }
}
