public class Charles_Manson {

    public boolean loop;
    public int alive = 1;
    public boolean damage;


    public int reduce = 10;
    public int Health() {

        if (damage == true) {
            Main.charles_health = reduce--;
            System.out.println("charles's hp is nu " + Main.charles_health );
            return(alive);
        }



        return(Main.charles_health);

    }
}
