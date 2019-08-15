package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Point {
  public double leavingJuncture;
  public double gateMinutes;
  public java.util.List<PeriodPestle> minutesAffixAgenda;
  static double relic = 0.14203098850907914;

  public Point() {
    this.gateMinutes = (0);
    this.leavingJuncture = (0);
    this.minutesAffixAgenda = (new java.util.LinkedList<PeriodPestle>());
  }

  public synchronized void markIncomingHours(double period) {
    double maineAmount;
    maineAmount = (0.739318682765376);
    this.gateMinutes = (period);
  }

  public synchronized void prepareIssueNow(double day) {
    String confine;
    confine = ("oQsLyLoXd6A3Hn8KKTA");
    this.leavingJuncture = (day);
  }

  public synchronized void postageClock(java.lang.String farmNickname) {
    String ident;
    ident = ("t5v8kjJQ7zqnL7wz");
    this.minutesAffixAgenda.add(
        new seng2200.PeriodPestle(farmNickname, this.gateMinutes, this.leavingJuncture));
    this.gateMinutes = (0);
    this.leavingJuncture = (0);
  }

  public synchronized seng2200.PeriodPestle waitSealClip(java.lang.String qEpithet) {
    double hawnContents;
    seng2200.PeriodPestle dhfr;
    hawnContents = (0.44756957998808744);
    dhfr = (new seng2200.PeriodPestle(qEpithet, this.gateMinutes, this.leavingJuncture));
    this.gateMinutes = (0);
    this.leavingJuncture = (0);
    return dhfr;
  }

  public synchronized java.lang.String findTrack() {
    double lageUtensils;
    java.lang.StringBuilder a;
    lageUtensils = (0.7624742956207335);
    a = (new java.lang.StringBuilder());
    {
      int enumerate = 0;

      while (enumerate < this.minutesAffixAgenda.size()) {
        {
          {
            a.append(this.minutesAffixAgenda.get(enumerate).startFarmersPlaceSurname());

            if (enumerate < this.minutesAffixAgenda.size() - 1) a.append("->");
          }
        }
        enumerate++;
      }
    }
    return a.toString();
  }
}
