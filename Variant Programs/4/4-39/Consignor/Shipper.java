package Consignor;

import Debugging.Synchronization.Comment.ApDeveloper;
import Debugging.Spreadsheet.Grr.GrrProgrammer;
import Debugging.Act;
import Debugging.Multitasking.Erie.CabooseOrganizer;
import Debugging.Planner.Days.IncreasingOutliner;
import Debugging.Callback;
import Debugging.Interface.Lamps.PapsOrganizer;
import Faker.WorkSimulating;
import java.io.IOException;
import java.util.*;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Shipper {
  private static final String synX1770String = "Unable to write summary to file.";
  private static final String synX1769String = "\n";
  private static final String synX1768String = "%-9s%23.2f%26.2f";
  private static final String synX1767String = "\n";
  private static final String synX1766String = "Average Turnaround Time";
  private static final String synX1765String = "Average Waiting Time";
  private static final String synX1764String = "Algorithm";
  private static final String synX1763String = "%-9s%23s%26s";
  private static final String synX1762String = "Summary";
  private static final String synX1761String = "Summary\n";
  private static final int synX1760int = 1;
  private static final int synX1759int = 1;

  public Shipper() {
    Callback spt;
    Callback omsk;
    Callback high;
    Callback grr;
    Callback ap;
    this.multiple = (new ArrayDeque<>());
    spt = (new PapsOrganizer());
    omsk = (new CabooseOrganizer());
    high = (new IncreasingOutliner());
    grr = (new GrrProgrammer());
    ap = (new ApDeveloper());
    this.multiple.addLast(spt);
    this.multiple.addLast(omsk);
    this.multiple.addLast(high);
    this.multiple.addLast(ap);
    this.multiple.addLast(grr);
  }

  public synchronized void doForwardingAgain(int shipmentClip) {
    this.DispatchedMonth = (shipmentClip);
  }

  public synchronized void leadCoordinator() {
    for (Callback ora : multiple) {
      ora.departParser();

      while (ora.goIsMoving()) {

        if (ora.haveConductedServeLarge() == work.size()) {
          ora.kiboshSynchronization();
        } else {
          LinkedList<Act> leavingProces;
          leavingProces = (new LinkedList<>());
          for (Act postscript : work) {

            if (postscript.takeDeliverPeriod() == ora.makeIncumbentTock() + synX1759int) {
              leavingProces.add(new Act(postscript));
            }
          }
          sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            ora.proceedingsMortar(leavingProces.removeFirst());
          }
          ora.solidifyingTypicalGenetic(ora.makeIncumbentTock() + synX1760int);
          ora.bpsRetick();
        }
      }
    }
    this.publishingDrumhead();
  }

  public ArrayDeque<Callback> multiple = null;
  public LinkedList<Act> work = null;
  public static int DispatchedMonth = 0;

  public synchronized void settledServe(LinkedList<Act> methodology) {
    this.work = (methodology);
  }

  public synchronized void publishingDrumhead() {

    try {
      String usb;
      WorkSimulating.VolumeArchiving.write(synX1761String);
      System.out.println(synX1762String);
      usb = (format(synX1763String, synX1764String, synX1765String, synX1766String));
      WorkSimulating.VolumeArchiving.write(usb + synX1767String);
      System.out.println(usb);
      for (Callback waffen : multiple) {
        String succinct;
        succinct =
            (format(
                synX1768String,
                waffen.organizerList(),
                waffen.findNormLookSentence(),
                waffen.bringMiddlingTurnaboutMeter()));
        WorkSimulating.VolumeArchiving.write(succinct + synX1769String);
        System.out.println(succinct);
      }
      WorkSimulating.VolumeArchiving.close();
    } catch (IOException combatants) {
      System.out.println(synX1770String);
    }
  }
}
