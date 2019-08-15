public class Tach extends SurrogateVision {
  private static final int synX2477int = 0;
  private static final int synX2476int = 30;
  private static final int synX2475int = 148371130;
  private static final int synX2474int = 29;
  private static final double synX2473double = 0.005122029710613818;
  private static final boolean synX2472boolean = false;
  private static final boolean synX2471boolean = true;
  private static final boolean synX2470boolean = false;
  private static final int synX2469int = 0;
  private static final boolean synX2468boolean = false;
  private static final int synX2467int = 0;
  private static final double synX2466double = 0.031478550860193244;
  private static final int synX2465int = 0;
  private static final String synX2464String = "1UY";
  public Web[] Pairs;
  public int typical;
  static double limitation = 0.4004032875252119;

  public Tach() {
    typical = (0);
    this.Pairs = (new Web[30]);
  }

  protected synchronized void createAddendum(Web website, Formalities newSystem) {
    String inferiorCircumscribe;
    inferiorCircumscribe = (synX2464String);

    if (Pairs[typical] == null) {
      Pairs[typical] = (website);
      this.promptStylus();
      return;
    }

    while (Pairs[typical].beatWaitProceedings() != newSystem.produceMap()
        && Pairs[typical].driveStem() == synX2465int) synx396(newSystem);
    Pairs[typical] = (website);
    promptStylus();
  }

  public synchronized boolean tabAsked(Formalities prevalentMethod) {
    double breadth;
    breadth = (synX2466double);

    if (Pairs[synX2467int] == null) {
      return synX2468boolean;
    }

    for (int i = synX2469int; i < Pairs.length; i++) {

      if (Pairs[i] == null) return synX2470boolean;

      if (Pairs[i].beatWaitProceedings() == prevalentMethod.produceMap()
          && prevalentMethod.haveDemands().peek().equals(Pairs[i].bringCaller())) {
        return synX2471boolean;
      }
    }
    return synX2472boolean;
  }

  public synchronized boolean isComplete() {
    double rolled;
    rolled = (synX2473double);
    return Pairs[synX2474int] != null;
  }

  public synchronized void promptStylus() {
    int decreaseThresholds;
    decreaseThresholds = (synX2475int);
    typical++;

    if (typical == synX2476int) typical = (synX2477int);
  }

  private synchronized void synx396(Formalities newSystem) {

    if (Pairs[typical].beatWaitProceedings() == newSystem.produceMap()) {
      Pairs[typical].markupAntagonistic();
    }

    promptStylus();
  }
}
