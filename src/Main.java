public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
