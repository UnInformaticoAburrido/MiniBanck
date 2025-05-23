package org.UIA.Records;

import java.time.Instant;

public class Records {
    public String descripcion;
    public int cash;
    public boolean tipe;
    public Instant date;

    public Records(String descripcionIn, int cashIn, boolean tipeIn){
        this.descripcion = descripcionIn;
        this.cash = cashIn;
        this.tipe = tipeIn;
        this.date = Instant.now();
    }
}
