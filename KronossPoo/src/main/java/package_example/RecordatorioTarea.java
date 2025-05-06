package package_example;

import java.time.LocalDateTime;

public class RecordatorioTarea extends Recordatorio implements Programable {
    private int prioridad; // 1 = alta, 2 = media, 3 = baja

    public RecordatorioTarea() {
    }

    public RecordatorioTarea(int id, String titulo, LocalDateTime fechaHora, int prioridad) {
        super(id, titulo, fechaHora);
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public void notificar() {
        System.out.println("[Tarea] " + getTitulo() + " (prioridad " + prioridad + ") vencimiento: " + getFechaHora());
    }

    @Override
    public void programar() {
        System.out.println("Programando tarea '" + getTitulo() + "' para " + getFechaHora());
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando tarea '" + getTitulo() + "'.");
    }
}
