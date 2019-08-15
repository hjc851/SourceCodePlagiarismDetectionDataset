package Simulations;

import Plenum.Distributors;
import Compiler.Method;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.regex.Pattern.compile;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.Integer.parseInt;

public class ProcedureSimulation {
  public static java.io.BufferedWriter SupplyDocumentation;
  public static java.lang.String ParticipationSubmitted;
  public Plenum.Distributors regulator;
  public java.util.LinkedList<Method> methodsSelection;

  public synchronized void extend(java.lang.String elected) {
    this.ParticipationSubmitted = (elected);
    regulator = (new Plenum.Distributors());
    methodsSelection = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String bareEpithet;
      bareEpithet = (ParticipationSubmitted.substring(0, ParticipationSubmitted.lastIndexOf(".")));
      SupplyDocumentation =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + bareEpithet + "_output.txt"))));
    } catch (java.io.IOException exwife) {
      out.println("Unable to generate output file.");
    }
    ParticipationSubmitted = ("./out/production/c3063467A1/" + ParticipationSubmitted);

    try {
      java.lang.String consultation;
      java.lang.String equiv;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern a2;
      java.util.regex.Matcher d;
      consultation = (readableArchiving(ParticipationSubmitted, UTF_8));
      equiv = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      cern = (compile(equiv));
      sm = (cern.matcher(consultation));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      a2 = (compile(exp2));
      d = (a2.matcher(consultation));

      while (sm.find()) synx238(sm);

      while (d.find()) synx239(d);
      out.println("Finished reading input file...");
    } catch (java.lang.Exception adult) {
      out.println(adult.toString());
    }
    regulator.readyMarch(methodsSelection);
    regulator.footraceLimiter();
  }

  public static synchronized java.lang.String readableArchiving(
      java.lang.String ride, java.nio.charset.Charset coder) throws IOException {
    byte[] transmit = readAllBytes(get(ride));
    return new java.lang.String(transmit, coder);
  }

  private synchronized void synx238(Matcher sm) {
    regulator.determinedDischargeDays(parseInt(sm.group("DISP")));
  }

  private synchronized void synx239(Matcher d) {
    methodsSelection.add(
        new Compiler.Method(d.group("ID"), parseInt(d.group("Arrive")), parseInt(d.group("SIZE"))));
  }
}
