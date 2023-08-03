// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static void compareStudentsByFaculty(Hogwarts student1, Hogwarts student2) {
        if (student1.getClass() == student2.getClass()) {
            if (student1.totalPoints() > student2.totalPoints()) {
                System.out.println("1-ый ученик лучше 2-го: " + student1.toString() + " VS " + student2.toString());
            } else {
                System.out.println("1-ый ученик хуже 2-го: " + student1.toString() + " VS " + student2.toString());
            }
        } else {
            System.out.println("Ученики относятся к разным факультетам.");
        }
    }

    static void compareStudentsByMagicPowerAndTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        String result = String.format("Ученик %s обладает %s мощностью магии, чем %s",
                student1.toString(),
                (student1.getMagicPower() > student2.getMagicPower()) ? "большей" : "меньшей",
                student2.toString());

        result += student1.getTransgressionDistance() > student2.getTransgressionDistance() ? " и может трансгрессировать на большее расстояние" : " и может трансгрессировать на меньшее расстояние";

        System.out.println(result);
    }

    public static void main(String[] args) {

        Griffindor[]  griffindors = {
                new Griffindor("Гриффиндор",95, 85, "Гарри", "Поттер",100, 90, 80),
                new Griffindor("Гриффиндор",80,50, "Гермиона", "Грейнджер", 75, 100, 65),
                new Griffindor("Гриффиндор",80, 75, "Рон", "Уизли", 85, 80, 75)
        };

        Slytherin[]  slytherins = {
                new Slytherin("Слизерин",75,65,"Драко", "Малфой", 45, 50, 60, 70, 90),
                new Slytherin("Слизерин",65,45,"Грэхэм", "Монтегю", 55, 40, 70, 90, 80),
                new Slytherin("Слизерин",55,35,"Грегори", "Гойл", 75, 30, 80, 10, 100)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Пуффендуй",45, 65, "Захария", "Смит", 55, 35, 45),
                new Hufflepuff("Пуффендуй",25, 55, "Сердик", "Диггори", 85, 90, 35),
                new Hufflepuff("Пуффендуй",35, 75, "Джастин", "Финч-Флетчли", 75, 15, 5)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Когтевран",40,30, "Чжоу","Чанг", 45,85,62,85),
                new Ravenclaw("Когтевран",50,20, "Падма","Патил", 75,55,72,75),
                new Ravenclaw("Когтевран",60,10, "Маркус","Белби", 55,35,32,45),
        };

        for (int i = 0; i < griffindors.length; i++) {
            System.out.println(griffindors[i].toString());
        }

        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i].toString());
        }

        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.println(hufflepuffs[i].toString());
        }

        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i].toString());
        }

        compareStudentsByFaculty(griffindors[0], griffindors[1]); // сравнение учеников по факультету
        compareStudentsByMagicPowerAndTransgressionDistance(griffindors[2],slytherins[0]); // сравнение двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии

    }
}