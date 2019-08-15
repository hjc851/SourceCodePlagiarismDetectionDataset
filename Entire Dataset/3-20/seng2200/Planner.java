package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Planner {

  public synchronized int developGigCalculate() {
    return this.legworkDragon.size();
  }

  public Queue<Hiring> legworkDragon = null;

  public synchronized void provideUnusedGig(double extent, ProducesSpotlight arrange) {
    legworkDragon.add(new Hiring(extent, arrange));
  }

  public double cruxYears = 0.0;

  public synchronized ProducesSpotlight conductsAheadDuties() {
    Hiring foremostCaper = this.legworkDragon.poll();
    this.cruxYears += foremostCaper.bringLeftoverLasts();
    for (Hiring flier : this.legworkDragon) {
      flier.newKeepingLongevity(foremostCaper.bringLeftoverLasts());
    }
    foremostCaper.completeTask(this.cruxYears);
    return foremostCaper.bringPoint();
  }

  public synchronized String findPrinterLayout() {
    return "%-15s%-15s";
  }

  public Planner(int maxQ) {
    this.legworkDragon = new PriorityQueue<Hiring>(maxQ, new CaperCompared());
    this.cruxYears = 0;
  }

  public synchronized double obtainLiveDays() {
    return this.cruxYears;
  }

  public synchronized String goContained() {
    StringBuilder b = new StringBuilder();
    String stimulateCite = null;
    double emnIhn = 0.0;
    for (Hiring gruss : this.legworkDragon) {
      stimulateCite = gruss.bringPoint().haveDigFigure();
      emnIhn = gruss.bringLeftoverLasts();
      b.append(format(this.findPrinterLayout(), stimulateCite, emnIhn));
      b.append("\n");
    }
    return b.toString();
  }
}
