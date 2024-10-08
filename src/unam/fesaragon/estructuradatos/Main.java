package unam.fesaragon.estructuradatos;

import unam.fesaragon.estructuradatos.ADT.ColaADT;
import unam.fesaragon.estructuradatos.clinica.Paciente;

public class Main {
    public static void main(String[] args) {
        ColaADT<Paciente> colaClinica = new ColaADT<>();
        imp("\n\nAgregando 3 pacientes a la cola");
        colaClinica.encolar(new Paciente("Alexis", "Martinez Prado", 19, "Hombre"));
        colaClinica.encolar(new Paciente("Alejandra", "Heredia Nava", 24, "Mujer"));
        colaClinica.encolar(new Paciente("Luis Angel", "Cervantes Moreno", 29, "Hombre"));
        imp("Mostrando contenido de la cola");
        imp(colaClinica.toString());
        imp("\nEl paciente que sigue es (Sin sacar de la cola): ");
        imp(colaClinica.siguiente().toString());
        imp("Comprobando que no se saco de la cola");
        imp(colaClinica.toString());
        imp("\nAtendiendo al siguiente: " + colaClinica.desEncolar());
        imp("\nMostrando el contenido de la cola nuevamente: ");
        imp(colaClinica.toString());
        imp("\nAgregando dos pacientes nuevos a la cola: ");
        colaClinica.encolar(new Paciente("Leslie", "Lopez Hernandez", 14, "Mujer"));
        colaClinica.encolar(new Paciente("Ana", "Nieves Clieto", 20, "Mujer"));
        imp(colaClinica.toString());

    }

    private static void imp(String str) {
        System.out.println(str);
    }
}
