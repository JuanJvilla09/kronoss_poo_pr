package package_example;

import java.time.LocalDateTime;

public class RecordatorioEvento extends Recordatorio implements Programable {
    private String ubicacion;

    public RecordatorioEvento() {
    }

    public RecordatorioEvento(int id, String titulo, LocalDateTime fechaHora, String ubicacion) {
        super(id, titulo, fechaHora);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void notificar() {
        System.out.println("[Evento] " + getTitulo() + " en " + ubicacion + " programado para " + getFechaHora());
    }

    @Override
    public void programar() {
        System.out.println("Programando evento '" + getTitulo() + "' para " + getFechaHora());
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando evento '" + getTitulo() + "'.");
    }
}
