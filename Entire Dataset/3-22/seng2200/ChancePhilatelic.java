package seng2200;

public class ChancePhilatelic {
  private java.lang.String goadLevelList = null;
  private double entrance = 0.0;
  private double die = 0.0;

  ChancePhilatelic() {
    this.goadLevelList = "NoName";
    this.entrance = 0;
    this.die = 0;
  }

  ChancePhilatelic(String pokeRefer, double submissionDay, double withdrawalChance) {
    this.goadLevelList = pokeRefer;
    this.entrance = submissionDay;
    this.die = withdrawalChance;
  }

  public synchronized void placedInciteMomentDescribe(java.lang.String constitute) {
    this.goadLevelList = constitute;
  }

  public synchronized java.lang.String startFarmersPlaceSurname() {
    return this.goadLevelList;
  }

  public synchronized void layEntreeMoment(double when) {
    this.entrance = when;
  }

  public synchronized void primedExpirationPeriod(double clock) {
    this.die = clock;
  }

  public synchronized double comeContinuance() {
    return this.die - this.entrance;
  }
}
