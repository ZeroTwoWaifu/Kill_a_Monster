import java.util.Scanner;

public class Main {

    public static int charles_health = 100;

    boolean loop;

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        boolean alive = true;
        boolean attacked = true;
        boolean c_attacked = true;

        Charles_Manson charles = new Charles_Manson();
        Lucas_Boon lucas = new Lucas_Boon();
        Deadbolt deadbolt = new Deadbolt();
        You you = new You();
        Adolf_Hitler adolf = new Adolf_Hitler();

        System.out.println("Howdy, er zijn monsters hier en ze willen je vermoorden.. Typ snel 'attack' in! ");
        String Input = Scan.nextLine();

        while (alive) {
            while (attacked)
                switch (Input.toLowerCase()) {

                    case "attack":
                        System.out.println("Wie wil je aanvallen? charles, lucas, deadbolt, you of adolf?");
                        attacked = false;

                        while (c_attacked) {
                            switch (Input.toLowerCase()) {

                                case "charles":

                                    charles.Health();

                                    if (charles_health <= 0) {

                                        System.out.println("AAAARRRHHGGG");
                                        System.out.println("               ...\n" +
                                                "             ;::::;\n" +
                                                "           ;::::; :;\n" +
                                                "         ;:::::'   :;\n" +
                                                "        ;:::::;     ;.\n" +
                                                "       ,:::::'       ;           OOO\\\n" +
                                                "       ::::::;       ;          OOOOO\\\n" +
                                                "       ;:::::;       ;         OOOOOOOO\n" +
                                                "      ,;::::::;     ;'         / OOOOOOO\n" +
                                                "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                                                "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                                                " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                                                ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                                                ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                                                "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                                                "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                                                " :::`:::::::`;; ;:::::::::##                OO\n" +
                                                " ::::`:::::::`;::::::::;:::#                OO\n" +
                                                " `:::::`::::::::::::;'`:;::#                O\n" +
                                                "  `:::::`::::::::;' /  / `:#\n" +
                                                "   ::::::`:::::;'  /  /   `#");


                                        System.exit(0);
                                    }

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
    }
}

