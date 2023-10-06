package ENUM;

enum Servicios {
    CORTE("mullet","un corte para los mas aestetik",15000){
        @Override
        public String mostrarDescripcionServicio() {
            return "el corte mas aragan del pedazo";
        }
    },
    UNAS("acrilicas","el servicio tarda al rededor de hora y media",80000){
        @Override
        public String mostrarDescripcionServicio() {
            return "el procedimiento tarda hora y media y puedes elegir el diseño que quieras";
        }
    },
    TINTE("tintura", "elige el color que quieras para tu cabello", 45000){
        @Override
        public String mostrarDescripcionServicio() {
            return "el tinte mas barato es el rosa";
        }
    };
    private String nombre;
    private String descripcion;
    private int precio;

    Servicios(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
    public abstract String mostrarDescripcionServicio();
}
