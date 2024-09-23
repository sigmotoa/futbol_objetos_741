public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        j1.name="James";
        j1.year_born=1994;
        //j1.age=30;
        j1.number=14;
        j1.height=180;
        j1.weight=70;
        j1.skills = new String[]{"Hablar en publico","Hacer pases","Hacer Goles","Calentar puestos"};
        System.out.println(j1.name);
        System.out.println(j1.skills);
        j1.showSkills();
        j1.kick();
        j1.ageCalculator();
        System.out.println(j1.getAge());

        Jugador j2 = new Jugador();
        Jugador j3 = new Jugador();
        j2.name="El bicho siuu";
        //j2.age=39;
        j2.number=7;
        j2.height=187;
        j2.weight=83;
        j2.skills= new String[]{"Chilena","Cabecear","Tiro lejano","Regate","Georgina", "Muchas gracias aficion, esto es para vosotros SiuUUuu"};
        System.out.println(j2.name);
        j2.showSkills();
        j2.kick();


        j3.name= "messi :D";
        //j3.age=37;
        j3.number= 10;
        j3.height= 170;
        j3.weight= 67;
        j3.skills= new String[]{"pases","meter goles", "que mira' bobo anda pa' ya", "la pulga","el mejor de la fokin historia"};
        System.out.println(j3.name);
        System.out.println(j3.skills);
        j3.showSkills();
        j3.kick();
        System.out.println();


    }
}
