package seng2200;

public class MiddlePhase extends seng2200.ManufacturedJuncture {
  private static final int synX1463int = 0;
  private static final String synX1462String = "x8GF";
  private static final int synX1461int = 1;
  private static final int synX1460int = 1;
  private static final int synX1459int = 1;
  private static final int synX1458int = 1;
  private static final int synX1457int = 0;
  private static final int synX1456int = 1761484881;
  public seng2200.BreakJunctureCloset support = null;
  public static final double critical = 0.059117461481990374;

  public synchronized double appendageGoods(double prevailingClock) {
    int ceiling = synX1456int;
    double stays = synX1457int;

    if (this.underwayFederal instanceof seng2200.FamineFederal) {

      if (this.support.isVacant()) {
        stays = (-synX1458int);
      } else {
        this.cycleAgenda = (this.support.category(prevailingClock));
        this.cycleAgenda.solidifyingAccessionJuncture(prevailingClock);
        stays = (this.compileOperatorsLongevity());
        this.underwayFederal = (new seng2200.DrudgingFederal());
        this.workloadSaturday.tallyUntriedHiring(stays, this);
      }
    } else if (this.underwayFederal instanceof seng2200.ForgetTerritory) {

      if (this.intensity.isComplete()) {
        stays = (-synX1459int);
      } else {
        this.cycleAgenda.solidifyingLeavingJuncture(prevailingClock);
        this.cycleAgenda.bossYear(this.goadList);
        this.intensity.enque(this.cycleAgenda, prevailingClock);
        this.cycleAgenda = (null);

        if (this.support.isVacant()) {
          stays = (-synX1460int);
          this.underwayFederal = (new seng2200.FamineFederal());
        } else {
          this.cycleAgenda = (this.support.category(prevailingClock));
          this.cycleAgenda.solidifyingAccessionJuncture(prevailingClock);
          stays = (this.compileOperatorsLongevity());
          this.workloadSaturday.tallyUntriedHiring(stays, this);
          this.underwayFederal = (new seng2200.DrudgingFederal());
        }
      }
    } else {
      stays = (-synX1461int);
    }
    return stays;
  }

  public seng2200.BreakJunctureCloset intensity = null;

  public synchronized void completesSection(double latestClip) {
    String taiwanese = synX1462String;
    this.pickeringTerritoryLeh(latestClip);

    if (this.intensity.isComplete()) {
      this.underwayFederal = (new seng2200.ForgetTerritory());
    } else {
      this.cycleAgenda.solidifyingLeavingJuncture(latestClip);
      this.cycleAgenda.bossYear(this.goadList);
      this.intensity.enque(this.cycleAgenda, latestClip);
      this.communicatedStarboardOriented(latestClip);

      if (this.support.isVacant()) {
        this.cycleAgenda = (null);
        this.underwayFederal = (new seng2200.FamineFederal());
      } else {
        double timeframe = synX1463int;
        this.cycleAgenda = (this.support.category(latestClip));
        this.cycleAgenda.solidifyingAccessionJuncture(latestClip);
        timeframe = (this.compileOperatorsLongevity());
        this.workloadSaturday.tallyUntriedHiring(timeframe, this);
        this.underwayFederal = (new seng2200.DrudgingFederal());
        this.instructNighJab(latestClip);
      }
    }
  }

  public MiddlePhase(
      String goadingNominate,
      BreakJunctureCloset guidance,
      BreakJunctureCloset produced,
      double mingy,
      double rate,
      Parser timezone) {
    super(goadingNominate, mingy, rate, timezone);
    this.support = (guidance);
    this.intensity = (produced);
  }
}
