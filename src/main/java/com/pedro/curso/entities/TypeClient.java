package com.pedro.curso.entities;

public enum TypeClient {
    PhysicalPerson(1, "Pessoa Fisica"),
    LegalPerson(2, "Pessoa Juridica");

    private String desc;
    private int cod;

    private TypeClient(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public int getCod() {
        return cod;
    }

    public static TypeClient toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for(TypeClient tc: TypeClient.values()) {
           if (cod.equals(tc.getCod())) {
               return tc;
           }
        }

        throw new IllegalArgumentException("Cod doenst exist: " + cod);
    }
}
