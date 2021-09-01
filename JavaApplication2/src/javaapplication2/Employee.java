/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Leo45
 */
public class Employee {
    private String first, last, social;
    private CompensationModel model;
    public Employee(String first, String last, String social, CompensationModel model){
        this.first=first;
        this.last=last;
        this.social=social;
        this.model=model;
    }
    public String getFirstName(){
        return this.first;
    }
    public String getLastName(){
        return this.last;
    } 
    public void setCompensation(CompensationModel model){
        this.model=model;
    }
    public double earnings(){
        return this.model.earnings();
    }
    public void raise(double percent){
        this.model.raise(percent);
    }
    @Override
    public String toString(){
        return this.first+" "+this.last+"\nSocial Security Number: "+this.social+"\n"+this.model+"\n";
    }
}
