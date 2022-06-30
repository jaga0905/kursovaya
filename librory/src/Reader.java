public class Reader extends User implements iReader, iAdmin{
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Admin admin) {
        System.out.println("The reader took a book from the library from the administrator " + admin.getName());
    }

    @Override
    public void returnBook(Admin admin) {
        System.out.println("The reader returned the book to the administrator " + admin.getName());
    }

    @Override
    public void findBook() {
        System.out.println("Администратор нашел книгу");
    }

    @Override
    public void overdueNotifications(User user) {

    }
}
