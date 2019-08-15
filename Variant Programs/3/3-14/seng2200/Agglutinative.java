package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Agglutinative {
  private static final int synX1313int = 2;
  private static final int synX1312int = 1;
  private static final int synX1311int = 0;
  private static final String synX1310String = "Not enough Parameters";
  private static final int synX1309int = 3;
  public int maxQ;
  public double compass;
  public double ignoble;
  public ProduceCrinkleBoss spurringBoss;
  public String[] ing;

  public Agglutinative(String[] handles) {
    this.ing = handles;
  }

  public synchronized void extend() {

    if (ing.length != synX1309int) {
      System.out.println(synX1310String);
      return;
    }

    this.ignoble = parseDouble(this.ing[synX1311int]);
    this.compass = parseDouble(this.ing[synX1312int]);
    this.maxQ = parseInt(this.ing[synX1313int]);
    this.spurringBoss = new ProduceCrinkleBoss(this.ignoble, this.compass, this.maxQ);
    this.spurringBoss.beganExercise();
  }

  public static synchronized void main(String[] adapter) {
    Agglutinative iface;
    iface = new Agglutinative(adapter);
    iface.extend();
  }
}
