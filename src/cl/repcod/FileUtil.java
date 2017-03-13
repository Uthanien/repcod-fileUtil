/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.repcod;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Uthanien
 * @link http://www.rgagnon.com/javadetails/java-0541.html
 */
public class FileUtil {
    
    /**
     * Metodo que obtiene la extension de un arcivo
     *
     * @param f (ruta de archivo a revisar)
     * @return
     */
    public static String getFileExtension(String f) {
        String ext = "";
        int i = f.lastIndexOf('.');
        if (i > 0 && i < f.length() - 1) {
            ext = f.substring(i + 1);
        }
        return ext;
    }
    
    /**
     * Metodo que sirve para renombrar la extension de un archivo
     * @param source
     * @param newExtension
     * @return 
     */
    public static boolean renameFileExtension(String source, String newExtension) {
        String target;
        String currentExtension = getFileExtension(source);

        if (currentExtension.equals("")) {
            target = source + "." + newExtension;
        } else {
            target = source.replaceFirst(Pattern.quote("."+ currentExtension) + "$", Matcher.quoteReplacement("." + newExtension));

        }    
        return new File(source).renameTo(new File(target));
    }
    
}
