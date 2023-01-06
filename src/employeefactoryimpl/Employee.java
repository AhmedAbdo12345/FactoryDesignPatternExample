/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeefactoryimpl;

/**
 *
 * @author Ahmed
 */
public abstract class Employee {
    public abstract void isPayday();
 public abstract void calculatePay();
 public abstract void deliverPay();
 
 
 public String type(){
     System.out.println("Employee Class ");
     return "Employee";
 }
}
