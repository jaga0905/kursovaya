public class Supplier extends User implements iSupplier, iReader {

    public Supplier(String name) {
        super(name);
    }

    @Override
    public void bringBook () {
        System.out.println("The supplier asked for books in the library ");
    }

    @Override
    public void takeBook (Admin admin) {
        System.out.println("The supplier took the book from the administrator " + admin.getName());
    }

    @Override
    public void returnBook (Admin admin) {
        System.out.println("Поставщик сделал возврат книги администратору " + admin.getName());
    }

    @Override
    public void orderBook (Librarian librarian) {
        System.out.println("Поставщик " + getName()  + " доставил книгу" + " Harry Potter" + " библиотекарю " + librarian.getName());
    }
}
