package seng2200;

public class JumpMoment extends seng2200.CultivationScene {

  public synchronized double cycleAgenda(double flowMonth) {
    double remainder = 0;

    if (this.presentlyForeign instanceof seng2200.DieLand) {
      remainder = (this.determiningOrientedHours());
      this.sueSomething = (new seng2200.Consignment());
      this.sueSomething.laidEntranceClip(flowMonth);
      this.presentlyForeign = (new seng2200.LabouringSate());
      this.careerTonite.bestowNewfangledProblem(remainder, this);
      this.pieceReckoning += (this.pieceReckoning + 1);
    } else if (this.presentlyForeign instanceof seng2200.StoppageCanton) {

      if (this.volume.isComplete()) {
        remainder = (-1);
      } else {
        this.sueSomething.markDeceaseHours(flowMonth);
        this.sueSomething.imprimaturWeek(this.farmNickname);
        this.volume.enque(this.sueSomething, flowMonth);
        this.sueSomething = (new seng2200.Consignment());
        this.sueSomething.laidEntranceClip(flowMonth);
        remainder = (this.determiningOrientedHours());
        this.careerTonite.bestowNewfangledProblem(remainder, this);
        this.presentlyForeign = (new seng2200.LabouringSate());
        this.pieceReckoning += (this.pieceReckoning + 1);
      }
    } else {
      remainder = (-1);
    }
    return remainder;
  }

  private seng2200.BuryPhaseStorehouse volume;

  JumpMoment(
      String pushDistinguish,
      BuryPhaseStorehouse power,
      double signify,
      double straddle,
      Developer kts) {
    super(pushDistinguish, signify, straddle, kts);
    this.volume = (power);
  }

  public synchronized void terminusSomething(double streamWeek) {
    this.ingSayRough(streamWeek);

    if (this.volume.isComplete()) synx440();
    else synx441(streamWeek);
  }

  private synchronized void synx440() {
    this.presentlyForeign = (new seng2200.StoppageCanton());
  }

  private synchronized void synx441(double streamWeek) {
    this.sueSomething.markDeceaseHours(streamWeek);
    this.sueSomething.imprimaturWeek(this.farmNickname);
    this.volume.enque(this.sueSomething, streamWeek);
    this.sueSomething = (null);
    this.presentlyForeign = (new seng2200.DieLand());
    this.communicateConservativeImpel(streamWeek);
  }
}
