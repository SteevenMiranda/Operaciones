package operaciones;

public class OperacionesBasicas {

    private double resultado;
    private String operacion;
    private Datos Dtos;

    public double getResultado() {
        return resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void IngreseDatos(String usuario, double primervalor, double segundovalor) {
        this.Dtos = new Datos();
        this.Dtos.setPrimervalor(primervalor);
        this.Dtos.setSegundovalor(segundovalor);
        this.Dtos.setUsuario(usuario);
    }

    public void Sumar() {
        this.operacion = "Suma";
        this.resultado = this.Dtos.getPrimervalor() + this.Dtos.getSegundovalor();
    }

    public void Restar() {
        this.operacion = "Resta";
        this.resultado = this.Dtos.getPrimervalor() - this.Dtos.getSegundovalor();
    }

    public void Multiplicar() {
        this.operacion = "Multiplicar";
        this.resultado = this.Dtos.getPrimervalor() * this.Dtos.getSegundovalor();
    }

    public void Dividir() {
        this.operacion = "Dividir";
        this.resultado = this.Dtos.getPrimervalor() / this.Dtos.getSegundovalor();
    }
}
