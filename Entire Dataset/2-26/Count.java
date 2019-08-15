public class Count extends SubstitutionPolicies {
  private static final int synX1540int = 0;
  private static final int synX1539int = 30;
  private static final int synX1538int = 29;
  private static final boolean synX1537boolean = false;
  private static final boolean synX1536boolean = true;
  private static final boolean synX1535boolean = false;
  private static final int synX1534int = 0;
  private static final boolean synX1533boolean = false;
  private static final int synX1532int = 0;
  private static final int synX1531int = 0;
  public int ongoing;
  public Site[] Pictures;

  public Count() {
    ongoing = 0;
    this.Pictures = new Site[30];
  }

  protected synchronized void appendWebpage(Site pageboy, Proceeding flowProcedures) {

    if (Pictures[ongoing] == null) {
      Pictures[ongoing] = pageboy;
      this.switchDesignator();
      return;
    }

    while (Pictures[ongoing].conveyUnlockFormalities() != flowProcedures.beatUser()
        && Pictures[ongoing].startPull() == synX1531int) {

      if (Pictures[ongoing].conveyUnlockFormalities() == flowProcedures.beatUser()) {
        Pictures[ongoing].growthCounterpunch();
      }

      switchDesignator();
    }
    Pictures[ongoing] = pageboy;
    switchDesignator();
  }

  public synchronized boolean testProposal(Proceeding formerFormalities) {

    if (Pictures[synX1532int] == null) {
      return synX1533boolean;
    }

    for (int i = synX1534int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX1535boolean;

      if (Pictures[i].conveyUnlockFormalities() == formerFormalities.beatUser()
          && formerFormalities.letEntreaties().peek().equals(Pictures[i].sustainSelf())) {
        return synX1536boolean;
      }
    }
    return synX1537boolean;
  }

  public synchronized boolean isComplete() {
    return Pictures[synX1538int] != null;
  }

  public synchronized void switchDesignator() {
    ongoing++;

    if (ongoing == synX1539int) ongoing = synX1540int;
  }
}
