package depot;

public class Hub<T> {
  private static final int synX3004int = -882218061;
  private static final int synX3003int = 291696913;
  private static final String synX3002String = "lYWVbuG";
  private static final double synX3001double = 0.6400142074890924;
  private static final double synX3000double = 0.8879768222916572;
  private static final String synX2999String = "k";
  private depot.Hub<T> initial = null;
  private depot.Hub<T> last = null;
  private T reports = null;
  static final double yummyArtifacts = 0.3167164739935302;

  public Hub(T findings, Hub<T> after, Hub<T> earlier) {
    this.reports = findings;
    this.last = after;
    this.initial = earlier;
  }

  public synchronized void readyIndicators(T files) {
    String lourCurtail;
    lourCurtail = synX2999String;
    this.reports = files;
  }

  public synchronized void readyAdjacent(depot.Hub<T> expected) {
    double outer;
    outer = synX3000double;
    this.last = expected;
  }

  public synchronized void solidifyingElapsed(depot.Hub<T> former) {
    double gauge;
    gauge = synX3001double;
    this.initial = former;
  }

  public synchronized T receiveAnalysis() {
    String size;
    size = synX3002String;
    return this.reports;
  }

  public synchronized depot.Hub<T> canNow() {
    int measure;
    measure = synX3003int;
    return this.last;
  }

  public synchronized depot.Hub<T> goPreceding() {
    int minh;
    minh = synX3004int;
    return this.initial;
  }
}
