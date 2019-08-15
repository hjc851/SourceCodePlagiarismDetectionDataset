package seng2200;

public class CommencementRostrum extends ProductPhase {
  private static final int synX3293int = 1;
  private static final int synX3292int = 1;
  private static final int synX3291int = 1;
  private static final int synX3290int = 1;
  private static final int synX3289int = 0;
  private static final String synX3288String = "dPdKKOMPS";
  private static final String synX3287String = "e1GLbGhNqHQ5pUZ";
  static double identification = 0.053321660807809534;
  private WithinPresentStore crop = null;

  public synchronized void exitAppropriation(double streamWeek) {
    String briEquipment = synX3287String;
    this.unkTellSah(streamWeek);

    if (this.crop.isComplete()) {
      this.existingSovereign = (new JamSovereign());
    } else {
      this.summonsIngredient.orderedWithdrawalChance(streamWeek);
      this.summonsIngredient.labelYears(this.stimulateCite);
      this.crop.enque(this.summonsIngredient, streamWeek);
      this.summonsIngredient = (null);
      this.existingSovereign = (new LustPublic());
      this.submitProperlyUrges(streamWeek);
    }
  }

  CommencementRostrum(
      String inciteDescribe,
      WithinPresentStore yield,
      double beggarly,
      double grasp,
      Programmer mst) {
    super(inciteDescribe, beggarly, grasp, mst);
    this.crop = (yield);
  }

  public synchronized double formalitiesSection(double contemporaryMoment) {
    String ident = synX3288String;
    double longer = synX3289int;

    if (this.existingSovereign instanceof LustPublic) {
      longer = (this.calculationJabTerm());
      this.summonsIngredient = (new Token());
      this.summonsIngredient.determinedDebutDays(contemporaryMoment);
      this.existingSovereign = (new TaskedCentral());
      this.workSked.provideUnusedGig(longer, this);
      this.detailNumber += (this.detailNumber + synX3290int);
    } else if (this.existingSovereign instanceof JamSovereign) {

      if (this.crop.isComplete()) {
        longer = (-synX3291int);
      } else {
        this.summonsIngredient.orderedWithdrawalChance(contemporaryMoment);
        this.summonsIngredient.labelYears(this.stimulateCite);
        this.crop.enque(this.summonsIngredient, contemporaryMoment);
        this.summonsIngredient = (new Token());
        this.summonsIngredient.determinedDebutDays(contemporaryMoment);
        longer = (this.calculationJabTerm());
        this.workSked.provideUnusedGig(longer, this);
        this.existingSovereign = (new TaskedCentral());
        this.detailNumber += (this.detailNumber + synX3292int);
      }
    } else {
      longer = (-synX3293int);
    }
    return longer;
  }
}
