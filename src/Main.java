public class Main {
    public static void main(String[] args) {
        System.out.println("hist");
        System.out.println("Hello world!");

        Register register1 = new Register("Jan", "Kowalski", "jankowaslki@gmail.com", "12345678");
        System.out.println(register1.getPassword());
        Register register2 = new Register("Tomek", "Kowalski", "tomek@gmail.com", "12345");
        System.out.println("trzeci komit");
        Register register3 = new Register("Tomasz", "Nowak", "tomasz@gmail.com", "12345");
        System.out.println(register3.getPassword());


        Login login1 = new Login("user1", "password1");
        Login login2 = new Login("user2", "password2");
        System.out.println("Username: " + login1.getUsername() + "Password: " + login1.getPassword());
        login1.setPassword("newPassword1");
        System.out.println("Zmiana hasła:");
        System.out.println("Username: " + login1.getUsername() + "Password: " + login1.getPassword());
        HomePage page = new HomePage("www.superstrona.pl");
        page.print();
    }
}
