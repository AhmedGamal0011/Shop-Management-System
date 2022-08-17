/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import static javaapplication17.JavaApplication17.copy_to_file_without;

/**
 *
 * @author khalid
 */
public class admin {
    static String username;
    static String password;
    
      public static void add_product(File f) throws IOException{
               FileWriter fr = new FileWriter(f, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);
int i;
for (i=0;i<1;i++){
 
 
br.write(input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.nextInt()+" "+input.nextInt()+" "+input.nextInt()+"\n");
        br.close();
    }}
     public static void delete_product(File f,File f2,String namee)throws IOException {
        
        copy_to_file_without(f,f2,namee);
        try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }
        
    }
        public static void update_product_quantity(File f,File f2,String namee,int qn)throws IOException{
      try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
          try (BufferedWriter br = new BufferedWriter(fr)) {
              Scanner input=new Scanner(System.in);
              
              
              for (c=0;c<100;c++){
                  
                  
                  product.name[c]=scan.next();
                  product.type[c]=scan.next();
                  product.supplier[c]=scan.next();
                  product.date[c]=scan.nextInt();
                  product.date2[c]=scan.nextInt();
                  product.quantity[c]=scan.nextInt();
                  product.price[c]=scan.nextInt();
                  if (!scan.hasNext()){
                      if (namee.equals(product.name[c])){
                          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+qn+" "+product.price[c]+"\n");
                          break;
                      }
                      br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
                      break;
                      
                  }
                  if (        namee.equals(product.name[c])){
                      br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+qn+" "+product.price[c]+"\n");
                      continue;
                  }
                  br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
                  //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
              }
          }
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }}
    public static void search_by_name(File f,String namee)throws IOException{
           Scanner input=new Scanner(System.in);
       try{
            Scanner scan = new Scanner(f);
           int c;
          // String namee=input.next();
           for (c=0;c<100;c++){
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
                if (product.name[c].equals(namee)){
                   System.out.println("found"+" at index number:"+c+"\n"+"take care there is only:"+product.quantity[c]+" pieces "+"\n"+"and date of expiration is:"+product.date2[c]);
                   
               }
       }
       }
        catch (Exception ex){
            
        }
        
        
        
    }
public static void search_by_date(File f) throws IOException{
        Scanner input=new Scanner(System.in);
       try{
            Scanner scan = new Scanner(f);
           int c;
           int date=input.nextInt();
           for (c=0;c<100;c++){
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
               if (product.date[c]==date){
                   System.out.println("found"+" at index number:"+c);
               }
       }
       }
        catch (Exception ex){
            
        }
       //int []arr=new int [10];
     
    }
    public static void search_by_date2(File f) throws IOException{
        Scanner input=new Scanner(System.in);
       try{
            Scanner scan = new Scanner(f);
           int c;
           int date=input.nextInt();
           for (c=0;c<100;c++){
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
               if (product.date2[c]==date){
                   System.out.println("found"+" at index number:"+c);
               }
       }
       }
        catch (Exception ex){
            
        }
       //int []arr=new int [10];
     
    }
     public static void add_product_type(File f,File f2,String namee,String type) throws IOException{
            
        try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        br.write(product.name[c]+" "+type+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+type+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
        
    }
public static void update_product_type(File f,File f2,String namee,String type) throws IOException{
        
        try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        br.write(product.name[c]+" "+type+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+type+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
        
        
        
        
        
        
    }
    public static void delete_product_type(File f,File f2,String namee)throws IOException{
        
            try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        br.write(product.name[c]+" "+"None"+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+"None"+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
        
    }
        public static void add_product_supplier(File f,File f2,String namee,String supplier)throws IOException{
        try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        br.write(product.name[c]+" "+product.type[c]+" "+supplier+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+product.type[c]+" "+supplier+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
        
        
        
        
        
        
    }
public static void update_product_supplier(File f,File f2,String namee,String supplier)throws IOException{
        try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        br.write(product.name[c]+" "+product.type[c]+" "+supplier+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+product.type[c]+" "+supplier+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
        
        
        
        
        
        
    }
    public static void delete_product_supplier(File f,File f2,String namee)throws IOException{
             try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        br.write(product.name[c]+" "+product.type[c]+" "+"None"+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+product.type[c]+" "+"None"+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
    }
        public static void report_for_product(File f,File f5,String namee) throws IOException{
        Scanner input=new Scanner(f5);
        try (Scanner scan = new Scanner(f)) {
            int c;
            for (c=0;c<100;c++){
                //p[c]=new product();
                product.name[c]=scan.next();
                oldinventory.name[c]=input.next();
                product.type[c]=scan.next();
                oldinventory.type[c]=input.next();
                product.supplier[c]=scan.next();
                oldinventory.supplier[c]=input.next();
                product.date[c]=scan.nextInt();
                oldinventory.date[c]=input.nextInt();
                product.date2[c]=scan.nextInt();
                oldinventory.date2[c]=input.nextInt();
                product.quantity[c]=scan.nextInt();
                oldinventory.quantity[c]=input.nextInt();
                product.price[c]=scan.nextInt();
                oldinventory.price[c]=input.nextInt();
              if (namee.equals(product.name[c])){
               System.out.println("product type:"+product.type[c]+"\n"+"product supplier:"+product.supplier[c]+"\n"+"Production date:"+product.date[c]+ "\n"+"Expiration date:"+product.date2[c]+"\n"+"product quantity:"+product.quantity[c]+"\n"+"product price:"+product.price[c]+"\n"+"was sold :"+(oldinventory.quantity[c]-product.quantity[c])+" times");
            
               break;
            }
            }               
   }
    }
    public static void add_offer(File f,File f2,int date,int date2,int newprice)throws IOException{
             try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (product.date[c]==date&&product.date2[c]==date2){ 
        br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+newprice+"\n");
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (product.date[c]==date&&product.date2[c]==date2){
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+newprice+"\n");
continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f)) {
            writer.print("");writer.close();
        }
copy_to_file_without(f2,f,"0");
        try (PrintWriter writerr = new PrintWriter(f2)) {
            writerr.print("");
        }  
         
      
      
      
        
    }
    }
    public static void profit_report(File f,File f5)throws IOException{
        Scanner scan=new Scanner (f);
        Scanner input=new Scanner (f5);
        
         int c;double sum=0;
            for (c=0;c<100;c++){
                
                oldinventory.name[c]=input.next();
                product.name[c]=scan.next();
                System.out.print("the profit of sold "+product.name[c]+" is:");
                oldinventory.type[c]=input.next();
                product.type[c]=scan.next();
                oldinventory.supplier[c]=input.next();
                product.supplier[c]=scan.next();
                oldinventory.date[c]=input.nextInt();
                product.date[c]=scan.nextInt();
                oldinventory.date2[c]=input.nextInt();
                product.date2[c]=scan.nextInt();
                oldinventory.quantity[c]=input.nextInt();
                product.quantity[c]=scan.nextInt();
                oldinventory.price[c]=input.nextInt();
                product.price[c]=scan.nextInt();
                if (product.date[c]==2020){
                    product.price[c]=product.price[c]-3;
                }
                 sum= (sum+(oldinventory.quantity[c]-product.quantity[c])*product.price[c]*.25);
                System.out.println((oldinventory.quantity[c]-product.quantity[c])*product.price[c]*.25+"\n");
                if (!scan.hasNext()){
                    System.out.println("the total profit is:"+sum);
                }
                
            }               
    }
}
