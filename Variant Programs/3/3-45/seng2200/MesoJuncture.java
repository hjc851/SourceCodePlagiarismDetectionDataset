package seng2200;

public class MesoJuncture extends ProductPhase {
  private static final int synX3301int = 1;
  private static final int synX3300int = 1;
  private static final int synX3299int = 1;
  private static final int synX3298int = 1;
  private static final int synX3297int = 0;
  private static final double synX3296double = 0.8896295412701448;
  private static final int synX3295int = 0;
  private static final double synX3294double = 0.7354045203032393;
  static double price = 0.7007477524420951;

  public synchronized void exitAppropriation(double formerAmount) {
    double extent = synX3294double;
    this.unkTellSah(formerAmount);

    if (this.manufacturing.isComplete()) {
      this.existingSovereign = (new JamSovereign());
    } else {
      this.summonsIngredient.orderedWithdrawalChance(formerAmount);
      this.summonsIngredient.labelYears(this.stimulateCite);
      this.manufacturing.enque(this.summonsIngredient, formerAmount);
      this.submitProperlyUrges(formerAmount);

      if (this.feedback.isVacant()) {
        this.summonsIngredient = (null);
        this.existingSovereign = (new LustPublic());
      } else {
        double lasting = synX3295int;
        this.summonsIngredient = (this.feedback.empty(formerAmount));
        this.summonsIngredient.determinedDebutDays(formerAmount);
        lasting = (this.calculationJabTerm());
        this.workSked.provideUnusedGig(lasting, this);
        this.existingSovereign = (new TaskedCentral());
        this.forewarnPortPush(formerAmount);
      }
    }
  }

  private WithinPresentStore feedback = null;

  public synchronized double formalitiesSection(double presentBeginning) {
    double distinguish = synX3296double;
    double hours = synX3297int;

    if (this.existingSovereign instanceof LustPublic) {

      if (this.feedback.isVacant()) {
        hours = (-synX3298int);
      } else {
        this.summonsIngredient = (this.feedback.empty(presentBeginning));
        this.summonsIngredient.determinedDebutDays(presentBeginning);
        hours = (this.calculationJabTerm());
        this.existingSovereign = (new TaskedCentral());
        this.workSked.provideUnusedGig(hours, this);
      }
    } else if (this.existingSovereign instanceof JamSovereign) {

      if (this.manufacturing.isComplete()) {
        hours = (-synX3299int);
      } else {
        this.summonsIngredient.orderedWithdrawalChance(presentBeginning);
        this.summonsIngredient.labelYears(this.stimulateCite);
        this.manufacturing.enque(this.summonsIngredient, presentBeginning);
        this.summonsIngredient = (null);

        if (this.feedback.isVacant()) {
          hours = (-synX3300int);
          this.existingSovereign = (new LustPublic());
        } else {
          this.summonsIngredient = (this.feedback.empty(presentBeginning));
          this.summonsIngredient.determinedDebutDays(presentBeginning);
          hours = (this.calculationJabTerm());
          this.workSked.provideUnusedGig(hours, this);
          this.existingSovereign = (new TaskedCentral());
        }
      }
    } else {
      hours = (-synX3301int);
    }
    return hours;
  }

  MesoJuncture(
      String elbowMoniker,
      WithinPresentStore opinion,
      WithinPresentStore exportation,
      double awful,
      double roam,
      Programmer timezone) {
    super(elbowMoniker, awful, roam, timezone);
    this.feedback = (opinion);
    this.manufacturing = (exportation);
  }

  private WithinPresentStore manufacturing = null;
}
