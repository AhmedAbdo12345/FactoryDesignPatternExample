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
public class HourlyEmployee extends Employee {

    @Override
    public String type() {
        System.out.println("HourlyEmployee Class ");
        return "HOURLY";
    }

    @Override
    public void isPayday() {
        System.out.println("isPayday in HourlyEmployee Class");
    }

    @Override
    public void calculatePay() {
        System.out.println("calculatePay in HourlyEmployee Class");
    }

    @Override
    public void deliverPay() {
        System.out.println("deliverPay in HourlyEmployee Class");
    }
}
