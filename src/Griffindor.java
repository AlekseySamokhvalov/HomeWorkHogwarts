public class Griffindor extends Hogwarts {
    private String name;
    private String surname;
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; //храбрость

    public  Griffindor  (int magicPower, int transgressionDistance, String name, String surname, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.name = name;
        this.surname = surname;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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
    public String toString() {
        return "Гриффиндор{ " + name + " " + surname +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery +
                ", Сила магии: " + getMagicPower() +
                ", расстояние трансгрессии: " + getTransgressionDistance() + '}';
    }
/*
    public static void printStudentDescription() {
        System.out.println("Студент " + name + " из факультета Гриффиндор:");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
        System.out.println();
    }

    public static void printHouseDescription() {
        System.out.println("Факультет Гриффиндор:");
        System.out.println("У всех студентов присущи благородство, честь и храбрость.");
        System.out.println();
    }
    */

}

