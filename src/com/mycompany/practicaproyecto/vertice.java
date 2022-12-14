/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaproyecto;

/**
 *
 * @author Luisp
 */
// Creamos la clase vertice con sus constructores.
public class vertice {
    private int numVertice;
    private vertice pNext;
    private vertice pPrev;
    private lista listaadyacencia;
    private int estado;

    public vertice(int numVertice, lista listaadyacencia) {
        this.numVertice = numVertice;
        this.listaadyacencia = listaadyacencia;
        this.pNext = null;
        this.pPrev = null;
        this.estado = 0;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public vertice getpPrev() {
        return pPrev;
    }

    public void setpPrev(vertice pPrev) {
        this.pPrev = pPrev;
    }

    public vertice getpNext() {
        return pNext;
    }

    public void setpNext(vertice pNext) {
        this.pNext = pNext;
    }

    public lista getListaadyacencia() {
        return listaadyacencia;
    }

    public void setListaadyacencia(lista listaadyacencia) {
        this.listaadyacencia = listaadyacencia;
    }
    

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
    
    
}
