public class EduSmartMain {
    public static void main(String[] args) {

        Student s1 = new Student("Shri", "rshri@mail.com", "S101");
        Student s2 = new Student("Gagan", "gagan@mail.com", "S102");

        Instructor i1 = new Instructor("Aryan", "aryan@mail.com", "I201");
        Instructor i2 = new Instructor("Vaish", "vaish@mail.com", "I202");

        Admin admin = new Admin("System Admin", "admin@mail.com", "A001");

        i1.createCourse("Java Fundamentals");
        i1.createCourse("Advanced Java");

        i2.createCourse("Spring Boot");
        i2.createCourse("Python");

        s1.enrollCourse("Spring Boot");
        s1.enrollCourse("Python");

        s2.enrollCourse("Advanced Java");
        s2.enrollCourse("Java Fundamentals");

        s1.viewProfile();
        s2.viewProfile();
        i1.viewProfile();
        i2.viewProfile();
        admin.viewProfile();

        s1.trackProgress();
        s2.trackProgress();

        admin.removeUser(s2);

        Course c1 = new Course("Java Fundamentals", 40, 50);
        Course c2 = new Course("Data Science Intro");

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
