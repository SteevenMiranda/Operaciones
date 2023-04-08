package operaciones;
public class Datos {
    private String usuario;
    private double primervalor;
    private double segundovalor;
    

    public Datos(String usuario, double primervalor, double segundovalor) {
        this.usuario = usuario;
        this.primervalor = primervalor;
        this.segundovalor = segundovalor;       
    }
    
    public Datos(){
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getPrimervalor() {
        return primervalor;
    }

    public void setPrimervalor(double primervalor) {
        this.primervalor = primervalor;
    }

    public double getSegundovalor() {
        return segundovalor;
    }

    public void setSegundovalor(double segundovalor) {
        this.segundovalor = segundovalor;
    }
       
}
