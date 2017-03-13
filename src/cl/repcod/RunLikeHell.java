/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.repcod;

import java.io.IOException;

/**
 *
 * @author Uthanien
 */
public class RunLikeHell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Prueba metodo getFileExtension
         System.out.println("--- Prueba metodo getFileExtension ---");
        String ruta = "D:\\foto.jpg";
        System.out.println("Extension: " +FileUtil.getFileExtension(ruta));
        
        //Prueba metodo renameFileExtension
        System.out.println("--- Prueba metodo renameFileExtension ---");
        String nuevaExtension = "hola";
        System.out.println("Resultado: " + FileUtil.renameFileExtension(ruta, nuevaExtension));
        
    }
    
}
