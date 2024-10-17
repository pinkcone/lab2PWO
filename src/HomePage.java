public class HomePage {

    private String link;

    public HomePage(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void print(){
        System.out.println(this.link);
        System.out.println("Witaj na naszej stronie!");
        System.out.println("Zaloguj sie");
        System.out.println("Zarejestruj sie");
        for(int i=0; i<10; i++){
            for (int j = i; j<10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Pierwszy artykuł: ");
        System.out.println("Drugi artykuł");
    }
}
