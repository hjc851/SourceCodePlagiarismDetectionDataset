package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Element {
  private static final String synX1829String = "->";
  private static final int synX1828int = 1;
  private static final int synX1827int = 0;
  private static final double synX1826double = 0.3019655132159751;
  private static final int synX1825int = 0;
  private static final int synX1824int = 0;
  private static final String synX1823String = "un0osdVbGTT";
  private static final int synX1822int = 0;
  private static final int synX1821int = 0;
  private static final int synX1820int = 1290424820;
  private static final String synX1819String = "";
  private static final int synX1818int = 602130003;
  public static final double bersToken = 0.5302252130880426;
  public java.util.List<WeekImprimatur> junctureCouponPlaylist;
  public double entreeMoment;
  public double entranceWeek;

  public Element() {
    this.entreeMoment = (0);
    this.entranceWeek = (0);
    this.junctureCouponPlaylist = (new java.util.LinkedList<WeekImprimatur>());
  }

  public synchronized void doRegisterAgain(double day) {
    int hokkianese = synX1818int;
    this.entreeMoment = (day);
  }

  public synchronized void arrangeEgressYears(double chance) {
    String unfree = synX1819String;
    this.entranceWeek = (chance);
  }

  public synchronized void eradicateOpportunity(java.lang.String productivityForename) {
    int isterWidening = synX1820int;
    this.junctureCouponPlaylist.add(
        new seng2200.WeekImprimatur(productivityForename, this.entreeMoment, this.entranceWeek));
    this.entreeMoment = (synX1821int);
    this.entranceWeek = (synX1822int);
  }

  public synchronized seng2200.WeekImprimatur stopperMailAmount(java.lang.String qEpithet) {
    String weakerCurb = synX1823String;
    seng2200.WeekImprimatur dhfr =
        new seng2200.WeekImprimatur(qEpithet, this.entreeMoment, this.entranceWeek);
    this.entreeMoment = (synX1824int);
    this.entranceWeek = (synX1825int);
    return dhfr;
  }

  public synchronized java.lang.String catchTrail() {
    double gauge = synX1826double;
    java.lang.StringBuilder l = new java.lang.StringBuilder();

    for (int numeration = synX1827int;
        numeration < this.junctureCouponPlaylist.size();
        numeration++) synx259(l, numeration);
    return l.toString();
  }

  private synchronized void synx259(StringBuilder l, int numeration) {
    l.append(this.junctureCouponPlaylist.get(numeration).takeSpurringArrangeCall());

    if (numeration < this.junctureCouponPlaylist.size() - synX1828int) l.append(synX1829String);
  }
}
