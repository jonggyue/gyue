/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

/**
 *
 * @author 1
 */
public class Dog extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("¸Û¸Û");
    }

    @Override
    public String col() {
        return "¹é±¸";
    }

}
