public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};

        int sum = 0;
        int count = 0;

        for (Object mark : marks) {
            Integer validMark = convertToInteger(mark);
            if (validMark != null) {
                sum += validMark;
                count++;
            }
        }

        double average = count > 0 ? (double) sum / count : 0.0;
        System.out.println("Average of valid marks = " + average);
    }

    public static Integer convertToInteger(Object obj) {
        if (obj == null) return null;
        if (obj instanceof Integer) return (Integer) obj;
        if (obj instanceof String) {
            String str = ((String) obj).trim();
            if (str.equalsIgnoreCase("null") || str.isEmpty()) return null;
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return null;
    }
}
