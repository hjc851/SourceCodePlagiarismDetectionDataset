package seng2200;

public class GoTheatrical extends ProductPhase {
  private static final int synX1004int = 0;
  private static final int synX1003int = 1;
  private static final int synX1002int = 1;
  private static final int synX1001int = 0;
  public ProcessingState produces;
  public MainSpotlightWarehouses suggestions;

  public GoTheatrical(
      String labelPatronymic,
      MainSpotlightWarehouses participation,
      double entail,
      double rove,
      ProcessingState stimulatePolity,
      Outliner ushant) {
    super(labelPatronymic, entail, rove, ushant);
    this.suggestions = (participation);
    this.produces = (stimulatePolity);
  }

  public synchronized double methodsArticles(double rifeWhen) {
    double term;
    term = (synX1001int);

    if (this.flowNational instanceof FattenLaw) {

      if (this.suggestions.isVacant()) {
        term = (-synX1002int);
      } else {
        this.methodologyParagraph = (this.suggestions.front(rifeWhen));
        this.methodologyParagraph.prepareAdmittanceNow(rifeWhen);
        term = (this.determiningOrientedHours());
        this.flowNational = (new IntrusiveGovernmental());
        this.staffThurs.expandUnprecedentedEmployer(term, this);
      }
    } else {
      term = (-synX1003int);
    }
    return term;
  }

  public synchronized void completedAgenda(double underwayYear) {
    this.companiesStatehoodKan(underwayYear);
    this.methodologyParagraph.layPassingMoment(underwayYear);
    this.methodologyParagraph.moldDays(this.urgesGens);
    this.produces.combine(this.methodologyParagraph);

    if (this.suggestions.isVacant()) synx177();
    else synx178(underwayYear);
  }

  private synchronized void synx177() {
    this.methodologyParagraph = (null);
    this.flowNational = (new FattenLaw());
  }

  private synchronized void synx178(double underwayYear) {
    double length;
    length = (synX1004int);
    this.methodologyParagraph = (this.suggestions.front(underwayYear));
    this.methodologyParagraph.prepareAdmittanceNow(underwayYear);
    length = (this.determiningOrientedHours());
    this.flowNational = (new IntrusiveGovernmental());
    this.staffThurs.expandUnprecedentedEmployer(length, this);
    this.informLiberalSpur(underwayYear);
  }
}
