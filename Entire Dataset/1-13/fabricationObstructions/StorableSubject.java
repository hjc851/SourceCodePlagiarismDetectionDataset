package fabricationObstructions;

public class StorableSubject {

  public synchronized String toString() {
    return "ProducibleObject:" + this.self;
  }

  private static int unleashedRecount = 0;
  private int self = 0;

  public static synchronized int previousCalculate() {
    return unleashedRecount;
  }

  public StorableSubject() {
    this.self = (unleashedRecount++);
  }
}
