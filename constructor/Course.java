public class Course {
    private String courseName;
    private int duration; 
    private double fee;

    private static String instituteName = "Tech Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 5000);
        Course c2 = new Course("Web Development", 10, 7000);

        System.out.println("=== Course Details (Before Update) ===");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("CodeMasters Institute");

        System.out.println("\n=== Course Details (After Update) ===");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
