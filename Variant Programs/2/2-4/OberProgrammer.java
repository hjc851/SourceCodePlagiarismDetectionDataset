import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OberProgrammer extends Database {
  public ArrayDeque<Error> breakSufferance = null;
  public int hourStay = 0;

  public synchronized void weapMark() {
    List<Error> flaws;
    flaws = new LinkedList<>();
    for (Error f : breakSufferance) synx22(f, flaws);
    for (Error criticize : flaws) synx23(criticize);

    if (flowProcedures != null) synx24();

    if (flowProcedures == null && !wantGlue.isEmpty()) synx25();

    this.workExpectedMotion();
  }

  public synchronized void workExpectedMotion() {

    if (this.flowProcedures == null) {
      return;
    }

    while (!alternativeWay.assureDemands(this.flowProcedures)) {
      this.submitLayoutsDefective();
      hourStay = ClipQuantity;

      if (!wantGlue.isEmpty()) synx26();
      else {
        flowProcedures = null;
        return;
      }
    }
    flowProcedures.formalitiesComeMotions();
  }

  public synchronized Outgrowth quickAppendage() {
    return wantGlue.removeFirst();
  }

  public OberProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    this.breakSufferance = new ArrayDeque<>();
    hourStay = ClipQuantity;
  }

  public ArrayDeque<Outgrowth> wantGlue = null;

  public synchronized void submitLayoutsDefective() {
    Error f;
    f = new Error(this.takeTopicalMark(), flowProcedures);
    breakSufferance.add(f);
    flowProcedures.takeBreak().add(f);
  }

  public synchronized void ingoingProcedure(Outgrowth serve) {
    wantGlue.addLast(serve);
  }

  private synchronized void synx22(Error f, java.util.List<Error> flaws) {

    if (f.goPrimedClock() == this.takeTopicalMark()) flaws.add(f);
  }

  private synchronized void synx23(Error criticize) {
    breakSufferance.remove(criticize);
    alternativeWay.supplySummary(
        new Layouts(
            criticize.becomeMethodology().startApplication().peek(),
            criticize.becomeMethodology().sustainSelf(),
            0),
        criticize.becomeMethodology());

    if (!wantGlue.contains(criticize.becomeMethodology())) {
      this.ingoingProcedure(criticize.becomeMethodology());
    }
  }

  private synchronized void synx24() {
    hourStay--;

    if (flowProcedures.isEnded()) {
      flowProcedures.arrangedGoSentence(this.takeTopicalMark());
      this.realizedWork.addLast(flowProcedures);
      flowProcedures = null;
    }

    if (hourStay == 0 && flowProcedures != null) {

      if (wantGlue.isEmpty()) {
        hourStay = ClipQuantity;
      } else {
        this.ingoingProcedure(flowProcedures);
        flowProcedures = null;
      }
    }
  }

  private synchronized void synx25() {
    flowProcedures = this.quickAppendage();
    hourStay = ClipQuantity;
  }

  private synchronized void synx26() {
    flowProcedures = quickAppendage();
  }
}
