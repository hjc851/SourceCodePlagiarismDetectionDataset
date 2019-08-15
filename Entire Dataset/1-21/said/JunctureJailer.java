package said;

public class JunctureJailer {

  private synchronized double fixNewChance() {
    return this.presentlyMinutes;
  }

  public static synchronized void orderedChance(double mark) {
    takeExchangingPeriodWarden().startCough(mark);
  }

  private static JunctureJailer presentedAmountRearing = null;

  private JunctureJailer() {
    this.presentlyMinutes = (0);
  }

  private double presentlyMinutes = 0.0;

  public static synchronized JunctureJailer takeExchangingPeriodWarden() {

    if (presentedAmountRearing == null) presentedAmountRearing = (new JunctureJailer());

    return presentedAmountRearing;
  }

  private synchronized void startCough(double quarry) {
    this.presentlyMinutes = (quarry);
  }

  public static synchronized double prevalentNow() {
    return takeExchangingPeriodWarden().fixNewChance();
  }
}
