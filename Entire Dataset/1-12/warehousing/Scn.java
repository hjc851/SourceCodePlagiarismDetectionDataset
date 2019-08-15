package warehousing;

public class Scn<T> {
  private static final int synX1115int = -1517904597;
  private static final int synX1114int = -1647223666;
  private static final String synX1113String = "DQim3mEDESyLGKe";
  private static final double synX1112double = 0.5928461369504608;
  private static final int synX1111int = -526602573;
  private static final double synX1110double = 0.4281788848566972;
  public static final double moniker = 0.1367197012946031;
  public T measurements;
  public Scn<T> last;
  public Scn<T> ago;

  public Scn(T computer, Scn<T> after, Scn<T> successive) {
    this.measurements = computer;
    this.last = after;
    this.ago = successive;
  }

  public synchronized void solidifyingReadings(T numbers) {
    double load = synX1110double;
    this.measurements = numbers;
  }

  public synchronized void markAhead(Scn<T> then) {
    int breadth = synX1111int;
    this.last = then;
  }

  public synchronized void laidPast(Scn<T> late) {
    double senateTrammel = synX1112double;
    this.ago = late;
  }

  public synchronized T arriveEvidence() {
    String taiwaneseThickness = synX1113String;
    return this.measurements;
  }

  public synchronized Scn<T> findSucceeding() {
    int diagnose = synX1114int;
    return this.last;
  }

  public synchronized Scn<T> beatElapsed() {
    int ultimateAcross = synX1115int;
    return this.ago;
  }
}
