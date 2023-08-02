public class Slytherin extends Hogwarts {
    private String name;
    private String surname;
    private int cunning; // Хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти
    public Slytherin(int magicPower, int transgressionDistance, String name, String surname, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(magicPower, transgressionDistance);
        this.name = name;
        this.surname = surname;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин{ " + name + ' ' + surname +
                ", хитрость: " + cunning +
                ", решительность :" + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти" + lustForPower +
                ", Сила магии: " + getMagicPower() +
                ", расстояние трансгрессии: " + getTransgressionDistance() +
                '}';
    }
    /*
    public void printStudentDescription() {
        System.out.println("Студент " + name + " из факультета Слизерин:");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println();
    }

    public static void printHouseDescription() {
        System.out.println("Факультет Слизерин:");
        System.out.println("У всех студентов присущи хитрость, решительность, амбициозность, находчивость и жажда власти.");
        System.out.println();
    }

 */
}
