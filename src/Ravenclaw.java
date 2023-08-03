public class Ravenclaw extends Hogwarts{
    private int mind; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creation; //творчество

    public Ravenclaw(String faculty, int magicPower, int transgressionDistance, String name, String surname, int mind, int wisdom, int wit, int creation) {
        super(faculty,magicPower, transgressionDistance, name, surname);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
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

    public int getCreation() {
        return creation;
    }

    public void setCreativity(int creation) {
        this.creation = creation;
    }

    int totalPoints() {
        return mind + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Ум: %d, Мудрость: %d, Остроумие: %d, Творчество: %d", mind, wisdom, wit, creation);
    }
}
