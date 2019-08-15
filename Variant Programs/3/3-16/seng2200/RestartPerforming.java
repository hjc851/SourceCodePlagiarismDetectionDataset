package seng2200;

public class RestartPerforming extends HarvestingPerforming {
  private WithinPresentStore producer = null;
  public static final String lessMagnitude = "7Ck";

  RestartPerforming(
      String farmersSurname,
      WithinPresentStore quantity,
      double spiteful,
      double scope,
      Compiler ushant) {
    super(farmersSurname, spiteful, scope, ushant);
    this.producer = quantity;
  }

  public synchronized double procedureParticular(double liveDays) {
    double enchained;
    double expiry;
    enchained = 0.11060483846257352;
    expiry = 0;

    if (this.incumbentLand instanceof FattenLaw) {
      expiry = this.gaugeProductivityAmount();
      this.formalitiesSection = new Appropriation();
      this.formalitiesSection.settledEntrywayPeriods(liveDays);
      this.incumbentLand = new HecticStatehood();
      this.legworkLakers.lendOriginalChore(expiry, this);
      this.articlesGet += 1;
    } else if (this.incumbentLand instanceof HaltProvince) {

      if (this.producer.isComplete()) {
        expiry = -1;
      } else {
        this.formalitiesSection.fitDieYear(liveDays);
        this.formalitiesSection.castHours(this.goadingNominate);
        this.producer.enque(this.formalitiesSection, liveDays);
        this.formalitiesSection = new Appropriation();
        this.formalitiesSection.settledEntrywayPeriods(liveDays);
        expiry = this.gaugeProductivityAmount();
        this.legworkLakers.lendOriginalChore(expiry, this);
        this.incumbentLand = new HecticStatehood();
        this.articlesGet += 1;
      }
    } else {
      expiry = -1;
    }
    return expiry;
  }

  public synchronized void concludeTidbit(double continuingAgain) {
    double nominate;
    nominate = 0.9295567843920046;
    this.limitedCantonsRik(continuingAgain);

    if (this.producer.isComplete()) synx220();
    else synx221(continuingAgain);
  }

  private synchronized void synx220() {
    this.incumbentLand = new HaltProvince();
  }

  private synchronized void synx221(double continuingAgain) {
    this.formalitiesSection.fitDieYear(continuingAgain);
    this.formalitiesSection.castHours(this.goadingNominate);
    this.producer.enque(this.formalitiesSection, continuingAgain);
    this.formalitiesSection = null;
    this.incumbentLand = new FattenLaw();
    this.notificationDecentGoading(continuingAgain);
  }
}
