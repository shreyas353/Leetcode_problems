class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean a = false, b = false, c = false, d = false, e = false,
                f = false, g = false, h = false, i = false, j = false,
                k = false, l = false, m = false, n = false, o = false,
                p = false, q = false, r = false, s = false, t = false,
                u = false, v = false, w = false, x = false, y = false, z = false;
        int len = sentence.length();
        for (int alp = 0; alp < len; alp++) {
            char ch = sentence.charAt(alp);
            if (ch == 'a') a = true;
            else if (ch == 'b') b = true;
            else if (ch == 'c') c = true;
            else if (ch == 'd') d = true;
            else if (ch == 'e') e = true;
            else if (ch == 'f') f = true;
            else if (ch == 'g') g = true;
            else if (ch == 'h') h = true;
            else if (ch == 'i') i = true;
            else if (ch == 'j') j = true;
            else if (ch == 'k') k = true;
            else if (ch == 'l') l = true;
            else if (ch == 'm') m = true;
            else if (ch == 'n') n = true;
            else if (ch == 'o') o = true;
            else if (ch == 'p') p = true;
            else if (ch == 'q') q = true;
            else if (ch == 'r') r = true;
            else if (ch == 's') s = true;
            else if (ch == 't') t = true;
            else if (ch == 'u') u = true;
            else if (ch == 'v') v = true;
            else if (ch == 'w') w = true;
            else if (ch == 'x') x = true;
            else if (ch == 'y') y = true;
            else if (ch == 'z') z = true;
        }
        return a && b && c && d && e && f && g && h && i && j &&
               k && l && m && n && o && p && q && r && s && t &&
               u && v && w && x && y && z;
    }
}