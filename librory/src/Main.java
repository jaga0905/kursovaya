public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader("James");
        Librarian librarian = new Librarian("Fedya");
        Admin admin = new Admin("Alex");
        Supplier supplier = new Supplier("Petya");
        librarian.orderBook(supplier);
        reader.takeBook(admin);
        supplier.takeBook(admin);
        admin.overdueNotifications(reader);
        reader.returnBook(admin);
        admin.findBook();

    }
}