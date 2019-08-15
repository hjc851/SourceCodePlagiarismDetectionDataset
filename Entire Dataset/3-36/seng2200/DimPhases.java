package seng2200;

public class DimPhases extends seng2200.CultivationScene {

  DimPhases(
      String pokeRefer,
      BuryPhaseStorehouse stimulant,
      BuryPhaseStorehouse intensity,
      double average,
      double stray,
      Developer timezone) {
    super(pokeRefer, average, stray, timezone);
    this.stimulation = (stimulant);
    this.produced = (intensity);
  }

  public synchronized double cycleAgenda(double liveDays) {
    double period = 0;

    if (this.presentlyForeign instanceof seng2200.DieLand) {

      if (this.stimulation.isVacant()) {
        period = (-1);
      } else {
        this.sueSomething = (this.stimulation.calorie(liveDays));
        this.sueSomething.laidEntranceClip(liveDays);
        period = (this.determiningOrientedHours());
        this.presentlyForeign = (new seng2200.LabouringSate());
        this.careerTonite.bestowNewfangledProblem(period, this);
      }
    } else if (this.presentlyForeign instanceof seng2200.StoppageCanton) {

      if (this.produced.isComplete()) {
        period = (-1);
      } else {
        this.sueSomething.markDeceaseHours(liveDays);
        this.sueSomething.imprimaturWeek(this.farmNickname);
        this.produced.enque(this.sueSomething, liveDays);
        this.sueSomething = (null);

        if (this.stimulation.isVacant()) {
          period = (-1);
          this.presentlyForeign = (new seng2200.DieLand());
        } else {
          this.sueSomething = (this.stimulation.calorie(liveDays));
          this.sueSomething.laidEntranceClip(liveDays);
          period = (this.determiningOrientedHours());
          this.careerTonite.bestowNewfangledProblem(period, this);
          this.presentlyForeign = (new seng2200.LabouringSate());
        }
      }
    } else {
      period = (-1);
    }
    return period;
  }

  public synchronized void terminusSomething(double formerAmount) {
    this.ingSayRough(formerAmount);

    if (this.produced.isComplete()) synx442();
    else synx443(formerAmount);
  }

  private seng2200.BuryPhaseStorehouse stimulation;
  private seng2200.BuryPhaseStorehouse produced;

  private synchronized void synx442() {
    this.presentlyForeign = (new seng2200.StoppageCanton());
  }

  private synchronized void synx443(double formerAmount) {
    this.sueSomething.markDeceaseHours(formerAmount);
    this.sueSomething.imprimaturWeek(this.farmNickname);
    this.produced.enque(this.sueSomething, formerAmount);
    this.communicateConservativeImpel(formerAmount);

    if (this.stimulation.isVacant()) {
      this.sueSomething = (null);
      this.presentlyForeign = (new seng2200.DieLand());
    } else {
      double limit = 0;
      this.sueSomething = (this.stimulation.calorie(formerAmount));
      this.sueSomething.laidEntranceClip(formerAmount);
      limit = (this.determiningOrientedHours());
      this.careerTonite.bestowNewfangledProblem(limit, this);
      this.presentlyForeign = (new seng2200.LabouringSate());
      this.instructNighJab(formerAmount);
    }
  }
}
