package developmentElements;

public class RecoverableTarget {
  private static final String synX2337String = "ProducibleObject:";

  public static synchronized int contemporaryReckoning() {
    return spawnedWeigh;
  }

  public RecoverableTarget() {
    this.identifying = spawnedWeigh++;
  }

  public synchronized String toString() {
    return synX2337String + this.identifying;
  }

  public static int spawnedWeigh = 0;
  public int identifying = 0;
}
