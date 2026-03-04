public class BarrioSesamo {

    private Habitante[] habitantes;
    private final int MAX_VECINOS;

    public BarrioSesamo(int num_max_vecinos) {
        if (num_max_vecinos > 0) {
            MAX_VECINOS = num_max_vecinos;
        } else  {
            MAX_VECINOS = 10; // Por defecto si se introduce un numero menor que 0 o 0.
        }
    }

    public Habitante buscarHabitantePorId(int id) {

        for (int i = 0; i <= MAX_VECINOS; i++) {
            if (id == habitantes[i].getId()) {
                return habitantes[i];
            }
        }
        return null;
    }

    private int buscarPrimerHuecoLibre() {
        boolean seguirBuscando = true;
        int primerHuecoLibre = 0;

        for (int i = 0; i <= MAX_VECINOS && seguirBuscando; i++) {
            if (habitantes[i] == null) {
                seguirBuscando = false;
                primerHuecoLibre = i;
            }
        }
        return primerHuecoLibre;
    }
    



}
