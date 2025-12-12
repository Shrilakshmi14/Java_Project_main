public class Admin extends User {

    public Admin(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void removeUser(User user) {
        System.out.println("Admin removed user: " + user.getName());
    }

    @Override
    public void viewProfile() {
        System.out.println("----- Admin Profile -----");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("UserID: " + getUserId());
    }
}
