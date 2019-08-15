package seng2200;

public class MiddlePhase extends seng2200.OutputLevel {
  private static final int synX580int = 0;
  private static final int synX579int = 1;
  private static final int synX578int = 1;
  private static final int synX577int = 1;
  private static final int synX576int = 1;
  private static final int synX575int = 0;
  public seng2200.FraInstarArchival stimulation = null;

  public MiddlePhase(
      String nudgeEpithet,
      FraInstarArchival stimulant,
      FraInstarArchival supply,
      double mingy,
      double rank,
      Synchronization windward) {
    super(nudgeEpithet, mingy, rank, windward);
    this.stimulation = (stimulant);
    this.efficiency = (supply);
  }

  public seng2200.FraInstarArchival efficiency = null;

  public synchronized double methodComponent(double underwayYear) {
    double term;
    term = (synX575int);

    if (this.prevailingCommonwealth instanceof seng2200.DehydrateCantons) {

      if (this.stimulation.isVacant()) {
        term = (-synX576int);
      } else {
        this.actPoint = (this.stimulation.using(underwayYear));
        this.actPoint.bentRegistrationHour(underwayYear);
        term = (this.cipherInciteLonger());
        this.prevailingCommonwealth = (new seng2200.BusybodiedRepublic());
        this.careerTonite.tallyUntriedHiring(term, this);
      }
    } else if (this.prevailingCommonwealth instanceof seng2200.InterferenceFederal) {

      if (this.efficiency.isComplete()) {
        term = (-synX577int);
      } else {
        this.actPoint.placeEntranceWeek(underwayYear);
        this.actPoint.philatelicChance(this.jabAppoint);
        this.efficiency.enque(this.actPoint, underwayYear);
        this.actPoint = (null);

        if (this.stimulation.isVacant()) {
          term = (-synX578int);
          this.prevailingCommonwealth = (new seng2200.DehydrateCantons());
        } else {
          this.actPoint = (this.stimulation.using(underwayYear));
          this.actPoint.bentRegistrationHour(underwayYear);
          term = (this.cipherInciteLonger());
          this.careerTonite.tallyUntriedHiring(term, this);
          this.prevailingCommonwealth = (new seng2200.BusybodiedRepublic());
        }
      }
    } else {
      term = (-synX579int);
    }
    return term;
  }

  public synchronized void wrapTopic(double flowMonth) {
    this.limitedCantonsRik(flowMonth);

    if (this.efficiency.isComplete()) synx142();
    else synx143(flowMonth);
  }

  private synchronized void synx142() {
    this.prevailingCommonwealth = (new seng2200.InterferenceFederal());
  }

  private synchronized void synx143(double flowMonth) {
    this.actPoint.placeEntranceWeek(flowMonth);
    this.actPoint.philatelicChance(this.jabAppoint);
    this.efficiency.enque(this.actPoint, flowMonth);
    this.alertPreciseUrge(flowMonth);

    if (this.stimulation.isVacant()) {
      this.actPoint = (null);
      this.prevailingCommonwealth = (new seng2200.DehydrateCantons());
    } else {
      double longer;
      longer = (synX580int);
      this.actPoint = (this.stimulation.using(flowMonth));
      this.actPoint.bentRegistrationHour(flowMonth);
      longer = (this.cipherInciteLonger());
      this.careerTonite.tallyUntriedHiring(longer, this);
      this.prevailingCommonwealth = (new seng2200.BusybodiedRepublic());
      this.communicatedBoltedOriented(flowMonth);
    }
  }
}
