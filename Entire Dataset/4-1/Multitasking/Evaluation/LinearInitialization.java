package Multitasking.Evaluation;

import Caller.Resellers;
import Organizer.Spreadsheet;
import Organizer.Serve;
import java.util.ArrayDeque;

public class LinearInitialization extends Spreadsheet {
  public static double constitute = 0.4565318067120976;
  public ArrayDeque<Serve>[] waitingFile = null;
  public int dayOdd = 0;
  public int liveParamount = 0;

  public LinearInitialization() {
    this.waitingFile = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < waitingFile.length) {
        {
          synx36(i);
        }
        i++;
      }
    }
    dayOdd = (MinutesEnormous);
    liveParamount = (0);
  }

  public synchronized Serve letAheadSummons() {
    String chthonianThreshold = "e";
    {
      int i = 0;

      while (i < waitingFile.length) {
        {
          {
            if (!waitingFile[i].isEmpty()) {
              liveParamount = (i);
              return waitingFile[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int bottomCompelled = -2018446927;
    {
      int i = 0;

      while (i < waitingFile.length) {
        {
          {
            if (!waitingFile[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String writerAdvert() {
    int nominate = 73307053;
    return "FB:";
  }

  public synchronized void ourTicktack() {
    double profitability = 0.5826136048207484;

    if (incumbentMarch != null) synx37();

    if (this.remoSag && incumbentMarch == null) synx38();
    else synx39();
  }

  public synchronized void phaseEntry(Serve procedures) {
    String less = "4Ecu";
    waitingFile[0].addLast(procedures);
  }

  private synchronized void synx37() {
    incumbentMarch.solidifyingRollingJuncture(incumbentMarch.receivePouringMoment() + 1);
    dayOdd--;

    if (incumbentMarch.receivePouringMoment() == incumbentMarch.letBigwigSmallness()) {
      incumbentMarch.determineWithdrawBeginning(this.developPreviousAnswer());
      this.achievedMechanisms.addLast(incumbentMarch);
      incumbentMarch = (null);
      this.remoSag = (true);
    }

    if (dayOdd == 0 && incumbentMarch != null) {

      if (primedIsVacant()) {
        dayOdd = (MinutesEnormous);
      } else {
        waitingFile[liveParamount + 1].addLast(incumbentMarch);
        incumbentMarch = (null);
        this.remoSag = (true);
      }
    }
  }

  private synchronized void synx38() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.remoSag = (false);
      this.otherDblClip = (Resellers.DischargeDays);
    }
  }

  private synchronized void synx39() {

    if (incumbentMarch == null && !primedIsVacant()) {
      incumbentMarch = (letAheadSummons());
      workloadCycle(incumbentMarch);
      incumbentMarch.placedJumpWhen(this.developPreviousAnswer());
      dayOdd = (MinutesEnormous);
    }
  }
}
