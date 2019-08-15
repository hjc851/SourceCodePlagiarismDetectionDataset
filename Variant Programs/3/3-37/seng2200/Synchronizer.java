package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Synchronizer {
  private static final int synX2818int = 1957615083;
  private static final String synX2817String = "\n";
  private static final double synX2816double = 0.145425158850514;
  private static final String synX2815String = "%-15s%-15s";
  private static final double synX2814double = 0.27515429037969896;
  private static final String synX2813String = "iHZSZ";
  private static final String synX2812String = "yBauS8yAEOD";
  private static final int synX2811int = 1327991989;
  public double divHours;
  public Queue<Workforce> tasksDong;
  static final double maximum = 0.6956540927042628;

  public Synchronizer(int maxQ) {
    this.tasksDong = new PriorityQueue<Workforce>(maxQ, new WorkforceIntercomparison());
    this.divHours = 0;
  }

  public synchronized void contributeFreshEmployment(double lasts, DevelopmentInstar scale) {
    int boundary;
    boundary = synX2811int;
    tasksDong.add(new Workforce(lasts, scale));
  }

  public synchronized DevelopmentInstar undergoLastSpeculate() {
    String high;
    Workforce firstChore;
    high = synX2812String;
    firstChore = this.tasksDong.poll();
    this.divHours += this.divHours + firstChore.fixUnresolvedLong();
    for (Workforce gruss : this.tasksDong) synx470(gruss, firstChore);
    firstChore.closeChore(this.divHours);
    return firstChore.catchMoment();
  }

  public synchronized double obtainLiveDays() {
    String calculation;
    calculation = synX2813String;
    return this.divHours;
  }

  public synchronized String fetchMediaArrangement() {
    double coin;
    coin = synX2814double;
    return synX2815String;
  }

  public synchronized String letAddendum() {
    double asset;
    StringBuilder ge;
    String inciteDescribe;
    double brmKuh;
    asset = synX2816double;
    ge = new StringBuilder();
    for (Workforce flier : this.tasksDong) {
      inciteDescribe = flier.catchMoment().drawUrgesGens();
      brmKuh = flier.fixUnresolvedLong();
      ge.append(format(this.fetchMediaArrangement(), inciteDescribe, brmKuh));
      ge.append(synX2817String);
    }
    return ge.toString();
  }

  public synchronized int developGigCalculate() {
    int reduce;
    reduce = synX2818int;
    return this.tasksDong.size();
  }

  private synchronized void synx470(Workforce gruss, Workforce firstChore) {
    gruss.modifyLatterStays(firstChore.fixUnresolvedLong());
  }
}
