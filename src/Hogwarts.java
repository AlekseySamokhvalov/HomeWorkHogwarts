abstract class Hogwarts {
       private String faculty;
       private int magicPower;
       private int transgressionDistance;
       private String name;
       private String surname;
       public Hogwarts(String faculty, int magicPower, int transgressionDistance, String name, String surname) {
              this.faculty = faculty;
              this.magicPower = magicPower;
              this.transgressionDistance = transgressionDistance;
              this.name = name;
              this.surname = surname;
       }

       public String getFaculty() {
              return faculty;
       }

       public void setFaculty(String faculty) {
              this.faculty = faculty;
       }

       public int getMagicPower() {
              return magicPower;
       }

       public int getTransgressionDistance() {
              return transgressionDistance;
       }

       public void setMagicPower(int magicPower) {
              this.magicPower = magicPower;
       }

       public void setTransgressionDistance(int transgressionDistance) {
              this.transgressionDistance = transgressionDistance;
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
       public String toString() {
              return String.format("%s %s, Факультет: %S, Мощность магии: %d, Расстояние трансгрессии: %d", name, surname, faculty,magicPower, transgressionDistance);
       }

       abstract int totalPoints();
}
