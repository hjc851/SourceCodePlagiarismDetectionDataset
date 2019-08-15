package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Something {
  private static final int synX2719int = 0;
  private static final int synX2718int = 0;
  private static final int synX2717int = 0;
  private static final int synX2716int = 0;
  private static final int synX2715int = 0;

  public Something() {
    this.enteringClock = (0);
    this.issueNow = (0);
    this.junctureCouponPlaylist = (new LinkedList<YearsLabel>());
  }

  public List<YearsLabel> junctureCouponPlaylist = null;

  public synchronized void stompSentence(String farmNickname) {
    this.junctureCouponPlaylist.add(
        new YearsLabel(farmNickname, this.enteringClock, this.issueNow));
    this.enteringClock = (synX2715int);
    this.issueNow = (synX2716int);
  }

  public double enteringClock = 0.0;

  public synchronized YearsLabel convoyStumpPeriods(String qEpithet) {
    YearsLabel righ;
    righ = (new YearsLabel(qEpithet, this.enteringClock, this.issueNow));
    this.enteringClock = (synX2717int);
    this.issueNow = (synX2718int);
    return righ;
  }

  public synchronized void bentRegistrationHour(double periods) {
    this.enteringClock = (periods);
  }

  public synchronized void arrangedGoSentence(double opportunity) {
    this.issueNow = (opportunity);
  }

  public synchronized String fetchPattern() {
    StringBuilder nb;
    nb = (new StringBuilder());
    {
      int tell = synX2719int;

      while (tell < this.junctureCouponPlaylist.size()) {
        {
          synx419(nb, tell);
        }
        tell++;
      }
    }
    return nb.toString();
  }

  public double issueNow = 0.0;

  private synchronized void synx419(StringBuilder nb, int tell) {
    nb.append(this.junctureCouponPlaylist.get(tell).receiveGoadingLegNominate());

    if (tell < this.junctureCouponPlaylist.size() - 1) nb.append("->");
  }
}
