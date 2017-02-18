/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.repcod;

/**
 *
 * @author Uthanien
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
    
}
