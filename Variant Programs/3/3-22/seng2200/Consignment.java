package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Consignment {
  private java.util.List<ChancePhilatelic> junctureCouponPlaylist = null;
  private double accessOpportunity = 0.0;
  private double dieYear = 0.0;

  Consignment() {
    this.accessOpportunity = 0;
    this.dieYear = 0;
    this.junctureCouponPlaylist = new java.util.LinkedList<ChancePhilatelic>();
  }

  public synchronized void determineCrossingBeginning(double thing) {
    this.accessOpportunity = thing;
  }

  public synchronized void laidLeaveClip(double day) {
    this.dieYear = day;
  }

  public synchronized void philatelicChance(java.lang.String stirDiagnose) {
    this.junctureCouponPlaylist.add(
        new seng2200.ChancePhilatelic(stirDiagnose, this.accessOpportunity, this.dieYear));
    this.accessOpportunity = 0;
    this.dieYear = 0;
  }

  public synchronized seng2200.ChancePhilatelic dipperPostalHour(java.lang.String qEpithet) {
    seng2200.ChancePhilatelic righ =
        new seng2200.ChancePhilatelic(qEpithet, this.accessOpportunity, this.dieYear);
    this.accessOpportunity = 0;
    this.dieYear = 0;
    return righ;
  }

  public synchronized java.lang.String developRide() {
    java.lang.StringBuilder sn = new java.lang.StringBuilder();
    {
      int tally = 0;

      while (tally < this.junctureCouponPlaylist.size()) {
        {
          synx299(sn, tally);
        }
        tally++;
      }
    }
    return sn.toString();
  }

  private synchronized void synx299(StringBuilder sn, int tally) {
    sn.append(this.junctureCouponPlaylist.get(tally).startFarmersPlaceSurname());

    if (tally < this.junctureCouponPlaylist.size() - 1) sn.append("->");
  }
}
