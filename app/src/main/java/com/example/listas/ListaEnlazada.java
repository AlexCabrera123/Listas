package com.example.listas;

import java.util.List;

public class ListaEnlazada {
    private NodoLista primero;
    String resultado;

    public ListaEnlazada() { primero = null; }

    public void crearListaEnlazada(){
    }

    public String toString() {
        resultado = "";
        NodoLista aux = primero;
        while(aux != null) {
            resultado += aux+ " -> ";
            aux = aux.getEnlace();
        }
        return resultado;
    }
}
