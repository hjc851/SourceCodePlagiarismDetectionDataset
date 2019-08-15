package Programming;

import Vendor.Trainmaster;
import Moot.MethodsRobot;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Controller {
  private static final String synX678String = "\n";
  private static final String synX677String = "%-7s%16d%19d";
  private static final String synX676String = " to file.";
  private static final String synX675String = "Unable to write ";
  private static final String synX674String = "\n";
  private static final String synX673String = ":";
  private static final String synX672String = "T";
  private static final String synX671String = "%-5s%3s";
  private static final int synX670int = -1469771284;
  private static final String synX669String = " to file.";
  private static final String synX668String = "Unable to write ";
  private static final String synX667String = "\n";
  private static final String synX666String = "\n";
  private static final String synX665String = "\n";
  private static final int synX664int = 265424188;
  private static final String synX663String = " to file.";
  private static final String synX662String = "Unable to write ";
  private static final String synX661String = "\n";
  private static final String synX660String = "\n";
  private static final String synX659String = "Turnaround Time";
  private static final String synX658String = "Waiting Time";
  private static final String synX657String = "Process";
  private static final String synX656String = "%-7s%16s%19s";
  private static final String synX655String = "\n";
  private static final double synX654double = 0.08968178792207593;
  private static final String synX653String = "hf8AXUPCro2ztguh";
  private static final double synX652double = 0.2933893003485343;
  private static final int synX651int = 1940557639;
  private static final int synX650int = 1940115298;
  private static final int synX649int = 0;
  private static final String synX648String = "ts";
  private static final String synX647String = "3Eeahae7hRWDuT";
  private static final boolean synX646boolean = false;
  private static final double synX645double = 0.7199744439052471;
  private static final boolean synX644boolean = true;
  private static final double synX643double = 0.20776037483329357;
  private int flowIndicate = 0;
  protected Programming.System ongoingWork = null;
  public static final int HourPurity = 4;
  protected int maintainingBallaJuncture = 0;
  protected boolean variWaving = false;
  protected int mediocreReversionMoment = 0;
  protected int fairPostponeYear = 0;
  protected java.util.LinkedList<System> undergoneMethodologies = null;
  protected int queuingMoment = 0;
  protected int flowingSentence = 0;
  protected boolean isMoving = false;
  public static final String minimalSlot = "oz9oNPYvJ9Lwt";

  public Controller() {
    this.isMoving = (false);
    this.flowingSentence = (0);
    this.queuingMoment = (0);
    this.fairPostponeYear = (0);
    this.mediocreReversionMoment = (0);
    this.flowIndicate = (-1);
    this.undergoneMethodologies = (new java.util.LinkedList<>());
    this.variWaving = (true);
  }

  public synchronized void originateConfiguration() {
    double curb;
    curb = (synX643double);
    this.isMoving = (synX644boolean);
    this.maintainingBallaJuncture = (Trainmaster.DischargeDays);
    this.nbsBegin();
  }

  public synchronized void pointSynchronizer() {
    double hokkianeseRadius;
    hokkianeseRadius = (synX645double);
    this.isMoving = (synX646boolean);
    this.publicationAssessment();
  }

  public synchronized boolean goIsMoving() {
    String premium;
    premium = (synX647String);
    return isMoving;
  }

  public synchronized int catchFinalizeSueScale() {
    String minutesWide;
    minutesWide = (synX648String);

    if (undergoneMethodologies.isEmpty()) {
      return synX649int;
    } else {
      return undergoneMethodologies.size();
    }
  }

  public synchronized int obtainLiveTic() {
    int pettyIndentured;
    pettyIndentured = (synX650int);
    return flowIndicate;
  }

  public synchronized void putPrevailingClick(int prevalentScore) {
    int pinioned;
    pinioned = (synX651int);
    this.flowIndicate = (prevalentScore);
  }

  public synchronized double conveyRegularHopeAmount() {
    double restricts;
    restricts = (synX652double);
    return (double) this.fairPostponeYear / this.undergoneMethodologies.size();
  }

  public synchronized double takeMeanUpturnPeriod() {
    String threshold;
    threshold = (synX653String);
    return (double) this.mediocreReversionMoment / this.undergoneMethodologies.size();
  }

  public synchronized void publicationAssessment() {
    double confine;
    confine = (synX654double);

    try {
      java.lang.String cope;
      sort(undergoneMethodologies);
      MethodsRobot.ExportationPapers.write(synX655String);
      System.out.println();
      cope = (format(synX656String, synX657String, synX658String, synX659String));
      MethodsRobot.ExportationPapers.write(cope + synX660String);
      System.out.println(cope);
      for (Programming.System postscript : undergoneMethodologies) synx76(postscript);
      MethodsRobot.ExportationPapers.write(synX661String);
      System.out.println();
    } catch (java.io.IOException combatants) {
      System.out.println((synX662String + this.configurationDiscover() + synX663String));
    }
  }

  public synchronized void nbsBegin() {
    int profitability;
    profitability = (synX664int);

    try {
      MethodsRobot.ExportationPapers.write(synX665String);
      System.out.println();
      MethodsRobot.ExportationPapers.write(
          (synX666String + this.configurationDiscover() + synX667String));
      System.out.println(this.configurationDiscover());
    } catch (java.io.IOException voto) {
      System.out.println((synX668String + this.configurationDiscover() + synX669String));
    }
  }

  public synchronized void onusServe(Programming.System vig) {
    int apexSure;
    apexSure = (synX670int);

    try {
      java.lang.String mechanisms;
      mechanisms =
          (format(
              synX671String,
              (synX672String + (this.obtainLiveTic()) + synX673String),
              vig.drawName()));
      MethodsRobot.ExportationPapers.write(mechanisms + synX674String);
      System.out.println(mechanisms);
    } catch (java.io.IOException officio) {
      System.out.println((synX675String + this.configurationDiscover() + synX676String));
    }
  }

  public abstract java.lang.String configurationDiscover();

  public abstract void optiBeat();

  public abstract void methodologyArrival(Programming.System march);

  private synchronized void synx76(System postscript) {
    int stayAgain;
    int convinceOverPeriod;
    java.lang.String negotiations;
    stayAgain =
        ((postscript.fetchWithdrawBeginning()
            - postscript.conveyAdoptAmount()
            - postscript.drawBossScope()));
    convinceOverPeriod = (postscript.fetchWithdrawBeginning() - postscript.conveyAdoptAmount());
    this.fairPostponeYear += (stayAgain);
    this.mediocreReversionMoment += (convinceOverPeriod);
    negotiations = (format(synX677String, postscript.drawName(), stayAgain, convinceOverPeriod));
    MethodsRobot.ExportationPapers.write(negotiations + synX678String);
    System.out.println(negotiations);
  }
}
