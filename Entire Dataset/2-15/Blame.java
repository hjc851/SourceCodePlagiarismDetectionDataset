public class Blame {
  public int failuresJuncture = 0;
  public static final int SubstituteMeter = 6;

  public Blame(int mistakeClip, Act procedures) {
    this.failuresJuncture = (mistakeClip);
    this.willingMeter = (mistakeClip + SubstituteMeter);
    this.method = (procedures);
  }

  public synchronized Act drawPhase() {
    return method;
  }

  public Act method = null;

  public synchronized int beatFailuresJuncture() {
    return failuresJuncture;
  }

  public synchronized int driveWantAgain() {
    return willingMeter;
  }

  public int willingMeter = 0;
}
