class Solution {
    class Dist {
        int d, m, y;
        void read(String s) {
            String[] p = s.split("-");
            y = Integer.parseInt(p[0]);
            m = Integer.parseInt(p[1]);
            d = Integer.parseInt(p[2]);
        }
        boolean isLeapYear(int y) {
            return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        }
        int totalDays() {
            int total = 0;
            for (int year = 1; year < y; year++) {
                total += isLeapYear(year) ? 366 : 365;
            }
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(y))
                days[2] = 29;
            for (int month = 1; month < m; month++) {
                total += days[month];
            }
            total += d;
            return total;
        }
    }
    public int daysBetweenDates(String date1, String date2) {
        Dist d1 = new Dist();
        Dist d2 = new Dist();
        d1.read(date1);
        d2.read(date2);
        return Math.abs(d1.totalDays() - d2.totalDays());
    }
}