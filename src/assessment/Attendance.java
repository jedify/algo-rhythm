package assessment;

public class Attendance {
    public static void main(String[] args) {
        System.out.println(new Attendance().checkRecord("PPALLP"));
    }

    public boolean checkRecord(String s) {
        int absent = 0, late = 0, present = 0, consecutive = 0;
        Character prev = null;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            switch (ch) {
                case 'A':
                    absent++;
                    break;
                case 'L':
                    late++;
                    break;
                default:
                    present++;
            }
            if (late > 2) {
                return false;
            }
            if (absent > 1) {
                return false;
            }
            if (ch != 'L') {
                late = 0;
            }
        }
        return true;
    }
}
