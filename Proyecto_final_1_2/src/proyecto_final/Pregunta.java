/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

/**
 *
 * @author Erick Jair
 */
public class Pregunta {
   private String titulo;
   private Opcion opciones[];

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }
}
