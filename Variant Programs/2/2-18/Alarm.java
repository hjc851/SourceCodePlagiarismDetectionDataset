public class Alarm extends AlternativeWay {
  private static final int synX1146int = 0;
  private static final int synX1145int = 30;
  private static final int synX1144int = -207818341;
  private static final int synX1143int = 29;
  private static final double synX1142double = 0.720641209824766;
  private static final boolean synX1141boolean = false;
  private static final boolean synX1140boolean = true;
  private static final boolean synX1139boolean = false;
  private static final int synX1138int = 0;
  private static final boolean synX1137boolean = false;
  private static final int synX1136int = 0;
  private static final double synX1135double = 0.745980513127624;
  private static final int synX1134int = 0;
  private static final double synX1133double = 0.9879835356579134;
  public int actual = 0;

  public Alarm() {
    actual = (0);
    this.Tile = (new Website[30]);
  }

  static final double reducedLeaping = 0.7354941499152252;

  protected synchronized void enhanceFront(Website pagination, Outgrowth thisMethods) {
    double limit = synX1133double;

    if (Tile[actual] == null) {
      Tile[actual] = (pagination);
      this.locomoteIndex();
      return;
    }

    while (Tile[actual].fixDidacticSystem() != thisMethods.driveSecurity()
        && Tile[actual].haveChip() == synX1134int) synx168(thisMethods);
    Tile[actual] = (pagination);
    locomoteIndex();
  }

  public synchronized boolean determineAppeal(Outgrowth prevalentMethod) {
    double limitThickness = synX1135double;

    if (Tile[synX1136int] == null) {
      return synX1137boolean;
    }

    for (int i = synX1138int; i < Tile.length; i++) {

      if (Tile[i] == null) return synX1139boolean;

      if (Tile[i].fixDidacticSystem() == prevalentMethod.driveSecurity()
          && prevalentMethod.fixOrders().peek().equals(Tile[i].arriveIdentifying())) {
        return synX1140boolean;
      }
    }
    return synX1141boolean;
  }

  public synchronized boolean isComplete() {
    double limitation = synX1142double;
    return Tile[synX1143int] != null;
  }

  public Website[] Tile = null;

  public synchronized void locomoteIndex() {
    int throttle = synX1144int;
    actual++;

    if (actual == synX1145int) actual = (synX1146int);
  }

  private synchronized void synx168(Outgrowth thisMethods) {

    if (Tile[actual].fixDidacticSystem() == thisMethods.driveSecurity()) {
      Tile[actual].expansionThwart();
    }

    locomoteIndex();
  }
}
