/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3homework;

/**
 *
 * @author stella
 */
public interface Asset {
    double getPurchasePrice();  //the default is public and abstract
    double getCurrentValue();
    double Amortize(int years);

}
