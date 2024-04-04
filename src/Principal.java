
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       boolean x = true;
        while(x){
        String menu=JOptionPane.showInputDialog("****COMPETENCIA*******\n"
                                                + "1. Registrar Atleta.\n"
                                                + "2. Datos del Campeón.\n"
                                                + "3. Atletas por País.\n"
                                                + "4. Tiempo promedio de todos los Atletas.\n"
                                                + "5. Salir");
        int opcion=Integer.parseInt(menu);
        switch(opcion){
            case 1:
                String nombreAtleta=JOptionPane.showInputDialog("Ingresar Nombre :");
                
                break;
            case 2:
                String nombreCampeon=JOptionPane.showInputDialog("Ingresar Nombre :");
                String nacionalidad=JOptionPane.showInputDialog("Ingresar Nacionalidad :");
                String tiempo=JOptionPane.showInputDialog("Ingresar Tiempo");
               break;
            case 3 :
                
                break;
            
            case 4:
                break;
                
            case 5:
                x = false;
                break;
                
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                
                break;
            
        }
        
    }// Finaliza el While
    
}
    
}
