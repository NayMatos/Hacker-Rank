package com.treino11;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Apartamento> apartamentos; // Lista de apartamentos

    public Edificio() {
        apartamentos = new ArrayList<>();
    }

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public void listarApartamentos() {
        for (Apartamento apartamento : apartamentos) {
            System.out.println(apartamento);
        }
    }

    public Apartamento buscarApartamentoPorId(int numIdentificador) {
        for (Apartamento apartamento : apartamentos) {
            if (apartamento.getNumIdentificador() == numIdentificador) {
                return apartamento;
            }
        }
        return null;
    }
}
