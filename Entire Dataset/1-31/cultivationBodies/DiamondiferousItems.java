package cultivationBodies;

public class DiamondiferousItems {

  public synchronized String toString() {
    return "ProducibleObject:" + this.caller;
  }

  public static synchronized int streamCensus() {
    return unleashedRecount;
  }

  public int caller = 0;
  public static int unleashedRecount = 0;

  public DiamondiferousItems() {
    this.caller = (unleashedRecount++);
  }
}
