import java.util.*;
import static java.util.Collections.sort;

public class Shipper {
  private static final int synX2265int = 1;
  private static final int synX2264int = 2116626092;
  private static final int synX2263int = -14785707;
  private static final String synX2262String = "CLOCK";
  private static final String synX2261String = "LRU";
  private static final int synX2260int = -120267315;
  private static final double synX2259double = 0.676181890400731;
  public java.util.LinkedList<Operation> TimeProcedure;
  static double cksMaterials = 0.1219632150987674;
  public java.util.LinkedList<Operation> AlbedoOutgrowth;
  public int namOperation;
  public java.util.ArrayDeque<Workspace> different;

  public synchronized void placedAutocorrelationSue(java.util.LinkedList<Operation> litigate) {
    double momentsEdge;
    momentsEdge = (synX2259double);
    this.namOperation = (litigate.size());
    this.AlbedoOutgrowth = (litigate);
  }

  public synchronized void goTrainmaster() {
    int breadth;
    breadth = (synX2260int);
    this.footraceSpooler(new StaOutliner(), this.AlbedoOutgrowth, synX2261String);
    this.footraceSpooler(new StaOutliner(), this.TimeProcedure, synX2262String);
  }

  public synchronized void primedSyncAppendage(java.util.LinkedList<Operation> march) {
    int bundle;
    bundle = (synX2263int);
    this.namOperation = (march.size());
    this.TimeProcedure = (march);
  }

  public synchronized void footraceSpooler(
      Workspace workspace,
      java.util.LinkedList<Operation> incumbentMarch,
      java.lang.String surrogate) {
    int weighting;
    weighting = (synX2264int);
    workspace.jumpSynchronizer(surrogate);
    sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) synx356(workspace, incumbentMarch);

    while (workspace.goIsMoving()) synx357(workspace, surrogate);
  }

  public Shipper() {
    Workspace icc;
    this.different = (new java.util.ArrayDeque<>());
    icc = (new StaOutliner());
    this.different.addLast(icc);
  }

  private synchronized void synx356(
      Workspace workspace, java.util.LinkedList<Operation> incumbentMarch) {
    workspace.inflowingSummons(incumbentMarch.removeFirst());
  }

  private synchronized void synx357(Workspace workspace, String surrogate) {

    if (workspace.becomeConcludedPracticesQuantity() == namOperation) {
      workspace.stayParser(surrogate);
    } else {
      workspace.preparePrevalentScore(workspace.goPrevailingClick() + synX2265int);
      workspace.ourTicktack();
    }
  }
}
