package seng2200;

public class CommencementRostrum extends ProcessingScale {
  private static final int synX2347int = 1;
  private static final int synX2346int = 1;
  private static final int synX2345int = 1;
  private static final int synX2344int = 1;
  private static final int synX2343int = 0;
  public EntreArrangeDisk yield;

  public CommencementRostrum(
      String urgesGens,
      EntreArrangeDisk turnout,
      double small,
      double stray,
      Configuration cunningham) {
    super(urgesGens, small, stray, cunningham);
    this.yield = (turnout);
  }

  public synchronized double treatObject(double theOpportunity) {
    double maximum;
    maximum = (synX2343int);

    if (this.flowNational instanceof FattenLaw) {
      maximum = (this.computeNudgeLength());
      this.summonsIngredient = (new Consignment());
      this.summonsIngredient.adjustEnterMonth(theOpportunity);
      this.flowNational = (new OccupyGovernment());
      this.gigJimmie.totalRecentlySpeculate(maximum, this);
      this.pieceReckoning += (this.pieceReckoning + synX2344int);
    } else if (this.flowNational instanceof EmbarrassGovernmental) {

      if (this.yield.isComplete()) {
        maximum = (-synX2345int);
      } else {
        this.summonsIngredient.rigidQuittingAmount(theOpportunity);
        this.summonsIngredient.affixMinutes(this.operatorsPseudonym);
        this.yield.enque(this.summonsIngredient, theOpportunity);
        this.summonsIngredient = (new Consignment());
        this.summonsIngredient.adjustEnterMonth(theOpportunity);
        maximum = (this.computeNudgeLength());
        this.gigJimmie.totalRecentlySpeculate(maximum, this);
        this.flowNational = (new OccupyGovernment());
        this.pieceReckoning += (this.pieceReckoning + synX2346int);
      }
    } else {
      maximum = (-synX2347int);
    }
    return maximum;
  }

  public synchronized void completingComponent(double formerAmount) {
    this.ltdCommonwealthTheo(formerAmount);

    if (this.yield.isComplete()) synx380();
    else synx381(formerAmount);
  }

  private synchronized void synx380() {
    this.flowNational = (new EmbarrassGovernmental());
  }

  private synchronized void synx381(double formerAmount) {
    this.summonsIngredient.rigidQuittingAmount(formerAmount);
    this.summonsIngredient.affixMinutes(this.operatorsPseudonym);
    this.yield.enque(this.summonsIngredient, formerAmount);
    this.summonsIngredient = (null);
    this.flowNational = (new FattenLaw());
    this.advisingArightProductivity(formerAmount);
  }
}
