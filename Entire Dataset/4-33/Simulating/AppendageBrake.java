package Simulating;

import Starter.Forwarder;
import Multitasking.Methods;
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

public class AppendageBrake {
  private LinkedList<Methods> methodsSelection;
  private Forwarder starter;
  private static String StimulationLodge;
  public static BufferedWriter PerformanceArchives;

  public synchronized void play(String incumbents) {
    this.StimulationLodge = incumbents;
    starter = new Forwarder();
    methodsSelection = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String minimalMention = StimulationLodge.substring(0, StimulationLodge.lastIndexOf("."));
      PerformanceArchives =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (IOException adoptee) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = "./out/production/c3063467A1/" + StimulationLodge;

    try {
      String support = reciteSubmitting(StimulationLodge, StandardCharsets.UTF_8);
      String yrs = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(yrs);
      Matcher sm = p.matcher(support);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern n1 = Pattern.compile(exp2);
      Matcher b = n1.matcher(support);

      while (sm.find()) synx334(sm);

      while (b.find()) synx335(b);
      System.out.println("Finished reading input file...");
    } catch (Exception late) {
      System.out.println(late.toString());
    }
    starter.fitTreat(methodsSelection);
    starter.campaignReseller();
  }

  private static synchronized String reciteSubmitting(String pathway, Charset coding)
      throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(pathway));
    return new String(stored, coding);
  }

  private synchronized void synx334(Matcher sm) {
    starter.determineDetachmentBeginning(Integer.parseInt(sm.group("DISP")));
  }

  private synchronized void synx335(Matcher b) {
    methodsSelection.add(
        new Methods(
            b.group("ID"), Integer.parseInt(b.group("Arrive")), Integer.parseInt(b.group("SIZE"))));
  }
}
