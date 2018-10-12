public class Student_Attendance_Record_I {
    public static void main(String[] args) {
        String s = "PPLALL";
        System.out.print(checkRecord(s));
    }

    public static boolean checkRecord(String s) {
        int ca = 0, cl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (ca == 1)
                    return false;
                else {
                    ca++;
                    cl = 0;
                }
            } else if (s.charAt(i) == 'L') {
                if (cl == 2)
                    return false;
                else
                    cl++;
            } else
                cl = 0;
        }
        return true;
    }
}

