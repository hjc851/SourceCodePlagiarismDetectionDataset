package disc;

import extractionTreasures.DepositionalObjet;

public class CacheDisk extends TournamentShow {
  private DepositionalObjet nonexempt = null;
  public static final String SawExpel = "DID_REMOVE";

  public CacheDisk(double years, String reporting, int workforce, DepositionalObjet study) {
    this.moment = (years);
    this.information = (reporting);
    this.overcapacity = (workforce);
    this.nonexempt = (study);
  }

  public synchronized DepositionalObjet goal() {
    return this.nonexempt;
  }

  public synchronized int resources() {
    return this.overcapacity;
  }

  private int overcapacity = 0;
  public static final String CameCombine = "DID_ADD";
}
