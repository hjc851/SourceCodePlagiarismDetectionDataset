package Manikin;

import Distributors.Device;
import Interface.Act;
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

public class LitigateMimic {
  private static String StimulationLodge;

  public synchronized void go(String tenants) {
    this.StimulationLodge = (tenants);
    yardmaster = (new Device());
    summonsRoster = (new LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      String unclothedList;
      unclothedList = (StimulationLodge.substring(0, StimulationLodge.lastIndexOf(".")));
      ProductivityDocuments =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + unclothedList + "_output.txt"))));
    } catch (IOException vet) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = ("./out/production/c3063467A1/" + StimulationLodge);

    try {
      String response;
      String ind;
      Pattern p;
      Matcher manuscript;
      String exp2;
      Pattern a1;
      Matcher brane;
      response = (interpretLodge(StimulationLodge, StandardCharsets.UTF_8));
      ind = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      p = (Pattern.compile(ind));
      manuscript = (p.matcher(response));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      a1 = (Pattern.compile(exp2));
      brane = (a1.matcher(response));

      while (manuscript.find()) {
        yardmaster.determineDetachmentBeginning(Integer.parseInt(manuscript.group("DISP")));
      }

      while (brane.find()) {
        summonsRoster.add(
            new Act(
                brane.group("ID"),
                Integer.parseInt(brane.group("Arrive")),
                Integer.parseInt(brane.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    yardmaster.arrangeMethods(summonsRoster);
    yardmaster.moveSender();
  }

  private LinkedList<Act> summonsRoster;
  private Device yardmaster;

  private static synchronized String interpretLodge(String trails, Charset code)
      throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(trails));
    return new String(consolidated, code);
  }

  public static BufferedWriter ProductivityDocuments;
}
