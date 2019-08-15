import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Server {
  public java.util.ArrayDeque<Procedures> ablePecker;

  public synchronized void addTock() {
    java.util.List<Malfunction> malfunctions = new java.util.LinkedList<>();
    for (Malfunction f : malfunctionBraid) synx440(f, malfunctions);
    for (Malfunction glitch : malfunctions) synx441(glitch);

    if (presentNegotiations != null) synx442();

    if (presentNegotiations == null && !ablePecker.isEmpty()) synx443();

    this.prevailNowPlea();
  }

  public synchronized void outboundProceeding(Procedures system) {
    ablePecker.addLast(system);
  }

  public synchronized Procedures preparedOperation() {
    return ablePecker.removeFirst();
  }

  public DiddleProgramming() {
    this.ablePecker = (new java.util.ArrayDeque<>());
    this.malfunctionBraid = (new java.util.ArrayDeque<>());
    yearStill = (PeriodQualitative);
  }

  public synchronized void institutionalizeSectionCulpability() {
    Malfunction f = new Malfunction(this.findActualRetick(), presentNegotiations);
    malfunctionBraid.add(f);
    presentNegotiations.catchShortcomings().add(f);
  }

  public java.util.ArrayDeque<Malfunction> malfunctionBraid;

  public synchronized void prevailNowPlea() {

    if (this.presentNegotiations == null) {
      return;
    }

    while (!substitutionPolicies.watchQuest(this.presentNegotiations)) {
      this.institutionalizeSectionCulpability();
      yearStill = (PeriodQualitative);

      if (!ablePecker.isEmpty()) synx444();
      else {
        presentNegotiations = (null);
        return;
      }
    }
    presentNegotiations.methodSecondDecision();
  }

  public int yearStill;

  private synchronized void synx440(Malfunction f, java.util.List<Malfunction> malfunctions) {

    if (f.canEagerYears() == this.findActualRetick()) malfunctions.add(f);
  }

  private synchronized void synx441(Malfunction glitch) {
    malfunctionBraid.remove(glitch);
    substitutionPolicies.combineScreen(
        new Layouts(
            glitch.haveServe().drawSubmissions().peek(), glitch.haveServe().sustainSelf(), 0),
        glitch.haveServe());

    if (!ablePecker.contains(glitch.haveServe())) {
      this.outboundProceeding(glitch.haveServe());
    }
  }

  private synchronized void synx442() {
    yearStill--;

    if (presentNegotiations.isEnded()) {
      presentNegotiations.determineWithdrawBeginning(this.findActualRetick());
      this.performedTreat.addLast(presentNegotiations);
      presentNegotiations = (null);
    }

    if (yearStill == 0 && presentNegotiations != null) {

      if (ablePecker.isEmpty()) {
        yearStill = (PeriodQualitative);
      } else {
        this.outboundProceeding(presentNegotiations);
        presentNegotiations = (null);
      }
    }
  }

  private synchronized void synx443() {
    presentNegotiations = (this.preparedOperation());
    yearStill = (PeriodQualitative);
  }

  private synchronized void synx444() {
    presentNegotiations = (preparedOperation());
  }
}
