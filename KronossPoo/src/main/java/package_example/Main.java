package package_example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 1. Evento - Reunión de equipo
        RecordatorioEvento evento1 = new RecordatorioEvento(
                1,
                "Reunión de equipo",
                LocalDateTime.of(2025, 5, 10, 14, 30),
                "Sala A"
        );
        evento1.programar();
        evento1.notificar();
        evento1.cancelar();

        System.out.println();

        // 2. Evento - Conferencia
        RecordatorioEvento evento2 = new RecordatorioEvento(
                2,
                "Conferencia de tecnología",
                LocalDateTime.of(2025, 6, 20, 9, 0),
                "Auditorio Principal"
        );
        evento2.programar();
        evento2.notificar();
        evento2.cancelar();

        System.out.println();

        // 3. Tarea - Entrega de informe
        RecordatorioTarea tarea1 = new RecordatorioTarea(
                3,
                "Entrega de informe",
                LocalDateTime.of(2025, 4, 30, 23, 59),
                1 // alta prioridad
        );
        tarea1.programar();
        tarea1.notificar();
        tarea1.cancelar();

        System.out.println();

        // 4. Tarea - Enviar correo importante
        RecordatorioTarea tarea2 = new RecordatorioTarea(
                4,
                "Enviar correo importante",
                LocalDateTime.of(2025, 5, 5, 16, 0),
                2 // prioridad media
        );
        tarea2.programar();
        tarea2.notificar();
        tarea2.cancelar();

        System.out.println();

        // 5. Tarea - Comprar materiales
        RecordatorioTarea tarea3 = new RecordatorioTarea(
                5,
                "Comprar materiales",
                LocalDateTime.of(2025, 5, 7, 18, 30),
                3 // prioridad baja
        );
        tarea3.programar();
        tarea3.notificar();
        tarea3.cancelar();
    }
}
