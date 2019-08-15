package extractionTreasures;

public class DepositionalObjet {

  public static synchronized int flowNumbers() {
    return introducedCalculation;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.pictures;
  }

  private static int introducedCalculation = 0;
  private int pictures = 0;

  public DepositionalObjet() {
    this.pictures = (introducedCalculation++);
  }
}
