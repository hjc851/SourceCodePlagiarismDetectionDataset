package Sim;

import Consignor.Resellers;
import Synchronization.Proceeding;
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
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ProceedingsKinematics {
  private java.util.LinkedList<Proceeding> proceduresCompendium = null;
  private static java.lang.String GuidanceFilename = null;
  public static java.io.BufferedWriter ProducePaperwork = null;

  public synchronized void streak(java.lang.String establishment) {
    this.GuidanceFilename = (establishment);
    regulator = (new Consignor.Resellers());
    proceduresCompendium = (new java.util.LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      java.lang.String forfeitedDescribe =
          GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf("."));
      ProducePaperwork =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + forfeitedDescribe + "_output.txt"))));
    } catch (java.io.IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    GuidanceFilename = ("./out/production/c3063467A1/" + GuidanceFilename);

    try {
      java.lang.String support = quoteData(GuidanceFilename, StandardCharsets.UTF_8);
      java.lang.String indiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = compile(indiv);
      java.util.regex.Matcher manuscript = vig.matcher(support);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern aj = compile(exp2);
      java.util.regex.Matcher b2 = aj.matcher(support);

      while (manuscript.find()) {
        regulator.arrangedCompleteSentence(parseInt(manuscript.group("DISP")));
      }

      while (b2.find()) {
        proceduresCompendium.add(
            new Synchronization.Proceeding(
                b2.group("ID"), parseInt(b2.group("Arrive")), parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
    }
    regulator.layLitigate(proceduresCompendium);
    regulator.tallyConsignor();
  }

  private static synchronized java.lang.String quoteData(
      java.lang.String pattern, java.nio.charset.Charset scrambling) throws IOException {
    byte[] cryptographic = readAllBytes(get(pattern));
    return new java.lang.String(cryptographic, scrambling);
  }

  private Consignor.Resellers regulator = null;
}
