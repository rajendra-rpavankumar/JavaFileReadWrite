import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Lenovo on 06/05/2017.
 */
public class FileReadandWrite {
    public String fileReadWrite(String filePath) throws  IOException{
        String result=null;
        //try {

            Scanner scanner = new Scanner(getFile(filePath));
            while (scanner.hasNextLine()){
                String fileText=scanner.nextLine();
                result=removeSapce(fileText);
            }

       // } catch (IOException ex) {

        //}
        return result;
    }

    private File getFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(fileName).getFile());
    }

    private String removeSapce(String fileText) {
        StringBuilder stringBuilder=new StringBuilder();
        StringTokenizer stringTokenizer=new StringTokenizer(fileText," ");
        while (stringTokenizer.hasMoreElements()){
            stringBuilder.append(stringTokenizer.nextElement()).append(" ");
        }
        return stringBuilder.toString().trim();
    }


}
