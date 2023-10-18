package lab6;

public class Main {
    public static void main(String[] args) {
        // Creează o instanță a clasei CititorTastatura
        CititorTastatura cititorTastatura = new CititorTastatura(null, null);

        // Creează o instanță a clasei Manager și îi trimite instanța CititorTastatura ca parametru
        Manager manager = new Manager(cititorTastatura);

        // Poți utiliza acum obiectul manager pentru a citi și afișa mesaje
        System.out.println("Introdu un mesaj:");
        manager.citesteMesaj();
        System.out.println("Mesajul introdus este: " + manager.afiseazaMesaj());
    }
}
