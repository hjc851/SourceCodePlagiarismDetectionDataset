package Emulator;

import Dealer.Exporter;
import Timer.Appendage;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class MechanismMockup {
  private static final String synX318String = "Finished reading input file...";
  private static final String synX317String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX316String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX315String = "./out/production/c3063467A1/";
  private static final String synX314String = "Unable to generate output file.";
  private static final String synX313String = "_output.txt";
  private static final String synX312String = "./out/production/c3063467A1/";
  private static final String synX311String = ".";
  private static final int synX310int = 0;
  private static final String synX309String = "Reading in input file...";

  private static synchronized java.lang.String wrotePapers(
      java.lang.String pattern, java.nio.charset.Charset codifying) throws IOException {
    byte[] coded = readAllBytes(get(pattern));
    return new java.lang.String(coded, codifying);
  }

  private java.util.LinkedList<Appendage> operationName;
  public static java.io.BufferedWriter ProducingFolders;
  private Dealer.Exporter reseller;

  public synchronized void extend(java.lang.String cbs) {
    this.RepresentationsInitiate = (cbs);
    reseller = (new Dealer.Exporter());
    operationName = (new java.util.LinkedList<>());
    out.println(synX309String);

    try {
      java.lang.String withdrawnMake;
      withdrawnMake =
          (RepresentationsInitiate.substring(
              synX310int, RepresentationsInitiate.lastIndexOf(synX311String)));
      ProducingFolders =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX312String + withdrawnMake + synX313String))));
    } catch (java.io.IOException vet) {
      out.println(synX314String);
    }
    RepresentationsInitiate = (synX315String + RepresentationsInitiate);

    try {
      java.lang.String consultation;
      java.lang.String interactive;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern b2;
      java.util.regex.Matcher ff;
      consultation = (wrotePapers(RepresentationsInitiate, UTF_8));
      interactive = (synX316String);
      writes = (compile(interactive));
      manuscript = (writes.matcher(consultation));
      exp2 = (synX317String);
      b2 = (compile(exp2));
      ff = (b2.matcher(consultation));

      while (manuscript.find()) synx70(manuscript);

      while (ff.find()) synx71(ff);
      out.println(synX318String);
    } catch (java.lang.Exception abbe) {
      out.println(abbe.toString());
    }
    reseller.situatedMethodology(operationName);
    reseller.carryDevice();
  }

  private static java.lang.String RepresentationsInitiate;

  private synchronized void synx70(Matcher manuscript) {
    reseller.arrangedCompleteSentence(parseInt(manuscript.group("DISP")));
  }

  private synchronized void synx71(Matcher ff) {
    operationName.add(
        new Timer.Appendage(
            ff.group("ID"), parseInt(ff.group("Arrive")), parseInt(ff.group("SIZE"))));
  }
}
