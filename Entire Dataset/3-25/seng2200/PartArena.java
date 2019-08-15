package seng2200;

public class PartArena extends seng2200.SupplyArena {
  private static final int synX1834int = 1;
  private static final int synX1833int = 1;
  private static final int synX1832int = 1;
  private static final int synX1831int = 1;
  private static final int synX1830int = 0;

  public synchronized double marchArtifact(double contemporaryMoment) {
    double continuance = synX1830int;

    if (this.rifeExpress instanceof seng2200.FattenLaw) {
      continuance = (this.evaluateFarmersStays());
      this.methodologyParagraph = (new seng2200.Appropriation());
      this.methodologyParagraph.determinedDebutDays(contemporaryMoment);
      this.rifeExpress = (new seng2200.LaboringSay());
      this.gigJimmie.enhanceBabyTenure(continuance, this);
      this.aspectTell += (this.aspectTell + synX1831int);
    } else if (this.rifeExpress instanceof seng2200.BarricadeLand) {

      if (this.produce.isComplete()) {
        continuance = (-synX1832int);
      } else {
        this.methodologyParagraph.solidifyingLeavingJuncture(contemporaryMoment);
        this.methodologyParagraph.bossYear(this.orientedConstitute);
        this.produce.enque(this.methodologyParagraph, contemporaryMoment);
        this.methodologyParagraph = (new seng2200.Appropriation());
        this.methodologyParagraph.determinedDebutDays(contemporaryMoment);
        continuance = (this.evaluateFarmersStays());
        this.gigJimmie.enhanceBabyTenure(continuance, this);
        this.rifeExpress = (new seng2200.LaboringSay());
        this.aspectTell += (this.aspectTell + synX1833int);
      }
    } else {
      continuance = (-synX1834int);
    }
    return continuance;
  }

  public seng2200.MattersPodiumArchiving produce = null;

  public synchronized void coatingGoods(double existingYears) {
    this.incorporatedNationalDus(existingYears);

    if (this.produce.isComplete()) {
      this.rifeExpress = (new seng2200.BarricadeLand());
    } else {
      this.methodologyParagraph.solidifyingLeavingJuncture(existingYears);
      this.methodologyParagraph.bossYear(this.orientedConstitute);
      this.produce.enque(this.methodologyParagraph, existingYears);
      this.methodologyParagraph = (null);
      this.rifeExpress = (new seng2200.FattenLaw());
      this.communicateConservativeImpel(existingYears);
    }
  }

  public PartArena(
      String productivityForename,
      MattersPodiumArchiving turnout,
      double awful,
      double wander,
      Callback trysail) {
    super(productivityForename, awful, wander, trysail);
    this.produce = (turnout);
  }
}
