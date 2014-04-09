package mattsmc.extratorches.utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
    public static String checkUpdate(String URL, String MCVERSION,
            String MODID, String Version) {
        try {
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.parse(URL);

            doc.getDocumentElement().normalize();

            NodeList items = doc.getElementsByTagName("VersionCheck");
            for (int i = 0; i < items.getLength(); i++) {
                Node n = items.item(i);
                if (n.getNodeType() != Node.ELEMENT_NODE) continue;
                Element e = (Element) n;

                NodeList titleList = e.getElementsByTagName(MCVERSION);
                Element titleElem = (Element) titleList.item(0);

                Node titleNode = titleElem.getChildNodes().item(0);
                if (titleElem.getAttribute("modid").equals(MODID)) {
                    if (titleNode.getNodeValue().equals(Version)) {
                        System.out.println("Correct Version");
                        return "NoUpdate";
                    }
                    else {
                        System.out
                                .println("[Extra Torches] Update Avalable! Current Version:"
                                        + Version
                                        + " New Version:"
                                        + titleNode.getNodeValue());
                        return titleNode.getNodeValue();
                    }
                }
                else {
                    i++;
                }
            }
        }
        catch (Exception e) {
            return "error";
        }
        return null;
    }

    public static boolean isNewUpdate(String URL, String MCVERSION,
            String MODID, String Version) {
        String update = checkUpdate(URL, MCVERSION, MODID, Version);
        if (update != "error") {
            if (update != "NoUpdate") return true;
            else
                return false;
        }
        else
            System.out
                    .println("[ExtraTorches] An Error Has Occured While Checking For Updates!");
        return false;
    }

    public static String returnVersion(String URL, String MCVERSION,
            String MODID, String Version) {
        String update = checkUpdate(URL, MCVERSION, MODID, Version);
        if (update != "error") {
            if (update != "NoUpdate") {
                return update;
            }
        }
        else {
            System.out
                    .println("[ExtraTorches] An Error Has Occured While Checking For Updates!");
        }
        return null;
    }
}
