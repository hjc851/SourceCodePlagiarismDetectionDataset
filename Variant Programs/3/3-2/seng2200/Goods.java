package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Goods {
  private static final String synX314String = "->";
  private static final int synX313int = 1;
  private static final int synX312int = 0;
  private static final int synX311int = 0;
  private static final int synX310int = 0;
  private static final int synX309int = 0;
  private static final int synX308int = 0;

  public Goods() {
    this.entreeMoment = 0;
    this.escapeOpportunity = 0;
    this.againMarkBibliography = new java.util.LinkedList<DayPigeonhole>();
  }

  public double escapeOpportunity = 0.0;

  public synchronized void fixedEscapeOpportunity(double periods) {
    this.escapeOpportunity = periods;
  }

  public synchronized seng2200.DayPigeonhole sufferancePestlePeriod(java.lang.String qEpithet) {
    seng2200.DayPigeonhole righ;
    righ = new seng2200.DayPigeonhole(qEpithet, this.entreeMoment, this.escapeOpportunity);
    this.entreeMoment = synX308int;
    this.escapeOpportunity = synX309int;
    return righ;
  }

  public synchronized java.lang.String bringCourse() {
    java.lang.StringBuilder d;
    d = new java.lang.StringBuilder();

    for (int calculation = synX310int;
        calculation < this.againMarkBibliography.size();
        calculation++) synx59(d, calculation);
    return d.toString();
  }

  public java.util.List<DayPigeonhole> againMarkBibliography = null;

  public synchronized void doRegisterAgain(double minutes) {
    this.entreeMoment = minutes;
  }

  public double entreeMoment = 0.0;

  public synchronized void moldDays(java.lang.String digFigure) {
    this.againMarkBibliography.add(
        new seng2200.DayPigeonhole(digFigure, this.entreeMoment, this.escapeOpportunity));
    this.entreeMoment = synX311int;
    this.escapeOpportunity = synX312int;
  }

  private synchronized void synx59(StringBuilder d, int calculation) {
    d.append(this.againMarkBibliography.get(calculation).letPushTheaterDistinguish());

    if (calculation < this.againMarkBibliography.size() - synX313int) d.append(synX314String);
  }
}
