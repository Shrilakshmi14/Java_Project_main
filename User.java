public abstract class User {
    private String name;
    private String email;
    private String userId;

    public User(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getUserId() { return userId; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setUserId(String userId) { this.userId = userId; }

    public abstract void viewProfile();

    public final void displayWelcome() {
        System.out.println("Welcome to EduSmart LMS, " + name + "!");
    }
}
