public class Hufflepuff extends Hogwarts{
    private String name;
    private String surname;
    private int diligence; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(int magicPower, int transgressionDistance, String name, String surname, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.name = name;
        this.surname = surname;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    public String toString() {
        return "Пуффендуй{ " + name + ' ' + surname +
                ", трудолюбие: " + diligence +
                ", верность: " + loyalty +
                ", честность: " + honesty +
                ", Сила магии: " + getMagicPower() +
                ", расстояние трансгрессии: " + getTransgressionDistance() +
                '}';
    }
    /*
    public void printStudentDescription() {
        System.out.println("Студент " + name + " из факультета Пуффендуй:");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
        System.out.println();
    }

    public static void printHouseDescription() {
        System.out.println("Факультет Пуффендуй:");
        System.out.println("У всех студентов присущи трудолюбие, верность и честность.");
        System.out.println();
    }
 */
}
