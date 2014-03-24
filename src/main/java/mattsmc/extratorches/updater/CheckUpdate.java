package mattsmc.extratorches.updater;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.utils.TFile;

public class CheckUpdate {
    private static String currentVersion = null;
    private static String newVersion = null;

    public static int update = 0;

    public static String checkUpdate(){
                currentVersion = TFile.readFile("./VERSION.txt");
                try{
                    URL url = new URL("https://raw.githubusercontent.com/MattsMc/ExtraTorches/master/VERSION.txt");
                    ReadableByteChannel rbc = Channels.newChannel(url.openStream());
                    FileOutputStream fos = new FileOutputStream("./newVERSION.txt");
                    fos.getChannel().transferFrom(rbc, 0, 1 << 24);
                    fos.close();
                    if(!currentVersion.equals(newVersion)){
                        newVersion = TFile.readFile("./newVERSION.txt");
                        return newVersion; }
                }catch (IOException e) {
                    e.printStackTrace();
                    return "error";
                }finally{
                    File file = new File("./newVERSION.txt");
                    file.delete();
                }
                return null;
            }
}
