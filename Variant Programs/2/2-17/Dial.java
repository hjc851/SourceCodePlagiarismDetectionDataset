public class Dial extends ReplacingScheme {

  public synchronized boolean isComplete() {
    return Rims[29] != null;
  }

  public Layout[] Rims = null;

  protected synchronized void provideLayout(Layout site, System afootSummons) {

    if (Rims[contemporary] == null) {
      Rims[contemporary] = (site);
      this.displaceMarker();
      return;
    }

    while (Rims[contemporary].catchAddSue() != afootSummons.goQuod()
        && Rims[contemporary].makeBars() == 0) synx149(afootSummons);
    Rims[contemporary] = (site);
    displaceMarker();
  }

  public synchronized boolean breakWishes(System previousProceeding) {

    if (Rims[0] == null) {
      return false;
    }

    for (int i = 0; i < Rims.length; i++) {

      if (Rims[i] == null) return false;

      if (Rims[i].catchAddSue() == previousProceeding.goQuod()
          && previousProceeding.obtainInquires().peek().equals(Rims[i].developPeg())) {
        return true;
      }
    }
    return false;
  }

  public synchronized void displaceMarker() {
    contemporary++;

    if (contemporary == 30) contemporary = (0);
  }

  public int contemporary = 0;

  public Dial() {
    contemporary = (0);
    this.Rims = (new Layout[30]);
  }

  private synchronized void synx149(System afootSummons) {

    if (Rims[contemporary].catchAddSue() == afootSummons.goQuod()) {
      Rims[contemporary].growthCounterpunch();
    }

    displaceMarker();
  }
}
