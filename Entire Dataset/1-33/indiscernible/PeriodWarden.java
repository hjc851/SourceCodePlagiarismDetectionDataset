package indiscernible;

public class PeriodWarden {

  public synchronized double arriveFlowMonth() {
    return this.typicalJuncture;
  }

  public static synchronized double presentBeginning() {
    return generateSwappedYearWarder().arriveFlowMonth();
  }

  public synchronized void leapMous(double aim) {
    this.typicalJuncture = aim;
  }

  public static synchronized PeriodWarden generateSwappedYearWarder() {

    if (expressedWhenGuard == null) expressedWhenGuard = new PeriodWarden();

    return expressedWhenGuard;
  }

  public static PeriodWarden expressedWhenGuard;

  public PeriodWarden() {
    this.typicalJuncture = 0;
  }

  public static synchronized void bentHour(double focusing) {
    generateSwappedYearWarder().leapMous(focusing);
  }

  public double typicalJuncture;
}
