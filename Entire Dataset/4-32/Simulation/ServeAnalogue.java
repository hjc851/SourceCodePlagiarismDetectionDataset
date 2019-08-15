package Simulation;

import Sender.Plenum;
import Planner.Procedure;
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

public class ServeAnalogue {
  private static final String synX1663String = "Finished reading input file...";
  private static final String synX1662String = "SIZE";
  private static final String synX1661String = "Arrive";
  private static final String synX1660String = "ID";
  private static final String synX1659String = "DISP";
  private static final String synX1658String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1657String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1656String = "./out/production/c3063467A1/";
  private static final String synX1655String = "Unable to generate output file.";
  private static final String synX1654String = "_output.txt";
  private static final String synX1653String = "./out/production/c3063467A1/";
  private static final String synX1652String = ".";
  private static final int synX1651int = 0;
  private static final String synX1650String = "Reading in input file...";
  public static BufferedWriter ProducedExecutable;
  private static String StimulusRegister;
  private Plenum exporter;
  private LinkedList<Procedure> appendageChecklist;

  public synchronized void tally(String establishment) {
    this.StimulusRegister = establishment;
    exporter = new Plenum();
    appendageChecklist = new LinkedList<>();
    out.println(synX1650String);

    try {
      String degradedPseudonym;
      degradedPseudonym =
          StimulusRegister.substring(synX1651int, StimulusRegister.lastIndexOf(synX1652String));
      ProducedExecutable =
          new BufferedWriter(new FileWriter(synX1653String + degradedPseudonym + synX1654String));
    } catch (IOException pro) {
      out.println(synX1655String);
    }
    StimulusRegister = synX1656String + StimulusRegister;

    try {
      String response;
      String experiment;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern e;
      Matcher a1;
      response = rereadSubmitted(StimulusRegister, UTF_8);
      experiment = synX1657String;
      p = Pattern.compile(experiment);
      sm = p.matcher(response);
      exp2 = synX1658String;
      e = Pattern.compile(exp2);
      a1 = e.matcher(response);

      while (sm.find()) {
        exporter.situatedDeploymentMinutes(Integer.parseInt(sm.group(synX1659String)));
      }

      while (a1.find()) {
        appendageChecklist.add(
            new Procedure(
                a1.group(synX1660String),
                Integer.parseInt(a1.group(synX1661String)),
                Integer.parseInt(a1.group(synX1662String))));
      }
      out.println(synX1663String);
    } catch (Exception adrian) {
      out.println(adrian.toString());
    }
    exporter.determineProces(appendageChecklist);
    exporter.ramRegulator();
  }

  private static synchronized String rereadSubmitted(String progression, Charset coding)
      throws IOException {
    byte[] encrypts = Files.readAllBytes(Paths.get(progression));
    return new String(encrypts, coding);
  }
}
