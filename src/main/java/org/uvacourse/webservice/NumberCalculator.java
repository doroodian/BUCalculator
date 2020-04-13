/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uvacourse.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.uvacourse.webservice.business.NumberServiceImpl;

/**
 *
 * @author Mostafa
 */

//WebService  is an annotation of javax.jws so we import javax.jws to be able 
//to use it 
@WebService

//in wsdl it gonna append a suffix service to NumberCalculator so the service 
//name not gonna be numberCalculator it gonna be NumberCalculatorService
//then we gonna have a port which is NumberCalculatorPort which can call 4
//operations which is are get+(Multiplication,division,substraction,addition)
public class NumberCalculator {
    NumberServiceImpl numberService = new NumberServiceImpl();
    
    //webmethod is optional , because when the class is webservice it assumes
    //every public method in that class need to be a seprated operation in wsdl
    @WebMethod
    public Integer getAddition(Integer firstNum,Integer SecondNum){
      return numberService.getAddition(firstNum,SecondNum);  
    }
    
    
    //not required
    @WebMethod
    public Integer getSubstraction(Integer firstNum,Integer SecondNum){
        
      return numberService.getSubstraction(firstNum,SecondNum);  
    }
    
    
    //not required
    @WebMethod
    public Integer getMultiplication(Integer firstNum,Integer SecondNum){
        
      return numberService.getMultiplication(firstNum,SecondNum);  
    }
    
    //not required
    @WebMethod
    public String getDivision(Integer firstNum,Integer SecondNum){
        int[] result = numberService.getDivision(firstNum,SecondNum);
        if (result[0]==0)
            return "Division on Zero is IMPOSSIBLE.";
      return Integer.toString(result[1]);  
    }
    
}
    
