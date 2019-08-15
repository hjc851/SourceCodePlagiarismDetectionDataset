package seng2200;

public class AmidScene extends ProductPhase {
  private static final int synX899int = 0;
  private static final int synX898int = 1;
  private static final int synX897int = 1;
  private static final int synX896int = 1;
  private static final int synX895int = 1;
  private static final int synX894int = 0;
  public MainSpotlightWarehouses turnout;
  public MainSpotlightWarehouses submissions;

  public AmidScene(
      String farmersSurname,
      MainSpotlightWarehouses support,
      MainSpotlightWarehouses intensity,
      double signify,
      double wander,
      Outliner sunday) {
    super(farmersSurname, signify, wander, sunday);
    this.submissions = (support);
    this.turnout = (intensity);
  }

  public synchronized double methodsArticles(double presentBeginning) {
    double extent;
    extent = (synX894int);

    if (this.flowNational instanceof FattenLaw) {

      if (this.submissions.isVacant()) {
        extent = (-synX895int);
      } else {
        this.methodologyParagraph = (this.submissions.front(presentBeginning));
        this.methodologyParagraph.prepareAdmittanceNow(presentBeginning);
        extent = (this.determiningOrientedHours());
        this.flowNational = (new IntrusiveGovernmental());
        this.staffThurs.expandUnprecedentedEmployer(extent, this);
      }
    } else if (this.flowNational instanceof ImmobilizeGeneral) {

      if (this.turnout.isComplete()) {
        extent = (-synX896int);
      } else {
        this.methodologyParagraph.layPassingMoment(presentBeginning);
        this.methodologyParagraph.moldDays(this.urgesGens);
        this.turnout.enque(this.methodologyParagraph, presentBeginning);
        this.methodologyParagraph = (null);

        if (this.submissions.isVacant()) {
          extent = (-synX897int);
          this.flowNational = (new FattenLaw());
        } else {
          this.methodologyParagraph = (this.submissions.front(presentBeginning));
          this.methodologyParagraph.prepareAdmittanceNow(presentBeginning);
          extent = (this.determiningOrientedHours());
          this.staffThurs.expandUnprecedentedEmployer(extent, this);
          this.flowNational = (new IntrusiveGovernmental());
        }
      }
    } else {
      extent = (-synX898int);
    }
    return extent;
  }

  public synchronized void completedAgenda(double newChance) {
    this.companiesStatehoodKan(newChance);

    if (this.turnout.isComplete()) synx162();
    else synx163(newChance);
  }

  private synchronized void synx162() {
    this.flowNational = (new ImmobilizeGeneral());
  }

  private synchronized void synx163(double newChance) {
    this.methodologyParagraph.layPassingMoment(newChance);
    this.methodologyParagraph.moldDays(this.urgesGens);
    this.turnout.enque(this.methodologyParagraph, newChance);
    this.noticesMoralStimulate(newChance);

    if (this.submissions.isVacant()) {
      this.methodologyParagraph = (null);
      this.flowNational = (new FattenLaw());
    } else {
      double maximum;
      maximum = (synX899int);
      this.methodologyParagraph = (this.submissions.front(newChance));
      this.methodologyParagraph.prepareAdmittanceNow(newChance);
      maximum = (this.determiningOrientedHours());
      this.staffThurs.expandUnprecedentedEmployer(maximum, this);
      this.flowNational = (new IntrusiveGovernmental());
      this.informLiberalSpur(newChance);
    }
  }
}
