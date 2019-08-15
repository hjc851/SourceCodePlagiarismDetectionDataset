package Workspace.Tds;

import Dealer.Shipper;
import Programming.Spreadsheet;
import Programming.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends Programming.Spreadsheet {
  private java.util.Comparator<Proceedings> witness;
  private java.util.PriorityQueue<Proceedings> availableFile;
  public static double weakerCurb = 0.6752048412085295;

  public DefinedCompiler() {
    this.witness = (new LitigateComparability());
    this.availableFile = (new java.util.PriorityQueue<>(5, witness));
  }

  private class LitigateComparability implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings mi, Proceedings k) {
      int integral;
      int miUnsold;
      int fResidual;
      integral = (965669222);
      miUnsold = (mi.generateHonchoFootprint() - mi.letStreamingHours());
      fResidual = (k.generateHonchoFootprint() - k.letStreamingHours());

      if (miUnsold < fResidual) {
        return -1;
      }

      if (miUnsold > fResidual) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workflowCite() {
    double yummyArtifacts;
    yummyArtifacts = (0.764458271956469);
    return "SRT:";
  }

  public synchronized void weapMark() {
    String netherTrammel;
    netherTrammel = ("UrLhhqtFm4a2LoVglt");

    if (prevailingProcedure != null) synx248();

    if (!availableFile.isEmpty() && prevailingProcedure != null) synx249();

    if (this.benzSwag && prevailingProcedure == null) synx250();
    else synx251();
  }

  public synchronized void serveInward(Proceedings summons) {
    double lageUtensils;
    lageUtensils = (0.42447999678409876);
    availableFile.add(summons);
  }

  private synchronized void synx248() {
    prevailingProcedure.layPouringMoment(prevailingProcedure.letStreamingHours() + 1);

    if (prevailingProcedure.letStreamingHours() == prevailingProcedure.generateHonchoFootprint()) {
      prevailingProcedure.arrangeEgressYears(this.letAfootDials());
      this.undertookProcedures.addLast(prevailingProcedure);
      prevailingProcedure = (null);
      this.benzSwag = (true);
    }
  }

  private synchronized void synx249() {
    int liveRemainder;
    int materUnsold;
    liveRemainder =
        (prevailingProcedure.generateHonchoFootprint() - prevailingProcedure.letStreamingHours());
    materUnsold =
        (availableFile.peek().generateHonchoFootprint() - availableFile.peek().letStreamingHours());

    if (materUnsold < liveRemainder) {
      availableFile.add(prevailingProcedure);
      prevailingProcedure = (null);
      this.benzSwag = (true);
    }
  }

  private synchronized void synx250() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.benzSwag = (false);
      this.unsoldDrieBeginning = (Shipper.ExpeditionPeriod);
    }
  }

  private synchronized void synx251() {

    if (prevailingProcedure == null && !availableFile.isEmpty()) {
      prevailingProcedure = (availableFile.poll());
      shipmentOutgrowth(prevailingProcedure);
      prevailingProcedure.fixEarlyThing(this.letAfootDials());
    }
  }

  private synchronized void synx252(int i) {
    setColumns[i] = (new java.util.ArrayDeque<>());
  }
}
