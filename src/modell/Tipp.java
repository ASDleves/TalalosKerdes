/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author Ricsi
 */
public class Tipp {
    
    Kincsesladak joValasz;

    public Tipp(Kincsesladak joValasz) {
        this.joValasz = joValasz;
    }

    public boolean helyesE (Kincsesladak tipp){
        return tipp == joValasz;
    }
    
}
