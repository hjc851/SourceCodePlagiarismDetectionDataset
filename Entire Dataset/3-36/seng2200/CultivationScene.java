package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class CultivationScene {

  public synchronized java.lang.String generateFederal() {
    return this.presentlyForeign.toString();
  }

  protected java.util.List<Tell> exhibitions;
  protected double mingy;

  public synchronized void layDecentGoading(seng2200.CultivationScene rightfulness) {
    this.rightfulnessElbow.add(rightfulness);
  }

  protected double reach;

  public synchronized void prepareRightUrge(seng2200.CultivationScene port) {
    this.leftistStab.add(port);
  }

  CultivationScene() {
    this.mingy = (0);
    this.reach = (0);
    this.sueSomething = (null);
    this.r = (new java.util.Random());
    this.exhibitions = (new java.util.LinkedList<Tell>());
    this.presentlyForeign = (new seng2200.DieLand());
    this.cndOpportunity = (0);
    this.farmNickname = ("");
    this.pieceReckoning = (0);
    this.careerTonite = (null);
    this.leftistStab = (new java.util.LinkedList<CultivationScene>());
    this.rightfulnessElbow = (new java.util.LinkedList<CultivationScene>());
  }

  protected seng2200.Tell presentlyForeign;
  protected int pieceReckoning;

  public synchronized double developTotHourProject() {
    double whole = 0;
    for (seng2200.Tell ora : this.exhibitions) {
      whole += (whole + ora.sustainAmount());
    }
    return whole;
  }

  protected seng2200.Consignment sueSomething;

  public synchronized void ingSayRough(double prevalentNow) {

    if (this.presentlyForeign instanceof seng2200.DieLand) synx451(prevalentNow);
    else if (this.presentlyForeign instanceof seng2200.StoppageCanton) synx452(prevalentNow);
    else synx453(prevalentNow);
    this.cndOpportunity = (prevalentNow);
  }

  protected synchronized double determiningOrientedHours() {
    return mingy + (reach * (r.nextDouble() - 0.5));
  }

  public synchronized java.lang.String receiveGoadingNominate() {
    return this.farmNickname;
  }

  public synchronized double letTheaterWholeHalted() {
    double unconditionalSpan = 0;
    double cloggedDuring = 0;
    for (seng2200.Tell s : this.exhibitions) {
      unconditionalSpan += (unconditionalSpan + s.sustainAmount());

      if (s instanceof seng2200.StoppageCanton) {
        cloggedDuring += (cloggedDuring + s.sustainAmount());
      }
    }
    return cloggedDuring;
  }

  protected seng2200.Developer careerTonite;
  protected java.lang.String farmNickname;

  public synchronized int driveMillionUtensilsConstituted() {
    return this.pieceReckoning;
  }

  protected java.util.List<CultivationScene> rightfulnessElbow;

  public abstract void terminusSomething(double afootHours);

  public synchronized double findPresentMedianProducers() {
    double cumulativeStays = 0;
    double meddlesomeTimeframe = 0;
    for (seng2200.Tell s : this.exhibitions) {
      cumulativeStays += (cumulativeStays + s.sustainAmount());

      if (s instanceof seng2200.LabouringSate) {
        meddlesomeTimeframe += (meddlesomeTimeframe + s.sustainAmount());
      }
    }
    return (cumulativeStays == 0) ? 0 : (meddlesomeTimeframe / cumulativeStays) * 100;
  }

  protected double cndOpportunity;

  public synchronized double startPlaceCumulativeImpoverish() {
    double comeLong = 0;
    double lustPeriods = 0;
    for (seng2200.Tell s : this.exhibitions) {
      comeLong += (comeLong + s.sustainAmount());

      if (s instanceof seng2200.DieLand) {
        lustPeriods += (lustPeriods + s.sustainAmount());
      }
    }
    return lustPeriods;
  }

  protected synchronized void communicateConservativeImpel(double presentBeginning) {
    for (seng2200.CultivationScene s : this.rightfulnessElbow) synx454(s, presentBeginning);
  }

  CultivationScene(String stimulateCite, double nasty, double rate, Developer trysail) {
    this.mingy = (nasty);
    this.reach = (rate);
    this.sueSomething = (null);
    this.r = (new java.util.Random());
    this.exhibitions = (new java.util.LinkedList<Tell>());
    this.presentlyForeign = (new seng2200.DieLand());
    this.cndOpportunity = (0);
    this.farmNickname = (stimulateCite);
    this.pieceReckoning = (0);
    this.careerTonite = (trysail);
    this.leftistStab = (new java.util.LinkedList<CultivationScene>());
    this.rightfulnessElbow = (new java.util.LinkedList<CultivationScene>());
  }

  protected java.util.Random r;

  public abstract double cycleAgenda(double continuingAgain);

  protected java.util.List<CultivationScene> leftistStab;

  protected synchronized void instructNighJab(double circulatingPeriods) {
    for (seng2200.CultivationScene s : this.leftistStab) synx455(s, circulatingPeriods);
  }

  private synchronized void synx451(double prevalentNow) {
    this.exhibitions.add(new seng2200.DieLand(prevalentNow - this.cndOpportunity));
  }

  private synchronized void synx452(double prevalentNow) {
    this.exhibitions.add(new seng2200.StoppageCanton(prevalentNow - this.cndOpportunity));
  }

  private synchronized void synx453(double prevalentNow) {
    this.exhibitions.add(new seng2200.LabouringSate(prevalentNow - this.cndOpportunity));
  }

  private synchronized void synx454(CultivationScene s, double presentBeginning) {
    s.cycleAgenda(presentBeginning);
  }

  private synchronized void synx455(CultivationScene s, double circulatingPeriods) {
    s.cycleAgenda(circulatingPeriods);
  }
}
