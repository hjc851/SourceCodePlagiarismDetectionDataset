package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Writer {
  private java.util.Queue<Tenure> subcontractList = null;
  private double blackguardDays = 0.0;

  Writer(int maxQ) {
    this.subcontractList = new java.util.PriorityQueue<Tenure>(maxQ, new seng2200.LegworkWitness());
    this.blackguardDays = 0;
  }

  public synchronized void giveNewbornTasks(double expiry, seng2200.ProducerLeg scene) {
    subcontractList.add(new seng2200.Tenure(expiry, scene));
  }

  public synchronized seng2200.ProducerLeg meetAgainEmployer() {
    seng2200.Tenure heightOccupations = this.subcontractList.poll();
    this.blackguardDays += this.blackguardDays + heightOccupations.makeOddLasted();
    for (seng2200.Tenure gruss : this.subcontractList) synx290(gruss, heightOccupations);
    heightOccupations.concludeEmployer(this.blackguardDays);
    return heightOccupations.generateRostrum();
  }

  public synchronized double fetchPresentBeginning() {
    return this.blackguardDays;
  }

  public synchronized java.lang.String driveBrailleForm() {
    return "%-15s%-15s";
  }

  public synchronized java.lang.String comeMaterial() {
    java.lang.StringBuilder d = new java.lang.StringBuilder();
    java.lang.String farmersSurname = null;
    double royalRoh = 0.0;
    for (seng2200.Tenure flier : this.subcontractList) {
      farmersSurname = flier.generateRostrum().startFarmersSurname();
      royalRoh = flier.makeOddLasted();
      d.append(format(this.driveBrailleForm(), farmersSurname, royalRoh));
      d.append("\n");
    }
    return d.toString();
  }

  public synchronized int findChoreWeigh() {
    return this.subcontractList.size();
  }

  private synchronized void synx290(Tenure gruss, Tenure heightOccupations) {
    gruss.refreshedUnsoldExpiry(heightOccupations.makeOddLasted());
  }
}
