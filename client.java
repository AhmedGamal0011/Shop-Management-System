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
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static javaapplication17.JavaApplication17.copy_to_file_without;

/**
 *
 * @author khalid
 */
public class client {
    static String  name[]=new String[1000];
    static String phone[]=new String [100];
    static String Email[]=new String [100];
    
     public static void register_client(File f3) throws IOException{
        
          FileWriter fr = new FileWriter(f3, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);
int i;
for (i=0;i<1;i++){
 
 
br.write(input.next()+"  "+input.next()+"  "+input.next()+"\n");
        br.close();
        
    }}
    public static void read_client_info(File f3)throws IOException{
                try (Scanner scan = new Scanner(f3)) {
            int c;
            for (c=0;c<100;c++){
                
                client.name[c]=scan.next();
                client.phone[c]=scan.next();
                client.Email[c]=scan.next();
                
               System.out.println(client.name[c]+" "+client.phone[c]+" "+client.Email[c]);
                
            }               
   }
    }
    public static void copy_to_clientfile_without(File f3,File f4,String namee)throws IOException{
       
        
              try (Scanner scan = new Scanner(f3)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f4, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                client.name[c]=scan.next();
                client.phone[c]=scan.next();
                client.Email[c]=scan.next();
               
      if (!scan.hasNext()){
         if (namee.equals(client.name[c])){ 
        
            break;
         }
          br.write(client.name[c]+" "+client.phone[c]+" "+client.Email[c]+"\n");
          break;
             
    }
    if (        namee.equals(client.name[c])){
    
        continue;
                }
br.write(client.name[c]+" "+client.phone[c]+" "+client.Email[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            } 
             
       br.close();

    }
        
        
        
    }
    public static void update_client_phone(File f3,File f4,String namee,String phone)throws IOException{
        
         try (Scanner scan = new Scanner(f3)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f4, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<10;c++){
          
                
                client.name[c]=scan.next();
                client.phone[c]=scan.next();
                client.Email[c]=scan.next();
               
      if (!scan.hasNext()){
         if (namee.equals(client.name[c])){ 
        br.write(client.name[c]+" "+phone+" "+client.Email[c]+"\n");
            break;
         }
          br.write(client.name[c]+" "+client.phone[c]+" "+client.Email[c]+"\n");
          break;
             
    }
    if (        namee.equals(client.name[c])){
    br.write(client.name[c]+" "+phone+" "+client.Email[c]+"\n");
        continue;
                }
br.write(client.name[c]+" "+client.phone[c]+" "+client.Email[c]+"\n");
      
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f3)) {
            writer.print("");writer.close();
        }
copy_to_clientfile_without(f4,f3,"0");
        try (PrintWriter writerr = new PrintWriter(f4)) {
            writerr.print("");
        }  
         
      
    }
        
    }
    public static void update_client_Email(File f3,File f4,String namee,String Email)throws IOException{
        try (Scanner scan = new Scanner(f3)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f4, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<100;c++){
          
                
                client.name[c]=scan.next();
                client.phone[c]=scan.next();
                client.Email[c]=scan.next();
               
      if (!scan.hasNext()){
         if (namee.equals(client.name[c])){ 
        br.write(client.name[c]+" "+client.phone[c]+" "+Email+"\n");
            break;
         }
          br.write(client.name[c]+" "+client.phone[c]+" "+client.Email[c]+"\n");
          break;
             
    }
    if (        namee.equals(client.name[c])){
    br.write(client.name[c]+" "+client.phone[c]+" "+Email+"\n");
        continue;
                }
br.write(client.name[c]+" "+client.phone[c]+" "+client.Email[c]+"\n");
      
            }  br.close();
                  try (PrintWriter writer = new PrintWriter(f3)) {
            writer.print("");writer.close();
        }
copy_to_clientfile_without(f4,f3,"0");
        try (PrintWriter writerr = new PrintWriter(f4)) {
            writerr.print("");
        }  
         
      
        }
        
    }
        public static void purchase_order(File f,File f2,String namee,int quantity)throws IOException{
        
           try (Scanner scan = new Scanner(f)) {
               DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);

Scanner input=new Scanner(System.in);

                int x=0;
            for (c=0;c<100;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
               
                
                    x=product.price[c];
                
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){     
             

        br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+(product.quantity[c]-quantity)+" "+product.price[c]+"\n");
        System.out.println("product name:"+product.name[c]+"\nquantity:"+quantity+"\ntotal price:"+(x*quantity)+"\n"+"Dated at:"+dtf.format(now));
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+(product.quantity[c]-quantity)+" "+product.price[c]+"\n");
              System.out.println("product name:"+product.name[c]+"\nquantity:"+quantity+"\ntotal price:"+(x*quantity)+"\n"+"Dated at:"+dtf.format(now));
    continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
product.price[c]=product.price[c]+3;
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
 public static void orders_report(File f,File f5)throws IOException{
          Scanner scan=new Scanner (f);
        Scanner input=new Scanner (f5);
        
         int c;int sum=0;
            for (c=0;c<100;c++){
                
                oldinventory.name[c]=input.next();
                product.name[c]=scan.next();
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
                sum=(oldinventory.quantity[c]-product.quantity[c]);
                System.out.println(product.name[c]+" was orderd:"+sum+" times");
               
                
            }   
    }
    public static void notification_by_Email(File f7,String namee)throws IOException, URISyntaxException{
        try  {
            Scanner scan = new Scanner(f7);
            int c;
            for (c=0;c<100;c++){
                //p[c]=new product();
                client.name[c]=scan.next();
                client.phone[c]=scan.next();
                client.Email[c]=scan.next();
                if (client.name[c].equals(namee)){
               System.out.println("the client Email is:"+client.Email[c]);
                URI uri= new URI("http://www.gmail.com");
   System.out.println("Web page opened in browser"); 
   java.awt.Desktop.getDesktop().browse(uri);
                }
    //break;}
   
                           
   }      } catch (Exception ex){
            
            }
    
    
}}
