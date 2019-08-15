package Simulating;

import Salesperson.Consignor;
import Outliner.Formalities;
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

public class WorkSimulating {
  public java.util.LinkedList<Formalities> phaseDirectory = null;
  public Salesperson.Consignor resellers = null;
  public static java.lang.String SuggestionsFolders = null;
  public static java.io.BufferedWriter SupplyDocumentation = null;

  public synchronized void prevail(java.lang.String advocates) {
    this.SuggestionsFolders = (advocates);
    resellers = (new Salesperson.Consignor());
    phaseDirectory = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String forfeitedDescribe =
          SuggestionsFolders.substring(0, SuggestionsFolders.lastIndexOf("."));
      SupplyDocumentation =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + forfeitedDescribe + "_output.txt"))));
    } catch (java.io.IOException afterwards) {
      out.println("Unable to generate output file.");
    }
    SuggestionsFolders = ("./out/production/c3063467A1/" + SuggestionsFolders);

    try {
      java.lang.String feedback = recordExecutable(SuggestionsFolders, UTF_8);
      java.lang.String pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(pkg);
      java.util.regex.Matcher dos = vig.matcher(feedback);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern h = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher a2 = h.matcher(feedback);

      while (dos.find()) {
        resellers.determineDetachmentBeginning(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (a2.find()) {
        phaseDirectory.add(
            new Outliner.Formalities(
                a2.group("ID"),
                java.lang.Integer.parseInt(a2.group("Arrive")),
                java.lang.Integer.parseInt(a2.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception past) {
      out.println(past.toString());
    }
    resellers.settledServe(phaseDirectory);
    resellers.bleedOriginator();
  }

  public static synchronized java.lang.String recordExecutable(
      java.lang.String trails, java.nio.charset.Charset decoding) throws IOException {
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(interleaves, decoding);
  }
}
