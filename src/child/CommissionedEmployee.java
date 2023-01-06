/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package child;

import employeefactoryimpl.Employee;

/**
 *
 * @author Ahmed
 */
public class CommissionedEmployee extends Employee {

    @Override
    public String type() {
        System.out.println("CommissionedEmployee Class ");
        return "COMMISSIONED";
    }

    @Override
    public void isPayday() {
        System.out.println("isPayday in COMMISSIONED Class");
    }

    @Override
    public void calculatePay() {
        System.out.println("calculatePay in COMMISSIONED Class");
    }

    @Override
    public void deliverPay() {
        System.out.println("deliverPay in COMMISSIONED Class");
    }

}
