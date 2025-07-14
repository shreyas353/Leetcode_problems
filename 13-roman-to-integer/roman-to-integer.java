class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int i, j;

        for (i = 0, j = 1; j < chars.length; i++, j++) {
            if (valueOf(chars[i]) >= valueOf(chars[j])) {
                result += valueOf(chars[i]);
            } else {
                result -= valueOf(chars[i]);
            }
        }

        result += valueOf(chars[i]);  // Add the last character value
        return result;
    }

    // Custom method to get value of Roman characters
    private int valueOf(char ch) {
        if (ch == 'I') return 1;
        else if (ch == 'V') return 5;
        else if (ch == 'X') return 10;
        else if (ch == 'L') return 50;
        else if (ch == 'C') return 100;
        else if (ch == 'D') return 500;
        else if (ch == 'M') return 1000;
        else return 0; // default case
    }
}
