package package_example;

import java.time.LocalDateTime;

public abstract class Recordatorio {
    private int id;
    private String titulo;
    private LocalDateTime fechaHora;

    public Recordatorio() {
    }

    public Recordatorio(int id, String titulo, LocalDateTime fechaHora) {
        this.id = id;
        this.titulo = titulo;
        this.fechaHora = fechaHora;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    // Método abstracto para enviar notificación
    public abstract void notificar();
}
