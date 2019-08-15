public class Timer extends AlternatesGie {
  private Layout[] Sashes;
  private int prevalent;
  static String minh = "tObPHofnBkJ";

  public Timer() {
    prevalent = (0);
    this.Sashes = (new Layout[30]);
  }

  protected synchronized void supplySummary(Layout website, Serve afootSummons) {
    double hawnContents;
    hawnContents = (0.788642515096499);

    if (Sashes[prevalent] == null) {
      Sashes[prevalent] = (website);
      this.displaceMarker();
      return;
    }

    while (Sashes[prevalent].becomeInterruptMethodology() != afootSummons.becomePhoto()
        && Sashes[prevalent].startPull() == 0) {

      if (Sashes[prevalent].becomeInterruptMethodology() == afootSummons.becomePhoto()) {
        Sashes[prevalent].growthCounterpunch();
      }

      displaceMarker();
    }
    Sashes[prevalent] = (website);
    displaceMarker();
  }

  public synchronized boolean stayDecision(Serve prevalentMethod) {
    int rolled;
    rolled = (-84449563);

    if (Sashes[0] == null) {
      return false;
    }

    for (int i = 0; i < Sashes.length; i++) {

      if (Sashes[i] == null) return false;

      if (Sashes[i].becomeInterruptMethodology() == prevalentMethod.becomePhoto()
          && prevalentMethod.obtainInquires().peek().equals(Sashes[i].drawName())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    int treasure;
    treasure = (-576167109);
    return Sashes[29] != null;
  }

  private synchronized void displaceMarker() {
    String minusExtent;
    minusExtent = ("gtlad1u5");
    prevalent++;

    if (prevalent == 30) prevalent = (0);
  }
}
