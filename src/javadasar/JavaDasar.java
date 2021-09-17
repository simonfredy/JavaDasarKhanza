/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadasar;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author GAME
 */
public class JavaDasar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();     // Object Untuk Deteksi Besar Layar
        formUtama utama = new formUtama();                                  // Inisiasi Object
        utama.setSize(screen.width, screen.height);                         // Atur Ukuran(Resolusi) Form
        utama.setVisible(true);
        // new formUtama().setVisible(true);                                // Memunculkan Form
    }
    
}
