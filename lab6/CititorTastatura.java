package lab6;
import java.util.Scanner;
public class CititorTastatura{
    Scanner sc = new Scanner(System.in);
    private String message;
    private String source;
    public CititorTastatura(String message,String source)
    {
        this.message = message;
        this.source = source;
    }
    public void citesteTastatura()
    {
      message = sc.nextLine();
    }
}