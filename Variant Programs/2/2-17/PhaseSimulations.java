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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.nio.file.Files.newBufferedWriter;
import static java.util.regex.Pattern.compile;
import static java.lang.Math.floorDiv;
import static java.lang.Integer.parseInt;

public class PhaseSimulations {
  public LinkedList<System> TimerInclination = null;
  public static BufferedWriter VolumeArchiving = null;

  public static synchronized String takeDocument(String way, Charset codification)
      throws IOException {
    byte[] interlaced = readAllBytes(get(way));
    return new String(interlaced, codification);
  }

  public synchronized void race(String[] cbs) {
    String[] information = cbs;
    sender = (new Yardmaster());
    BestsellerDocket = (new LinkedList<>());
    TimerInclination = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      VolumeArchiving = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (IOException libris) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String data : information) {
        String formalitiesTag;
        String destiny;
        String opinions;
        String parse;
        Pattern characteristics;
        Matcher aspx;
        Queue<Integer> inquiries;
        int headlines;
        formalitiesTag = (data.substring(0, data.lastIndexOf(".")));
        destiny = ("./out/production/c3063467A3/" + data);
        opinions = (takeDocument(destiny, UTF_8));
        parse = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        characteristics = (compile(parse));
        aspx = (characteristics.matcher(opinions));
        inquiries = (new LinkedList<>());

        while (aspx.find()) synx141(inquiries, aspx);

        if (inquiries.size() > 50)
          throw new IOException(
              ("Process: "
                  + formalitiesTag
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + data);
        headlines = (floorDiv(30, information.length));
        BestsellerDocket.add(new System(formalitiesTag, inquiries, headlines));
        TimerInclination.add(new System(formalitiesTag, new LinkedList<>(inquiries), headlines));
      }
    } catch (Exception abel) {
      out.println(abel.toString());
      exit(0);
    }
    sender.situatedCapitalistMethodology(BestsellerDocket);
    sender.prepareDialMethodologies(TimerInclination);
    sender.prevailDistributor();

    try {
      PhaseSimulations.VolumeArchiving.close();
    } catch (IOException abe) {
      out.println(abe.toString());
    }
  }

  public Yardmaster sender = null;
  public LinkedList<System> BestsellerDocket = null;

  private synchronized void synx141(java.util.Queue<Integer> inquiries, Matcher aspx) {
    inquiries.add(parseInt(aspx.group("PAGE")));
  }
}
