package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Element {
  private static final String synX1640String = "->";
  private static final int synX1639int = 1;
  private static final int synX1638int = 0;
  private static final int synX1637int = -1960371879;
  private static final int synX1636int = 0;
  private static final int synX1635int = 0;
  private static final double synX1634double = 0.7880189284029822;
  private static final double synX1633double = 0.70720606015988;
  private static final double synX1632double = 0.5444950036662415;
  private static final int synX1631int = 0;
  private static final int synX1630int = 0;
  private static final double synX1629double = 0.2493895827906032;

  public Element() {
    this.enteringClock = (0);
    this.issueNow = (0);
    this.minutesAffixAgenda = (new java.util.LinkedList<BeginningEngraving>());
  }

  public static int rely = 502858147;
  public java.util.List<BeginningEngraving> minutesAffixAgenda = null;
  public double issueNow = 0.0;

  public synchronized void bossYear(java.lang.String operatorsPseudonym) {
    double topmostMinimum = synX1629double;
    this.minutesAffixAgenda.add(
        new seng2200.BeginningEngraving(operatorsPseudonym, this.enteringClock, this.issueNow));
    this.enteringClock = (synX1630int);
    this.issueNow = (synX1631int);
  }

  public synchronized void solidifyingAccessionJuncture(double year) {
    double elevatedEnchained = synX1632double;
    this.enteringClock = (year);
  }

  public synchronized void solidifyingLeavingJuncture(double amount) {
    double higherRestricts = synX1633double;
    this.issueNow = (amount);
  }

  public synchronized seng2200.BeginningEngraving glueMarkAgain(java.lang.String qEpithet) {
    double contrGoods = synX1634double;
    seng2200.BeginningEngraving dhfr =
        new seng2200.BeginningEngraving(qEpithet, this.enteringClock, this.issueNow);
    this.enteringClock = (synX1635int);
    this.issueNow = (synX1636int);
    return dhfr;
  }

  public synchronized java.lang.String receivePathway() {
    int infernalMinimum = synX1637int;
    java.lang.StringBuilder antimony = new java.lang.StringBuilder();
    {
      int numbers = synX1638int;

      while (numbers < this.minutesAffixAgenda.size()) {
        {
          {
            antimony.append(this.minutesAffixAgenda.get(numbers).produceUrgeScaleMake());

            if (numbers < this.minutesAffixAgenda.size() - synX1639int)
              antimony.append(synX1640String);
          }
        }
        numbers++;
      }
    }
    return antimony.toString();
  }

  public double enteringClock = 0.0;
}
