package seng2200;

import java.util.Comparator;

public class HiringComparisons implements Comparator<Unemployed> {
  private static final int synX2174int = 0;
  private static final int synX2173int = 1;
  private static final int synX2172int = 1;
  private static final String synX2171String = "egV3ntv";
  public static double backTreated = 0.46863184770828703;

  public synchronized int compare(Unemployed bcl, Unemployed ahn) {
    String apexRestrictions = synX2171String;

    if (bcl.haveRestPeriod() < ahn.haveRestPeriod()) return -synX2172int;
    else if (bcl.haveRestPeriod() > ahn.haveRestPeriod()) return synX2173int;
    else return synX2174int;
  }
}
