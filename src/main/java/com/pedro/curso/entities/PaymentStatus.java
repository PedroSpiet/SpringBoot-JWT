package com.pedro.curso.entities;

public enum PaymentStatus {
    PENDING(1, "Aguardando Confirmação do pagamento!"),
    SETTLED(2, "Pagamento Quitado!"),
    CANCELED(3, "Pedido Cancelado!");

    private Integer cod;
    private String desc;

    private PaymentStatus(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }


    public Integer getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public static PaymentStatus toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }

        for(PaymentStatus ps : PaymentStatus.values()) {
            if (cod.equals(ps.getCod())) {
                return ps;
            }
        }

        throw new IllegalArgumentException("that cod doenst exist! " + cod);
    }
}
