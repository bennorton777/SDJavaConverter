package conversion;

import edu.harvard.hul.ois.mets.Mets;
import edu.harvard.hul.ois.mets.helper.MetsException;
import edu.harvard.hul.ois.mets.helper.MetsReader;
import edu.harvard.hul.ois.mets.helper.MetsValidator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ben on 3/26/14.
 */
public class AIPReader {
    public static void main (String[] args) throws IOException, MetsException {
        FileInputStream in = new FileInputStream("mets.xml");
        Mets mets = Mets.reader (new MetsReader(in));
        in.close ();

        mets.validate (new MetsValidator());
        Mets dmdSec = (Mets) mets.getContent().get(1);
        Mets mods = (Mets) dmdSec.getContent().get(0);
        Mets modsXML = (Mets) dmdSec.getContent().get(0);
        Mets modsNode = (Mets) modsXML.getContent().get(0);
        Mets modsActual = (Mets) modsXML.getContent().get(0);
System.err.println("GOT THEM");


    }

}
