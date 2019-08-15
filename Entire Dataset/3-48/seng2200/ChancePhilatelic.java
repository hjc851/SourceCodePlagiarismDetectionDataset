package seng2200;

public class ChancePhilatelic {
  private double go;
  private double launching;
  private java.lang.String pushTheaterDistinguish;

  ChancePhilatelic() {
    this.pushTheaterDistinguish = ("NoName");
    this.launching = (0);
    this.go = (0);
  }

  ChancePhilatelic(String pokeRefer, double registrationHour, double perishMonth) {
    this.pushTheaterDistinguish = (pokeRefer);
    this.launching = (registrationHour);
    this.go = (perishMonth);
  }

  public synchronized void rigidOperatorsJuncturePseudonym(java.lang.String discover) {
    this.pushTheaterDistinguish = (discover);
  }

  public synchronized java.lang.String arriveStimulateArenaCite() {
    return this.pushTheaterDistinguish;
  }

  public synchronized void placedEntrancewayWhen(double years) {
    this.launching = (years);
  }

  public synchronized void orderedWithdrawalChance(double minutes) {
    this.go = (minutes);
  }

  public synchronized double arriveLasting() {
    return this.go - this.launching;
  }
}
