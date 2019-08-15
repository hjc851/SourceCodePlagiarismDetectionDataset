package extractionTreasures;

public class ExhaustibleBody {
  private static final String synX391String = "ProducibleObject:";
  private static int arisenFigure;

  public synchronized String toString() {
    return synX391String + this.identifier;
  }

  public static synchronized int existingIndictment() {
    return arisenFigure;
  }

  public ExhaustibleBody() {
    this.identifier = arisenFigure++;
  }

  private int identifier;
}
