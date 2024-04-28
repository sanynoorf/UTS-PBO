public class Main {
    public static void main(String[] args) {
        // Membuat objek AddressBook
        AddressBook addressBook = new AddressBook();

        // Menambahkan beberapa kontak
        addressBook.addContact(new Person("Sany Noor", "123456789", "Cisaat"));
        addressBook.addContact(new Person("Jimin", "987654321", "Cibadak"));

        // Menampilkan daftar kontak
        System.out.println("Daftar Kontak:");
        addressBook.displayContacts();
    }
}