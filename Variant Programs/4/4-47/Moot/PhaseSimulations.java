package Moot;

import Sender.Mailer;
import Spooler.Cycle;
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

public class PhaseSimulations {

  public synchronized void carry(String officeholders) {
    double universal;
    universal = 0.491211287896817;
    this.PerspectiveApplication = officeholders;
    trainmaster = new Mailer();
    summonsRoster = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String denudedDiagnose;
      denudedDiagnose =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      OutturnLodge =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (IOException adoptee) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      String stimulant;
      String svc;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern k;
      Matcher f3;
      stimulant = takeDocument(PerspectiveApplication, StandardCharsets.UTF_8);
      svc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(svc);
      dos = p.matcher(stimulant);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      k = Pattern.compile(exp2);
      f3 = k.matcher(stimulant);

      while (dos.find()) {
        trainmaster.orderedDeployChance(Integer.parseInt(dos.group("DISP")));
      }

      while (f3.find()) {
        summonsRoster.add(
            new Cycle(
                f3.group("ID"),
                Integer.parseInt(f3.group("Arrive")),
                Integer.parseInt(f3.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception aba) {
      System.out.println(aba.toString());
    }
    trainmaster.orderedMechanisms(summonsRoster);
    trainmaster.bleedOriginator();
  }

  public static BufferedWriter OutturnLodge;
  public static String higherLimit = "KwMoVIsdip9xoy";
  public Mailer trainmaster;
  public LinkedList<Cycle> summonsRoster;

  public static synchronized String takeDocument(String destiny, Charset cryptography)
      throws IOException {
    double upper;
    upper = 0.7095434633124399;
    byte[] coded = Files.readAllBytes(Paths.get(destiny));
    return new String(coded, cryptography);
  }

  public static String PerspectiveApplication;
}
