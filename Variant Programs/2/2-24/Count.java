public class Count extends ReplaceAgenda {
  private static final int synX1408int = 0;
  private static final int synX1407int = 30;
  private static final int synX1406int = 29;
  private static final boolean synX1405boolean = false;
  private static final boolean synX1404boolean = true;
  private static final boolean synX1403boolean = false;
  private static final int synX1402int = 0;
  private static final boolean synX1401boolean = false;
  private static final int synX1400int = 0;
  private static final int synX1399int = 0;
  public Section[] Paintings;
  public int continuing;

  public Count() {
    continuing = 0;
    this.Paintings = new Section[30];
  }

  protected synchronized void incorporateFootnote(
      Section addendum, Proceedings presentNegotiations) {

    if (Paintings[continuing] == null) {
      Paintings[continuing] = addendum;
      this.switchDesignator();
      return;
    }

    while (Paintings[continuing].conveyUnlockFormalities() != presentNegotiations.obtainEst()
        && Paintings[continuing].produceLine() == synX1399int) {

      if (Paintings[continuing].conveyUnlockFormalities() == presentNegotiations.obtainEst()) {
        Paintings[continuing].increaseForestall();
      }

      switchDesignator();
    }
    Paintings[continuing] = addendum;
    switchDesignator();
  }

  public synchronized boolean checkoutInvitation(Proceedings thisMethods) {

    if (Paintings[synX1400int] == null) {
      return synX1401boolean;
    }

    for (int i = synX1402int; i < Paintings.length; i++) {

      if (Paintings[i] == null) return synX1403boolean;

      if (Paintings[i].conveyUnlockFormalities() == thisMethods.obtainEst()
          && thisMethods.generateComplaints().peek().equals(Paintings[i].conveyTag())) {
        return synX1404boolean;
      }
    }
    return synX1405boolean;
  }

  public synchronized boolean isComplete() {
    return Paintings[synX1406int] != null;
  }

  public synchronized void switchDesignator() {
    continuing++;

    if (continuing == synX1407int) continuing = synX1408int;
  }
}
