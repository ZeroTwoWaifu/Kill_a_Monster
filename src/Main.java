import java.util.Scanner;

public class Main {

    boolean loop;

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        boolean alive;

        Charles_Manson charles = new Charles_Manson();
        Lucas_Boon lucas = new Lucas_Boon();
        Deadbolt deadbolt = new Deadbolt();
        You you = new You();
        Adolf_Hitler adolf = new Adolf_Hitler();

        System.out.println("Howdy, er zijn monsters hier en ze willen je vermoorden.. Typ snel 'attack' in! ");
        String Input = Scan.nextLine();

        while (alive = true) {

            switch (Input.toLowerCase()) {

                case "attack":
                    System.out.println("Wie wil je aanvallen? charles, lucas, deadbolt, you of adolf?");
            }


            switch (Input.toLowerCase()) {

                case "charles":

                    charles.Health();

                    return;

                case "lucas":

                    return;

                case "deadbolt":

                    return;

                case "you":

                    return;

                case "adolf":

                    return;
            }
        }
    }
}
