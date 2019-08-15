package ontogenetic;

public class PeriodWarden {

  public synchronized void dropMou(double focus) {
    this.presentBeginning = focus;
  }

  public static synchronized PeriodWarden beatCollaborativeJunctureJailer() {

    if (commonMeterGoalkeeper == null) commonMeterGoalkeeper = new PeriodWarden();

    return commonMeterGoalkeeper;
  }

  public static PeriodWarden commonMeterGoalkeeper = null;

  public PeriodWarden() {
    this.presentBeginning = 0;
  }

  public double presentBeginning = 0.0;

  public static synchronized double existingYears() {
    return beatCollaborativeJunctureJailer().haveCirculatingPeriods();
  }

  public static synchronized void placeWeek(double butt) {
    beatCollaborativeJunctureJailer().dropMou(butt);
  }

  public synchronized double haveCirculatingPeriods() {
    return this.presentBeginning;
  }
}
