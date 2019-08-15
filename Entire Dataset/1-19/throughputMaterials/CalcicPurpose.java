package throughputMaterials;

public class CalcicPurpose {

  public CalcicPurpose() {
    this.dimidiate = (formedTally++);
  }

  private int dimidiate;
  private static int formedTally;

  public static synchronized int incumbentEnumeration() {
    return formedTally;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.dimidiate;
  }
}
