// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Griffindor[]  griffindors = {
                new Griffindor(95, 85, "Гарри", "Поттер",100, 90, 80),
                new Griffindor(80,50, "Гермиона", "Грейнджер", 75, 100, 65),
                new Griffindor(80, 75, "Рон", "Уизли", 85, 80, 75)
        };

        Slytherin[]  slytherins = {
                new Slytherin(75,65,"Драко", "Малфой", 45, 50, 60, 70, 90),
                new Slytherin(65,45,"Грэхэм", "Монтегю", 55, 40, 70, 90, 80),
                new Slytherin(55,35,"Грегори", "Гойл", 75, 30, 80, 10, 100)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff(45, 65, "Захария", "Смит", 55, 35, 45),
                new Hufflepuff(25, 55, "Сердик", "Диггори", 85, 90, 35),
                new Hufflepuff(35, 75, "Джастин", "Финч-Флетчли", 75, 15, 5)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw(40,30, "Чжоу","Чанг", 45,85,62,85),
                new Ravenclaw(50,20, "Падма","Патил", 75,55,72,75),
                new Ravenclaw(60,10, "Маркус","Белби", 55,35,32,45),
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
    }
}