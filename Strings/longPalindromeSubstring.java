package Strings;
    public class longPalindromeSubstring {

        // Helper method to expand around the center
        public static String expandFromCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.substring(left, left + 1).equals(s.substring(right, right + 1))) {
                left--;
                right++;
            }
            return s.substring(left + 1, right); // valid palindrome
        }

        public static String longestPalindrome(String s) {
            String longest = "";

            for (int i = 0; i < s.length(); i++) {
                // Odd-length palindrome
                String odd = expandFromCenter(s, i, i);

                // Even-length palindrome
                String even = expandFromCenter(s, i, i + 1);

                // Update the longest if needed
                if (odd.length() > longest.length()) {
                    longest = odd;
                }
                if (even.length() > longest.length()) {
                    longest = even;
                }
            }

            return longest;
        }

        public static void main(String[] args) {
            String input = "babad";
            String result = longestPalindrome(input);
            System.out.println("Longest palindromic substring: " + result);
        }
    }