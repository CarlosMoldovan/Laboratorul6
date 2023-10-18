package lab6;
import java.util.Scanner;
public class Manager {
    Scanner sc = new Scanner(System.in);
    private CititorTastatura cititor = new CititorTastatura(null, null);
    private String cool_message;
    public Manager(CititorTastatura cititor)
    {
        this.cititor = cititor;
    }
    public String afiseazaMesaj()
    {
        return cool_message;
    }
    public String citesteMesaj()
    {
       cool_message = sc.nextLine();
       return cool_message;
    }
}
