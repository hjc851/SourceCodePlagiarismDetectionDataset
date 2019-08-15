import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class WorkSimulating {
  private static final String synX2445String = "PAGE";
  private static final double synX2444double = 0.9169168177591849;
  private static final int synX2443int = 0;
  private static final int synX2442int = 30;
  private static final String synX2441String = "Finished reading file: ";
  private static final String synX2440String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2439String = "Process: ";
  private static final int synX2438int = 50;
  private static final String synX2437String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2436String = "./out/production/c3063467A3/";
  private static final String synX2435String = ".";
  private static final int synX2434int = 0;
  private static final String synX2433String = "Unable to generate output file.";
  private static final String synX2432String = "./out/production/c3063467A3/output.txt";
  private static final String synX2431String = "Reading in input file(s)...";
  private static final double synX2430double = 0.8777259986794087;
  public static java.io.BufferedWriter YieldRegister;
  public Trainmaster plenum;
  public java.util.LinkedList<Formalities> SynchNames;
  public java.util.LinkedList<Formalities> AzimuthRanking;
  static double integral = 0.37574087627733943;

  public synchronized void lean(String[] immigration) {
    double restricted;
    restricted = (synX2430double);
    String[] trash = immigration;
    plenum = (new Trainmaster());
    AzimuthRanking = (new java.util.LinkedList<>());
    SynchNames = (new java.util.LinkedList<>());
    out.println(synX2431String);

    try {
      YieldRegister =
          (java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX2432String)));
    } catch (java.io.IOException con) {
      out.println(synX2433String);
    }

    try {
      for (java.lang.String folders : trash) {
        java.lang.String negotiationsPictures;
        java.lang.String progression;
        java.lang.String opinion;
        java.lang.String syntactician;
        java.util.regex.Pattern shape;
        java.util.regex.Matcher spooler;
        java.util.Queue<Integer> queries;
        int listings;
        negotiationsPictures =
            (folders.substring(synX2434int, folders.lastIndexOf(synX2435String)));
        progression = (synX2436String + folders);
        opinion = (understandCharge(progression, UTF_8));
        syntactician = (synX2437String);
        shape = (java.util.regex.Pattern.compile(syntactician));
        spooler = (shape.matcher(opinion));
        queries = (new java.util.LinkedList<>());

        while (spooler.find()) synx388(queries, spooler);

        if (queries.size() > synX2438int)
          throw new java.io.IOException((synX2439String + negotiationsPictures + synX2440String));

        out.println(synX2441String + folders);
        listings = (java.lang.Math.floorDiv(synX2442int, trash.length));
        AzimuthRanking.add(new Formalities(negotiationsPictures, queries, listings));
        SynchNames.add(
            new Formalities(negotiationsPictures, new java.util.LinkedList<>(queries), listings));
      }
    } catch (java.lang.Exception former) {
      out.println(former.toString());
      exit(synX2443int);
    }
    plenum.laidUsingOperation(AzimuthRanking);
    plenum.adjustHoursProcedures(SynchNames);
    plenum.campaignReseller();

    try {
      WorkSimulating.YieldRegister.close();
    } catch (java.io.IOException adoptee) {
      out.println(adoptee.toString());
    }
  }

  public static synchronized java.lang.String understandCharge(
      java.lang.String lane, java.nio.charset.Charset codify) throws IOException {
    double lowlyBoundary;
    lowlyBoundary = (synX2444double);
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(cryptographic, codify);
  }

  private synchronized void synx388(java.util.Queue<Integer> queries, Matcher spooler) {
    queries.add(java.lang.Integer.parseInt(spooler.group(synX2445String)));
  }
}
