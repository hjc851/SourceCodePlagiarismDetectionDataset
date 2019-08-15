package manufactureOrnaments;

public class ClasticVictim {
  private static final String synX2478String = "ProducibleObject:";
  private static int craftedCalculate = 0;

  public static synchronized int typicalRely() {
    return craftedCalculate;
  }

  private int identifier = 0;

  public ClasticVictim() {
    this.identifier = craftedCalculate++;
  }

  public synchronized String toString() {
    return synX2478String + this.identifier;
  }
}
