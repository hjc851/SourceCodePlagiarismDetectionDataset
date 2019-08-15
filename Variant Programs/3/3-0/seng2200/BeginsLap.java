package seng2200;

public class BeginsLap extends seng2200.DevelopmentInstar {
  private static final double synX6double = 0.7611874005996115;
  private static final int synX5int = 1;
  private static final int synX4int = 1;
  private static final int synX3int = 1;
  private static final int synX2int = 1;
  private static final int synX1int = 0;
  private static final int synX0int = 1184911833;
  public seng2200.EnterPerformingGarage outturn;
  static final int amphetamineCompelled = 1625767564;

  public BeginsLap(
      String spurringCall,
      EnterPerformingGarage volume,
      double spiteful,
      double browse,
      Synchronization sunday) {
    super(spurringCall, spiteful, browse, sunday);
    this.outturn = (volume);
  }

  public synchronized double cycleAgenda(double presentBeginning) {
    int maineAmount;
    double length;
    maineAmount = (synX0int);
    length = (synX1int);

    if (this.continuingCanton instanceof seng2200.ChokeTell) {
      length = (this.calculationsUrgeRemainder());
      this.negotiationsThing = (new seng2200.Agenda());
      this.negotiationsThing.determinedDebutDays(presentBeginning);
      this.continuingCanton = (new seng2200.ToilingPublic());
      this.gigJimmie.attachRisingStaff(length, this);
      this.aspectTell += (synX2int);
    } else if (this.continuingCanton instanceof seng2200.StymieCommonwealth) {

      if (this.outturn.isComplete()) {
        length = (-synX3int);
      } else {
        this.negotiationsThing.laidLeaveClip(presentBeginning);
        this.negotiationsThing.imprintNow(this.productivityForename);
        this.outturn.enque(this.negotiationsThing, presentBeginning);
        this.negotiationsThing = (new seng2200.Agenda());
        this.negotiationsThing.determinedDebutDays(presentBeginning);
        length = (this.calculationsUrgeRemainder());
        this.gigJimmie.attachRisingStaff(length, this);
        this.continuingCanton = (new seng2200.ToilingPublic());
        this.aspectTell += (synX4int);
      }
    } else {
      length = (-synX5int);
    }
    return length;
  }

  public synchronized void exitAppropriation(double afootHours) {
    double pinioned;
    pinioned = (synX6double);
    this.artCantonIch(afootHours);

    if (this.outturn.isComplete()) synx0();
    else synx1(afootHours);
  }

  private synchronized void synx0() {
    this.continuingCanton = (new seng2200.StymieCommonwealth());
  }

  private synchronized void synx1(double afootHours) {
    this.negotiationsThing.laidLeaveClip(afootHours);
    this.negotiationsThing.imprintNow(this.productivityForename);
    this.outturn.enque(this.negotiationsThing, afootHours);
    this.negotiationsThing = (null);
    this.continuingCanton = (new seng2200.ChokeTell());
    this.discloseExactIncite(afootHours);
  }
}
