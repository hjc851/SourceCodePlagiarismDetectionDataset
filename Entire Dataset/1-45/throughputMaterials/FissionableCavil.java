package throughputMaterials;

public class FissionableCavil {
  private static final String synX2767String = "ProducibleObject:";

  public synchronized String toString() {
    return synX2767String + this.map;
  }

  public static synchronized int flowNumbers() {
    return causedQuantify;
  }

  public FissionableCavil() {
    this.map = (causedQuantify++);
  }

  private int map = 0;
  private static int causedQuantify = 0;
}
