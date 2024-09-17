package unam.fesaragon.estructuradatos.clinica;

public class Paciente {
    //Datos de paciente
    private int edad;
    private String nombre;
    private String apellido;
    private String sexo;
    private int peso;
    private int talla;
    //Datos de consulta
    private int noDeConsulta;
    private String fechaDeConsulta;
    private String tratamiento;

    public Paciente(String nombre, String apellido, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setNoDeConsulta(int noDeConsulta) {
        this.noDeConsulta = noDeConsulta;
    }

    public void setFechaDeConsulta(String fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public int getTalla() {
        return talla;
    }

    public int getNoDeConsulta() {
        return noDeConsulta;
    }

    public String getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    @Override
    public String toString() {
        return this.getNombre()+" "+this.getApellido()+" "+this.getEdad();
    }
}
