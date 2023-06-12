public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int mind, int wisdom, int wit, int creative, int magic, int transgression){
        super(name,magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() + ", ум = " + mind + ", мудрость = " + wisdom + ", остроумие = " + wit + ", творчество = " + creative;
    }
    @Override
    public int getTotalAbility(){
        return mind + wisdom + wit + creative;
    }
}
