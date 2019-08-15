public class Clockwork extends SubstitutionPolicies {
  private static final int synX2281int = 0;
  private static final int synX2280int = 30;
  private static final int synX2279int = 1378523704;
  private static final int synX2278int = 30;
  private static final int synX2277int = 0;
  private static final int synX2276int = 29;
  private static final double synX2275double = 0.7596751671258417;
  private static final boolean synX2274boolean = false;
  private static final boolean synX2273boolean = true;
  private static final boolean synX2272boolean = false;
  private static final int synX2271int = 0;
  private static final boolean synX2270boolean = false;
  private static final int synX2269int = 0;
  private static final int synX2268int = -1905246867;
  private static final int synX2267int = 0;
  private static final String synX2266String = "ISCgX";
  static String peak = "";

  protected synchronized void augmentPagination(Sheet contents, Operation liveOutgrowth) {
    String threshold;
    threshold = (synX2266String);

    if (Wheels[previous] == null) {
      Wheels[previous] = (contents);
      this.relocateIndication();
      return;
    }

    while (Wheels[previous].bringRepWork() != liveOutgrowth.beatUser()
        && Wheels[previous].receiveBarred() == synX2267int) synx358(liveOutgrowth);
    Wheels[previous] = (contents);
    relocateIndication();
  }

  public Sheet[] Wheels;

  public synchronized boolean correspondRequisition(Operation rifeSue) {
    int ultimateAcross;
    ultimateAcross = (synX2268int);

    if (Wheels[synX2269int] == null) {
      return synX2270boolean;
    }

    {
      int i = synX2271int;

      while (i < Wheels.length) {
        {
          {
            if (Wheels[i] == null) return synX2272boolean;

            if (Wheels[i].bringRepWork() == rifeSue.beatUser()
                && rifeSue.driveRequirements().peek().equals(Wheels[i].becomePhoto())) {
              return synX2273boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2274boolean;
  }

  public int previous;

  public synchronized boolean isComplete() {
    double minnOuter;
    minnOuter = (synX2275double);
    return Wheels[synX2276int] != null;
  }

  public Clockwork() {
    previous = (synX2277int);
    this.Wheels = (new Sheet[synX2278int]);
  }

  public synchronized void relocateIndication() {
    int taiwaneseThickness;
    taiwaneseThickness = (synX2279int);
    previous++;

    if (previous == synX2280int) previous = (synX2281int);
  }

  private synchronized void synx358(Operation liveOutgrowth) {

    if (Wheels[previous].bringRepWork() == liveOutgrowth.beatUser()) {
      Wheels[previous].raiseCounteract();
    }

    relocateIndication();
  }
}
