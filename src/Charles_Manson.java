public class Charles_Manson {

    public boolean loop;
    public int alive = 1;
    public boolean damage;

    public int charles_health = 100;
    public int reduce = 10;
    public int Health() {

        if (damage == true) {
            charles_health = reduce--;
            System.out.println("charles's hp is nu " + charles_health );
            return(alive);
        }

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

        return(charles_health);

    }
}
