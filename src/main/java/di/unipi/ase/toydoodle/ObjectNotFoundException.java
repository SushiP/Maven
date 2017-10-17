/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.unipi.ase.toydoodle;

/**
 *
 * @author Sushi
 */
public class ObjectNotFoundException extends Exception{
    ObjectNotFoundException(String objectClass, String id){
        super("The " + objectClass + " with id " + id + " has not be found.");
    }
}
