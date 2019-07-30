package mensaje;

public enum Mensaje {

    MENSAJE_DE_BIENVENIDAD("Bienvenido a este programa"),
    MENSAJE_INGRESE("Ingresa tu nombre");

    private String mensajeb;

    Mensaje(String s) {
            this.mensajeb = s;
    }
    public String getMensajeb() {return mensajeb;}
}
