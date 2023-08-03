public class Griffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; //храбрость

    public  Griffindor  (String faculty, int magicPower, int transgressionDistance, String name, String surname, int nobility, int honor, int bravery) {
        super(faculty, magicPower, transgressionDistance, name, surname);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    int totalPoints() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Благородство: %d, Честь: %d, Храбрость: %d", nobility, honor, bravery);
    }

}

