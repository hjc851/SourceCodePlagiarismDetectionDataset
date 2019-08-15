package seng2200;

public class RestartPerforming extends seng2200.OutputLevel {

  public RestartPerforming(
      String pushDistinguish,
      BreakJunctureCloset power,
      double beggarly,
      double ramble,
      Compiler ushant) {
    super(pushDistinguish, beggarly, ramble, ushant);
    this.volume = power;
  }

  public synchronized void accomplishAspect(double newChance) {
    double keepsake;
    keepsake = 0.7540825172248018;
    this.artCantonIch(newChance);

    if (this.volume.isComplete()) {
      this.formerTerritory = new seng2200.ImmobilizeGeneral();
    } else {
      this.systemTidbit.adjustPerishMonth(newChance);
      this.systemTidbit.moldDays(this.stimulateCite);
      this.volume.enque(this.systemTidbit, newChance);
      this.systemTidbit = null;
      this.formerTerritory = new seng2200.FamineFederal();
      this.discloseExactIncite(newChance);
    }
  }

  public seng2200.BreakJunctureCloset volume;

  public synchronized double litigatePiece(double thisThing) {
    double minimum;
    double periods;
    minimum = 0.5221791809568893;
    periods = 0;

    if (this.formerTerritory instanceof seng2200.FamineFederal) {
      periods = this.evaluateFarmersStays();
      this.systemTidbit = new seng2200.Detail();
      this.systemTidbit.laidEntranceClip(thisThing);
      this.formerTerritory = new seng2200.LabouringSate();
      this.tenureMst.enhanceBabyTenure(periods, this);
      this.articlesGet += 1;
    } else if (this.formerTerritory instanceof seng2200.ImmobilizeGeneral) {

      if (this.volume.isComplete()) {
        periods = -1;
      } else {
        this.systemTidbit.adjustPerishMonth(thisThing);
        this.systemTidbit.moldDays(this.stimulateCite);
        this.volume.enque(this.systemTidbit, thisThing);
        this.systemTidbit = new seng2200.Detail();
        this.systemTidbit.laidEntranceClip(thisThing);
        periods = this.evaluateFarmersStays();
        this.tenureMst.enhanceBabyTenure(periods, this);
        this.formerTerritory = new seng2200.LabouringSate();
        this.articlesGet += 1;
      }
    } else {
      periods = -1;
    }
    return periods;
  }

  public static String bandwidth = "qzpoH";
}
