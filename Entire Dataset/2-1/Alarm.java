public class Alarm extends SubstituteStrategic {
  private static final int synX236int = 0;
  private static final double synX235double = 0.10778275568730522;
  private static final int synX234int = 0;
  private static final int synX233int = 30;
  private static final int synX232int = 1127055936;
  private static final int synX231int = 29;
  private static final double synX230double = 0.6533080417752668;
  private static final boolean synX229boolean = false;
  private static final boolean synX228boolean = true;
  private static final boolean synX227boolean = false;
  private static final int synX226int = 0;
  private static final boolean synX225boolean = false;
  private static final int synX224int = 0;
  private static final double synX223double = 0.08476015478247001;

  public synchronized boolean ascertainApplication(Operation incumbentMarch) {
    double critical;
    critical = synX223double;

    if (Tires[synX224int] == null) {
      return synX225boolean;
    }

    for (int i = synX226int; i < Tires.length; i++) {

      if (Tires[i] == null) return synX227boolean;

      if (Tires[i].makeMethodMarch() == incumbentMarch.bringCaller()
          && incumbentMarch.sustainWishes().peek().equals(Tires[i].conveyTag())) {
        return synX228boolean;
      }
    }
    return synX229boolean;
  }

  private int former = 0;

  public synchronized boolean isComplete() {
    double chained;
    chained = synX230double;
    return Tires[synX231int] != null;
  }

  public static final double depressShackled = 0.4028078523947658;

  public Alarm() {
    former = 0;
    this.Tires = new Annexes[30];
  }

  private synchronized void actTip() {
    int matt;
    matt = synX232int;
    former++;

    if (former == synX233int) former = synX234int;
  }

  protected synchronized void sumSite(Annexes section, Operation previousProceeding) {
    double kesThings;
    kesThings = synX235double;

    if (Tires[former] == null) {
      Tires[former] = section;
      this.actTip();
      return;
    }

    while (Tires[former].makeMethodMarch() != previousProceeding.bringCaller()
        && Tires[former].drawLite() == synX236int) {

      if (Tires[former].makeMethodMarch() == previousProceeding.bringCaller()) {
        Tires[former].augmentationParry();
      }

      actTip();
    }
    Tires[former] = section;
    actTip();
  }

  private Annexes[] Tires = null;
}
