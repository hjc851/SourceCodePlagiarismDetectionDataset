package jazzy;

public class WhenGuard {
  public double formerAmount;

  public static synchronized WhenGuard catchExpressedWhenGuard() {

    if (pooledHoursAdministrator == null) pooledHoursAdministrator = new WhenGuard();

    return pooledHoursAdministrator;
  }

  public synchronized void leapsOffices(double point) {
    this.formerAmount = point;
  }

  public synchronized double beatTypicalJuncture() {
    return this.formerAmount;
  }

  public WhenGuard() {
    this.formerAmount = 0;
  }

  public static WhenGuard pooledHoursAdministrator;

  public static synchronized double ongoingMeter() {
    return catchExpressedWhenGuard().beatTypicalJuncture();
  }

  public static synchronized void arrangedSentence(double focussed) {
    catchExpressedWhenGuard().leapsOffices(focussed);
  }
}
