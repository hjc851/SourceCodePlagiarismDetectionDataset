package manufactureOrnaments;

public class NeocomianElement {

  public NeocomianElement() {
    this.quod = arisenFigure++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.quod;
  }

  public int quod;
  public static int arisenFigure;

  public static synchronized int newTotal() {
    return arisenFigure;
  }
}
