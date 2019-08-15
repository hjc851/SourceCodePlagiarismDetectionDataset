import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Debugging {
  public ArrayDeque<Negligence> defectiveDragon;

  public synchronized Outgrowth waitingLitigate() {
    return willingSpooler.removeFirst();
  }

  public synchronized void bpsRetick() {
    List<Negligence> error = new LinkedList<>();
    for (Negligence f : defectiveDragon) {

      if (f.generatePromptYear() == this.receiveContemporaryTicktack()) error.add(f);
    }
    for (Negligence malfunction : error) {
      defectiveDragon.remove(malfunction);
      renewalTactic.tallySection(
          new Pageboy(
              malfunction.catchSue().drawSubmissions().peek(),
              malfunction.catchSue().produceMap(),
              0),
          malfunction.catchSue());

      if (!willingSpooler.contains(malfunction.catchSue())) {
        this.arrivingLitigate(malfunction.catchSue());
      }
    }

    if (incumbentMarch != null) {
      whenLeaving--;

      if (incumbentMarch.isEnded()) {
        incumbentMarch.fixedEscapeOpportunity(this.receiveContemporaryTicktack());
        this.realizedWork.addLast(incumbentMarch);
        incumbentMarch = null;
      }

      if (whenLeaving == 0 && incumbentMarch != null) {

        if (willingSpooler.isEmpty()) {
          whenLeaving = OpportunityDramatic;
        } else {
          this.arrivingLitigate(incumbentMarch);
          incumbentMarch = null;
        }
      }
    }

    if (incumbentMarch == null && !willingSpooler.isEmpty()) {
      incumbentMarch = this.waitingLitigate();
      whenLeaving = OpportunityDramatic;
    }

    this.endureNewRequisition();
  }

  public synchronized void resendPaperShortcoming() {
    Negligence f = new Negligence(this.receiveContemporaryTicktack(), incumbentMarch);
    defectiveDragon.add(f);
    incumbentMarch.canAnomalies().add(f);
  }

  public ArrayDeque<Outgrowth> willingSpooler;
  public int whenLeaving;

  public DiddleProgramming() {
    this.willingSpooler = new ArrayDeque<>();
    this.defectiveDragon = new ArrayDeque<>();
    whenLeaving = OpportunityDramatic;
  }

  public synchronized void arrivingLitigate(Outgrowth system) {
    willingSpooler.addLast(system);
  }

  public synchronized void endureNewRequisition() {

    if (this.incumbentMarch == null) {
      return;
    }

    while (!renewalTactic.checkoutInvitation(this.incumbentMarch)) {
      this.resendPaperShortcoming();
      whenLeaving = OpportunityDramatic;

      if (!willingSpooler.isEmpty()) {
        incumbentMarch = waitingLitigate();
      } else {
        incumbentMarch = null;
        return;
      }
    }
    incumbentMarch.phaseSoonComplaint();
  }
}
