public class Librarian extends User implements iLibrarian, iAdmin{

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier) {
        supplier.orderBook(this);
    }

    @Override
    public void findBook() {
        System.out.println("The librarian found the book ");
    }

    @Override
    public void overdueNotifications(User user) {
        System.out.println("The librarian notified the reader " + getName());
    }
}
