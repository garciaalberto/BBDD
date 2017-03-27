 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicacheckbox;

import java.util.ArrayList;

/**
 *
 * @author alberto
 */
public class PoolPersonas {
    public static ArrayList<Persona> poolPersonas = new ArrayList<Persona>();

    public static void addPersona(Persona persona){
        poolPersonas.add(persona);
    }
    
}

