/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeefactoryimpl;

import child.CommissionedEmployee;
import child.HourlyEmployee;
import child.SalariedEmploye;

/**
 *
 * @author Ahmed
 */
public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public Employee makeEmployee(Employee r) {
        switch (r.type()) {
            case "COMMISSIONED":
                r= new CommissionedEmployee();
                break;
            case "HOURLY":
                r= new HourlyEmployee();
                 break;
            case "SALARIED":
                r= new SalariedEmploye();
                 break;
            default:
                break;
        }
   return r;
}


public  static void main(String[] args) {
    EmployeeFactoryImpl efi=new EmployeeFactoryImpl();
    
    //CommissionedEmployee obj = null  ;
    HourlyEmployee obj=null;
   // SalariedEmploye obj=null;
    Employee emp= efi.makeEmployee(obj);
  
    emp.isPayday();

}
    
}
