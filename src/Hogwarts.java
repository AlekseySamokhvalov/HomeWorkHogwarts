class Hogwarts {
       private int magicPower;
       private int transgressionDistance;

       public Hogwarts(int magicPower, int transgressionDistance) {
              this.magicPower = magicPower;
              this.transgressionDistance = transgressionDistance;
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

       @Override
       public String toString() {
              return "Hogwarts{" +
                      "Сила магии: " + magicPower +
                      ", Расстояние трансгрессии: " + transgressionDistance +
                      '}';
       }

}
