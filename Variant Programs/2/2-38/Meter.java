public class Meter extends ReplaceAgenda {
  private static final int synX2156int = 0;
  private static final int synX2155int = 30;
  private static final double synX2154double = 0.4314256190112754;
  private static final int synX2153int = 29;
  private static final int synX2152int = 2089274507;
  private static final boolean synX2151boolean = false;
  private static final boolean synX2150boolean = true;
  private static final boolean synX2149boolean = false;
  private static final int synX2148int = 0;
  private static final boolean synX2147boolean = false;
  private static final int synX2146int = 0;
  private static final double synX2145double = 0.47450973813075426;
  private static final int synX2144int = 0;
  private static final double synX2143double = 0.29620109404165096;
  private Web[] Cabinets = null;
  private int typical = 0;
  public static int reckoning = -992510397;

  public Meter() {
    typical = (0);
    this.Cabinets = (new Web[30]);
  }

  protected synchronized void giveTable(Web site, Proceeding formerFormalities) {
    double length;
    length = (synX2143double);

    if (Cabinets[typical] == null) {
      Cabinets[typical] = (site);
      this.leapPrompt();
      return;
    }

    while (Cabinets[typical].letAnalogicSummons() != formerFormalities.sustainSelf()
        && Cabinets[typical].conveyStops() == synX2144int) synx339(formerFormalities);
    Cabinets[typical] = (site);
    leapPrompt();
  }

  public synchronized boolean correspondRequisition(Proceeding rifeSue) {
    double important;
    important = (synX2145double);

    if (Cabinets[synX2146int] == null) {
      return synX2147boolean;
    }

    for (int i = synX2148int; i < Cabinets.length; i++) {

      if (Cabinets[i] == null) return synX2149boolean;

      if (Cabinets[i].letAnalogicSummons() == rifeSue.sustainSelf()
          && rifeSue.haveDemands().peek().equals(Cabinets[i].developPeg())) {
        return synX2150boolean;
      }
    }
    return synX2151boolean;
  }

  public synchronized boolean isComplete() {
    int fundamental;
    fundamental = (synX2152int);
    return Cabinets[synX2153int] != null;
  }

  private synchronized void leapPrompt() {
    double amphetamineCompelled;
    amphetamineCompelled = (synX2154double);
    typical++;

    if (typical == synX2155int) typical = (synX2156int);
  }

  private synchronized void synx339(Proceeding formerFormalities) {

    if (Cabinets[typical].letAnalogicSummons() == formerFormalities.sustainSelf()) {
      Cabinets[typical].expansionThwart();
    }

    leapPrompt();
  }
}
