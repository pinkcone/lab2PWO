public class Register{
    private String name;
    private String surname;
    private String email;
    private String password;


    public Register(String imie, String nazwisko, String email, String password) {
        this.name = imie;
        this.surname = nazwisko;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
