/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Via Aprillya
 */
public class Array {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        //deklarasi variabel Array
        //double[]z;              //boleh double,integer,boolean,cahr,string,dll
        //z = new double [5];     //new diganti sesuai variabel yang atas
        
        //for (int i=0;i<=4;i++)
            //z[i]=2.3*i+4;
        
        //for (int i=0;i<=4;i++)
            //System.out.println(z[i]);
       
        int number;
        System.out.print("Input Number = ");
        number=in.nextInt();
        
        int[]digit;
        digit = new int [100];
        int[]digit2;
        digit2 = new int [100];
        
        int index=0;
        int angka;
        
        while(number>0){
            angka=number%10;
            digit[index]=angka;
            number=number/10;
            index++;
        }
        //System.out.println(index);
        
        //for(int i=0;i<index;i++)           //angka dibalik
            //System.out.print(digit[i]+" ");
            
        //int z = digit[0];
        //digit[0]=digit[index-1];
        //digit[index-1]=z;
          
            
        for(int i=index-1;i>=0;i--) //angka tidak dibalik
            System.out.print(digit[i]+" ");
        
        }
        
        }
    
        
    
    

