public class Ravenclaw extends Hogwarts{
    private String name;
    private String surname;
    private int mind; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creation; //творчество

    public Ravenclaw(int magicPower, int transgressionDistance, String name, String surname, int mind, int wisdom, int wit, int creation) {
        super(magicPower, transgressionDistance);
        this.name = name;
        this.surname = surname;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
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

    @Override
    public String toString() {
        return "Когтевран{ " + name + ' ' + surname  +
                ", ум: " + mind +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", творчество: " + creation +
                ", Сила магии: " + getMagicPower() +
                ", расстояние трансгрессии: " + getTransgressionDistance() +
                '}';
    }
    /*
    public void printStudentDescription() {
        System.out.println("Студент " + name + " из факультета Когтевран:");
        System.out.println("Умность: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Творчество: " + creativity);
        System.out.println();
    }

    public static void printHouseDescription() {
        System.out.println("Факультет Когтевран:");
        System.out.println("У всех студентов присущи умность, мудрость и творчество.");
        System.out.println();
    }

 */
}
