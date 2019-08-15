package seng2200;

public class MedianPlace extends ManufacturingDegree {

  public synchronized void wrapTopic(double topicalPeriod) {
    this.lncPublicDurum(topicalPeriod);

    if (this.manufacturing.isComplete()) {
      this.ongoingCountry = (new BarricadeLand());
    } else {
      this.serveConsignment.solidifyingLeavingJuncture(topicalPeriod);
      this.serveConsignment.postalHour(this.farmNickname);
      this.manufacturing.enque(this.serveConsignment, topicalPeriod);
      this.noticesMoralStimulate(topicalPeriod);

      if (this.information.isVacant()) {
        this.serveConsignment = (null);
        this.ongoingCountry = (new DehydrateCantons());
      } else {
        double lasted;
        lasted = (0);
        this.serveConsignment = (this.information.head(topicalPeriod));
        this.serveConsignment.situatedGateMinutes(topicalPeriod);
        lasted = (this.cypherSpurringTimeframe());
        this.staffThurs.bringNewlyWork(lasted, this);
        this.ongoingCountry = (new LaboringSay());
        this.communicatedBoltedOriented(topicalPeriod);
      }
    }
  }

  private WithinPresentStore manufacturing;

  MedianPlace(
      String productivityForename,
      WithinPresentStore stimulant,
      WithinPresentStore produces,
      double awful,
      double reach,
      Spooler headsail) {
    super(productivityForename, awful, reach, headsail);
    this.information = (stimulant);
    this.manufacturing = (produces);
  }

  private WithinPresentStore information;

  public synchronized double negotiationsThing(double newChance) {
    double remainder;
    remainder = (0);

    if (this.ongoingCountry instanceof DehydrateCantons) {

      if (this.information.isVacant()) {
        remainder = (-1);
      } else {
        this.serveConsignment = (this.information.head(newChance));
        this.serveConsignment.situatedGateMinutes(newChance);
        remainder = (this.cypherSpurringTimeframe());
        this.ongoingCountry = (new LaboringSay());
        this.staffThurs.bringNewlyWork(remainder, this);
      }
    } else if (this.ongoingCountry instanceof BarricadeLand) {

      if (this.manufacturing.isComplete()) {
        remainder = (-1);
      } else {
        this.serveConsignment.solidifyingLeavingJuncture(newChance);
        this.serveConsignment.postalHour(this.farmNickname);
        this.manufacturing.enque(this.serveConsignment, newChance);
        this.serveConsignment = (null);

        if (this.information.isVacant()) {
          remainder = (-1);
          this.ongoingCountry = (new DehydrateCantons());
        } else {
          this.serveConsignment = (this.information.head(newChance));
          this.serveConsignment.situatedGateMinutes(newChance);
          remainder = (this.cypherSpurringTimeframe());
          this.staffThurs.bringNewlyWork(remainder, this);
          this.ongoingCountry = (new LaboringSay());
        }
      }
    } else {
      remainder = (-1);
    }
    return remainder;
  }
}
