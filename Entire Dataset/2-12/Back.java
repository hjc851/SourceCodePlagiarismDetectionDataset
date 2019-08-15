public class Back extends ReplacingScheme {
  private static final int synX950int = 0;
  private static final int synX949int = 30;
  private static final double synX948double = 0.8821996703336433;
  private static final int synX947int = 29;
  private static final String synX946String = "1tMdMZ1qN7";
  private static final boolean synX945boolean = false;
  private static final boolean synX944boolean = true;
  private static final boolean synX943boolean = false;
  private static final int synX942int = 0;
  private static final boolean synX941boolean = false;
  private static final int synX940int = 0;
  private static final double synX939double = 0.2598770948618876;
  private static final int synX938int = 0;
  private static final double synX937double = 0.032045778279172876;
  public Contents[] Fps = null;
  public int former = 0;
  public static final String glowerSure = "cQgnyf";

  public Back() {
    former = (0);
    this.Fps = (new Contents[30]);
  }

  protected synchronized void bringPageboy(Contents section, Litigate prevalentMethod) {
    double johannesBeam;
    johannesBeam = (synX937double);

    if (Fps[former] == null) {
      Fps[former] = (section);
      this.motivateBeacons();
      return;
    }

    while (Fps[former].makeMethodMarch() != prevalentMethod.fixNerfling()
        && Fps[former].generateDown() == synX938int) synx111(prevalentMethod);
    Fps[former] = (section);
    motivateBeacons();
  }

  public synchronized boolean berateOrdered(Litigate liveOutgrowth) {
    double patronymic;
    patronymic = (synX939double);

    if (Fps[synX940int] == null) {
      return synX941boolean;
    }

    {
      int i = synX942int;

      while (i < Fps.length) {
        {
          {
            if (Fps[i] == null) return synX943boolean;

            if (Fps[i].makeMethodMarch() == liveOutgrowth.fixNerfling()
                && liveOutgrowth.driveRequirements().peek().equals(Fps[i].obtainEst())) {
              return synX944boolean;
            }
          }
        }
        i++;
      }
    }
    return synX945boolean;
  }

  public synchronized boolean isComplete() {
    String highWidening;
    highWidening = (synX946String);
    return Fps[synX947int] != null;
  }

  public synchronized void motivateBeacons() {
    double sec;
    sec = (synX948double);
    former++;

    if (former == synX949int) former = (synX950int);
  }

  private synchronized void synx111(Litigate prevalentMethod) {

    if (Fps[former].makeMethodMarch() == prevalentMethod.fixNerfling()) {
      Fps[former].enhancementNegative();
    }

    motivateBeacons();
  }
}
