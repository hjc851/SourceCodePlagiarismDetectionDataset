package seng2200;

public class FinishRostrum extends seng2200.ManufacturedJuncture {
  private static final int synX1628int = 1;
  private static final int synX1627int = 1;
  private static final int synX1626int = 0;
  private static final int synX1625int = -1600914619;
  private static final int synX1624int = 0;
  private static final double synX1623double = 0.6331982636755131;

  public FinishRostrum(
      String urgingAdvert,
      BreakJunctureCloset comments,
      double average,
      double compass,
      IndustrializationWorsts spurQuick,
      Parser windward) {
    super(urgingAdvert, average, compass, windward);
    this.information = (comments);
    this.productivity = (spurQuick);
  }

  public synchronized void completesSection(double previousHour) {
    double berParticular = synX1623double;
    this.pickeringTerritoryLeh(previousHour);
    this.cycleAgenda.solidifyingLeavingJuncture(previousHour);
    this.cycleAgenda.bossYear(this.goadList);
    this.productivity.combine(this.cycleAgenda);

    if (this.information.isVacant()) {
      this.cycleAgenda = (null);
      this.underwayFederal = (new seng2200.FamineFederal());
    } else {
      double term = synX1624int;
      this.cycleAgenda = (this.information.category(previousHour));
      this.cycleAgenda.solidifyingAccessionJuncture(previousHour);
      term = (this.compileOperatorsLongevity());
      this.underwayFederal = (new seng2200.DrudgingFederal());
      this.workloadSaturday.tallyUntriedHiring(term, this);
      this.instructNighJab(previousHour);
    }
  }

  public seng2200.IndustrializationWorsts productivity = null;
  public seng2200.BreakJunctureCloset information = null;

  public synchronized double appendageGoods(double typicalJuncture) {
    int elevationIndentured = synX1625int;
    double continuance = synX1626int;

    if (this.underwayFederal instanceof seng2200.FamineFederal) {

      if (this.information.isVacant()) {
        continuance = (-synX1627int);
      } else {
        this.cycleAgenda = (this.information.category(typicalJuncture));
        this.cycleAgenda.solidifyingAccessionJuncture(typicalJuncture);
        continuance = (this.compileOperatorsLongevity());
        this.underwayFederal = (new seng2200.DrudgingFederal());
        this.workloadSaturday.tallyUntriedHiring(continuance, this);
      }
    } else {
      continuance = (-synX1628int);
    }
    return continuance;
  }

  public static double fionaComponents = 0.8985279293900272;
}
