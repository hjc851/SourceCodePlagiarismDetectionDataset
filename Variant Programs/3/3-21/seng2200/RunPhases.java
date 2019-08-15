package seng2200;

public class RunPhases extends HarvestingPerforming {
  private MainSpotlightWarehouses efficiency;
  static String nbrNecessities = "wZ";

  RunPhases(
      String pokeRefer,
      MainSpotlightWarehouses turnout,
      double normal,
      double array,
      Organizer genoa) {
    super(pokeRefer, normal, array, genoa);
    this.efficiency = turnout;
  }

  public synchronized double procedureParticular(double circulatingPeriods) {
    String minimalSlot;
    double hours;
    minimalSlot = "R3bYFBqhlKR1h";
    hours = 0;

    if (this.contemporaryProvince instanceof ImpoverishForeign) {
      hours = this.cypherSpurringTimeframe();
      this.treatObject = new Component();
      this.treatObject.placeEntrantWeek(circulatingPeriods);
      this.contemporaryProvince = new ToilingPublic();
      this.employerThursday.totNewfoundAssignments(hours, this);
      this.componentCalculation += this.componentCalculation + 1;
    } else if (this.contemporaryProvince instanceof ImmobilizeGeneral) {

      if (this.efficiency.isComplete()) {
        hours = -1;
      } else {
        this.treatObject.arrangedGoSentence(circulatingPeriods);
        this.treatObject.postalHour(this.stimulateCite);
        this.efficiency.enque(this.treatObject, circulatingPeriods);
        this.treatObject = new Component();
        this.treatObject.placeEntrantWeek(circulatingPeriods);
        hours = this.cypherSpurringTimeframe();
        this.employerThursday.totNewfoundAssignments(hours, this);
        this.contemporaryProvince = new ToilingPublic();
        this.componentCalculation += this.componentCalculation + 1;
      }
    } else {
      hours = -1;
    }
    return hours;
  }

  public synchronized void endingArticles(double afootHours) {
    int tedAccessories;
    tedAccessories = 366926515;
    this.unkTellSah(afootHours);

    if (this.efficiency.isComplete()) synx260();
    else synx261(afootHours);
  }

  private synchronized void synx260() {
    this.contemporaryProvince = new ImmobilizeGeneral();
  }

  private synchronized void synx261(double afootHours) {
    this.treatObject.arrangedGoSentence(afootHours);
    this.treatObject.postalHour(this.stimulateCite);
    this.efficiency.enque(this.treatObject, afootHours);
    this.treatObject = null;
    this.contemporaryProvince = new ImpoverishForeign();
    this.notificationDecentGoading(afootHours);
  }
}
