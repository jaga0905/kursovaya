public class Admin extends User implements iAdmin{

    public Admin(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Admin take the book");
    }

    @Override
    public void overdueNotifications(User user) {
        System.out.println("The administrator notified the user about the delay - " + user.getName());

    }
}
