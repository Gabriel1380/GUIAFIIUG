package com.vargas.guiafiiug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationData {

    public static class Ubicacion {
        public String nombre;
        public String bloque;
        public String piso;
        public String descripcion;
        public String tipo;
        public String instrucciones;

        public Ubicacion(String nombre, String bloque, String piso, String descripcion, String tipo, String instrucciones) {
            this.nombre = nombre;
            this.bloque = bloque;
            this.piso = piso;
            this.descripcion = descripcion;
            this.tipo = tipo;
            this.instrucciones = instrucciones;
        }
    }

    private static List<Ubicacion> ubicaciones;

    public static List<Ubicacion> obtenerTodasLasUbicaciones() {
        if (ubicaciones == null) {
            inicializarUbicaciones();
        }
        return ubicaciones;
    }

    private static void inicializarUbicaciones() {
        ubicaciones = new ArrayList<>();

        // ==================== PRIMER PISO - BLOQUE A ====================
        ubicaciones.add(new Ubicacion(
                "Aula 14A-201",
                "Bloque A",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque A. Al entrar, está ubicada en el segundo piso cerca del Laboratorio de Computación 14A-202."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14 A-203",
                "Bloque A",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque A, lado izquierdo del pasillo."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14 A-204",
                "Bloque A",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque A, junto al aula 14 A-203."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14 A-205",
                "Bloque A",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque A, al final del corredor de aulas."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio de Computación 14A-202",
                "Bloque A",
                "Primera Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Primera planta del Bloque A. Ubicado cerca del aula 14A-201, cuenta con equipos de computación para prácticas."
        ));

        ubicaciones.add(new Ubicacion(
                "Dirección de Telemática",
                "Bloque A",
                "Primera Planta",
                "Oficina administrativa de telemática",
                "departamento",
                "Primera planta del Bloque A, en la zona de laboratorios de computación."
        ));

        ubicaciones.add(new Ubicacion(
                "Sala de Tutorías",
                "Bloque A",
                "Primera Planta",
                "Sala para tutorías académicas",
                "departamento",
                "Primera planta del Bloque A, lado izquierdo del pasillo principal."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14 A-206",
                "Bloque A",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque A, cerca de la Sala de Tutorías."
        ));

        ubicaciones.add(new Ubicacion(
                "Instituto de Investigación",
                "Bloque A",
                "Primera Planta",
                "Centro de investigación académica",
                "departamento",
                "Primera planta del Bloque A, zona de investigación y desarrollo."
        ));

        ubicaciones.add(new Ubicacion(
                "Coordinación de Investigación",
                "Bloque A",
                "Primera Planta",
                "Oficina de coordinación de proyectos de investigación",
                "departamento",
                "Primera planta del Bloque A, dentro del área del Instituto de Investigación."
        ));

        ubicaciones.add(new Ubicacion(
                "Biblioteca de la Facultad",
                "Bloque A",
                "Primera Planta",
                "Biblioteca - Sala de lectura, préstamo de libros y área de estudio",
                "servicio",
                "Primera planta del Bloque A. Gran espacio con estanterías de libros, mesas de estudio y área de consulta."
        ));

        ubicaciones.add(new Ubicacion(
                "Departamento de Titulación",
                "Bloque A",
                "Primera Planta",
                "Oficina de trámites de titulación",
                "departamento",
                "Primera planta del Bloque A, zona administrativa cerca de la biblioteca."
        ));

        ubicaciones.add(new Ubicacion(
                "Decanato",
                "Bloque A",
                "Planta Baja",
                "Oficina del Decano de la Facultad",
                "departamento",
                "Planta baja del Bloque A. Oficina principal de la autoridad de la facultad."
        ));

        ubicaciones.add(new Ubicacion(
                "Vicedecanato",
                "Bloque A",
                "Planta Baja",
                "Oficina del Vicedecano",
                "departamento",
                "Planta baja del Bloque A, junto al Decanato."
        ));

        ubicaciones.add(new Ubicacion(
                "Departamento 7 - Doctorado",
                "Bloque A",
                "Planta Baja",
                "Oficina de programas de doctorado",
                "departamento",
                "Planta baja del Bloque A, zona de posgrado."
        ));

        ubicaciones.add(new Ubicacion(
                "Secretaría General",
                "Bloque A",
                "Planta Baja",
                "Secretaría de la Facultad - Trámites, certificados, matrículas",
                "departamento",
                "Planta baja del Bloque A. Oficina principal de atención administrativa a estudiantes."
        ));

        ubicaciones.add(new Ubicacion(
                "Sala de Individuales de Titulación",
                "Bloque A",
                "Planta Baja",
                "Sala para trabajos individuales de titulación",
                "servicio",
                "Planta baja del Bloque A, espacio de trabajo individual para estudiantes de titulación."
        ));

        ubicaciones.add(new Ubicacion(
                "Administración",
                "Bloque A",
                "Planta Baja",
                "Oficina administrativa general",
                "departamento",
                "Planta baja del Bloque A, gestión administrativa de la facultad."
        ));

        ubicaciones.add(new Ubicacion(
                "Dirección de Ingeniería Industrial",
                "Bloque A",
                "Planta Baja",
                "Dirección de la carrera de Ingeniería Industrial",
                "departamento",
                "Planta baja del Bloque A, oficina de dirección de carrera."
        ));

        ubicaciones.add(new Ubicacion(
                "Talento Humano",
                "Bloque A",
                "Planta Baja",
                "Departamento de recursos humanos",
                "departamento",
                "Planta baja del Bloque A, gestión de personal."
        ));

        ubicaciones.add(new Ubicacion(
                "Sala de Profesores de Ingeniería Industrial",
                "Bloque A",
                "Planta Baja",
                "Sala de descanso y trabajo para docentes",
                "departamento",
                "Planta baja del Bloque A, espacio exclusivo para profesores."
        ));

        // ==================== SEGUNDO PISO - BLOQUE A ====================
        ubicaciones.add(new Ubicacion(
                "Laboratorio de Computación 14A-101",
                "Bloque A",
                "Segunda Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Segunda planta del Bloque A. Primer laboratorio de computación equipado para prácticas."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula de Postgrado",
                "Bloque A",
                "Segunda Planta",
                "Aula para programas de posgrado",
                "aula",
                "Segunda planta del Bloque A, zona de aulas de posgrado."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14B-101",
                "Bloque A",
                "Segunda Planta",
                "Laboratorio de Cómputo avanzado",
                "aula",
                "Segunda planta, conectado entre bloques A y B."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Especial 14B-101",
                "Bloque A",
                "Segunda Planta",
                "Laboratorio especializado",
                "aula",
                "Segunda planta, laboratorio con equipamiento especial."
        ));

        // ==================== PRIMER PISO - BLOQUE B ====================
        ubicaciones.add(new Ubicacion(
                "Bodega",
                "Bloque B",
                "Primera Planta",
                "Bodega de almacenamiento",
                "servicio",
                "Primera planta del Bloque B, área de almacenamiento general."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14B-103",
                "Bloque B",
                "Primera Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Primera planta del Bloque B, equipado con computadoras para prácticas estudiantiles."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Especial 14B-002",
                "Bloque B",
                "Primera Planta",
                "Laboratorio especializado",
                "aula",
                "Primera planta del Bloque B, laboratorio con equipo técnico especializado."
        ));

        ubicaciones.add(new Ubicacion(
                "Coordinación de Nivelación",
                "Bloque B",
                "Primera Planta",
                "Oficina de coordinación de cursos de nivelación",
                "departamento",
                "Primera planta del Bloque B, gestión de programas de nivelación."
        ));

        ubicaciones.add(new Ubicacion(
                "Auditorio J B 201",
                "Bloque B",
                "Primera Planta",
                "Auditorio principal para eventos y conferencias",
                "servicio",
                "Primera planta del Bloque B. Gran espacio para eventos académicos."
        ));

        // ==================== SEGUNDO PISO - BLOQUE B ====================
        ubicaciones.add(new Ubicacion(
                "Aula 14B-202",
                "Bloque B",
                "Segunda Planta",
                "Aula de clases",
                "aula",
                "Segunda planta del Bloque B, aula estándar para clases."
        ));

        ubicaciones.add(new Ubicacion(
                "Bodega",
                "Bloque B",
                "Segunda Planta",
                "Bodega de materiales",
                "servicio",
                "Segunda planta del Bloque B, almacenamiento de segundo piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14 B-201",
                "Bloque B",
                "Segunda Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Segunda planta del Bloque B, laboratorio equipado."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14B-201",
                "Bloque B",
                "Segunda Planta",
                "Aula de clases regulares",
                "aula",
                "Segunda planta del Bloque B, aula académica."
        ));

        // ==================== PRIMER PISO - BLOQUE C ====================
        ubicaciones.add(new Ubicacion(
                "Bodega",
                "Bloque C",
                "Primera Planta",
                "Bodega general",
                "servicio",
                "Primera planta del Bloque C, almacenamiento."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14B-204",
                "Bloque C",
                "Primera Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Primera planta del Bloque C, laboratorio con equipos de computación."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14B-201",
                "Bloque C",
                "Primera Planta",
                "Laboratorio de Cómputo principal",
                "aula",
                "Primera planta del Bloque C, laboratorio equipado para prácticas."
        ));

        ubicaciones.add(new Ubicacion(
                "Coordinación de Acreditación",
                "Bloque C",
                "Primera Planta",
                "Oficina de acreditación académica",
                "departamento",
                "Primera planta del Bloque C, gestión de procesos de acreditación."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14C-102",
                "Bloque C",
                "Primera Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Primera planta del Bloque C, laboratorio computacional."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-102",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C, aula académica estándar."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-101",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C, primera aula del bloque."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-103",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Sala de Profesores Sistemas",
                "Bloque C",
                "Primera Planta",
                "Sala de profesores de sistemas",
                "departamento",
                "Primera planta del Bloque C, espacio para docentes de sistemas."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio de Arduino",
                "Bloque C",
                "Primera Planta",
                "Laboratorio de robótica y Arduino",
                "aula",
                "Primera planta del Bloque C, espacio para proyectos de electrónica."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-006",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-005",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-007",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-004",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-002",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-003",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-001",
                "Bloque C",
                "Primera Planta",
                "Aula de clases",
                "aula",
                "Primera planta del Bloque C, primera aula."
        ));

        ubicaciones.add(new Ubicacion(
                "Asociación de Estudiantes",
                "Bloque C",
                "Primera Planta",
                "Oficina de la asociación estudiantil",
                "departamento",
                "Primera planta del Bloque C, espacio para organización estudiantil."
        ));

        // ==================== SEGUNDO PISO - BLOQUE C ====================
        ubicaciones.add(new Ubicacion(
                "Bodega",
                "Bloque C",
                "Segunda Planta",
                "Bodega de segundo piso",
                "servicio",
                "Segunda planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-204",
                "Bloque C",
                "Segunda Planta",
                "Aula de clases",
                "aula",
                "Segunda planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-203",
                "Bloque C",
                "Segunda Planta",
                "Aula de clases",
                "aula",
                "Segunda planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-202",
                "Bloque C",
                "Segunda Planta",
                "Aula de clases",
                "aula",
                "Segunda planta del Bloque C."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14C-201",
                "Bloque C",
                "Segunda Planta",
                "Aula de clases",
                "aula",
                "Segunda planta del Bloque C, primera aula del piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Laboratorio Computación 14C-101",
                "Bloque C",
                "Segunda Planta",
                "Laboratorio de Cómputo",
                "aula",
                "Segunda planta del Bloque C."
        ));

        // ==================== TERCER PISO - AULAS 14D ====================
        ubicaciones.add(new Ubicacion(
                "Aula 14D-001",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja, aula académica."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-002",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-003",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-004",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-005",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-006",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-007",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-008",
                "Bloque D",
                "Planta Baja",
                "Aula de clases",
                "aula",
                "Planta baja."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-102",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-103",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-104",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-105",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-106",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-107",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        ubicaciones.add(new Ubicacion(
                "Aula 14D-108",
                "Bloque D",
                "Primer Piso",
                "Aula de clases",
                "aula",
                "Primer piso."
        ));

        // ==================== SERVICIOS GENERALES ====================
        ubicaciones.add(new Ubicacion(
                "Bar",
                "Zona Central",
                "Planta Baja",
                "Cafetería / Bar de la facultad - Snacks, bebidas y almuerzos",
                "servicio",
                "Zona central del campus, área de cafetería y comedor estudiantil."
        ));

        ubicaciones.add(new Ubicacion(
                "Cafetería",
                "Zona Central",
                "Planta Baja",
                "Cafetería / Bar de la facultad - Snacks, bebidas y almuerzos",
                "servicio",
                "Zona central del campus, área de cafetería y comedor estudiantil."
        ));

        ubicaciones.add(new Ubicacion(
                "Baños",
                "Todos los Bloques",
                "Todas las Plantas",
                "Servicios sanitarios disponibles en todo el campus",
                "servicio",
                "Hay baños disponibles en cada bloque y en todas las plantas. Busca las señales 🚻"
        ));

        ubicaciones.add(new Ubicacion(
                "Área Verde",
                "Zona Central",
                "Exterior",
                "Zona verde y de esparcimiento",
                "servicio",
                "Áreas verdes distribuidas en el campus para recreación y descanso."
        ));

        ubicaciones.add(new Ubicacion(
                "Entrada Central",
                "Zona Principal",
                "Exterior",
                "Acceso principal al campus",
                "servicio",
                "Entrada principal del Campus Mapasingue por la Av. Principal."
        ));

        ubicaciones.add(new Ubicacion(
                "Coordinación de Carrera de Sistemas",
                "Bloque C",
                "Primera Planta",
                "Oficina de coordinación de Ingeniería en Sistemas",
                "departamento",
                "Primera planta del Bloque C, gestión académica de la carrera de sistemas."
        ));

        ubicaciones.add(new Ubicacion(
                "Departamento de Vinculación con la Sociedad",
                "Bloque C",
                "Primera Planta",
                "Oficina de proyectos de vinculación",
                "departamento",
                "Primera planta del Bloque C, gestión de proyectos comunitarios."
        ));
    }

    public static List<Ubicacion> buscarUbicacion(String termino) {
        List<Ubicacion> resultados = new ArrayList<>();
        String terminoLower = termino.toLowerCase();

        for (Ubicacion ubicacion : obtenerTodasLasUbicaciones()) {
            if (ubicacion.nombre.toLowerCase().contains(terminoLower) ||
                    ubicacion.bloque.toLowerCase().contains(terminoLower) ||
                    ubicacion.descripcion.toLowerCase().contains(terminoLower)) {
                resultados.add(ubicacion);
            }
        }

        return resultados;
    }

    public static List<Ubicacion> obtenerPorTipo(String tipo) {
        List<Ubicacion> resultados = new ArrayList<>();

        for (Ubicacion ubicacion : obtenerTodasLasUbicaciones()) {
            if (ubicacion.tipo.equals(tipo)) {
                resultados.add(ubicacion);
            }
        }

        return resultados;
    }

    public static Map<String, List<Ubicacion>> obtenerPorBloque() {
        Map<String, List<Ubicacion>> bloques = new HashMap<>();

        for (Ubicacion ubicacion : obtenerTodasLasUbicaciones()) {
            if (!bloques.containsKey(ubicacion.bloque)) {
                bloques.put(ubicacion.bloque, new ArrayList<Ubicacion>());
            }
            bloques.get(ubicacion.bloque).add(ubicacion);
        }

        return bloques;
    }
}