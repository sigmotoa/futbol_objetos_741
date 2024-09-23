public class Jugador {
    String name;
    int number;
    int year_born;
    int month_born;
    int day_born;
    private int age;
    int weight;
    int height;

    String[] skills;

    public void ageCalculator()
    {
        this.age= (2024 - this.year_born);
        System.out.println("la edad de"+this.name+": "+this.age+ "años");

    }
    public void run() {
    }

    public void pass() {
    }

    public void kick() {
        double option =  Math.random();
        if (option>0.6)
        {
            System.out.println(this.name+" Hizo gol");
        }
        else {
            System.out.println(this.name+" Lo boto");
        }
        System.out.println(option);
    }

    public void showSkills() {
        for (String skill : skills) {
            System.out.println(skill);
        }
    }

    public int getAge() {
        return age;
    }
}
