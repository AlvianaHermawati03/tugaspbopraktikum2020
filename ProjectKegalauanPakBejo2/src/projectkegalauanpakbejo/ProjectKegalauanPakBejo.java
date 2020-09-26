/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkegalauanpakbejo;

/**
 *
 * @author Masterpiece
 */
public class ProjectKegalauanPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi */
        
        Keramik k1 = new Keramik ();
        k1.hargaKeramik();
        
        Keramik k2 = new Keramik(40);
        k2.hargaKeramik();
        
        Keramik k3 = new Keramik(30, 40);
        k3.hargaKeramik();
    }
    
}
