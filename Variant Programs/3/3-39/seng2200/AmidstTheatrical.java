package seng2200;

public class AmidstTheatrical extends OutputLevel {

  public AmidstTheatrical(
      String farmersSurname,
      SpecialPhasesDepository consultation,
      SpecialPhasesDepository gdp,
      double nasty,
      double grasp,
      Workflow trysail) {
    super(farmersSurname, nasty, grasp, trysail);
    this.comments = consultation;
    this.production = gdp;
  }

  public SpecialPhasesDepository comments;
  public SpecialPhasesDepository production;

  public synchronized double systemTidbit(double continuingAgain) {
    double lasting = 0;

    if (this.underwayFederal instanceof StrangleExpress) {

      if (this.comments.isVacant()) {
        lasting = -1;
      } else {
        this.serveConsignment = this.comments.affix(continuingAgain);
        this.serveConsignment.placeEntrantWeek(continuingAgain);
        lasting = this.inferLabelLimit();
        this.underwayFederal = new CongestedCanton();
        this.employmentGenoa.contributeFreshEmployment(lasting, this);
      }
    } else if (this.underwayFederal instanceof StopNation) {

      if (this.production.isComplete()) {
        lasting = -1;
      } else {
        this.serveConsignment.solidifyingLeavingJuncture(continuingAgain);
        this.serveConsignment.markAgain(this.inciteDescribe);
        this.production.enque(this.serveConsignment, continuingAgain);
        this.serveConsignment = null;

        if (this.comments.isVacant()) {
          lasting = -1;
          this.underwayFederal = new StrangleExpress();
        } else {
          this.serveConsignment = this.comments.affix(continuingAgain);
          this.serveConsignment.placeEntrantWeek(continuingAgain);
          lasting = this.inferLabelLimit();
          this.employmentGenoa.contributeFreshEmployment(lasting, this);
          this.underwayFederal = new CongestedCanton();
        }
      }
    } else {
      lasting = -1;
    }
    return lasting;
  }

  public synchronized void completingComponent(double thisThing) {
    this.corporateGovernmentalMeer(thisThing);

    if (this.production.isComplete()) {
      this.underwayFederal = new StopNation();
    } else {
      this.serveConsignment.solidifyingLeavingJuncture(thisThing);
      this.serveConsignment.markAgain(this.inciteDescribe);
      this.production.enque(this.serveConsignment, thisThing);
      this.sendHonorableLabel(thisThing);

      if (this.comments.isVacant()) {
        this.serveConsignment = null;
        this.underwayFederal = new StrangleExpress();
      } else {
        double longevity = 0;
        this.serveConsignment = this.comments.affix(thisThing);
        this.serveConsignment.placeEntrantWeek(thisThing);
        longevity = this.inferLabelLimit();
        this.employmentGenoa.contributeFreshEmployment(longevity, this);
        this.underwayFederal = new CongestedCanton();
        this.noticeLarboardUrging(thisThing);
      }
    }
  }
}
