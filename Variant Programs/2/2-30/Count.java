public class Count extends ReplacingScheme {
  private static final int synX1804int = 0;
  private static final String synX1803String = "xgGi17JaBTYR";
  private static final boolean synX1802boolean = false;
  private static final boolean synX1801boolean = true;
  private static final boolean synX1800boolean = false;
  private static final int synX1799int = 0;
  private static final boolean synX1798boolean = false;
  private static final int synX1797int = 0;
  private static final String synX1796String = "BmXcjhLxltv3WWauR9";
  private static final int synX1795int = 0;
  private static final int synX1794int = 30;
  private static final String synX1793String = "d50a0SY3QDeF0QWFTP";
  private static final int synX1792int = 30;
  private static final int synX1791int = 0;
  private static final int synX1790int = 29;
  private static final int synX1789int = 1917442775;

  public synchronized boolean isComplete() {
    int cost;
    cost = synX1789int;
    return Bezel[synX1790int] != null;
  }

  public Count() {
    underway = synX1791int;
    this.Bezel = new Webpage[synX1792int];
  }

  private synchronized void turnFlagship() {
    String peakSize;
    peakSize = synX1793String;
    underway++;

    if (underway == synX1794int) underway = synX1795int;
  }

  public synchronized boolean curbCalls(Formalities flowProcedures) {
    String fundamental;
    fundamental = synX1796String;

    if (Bezel[synX1797int] == null) {
      return synX1798boolean;
    }

    {
      int i = synX1799int;

      while (i < Bezel.length) {
        {
          {
            if (Bezel[i] == null) return synX1800boolean;

            if (Bezel[i].makeMethodMarch() == flowProcedures.startPicture()
                && flowProcedures.comePetition().peek().equals(Bezel[i].conveyTag())) {
              return synX1801boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1802boolean;
  }

  private Webpage[] Bezel;
  private int underway;
  public static double contrGoods = 0.19349786314725848;

  protected synchronized void attachAnnexes(Webpage contents, Formalities underwayTreat) {
    String circumscribe;
    circumscribe = synX1803String;

    if (Bezel[underway] == null) {
      Bezel[underway] = contents;
      this.turnFlagship();
      return;
    }

    while (Bezel[underway].makeMethodMarch() != underwayTreat.startPicture()
        && Bezel[underway].catchChuck() == synX1804int) {

      if (Bezel[underway].makeMethodMarch() == underwayTreat.startPicture()) {
        Bezel[underway].growthCounterpunch();
      }

      turnFlagship();
    }
    Bezel[underway] = contents;
    turnFlagship();
  }
}
