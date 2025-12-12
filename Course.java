public class Course {

    private String title;
    private int durationInHours;
    private final int maxStudents;

    public Course(String title, int durationInHours, int maxStudents) {
        this.title = title;
        this.durationInHours = durationInHours;
        this.maxStudents = maxStudents;
    }

    public Course(String title) {
        this.title = title;
        this.durationInHours = 0;
        this.maxStudents = 30;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title + " | Duration: " + durationInHours +
                           " hrs | Max Students: " + maxStudents);
    }
}
