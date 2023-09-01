/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculo;

/**
 *
 * @author Rocio Lopez
 */
class Bicicleta extends Vehiculo {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    public void Bicicleta(String bicicleta_de_montaña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " está pedaleando más rápido.");
    }

    @Override
    public void frenar() {
        System.out.println(getNombre() + " está frenando.");
    }
}