import java.util.Arrays;

public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgression;


    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Имя ученика " + name + "; Качества: " + " магия = " + magic + ", трангрессия = " + transgression;
    }

    public int getCommonAbilities(){
        return magic + transgression;
    }
    public  void compare(Hogwarts students) {
        if (this.getCommonAbilities() > students.getCommonAbilities()) {
            System.out.println(this.name + " лучше, чем " + students.getName());
        } else {
            if (this.getCommonAbilities() < students.getCommonAbilities()) {
                System.out.println(students.getName() + " лучше, чем " + this.name);
            } else if (this.getCommonAbilities() == students.getCommonAbilities()){
                System.out.println(students.getName() + " и " + this.name + " равны" );
            }
        }
    }
    public abstract int getTotalAbility();

    public  void compareWith(Hogwarts students) {
        if (this.getTotalAbility() > students.getTotalAbility()) {
            System.out.println(this.name + " лучше, чем " + students.getName());
        } else {
            if (this.getTotalAbility() < students.getTotalAbility()) {
                System.out.println(students.getName() + " лучше, чем " + this.name);
            } else if (this.getTotalAbility() == students.getTotalAbility()){
                System.out.println(students.getName() + " и " + this.name + " равны" );
            }
        }
    }
}

