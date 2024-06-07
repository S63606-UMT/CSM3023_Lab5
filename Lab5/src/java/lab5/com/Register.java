/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.com;

/**
 *
 * @author Saiful
 */
public class Register {
    
    private String IC_No;
    private String name;
    private String typeOfTraining;
    private int noPax;
    private String isStudent;
    private double amountDue;
    
    public Register() {        
    }

    public String getIC_No() {
        return IC_No;
    }

    public void setIC_No(String IC_No) {
        this.IC_No = IC_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfTraining() {
        return typeOfTraining;
    }

    public void setTypeOfTraining(String typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public int getNoPax() {
        return noPax;
    }

    public void setNoPax(int noPax) {
        this.noPax = noPax;
    }

    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
    
}
