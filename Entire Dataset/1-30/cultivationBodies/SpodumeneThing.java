package cultivationBodies;

public class SpodumeneThing {
  private static final String synX2133String = "ProducibleObject:";

  public static synchronized int liveMatter() {
    return designedNumbers;
  }

  private static int designedNumbers;
  private int finger;

  public synchronized String toString() {
    return synX2133String + this.finger;
  }

  public SpodumeneThing() {
    this.finger = designedNumbers++;
  }
}
