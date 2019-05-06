import ij.plugin.PlugIn;

/**
 * Class to launch the plugin in imageJ or as standalone. 
 * The plugin is used to quantify fluorescence around centrosomes in cells from microscope images. 
 * @author Laurent Brodier
 */
public class Start_FluoQuantif implements PlugIn {
    /**
     * Start the plugin in imageJ
     * @param arg 
     */        
    @Override
    public void run(String arg) {        
        //<editor-fold defaultstate="collapsed" desc=" System look and feel setting code (active) ">   
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        }               
    //</editor-fold> //set system look and feel
        FluoQuantifFrame FQF = new FluoQuantifFrame();
        FQF.setVisible(true);            
    }

    /**
     * DEBUG ONLY - Start the plugin as standalone, with basic imageJ sources. 
     * @param args 
     */
    public static void main(String args[]){
        //<editor-fold defaultstate="collapsed" desc=" System look and feel setting code (active) ">   
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        }               
    //</editor-fold> //set system look and feel
        ij.ImageJ myIJ = new ij.ImageJ();
        myIJ.run();        
        myIJ.setVisible(true); 
        FluoQuantifFrame FQF = new FluoQuantifFrame();
        FQF.setVisible(true);             
    }
}
