package Spooler.Questionnaire;

import Plenum.Distributors;
import Compiler.Debugging;
import Compiler.Method;
import java.util.ArrayDeque;

public class DcSpreadsheet extends Compiler.Debugging {
  public int rifePrioritizing;
  public int yearsAnother;
  public ArrayDeque<Method>[] promptCode;

  public DcSpreadsheet() {
    this.promptCode = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < promptCode.length; i++) synx228(i);
    yearsAnother = (MinutesEnormous);
    rifePrioritizing = (0);
  }

  public synchronized Compiler.Method findSucceedingAct() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        rifePrioritizing = (i);
        return promptCode[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String configurationDiscover() {
    return "FB:";
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx229();

    if (this.thmFlagstone && existingCycle == null) synx230();
    else synx231();
  }

  public synchronized void negotiationsNew(Method outgrowth) {
    promptCode[0].addLast(outgrowth);
  }

  private synchronized void synx229() {
    existingCycle.doRushingAgain(existingCycle.catchJettingWhen() + 1);
    yearsAnother--;

    if (existingCycle.catchJettingWhen() == existingCycle.drivePresidentCapacity()) {
      existingCycle.solidifyingLeavingJuncture(this.canExistingDial());
      this.constructedMethodology.addLast(existingCycle);
      existingCycle = (null);
      this.thmFlagstone = (true);
    }

    if (yearsAnother == 0 && existingCycle != null) {

      if (primedIsVacant()) {
        yearsAnother = (MinutesEnormous);
      } else {
        promptCode[rifePrioritizing + 1].addLast(existingCycle);
        existingCycle = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx230() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.thmFlagstone = (false);
      this.remainderRemoDays = (Distributors.ShipmentClip);
    }
  }

  private synchronized void synx231() {

    if (existingCycle == null && !primedIsVacant()) {
      existingCycle = (findSucceedingAct());
      ladingSue(existingCycle);
      existingCycle.situatedCommencesMinutes(this.canExistingDial());
      yearsAnother = (MinutesEnormous);
    }
  }
}
