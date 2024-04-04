import java.util.ArrayList;

public class Competencia {
    private ArrayList<Atleta> atletas;

    public Competencia() {
        ArrayList<Atleta> atletas = new ArrayList<Atleta>();
    }
    
    public void nuevoAtleta(){
        atletas.add(new Atleta("Pepito", "Colombiano",2,4));
    
    }
    
    
    
}
