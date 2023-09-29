/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import view.Validation;

/**
 *
 * @author This PC
 */
public class SolvingEquation {
    private Validation validation;
    
    public SolvingEquation(){
        validation= new Validation();
    }
    public boolean checkOddEven(float x){
        return x%2==0 ? true:false;
    }
    
    public boolean isPerfectNumber(float x){
        if(x==0) return false;
        return Math.pow((int) Math.sqrt(x), 2)==x ? true:false;
        
    }
    
    
    public List<Float> calculateEqution(){
        System.out.println("----- Calculate Equation -----");
        List<Float> result= new ArrayList<>();                      
        
        float a= validation.checkInputFloat("Enter A: ");       
        
        float b= validation.checkInputFloat("Enter B: ");
        
        if(a==0 ){
            if(b==0){
                System.out.println("Solution: The equation infinitely many solutions!");
            }else{
                System.out.println("Solution: The equation no solution!");
                result=null;
            }
        }else{
            if(b==0) result.add((float)0);
            else
                System.out.println("Solution: x = "+(-b/a));
                result.add((-b/a));
        }
        String odd="";
        if(!checkOddEven(a))  odd+=a+", ";
        if(!checkOddEven(b))  odd+=b+", ";
        if(result!=null && !result.isEmpty()){
            if(!checkOddEven(result.get(0)))
                odd+= result.get(0)+", ";
        }
        if(!odd.isEmpty()) odd= odd.substring(0, odd.lastIndexOf(","));
        System.out.println("Number is Odd:"+odd);
        
        String even="";
        if(checkOddEven(a)&&a!=0)  even+=a+", ";
        if(checkOddEven(b)&&b!=0)  even+=b+", ";
        if(result!=null && !result.isEmpty()){
            if(checkOddEven(result.get(0)) && result.get(0)!=0)
                even+= result.get(0)+", ";
        }
        if(!even.isEmpty()) even= even.substring(0, even.lastIndexOf(","));
        System.out.println("Number is Even:"+even);
        
        String perfect="";
        if(isPerfectNumber(a))  perfect+=a+", ";
        if(isPerfectNumber(b))  perfect+=b+", ";
        if(result!=null && !result.isEmpty()){
            if(isPerfectNumber(result.get(0)))
                perfect+= result.get(0)+", ";
        }
        if(!perfect.isEmpty()) perfect= perfect.substring(0, perfect.lastIndexOf(","));
        System.out.println("Number is perfect:"+perfect);
        return result;
    }
    
    public List<Float> calculateQuadraticEquation(){
        System.out.println("----- Calculate Quadratic Equation -----");
        List<Float> result= new ArrayList<>();
        float x1,x2;        
        
        float a= validation.checkInputFloat("Enter A: ");
       
        float b= validation.checkInputFloat("Enter B: ");
        
        float c= validation.checkInputFloat("Enter C: ");
        if(a!=0){
            float delta= (float) Math.pow(b, 2) - 4*a*c;
            if(delta<0) System.out.println("Solution: The equation no solution!");
            else if(delta>0){
                x1= (float) (-b + Math.sqrt(delta))/2*a;
                x2= (float) (-b + Math.sqrt(delta))/2*a;
                result.add(x1); result.add(x2);
                System.out.println("Solution: x1 = "+x1+" and x2 = "+x2);                
            }
            else{
                x1=x2= -b/(2*a);
                result.add(x1); result.add(x2);
                System.out.println("Solution: x1 = "+x1+" and x2 = "+x2);                
            }        
        }else{
            System.out.println("No solving equation!");
        }
        String odd="";
        if(!checkOddEven(a))  odd+=a+", ";
        if(!checkOddEven(b))  odd+=b+", ";
        if(!checkOddEven(c))  odd+=c+", ";
        if(result!=null && !result.isEmpty()){
            if(!checkOddEven(result.get(0)))
                odd+= result.get(0)+", ";
            if(!checkOddEven(result.get(1)))
                odd+= result.get(1)+", ";
        }
        if(!odd.isEmpty()) odd= odd.substring(0, odd.lastIndexOf(","));
        System.out.println("Number is Odd:"+odd);
        
        String even="";
        if(checkOddEven(a)&&a!=0)  even+=a+", ";
        if(checkOddEven(b)&&b!=0)  even+=b+", ";
        if(checkOddEven(c)&&c!=0)  even+=c+", ";
        if(result!=null && !result.isEmpty()){
            if(checkOddEven(result.get(0)) && result.get(0)!=0)                
                even+= result.get(0)+", ";
            if(checkOddEven(result.get(1))&& result.get(0)!=0)
                even+= result.get(1)+", ";                
        }       
        if(!even.isEmpty()) even= even.substring(0, even.lastIndexOf(","));
        System.out.println("Number is Even:"+even);
        
        String perfect="";
        if(isPerfectNumber(a))  perfect+=a+", ";
        if(isPerfectNumber(b))  perfect+=b+", ";
        if(isPerfectNumber(c))  perfect+=c+", ";
        if(result!=null && !result.isEmpty()){
            if(isPerfectNumber(result.get(0)))
                perfect+= result.get(0)+", ";
            if(isPerfectNumber(result.get(1)))
                perfect+= result.get(1)+", ";
            
        }
        if(!perfect.isEmpty()) perfect= perfect.substring(0, perfect.lastIndexOf(","));
        System.out.println("Number is perfect:"+perfect);        
        return result;
    }
               
}
