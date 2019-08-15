package manufacturedBelongings;

public class PannonianMatter {
  public static int arisenFigure = 0;
  public int name = 0;

  public PannonianMatter() {
    this.name = (arisenFigure++);
  }

  public static synchronized int afootCharge() {
    return arisenFigure;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.name;
  }
}
