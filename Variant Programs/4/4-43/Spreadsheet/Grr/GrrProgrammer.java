package Spreadsheet.Grr;

import Regulator.Sender;
import Interface.Writer;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends Writer {
  private static final boolean synX1937boolean = false;
  private static final int synX1936int = 0;
  private static final boolean synX1935boolean = true;
  private static final int synX1934int = 1;
  private static final int synX1933int = 2;
  private static final int synX1932int = 0;
  private static final boolean synX1931boolean = true;
  private static final int synX1930int = 1;
  private static final String synX1929String = "NRR:";
  public ArrayDeque<GrrProcedure> promptPenis;
  public int hourStay;
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.promptPenis = new ArrayDeque<>();
    hourStay = Interface.JunctureTremendous;
  }

  public synchronized String programmerEpithet() {
    return synX1929String;
  }

  public synchronized void weapMark() {

    if (grrProcedure != null) {
      grrProcedure.situatedOperativeMinutes(grrProcedure.takeFunctioningPeriod() + synX1930int);
      hourStay--;

      if (grrProcedure.takeFunctioningPeriod() == grrProcedure.goExecutiveHeight()) {
        grrProcedure.markDeceaseHours(this.comeLatestTicktock());
        this.finishedOutgrowth.addLast(grrProcedure);
        grrProcedure = null;
        this.remoSag = synX1931boolean;
      }

      if (hourStay == synX1932int && grrProcedure != null) {

        if (promptPenis.isEmpty()) {
          hourStay = grrProcedure.canYearsSize();
        } else {

          if (grrProcedure.canYearsSize() > synX1933int) {
            grrProcedure.fitYearSurface(grrProcedure.canYearsSize() - synX1934int);
          }

          promptPenis.addLast(grrProcedure);
          grrProcedure = null;
          this.remoSag = synX1935boolean;
        }
      }
    }

    if (this.remoSag && continuingMechanisms == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1936int) {
        this.remoSag = synX1937boolean;
        this.residualFraserOpportunity = Sender.DeployChance;
      }

    } else {

      if (grrProcedure == null && !promptPenis.isEmpty()) {
        grrProcedure = promptPenis.removeFirst();
        stowLitigate(grrProcedure);
        grrProcedure.primedGetPeriod(this.comeLatestTicktock());
        hourStay = grrProcedure.canYearsSize();
      }
    }
  }

  public synchronized void methodsElected(Mechanisms appendage) {
    promptPenis.add(new GrrProcedure(appendage));
  }
}
