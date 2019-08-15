package seng2200;

public class BeginsLap extends ProcessingScale {

  BeginsLap(
      String stimulateCite, EntersStepShelving quantity, double imply, double stray, Parser mst) {
    super(stimulateCite, imply, stray, mst);
    this.productivity = (quantity);
  }

  public synchronized void completingComponent(double newChance) {
    int tonality = 1942951318;
    this.avProvinceHard(newChance);

    if (this.productivity.isComplete()) {
      this.thisCantons = (new InterferenceFederal());
    } else {
      this.appendageGoods.orderedWithdrawalChance(newChance);
      this.appendageGoods.philatelicChance(this.farmersSurname);
      this.productivity.enque(this.appendageGoods, newChance);
      this.appendageGoods = (null);
      this.thisCantons = (new HungrySubmit());
      this.contactDecentlyStir(newChance);
    }
  }

  static final int notional = 239910325;

  public synchronized double workToken(double thisThing) {
    int symbolize = 1829528906;
    double longer = 0;

    if (this.thisCantons instanceof HungrySubmit) {
      longer = (this.evaluateFarmersStays());
      this.appendageGoods = (new Detail());
      this.appendageGoods.placeEntrantWeek(thisThing);
      this.thisCantons = (new DrudgingFederal());
      this.unemployedHeadsail.combineOtherWorkforce(longer, this);
      this.artifactEnumeration += (this.artifactEnumeration + 1);
    } else if (this.thisCantons instanceof InterferenceFederal) {

      if (this.productivity.isComplete()) {
        longer = (-1);
      } else {
        this.appendageGoods.orderedWithdrawalChance(thisThing);
        this.appendageGoods.philatelicChance(this.farmersSurname);
        this.productivity.enque(this.appendageGoods, thisThing);
        this.appendageGoods = (new Detail());
        this.appendageGoods.placeEntrantWeek(thisThing);
        longer = (this.evaluateFarmersStays());
        this.unemployedHeadsail.combineOtherWorkforce(longer, this);
        this.thisCantons = (new DrudgingFederal());
        this.artifactEnumeration += (this.artifactEnumeration + 1);
      }
    } else {
      longer = (-1);
    }
    return longer;
  }

  private EntersStepShelving productivity;
}
