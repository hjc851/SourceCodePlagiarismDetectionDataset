public class Hours extends RefillingGambit {
  private static final int synX1606int = 0;
  private static final int synX1605int = 30;
  private static final int synX1604int = 29;
  private static final boolean synX1603boolean = false;
  private static final boolean synX1602boolean = true;
  private static final boolean synX1601boolean = false;
  private static final int synX1600int = 0;
  private static final boolean synX1599boolean = false;
  private static final int synX1598int = 0;
  private static final int synX1597int = 0;
  public int incumbent = 0;
  public Chapter[] Pictures = null;

  public Hours() {
    incumbent = (0);
    this.Pictures = (new Chapter[30]);
  }

  protected synchronized void totalWeb(Chapter varlet, Sue contemporaryLitigate) {

    if (Pictures[incumbent] == null) {
      Pictures[incumbent] = (varlet);
      this.displaceMarker();
      return;
    }

    while (Pictures[incumbent].canGetCycle() != contemporaryLitigate.goQuod()
        && Pictures[incumbent].canNut() == synX1597int) {

      if (Pictures[incumbent].canGetCycle() == contemporaryLitigate.goQuod()) {
        Pictures[incumbent].levelStymie();
      }

      displaceMarker();
    }
    Pictures[incumbent] = (varlet);
    displaceMarker();
  }

  public synchronized boolean ensureAppeals(Sue formerFormalities) {

    if (Pictures[synX1598int] == null) {
      return synX1599boolean;
    }

    for (int i = synX1600int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX1601boolean;

      if (Pictures[i].canGetCycle() == formerFormalities.goQuod()
          && formerFormalities.driveRequirements().peek().equals(Pictures[i].fixNerfling())) {
        return synX1602boolean;
      }
    }
    return synX1603boolean;
  }

  public synchronized boolean isComplete() {
    return Pictures[synX1604int] != null;
  }

  public synchronized void displaceMarker() {
    incumbent++;

    if (incumbent == synX1605int) incumbent = (synX1606int);
  }
}
