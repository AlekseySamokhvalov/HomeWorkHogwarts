public class Hufflepuff extends Hogwarts{
    private int diligence; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String faculty, int magicPower, int transgressionDistance, String name, String surname, int diligence, int loyalty, int honesty) {
        super(faculty, magicPower, transgressionDistance, name, surname);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    int totalPoints() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Трудолюбие: %d, Верность: %d, Честность: %d", diligence, loyalty, honesty);
    }
}
