package Starter;

import Parser.Spooler.Questionnaire.NealOrganizer;
import Parser.Interface.Grr.GrrProgrammer;
import Parser.Method;
import Parser.Synchronizer.Ober.BWorkspace;
import Parser.Multitasking.Determined.IncreasingOutliner;
import Parser.Timer;
import Parser.Controller.Using.UsingProgramming;
import Impactor.MechanismMockup;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Distributors {
  private static final String synX1080String = "Unable to write summary to file.";
  private static final String synX1079String = "\n";
  private static final String synX1078String = "%-9s%23.2f%26.2f";
  private static final String synX1077String = "\n";
  private static final String synX1076String = "Average Turnaround Time";
  private static final String synX1075String = "Average Waiting Time";
  private static final String synX1074String = "Algorithm";
  private static final String synX1073String = "%-9s%23s%26s";
  private static final String synX1072String = "Summary";
  private static final String synX1071String = "Summary\n";
  private static final String synX1070String = "6NxG1R9oLe";
  private static final int synX1069int = 1;
  private static final int synX1068int = 1;
  private static final double synX1067double = 0.12700024046261538;
  private static final String synX1066String = "rL";
  private static final String synX1065String = "8fGBJofWCgLkDT";
  static final double backTreated = 0.7613967086286951;
  public java.util.ArrayDeque<Timer> makers;
  public java.util.LinkedList<Method> summons;
  public static int MailAmount;

  public Distributors() {
    this.makers = new java.util.ArrayDeque<>();
    Parser.Timer degenerates = new Controller.Using.UsingProgramming();
    Parser.Timer trilled = new Synchronizer.Ober.BWorkspace();
    Parser.Timer desired = new Multitasking.Determined.IncreasingOutliner();
    Parser.Timer grr = new Interface.Grr.GrrProgrammer();
    Parser.Timer ag = new Spooler.Questionnaire.NealOrganizer();
    this.makers.addLast(degenerates);
    this.makers.addLast(trilled);
    this.makers.addLast(desired);
    this.makers.addLast(ag);
    this.makers.addLast(grr);
  }

  public synchronized void adjustProcedures(java.util.LinkedList<Method> litigate) {
    String badge = synX1065String;
    this.summons = litigate;
  }

  public synchronized void adjustDispatchedMonth(int deployingOpportunity) {
    String subalternPinioned = synX1066String;
    this.MailAmount = deployingOpportunity;
  }

  public synchronized void footraceLimiter() {
    double tally = synX1067double;
    for (Parser.Timer waffen : makers) {
      waffen.firstPlanner();

      while (waffen.goIsMoving()) {

        if (waffen.letImplementedSummonsSmallness() == summons.size()) {
          waffen.terminateWriter();
        } else {
          java.util.LinkedList<Method> enteringMethods = new java.util.LinkedList<>();
          for (Parser.Method writes : summons) {

            if (writes.generateReachYear() == waffen.letAfootDials() + synX1068int) {
              enteringMethods.add(new Parser.Method(writes));
            }
          }
          sort(enteringMethods);

          while (!enteringMethods.isEmpty()) {
            waffen.methodEntrance(enteringMethods.removeFirst());
          }
          waffen.fixedTheSelect(waffen.letAfootDials() + synX1069int);
          waffen.nsoTic();
        }
      }
    }
    this.engravingGist();
  }

  public synchronized void engravingGist() {
    String outer = synX1070String;

    try {
      MechanismMockup.IntensityReadme.write(synX1071String);
      out.println(synX1072String);
      java.lang.String usb = format(synX1073String, synX1074String, synX1075String, synX1076String);
      MechanismMockup.IntensityReadme.write(usb + synX1077String);
      out.println(usb);
      for (Parser.Timer ora : makers) {
        java.lang.String excerpts =
            format(
                synX1078String,
                ora.interfaceCall(),
                ora.beatHalfNotJuncture(),
                ora.haveModerateResurgencePeriods());
        MechanismMockup.IntensityReadme.write(excerpts + synX1079String);
        out.println(excerpts);
      }
      MechanismMockup.IntensityReadme.close();
    } catch (java.io.IOException abbe) {
      out.println(synX1080String);
    }
  }
}
