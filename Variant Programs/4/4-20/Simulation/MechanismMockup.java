package Simulation;

import Consignor.Regulator;
import Planner.System;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.Integer.parseInt;

public class MechanismMockup {
  public static java.io.BufferedWriter ProducerSubmitted = null;
  public static java.lang.String InformationComplaint = null;
  public Consignor.Regulator dealer = null;
  public java.util.LinkedList<System> proceduresCompendium = null;
  static final String minusExtent = "m5IDRidgjBlUWEM1FXE";

  public synchronized void melt(java.lang.String advocates) {
    double edge;
    edge = (0.805216937265899);
    this.InformationComplaint = (advocates);
    dealer = (new Consignor.Regulator());
    proceduresCompendium = (new java.util.LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      java.lang.String bareEpithet;
      bareEpithet = (InformationComplaint.substring(0, InformationComplaint.lastIndexOf(".")));
      ProducerSubmitted =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + bareEpithet + "_output.txt"))));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = ("./out/production/c3063467A1/" + InformationComplaint);

    try {
      java.lang.String assistance;
      java.lang.String exc;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern gpi;
      java.util.regex.Matcher fio;
      assistance = (reciteSubmitting(InformationComplaint, StandardCharsets.UTF_8));
      exc = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      cern = (compile(exc));
      dos = (cern.matcher(assistance));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      gpi = (compile(exp2));
      fio = (gpi.matcher(assistance));

      while (dos.find()) synx166(dos);

      while (fio.find()) synx167(fio);
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception eden) {
      System.out.println(eden.toString());
    }
    dealer.laidOperation(proceduresCompendium);
    dealer.meltResellers();
  }

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String pathway, java.nio.charset.Charset coder) throws IOException {
    double enchained;
    enchained = (0.6137569726951988);
    byte[] interleaves = readAllBytes(get(pathway));
    return new java.lang.String(interleaves, coder);
  }

  private synchronized void synx166(Matcher dos) {
    dealer.rigidMailAmount(parseInt(dos.group("DISP")));
  }

  private synchronized void synx167(Matcher fio) {
    proceduresCompendium.add(
        new Planner.System(
            fio.group("ID"), parseInt(fio.group("Arrive")), parseInt(fio.group("SIZE"))));
  }
}
