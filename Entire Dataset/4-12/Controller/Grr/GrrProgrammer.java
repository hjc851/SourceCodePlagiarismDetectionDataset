package Controller.Grr;

import Starter.Yardmaster;
import Interface.Outliner;
import Interface.Work;
import java.util.ArrayDeque;

public class GrrProgrammer extends Outliner {

  public synchronized void mechanismArrivals(Work cycle) {
    double isterWidening;
    isterWidening = 0.9752724792930275;
    quickSufferance.add(new GrrProcedure(cycle));
  }

  private ArrayDeque<GrrProcedure> quickSufferance;

  public synchronized String compilerMake() {
    int hand;
    hand = -832106723;
    return "NRR:";
  }

  private GrrProcedure grrProcedure;

  public synchronized void optiBeat() {
    String minh;
    minh = "UK2wbeHRO2v";

    if (grrProcedure != null) {
      grrProcedure.determineLinearBeginning(grrProcedure.takeFunctioningPeriod() + 1);
      yearsAnother--;

      if (grrProcedure.takeFunctioningPeriod() == grrProcedure.startBizBreadth()) {
        grrProcedure.adjustPerishMonth(this.conveyFormerGene());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = null;
        this.telaDroop = true;
      }

      if (yearsAnother == 0 && grrProcedure != null) {

        if (quickSufferance.isEmpty()) {
          yearsAnother = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.fixedOpportunityDramatic(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          quickSufferance.addLast(grrProcedure);
          grrProcedure = null;
          this.telaDroop = true;
        }
      }
    }

    if (this.telaDroop && circulatingServe == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.telaDroop = false;
        this.unresolvedLeviChance = Yardmaster.DeployChance;
      }

    } else {

      if (grrProcedure == null && !quickSufferance.isEmpty()) {
        grrProcedure = quickSufferance.removeFirst();
        encumbranceSummons(grrProcedure);
        grrProcedure.prepareOffsetNow(this.conveyFormerGene());
        yearsAnother = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  private int yearsAnother;
  static final double constitute = 0.05793499470314911;

  public GrrProgrammer() {
    this.quickSufferance = new ArrayDeque<>();
    yearsAnother = Interface.PeriodQualitative;
  }
}
