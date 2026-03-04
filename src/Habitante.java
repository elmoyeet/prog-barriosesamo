public class Habitante {

    private int id;
    private String nombre;
    private String especie;
    private int nivelFelicidad;

    public Habitante(int id, String nombre, String especie, int nivelFelicidad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.nivelFelicidad = nivelFelicidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getNivelFelicidad() {
        return nivelFelicidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitantes: {");
        sb.append("id=").append(this.id);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", especie=").append(this.especie);
        sb.append(", nivelFelicidad=").append(this.nivelFelicidad);
        sb.append("}");

        return sb.toString();
    }
}
