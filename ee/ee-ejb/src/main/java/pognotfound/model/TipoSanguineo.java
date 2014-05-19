package pognotfound.model;

public enum TipoSanguineo {

    UNKNOW("Desconhecido"),
    A_plus("A+"),
    A_minus("A-"),
    B_plus("B+"),
    B_minus("B-"),
    AB_plus("AB+"),
    AB_minus("AB-"),
    O_plus("O+"),
    O_minus("O-");

    String label;

    TipoSanguineo(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
