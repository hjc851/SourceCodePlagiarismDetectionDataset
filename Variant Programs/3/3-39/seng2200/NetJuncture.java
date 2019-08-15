package seng2200;

public class NetJuncture extends OutputLevel {

  public synchronized double systemTidbit(double formerAmount) {
    double extent = 0;

    if (this.underwayFederal instanceof StrangleExpress) {

      if (this.participatory.isVacant()) {
        extent = -1;
      } else {
        this.serveConsignment = this.participatory.affix(formerAmount);
        this.serveConsignment.placeEntrantWeek(formerAmount);
        extent = this.inferLabelLimit();
        this.underwayFederal = new CongestedCanton();
        this.employmentGenoa.contributeFreshEmployment(extent, this);
      }
    } else {
      extent = -1;
    }
    return extent;
  }

  public NetJuncture(
      String orientedConstitute,
      SpecialPhasesDepository advice,
      double spiteful,
      double chain,
      ProduceAsap farmQuickly,
      Workflow windward) {
    super(orientedConstitute, spiteful, chain, windward);
    this.participatory = advice;
    this.yield = farmQuickly;
  }

  public synchronized void completingComponent(double theOpportunity) {
    this.corporateGovernmentalMeer(theOpportunity);
    this.serveConsignment.solidifyingLeavingJuncture(theOpportunity);
    this.serveConsignment.markAgain(this.inciteDescribe);
    this.yield.tot(this.serveConsignment);

    if (this.participatory.isVacant()) {
      this.serveConsignment = null;
      this.underwayFederal = new StrangleExpress();
    } else {
      double lasted = 0;
      this.serveConsignment = this.participatory.affix(theOpportunity);
      this.serveConsignment.placeEntrantWeek(theOpportunity);
      lasted = this.inferLabelLimit();
      this.underwayFederal = new CongestedCanton();
      this.employmentGenoa.contributeFreshEmployment(lasted, this);
      this.noticeLarboardUrging(theOpportunity);
    }
  }

  public ProduceAsap yield;
  public SpecialPhasesDepository participatory;
}
