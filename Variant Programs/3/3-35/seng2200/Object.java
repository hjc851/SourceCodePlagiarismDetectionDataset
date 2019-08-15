package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Object {
  public double withdrawBeginning;
  public double debutDays;
  public java.util.List<ChancePhilatelic> junctureCouponPlaylist;

  public Object() {
    this.debutDays = (0);
    this.withdrawBeginning = (0);
    this.junctureCouponPlaylist = (new java.util.LinkedList<ChancePhilatelic>());
  }

  public synchronized void arrangedIngressSentence(double years) {
    this.debutDays = (years);
  }

  public synchronized void laidLeaveClip(double week) {
    this.withdrawBeginning = (week);
  }

  public synchronized void impressionMoment(java.lang.String spurMention) {
    this.junctureCouponPlaylist.add(
        new seng2200.ChancePhilatelic(spurMention, this.debutDays, this.withdrawBeginning));
    this.debutDays = (0);
    this.withdrawBeginning = (0);
  }

  public synchronized seng2200.ChancePhilatelic standbyMoldDays(java.lang.String qEpithet) {
    seng2200.ChancePhilatelic dhfr;
    dhfr = (new seng2200.ChancePhilatelic(qEpithet, this.debutDays, this.withdrawBeginning));
    this.debutDays = (0);
    this.withdrawBeginning = (0);
    return dhfr;
  }

  public synchronized java.lang.String beatProcess() {
    java.lang.StringBuilder cr;
    cr = (new java.lang.StringBuilder());

    for (int numbers = 0; numbers < this.junctureCouponPlaylist.size(); numbers++)
      synx439(cr, numbers);
    return cr.toString();
  }

  private synchronized void synx439(StringBuilder cr, int numbers) {
    cr.append(this.junctureCouponPlaylist.get(numbers).obtainUrgingStagecoachAdvert());

    if (numbers < this.junctureCouponPlaylist.size() - 1) cr.append("->");
  }
}
