 
package javaapplication17;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static javaapplication17.admin.*;
import static javaapplication17.client.*;
import static javaapplication17.oldinventory.*;
import static javaapplication17.product.*;


public class JavaApplication17 {

    /**
     *
     * @param f
     * @param f2
     * @param namee
     * @throws java.io.IOException
     * 
     */
  
    public static void copy_to_file_without(File f,File f2,String namee)throws IOException{
        try (Scanner scan = new Scanner(f)) {
            int c; int i; 
            FileWriter fr = new FileWriter(f2, true);
BufferedWriter br = new BufferedWriter(fr);
Scanner input=new Scanner(System.in);

                
            for (c=0;c<10;c++){
          
                
                product.name[c]=scan.next();
                product.type[c]=scan.next();
                product.supplier[c]=scan.next();
                product.date[c]=scan.nextInt();
                product.date2[c]=scan.nextInt();
                product.quantity[c]=scan.nextInt();
                product.price[c]=scan.nextInt();
      if (!scan.hasNext()){
         if (namee.equals(product.name[c])){ 
        
            break;
         }
          br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
          break;
             
    }
    if (        namee.equals(product.name[c])){
    
        continue;
                }
br.write(product.name[c]+" "+product.type[c]+" "+product.supplier[c]+" "+product.date[c]+" "+product.date2[c]+" "+product.quantity[c]+" "+product.price[c]+"\n");
            //System.out.println(product.name[c]+"  "+product.type[c]+"  "+product.supplier[c]+"  "+product.date[c]+"  "+product.date2[c]+"  "+product.quantity[c]+"\n");
//System.out.println(c);
            } 
             
       br.close();

    }}
   
   
    public static void main(String[] args) throws FileNotFoundException, IOException, URISyntaxException {
        Scanner input=new Scanner(System.in);
       
     File f=new File("product.txt");
     File f2=new File("tmp.txt");
     File f3=new File ("client.txt");
     File f4=new File ("clienttmp.txt");
     File f5=new File ("oldinventory.txt");
     File f6=new File ("oldinventorytmp.txt");
     File f7=new File ("client.txt");
     File f8=new File ("admin.txt");
     File f9=new File ("order.txt");
     File f10=new File("mail.txt");
             
     try{  

        }
     
catch(Exception ex) {
       
}
   
    Scanner scan=new Scanner(f8);
    System.out.println("1 for admin module\n2 for client module");
     int x=input.nextInt();
     if (x==1){
         System.out.println("Enter username and password");
         String name=input.next() ;
         String password=input.next();
         if (name.equals(scan.next())&&password.equals(scan.next())){
             System.out.println("1-add product");
             System.out.println("2-delete product");
             System.out.println("3-search product by name");
             System.out.println("4-search product by date of production");
             System.out.println("5-search product by date of Expiration");
             System.out.println("6-update product type");
             System.out.println("7-delete product type");
             System.out.println("8-update product supplier");
             System.out.println("9-delete product supplier");
             System.out.println("10-print product report and statics");
             System.out.println("11-add offer for product");
             System.out.println("12-print profit report");
             int i=input.nextInt();
             switch (i){
                 case 1:{
                     System.out.println("Enter the product info\nname type supplier date of production date of expiration quantity price:");
                     add_product(f);
                     System.out.println("confirm");
                     add_product(f5);
                     
                 }break;
                 case 2:{
                     System.out.println("Enter the product name ");
                     String namee=input.next();
                     delete_product(f,f2,namee);
                     delete_product(f5,f6,namee);
                 }break;
                 case 3:{
                     System.out.println("Enter the product name:");
                     String namee=input.next();
                     search_by_name(f,namee);
                     
                 }break;
                 case 4:{
                    System.out.println("Enter the product date of Production:");
                     search_by_date(f);
                     
                 }break;
                 case 5:{
                      System.out.println("Enter the product date of Expiration:");
                     search_by_date2(f);
                 }break;
                 case 6:{
                     System.out.println("Enter product name:");
                     String namee=input.next();
                     System.out.println("Enter the new type:");
                     String type=input.next();
                     update_product_type( f, f2, namee, type);
                     update_product_type( f5, f6, namee, type);
                 }break;
                 case 7:{
                     System.out.println("Enter the product name:");
                     String namee=input.next();
                     delete_product_type( f, f2, namee);
                     delete_product_type( f5, f6, namee);
                     
                 }break;
                 case 8:{
                      System.out.println("Enter product name:");
                     String namee=input.next();
                     System.out.println("Enter the new supplier:");
                     String supplier=input.next();
                     update_product_type( f, f2, namee, supplier);
                     update_product_type( f5, f6, namee, supplier);
                 }break;
                 case 9:{
                      System.out.println("Enter the product name:");
                     String namee=input.next();
                     delete_product_type( f, f2, namee);
                     delete_product_type( f5, f6, namee);
                 }break;
                 case 10:{
                     System.out.println("Enter the product name:");
                     String namee=input.next();
                     report_for_product(f, f5, namee);
                 }break;
                 case 11:{
                     System.out.println("Enter the date of production and expiration and new price:");
                     int date=input.nextInt();
                     int date2=input.nextInt();
                     int newprice=input.nextInt();
                     add_offer( f, f2, date, date2, newprice);
                 }break;
                 case 12:{
                     
                     
                         try{  
profit_report( f, f5);
        }
     
catch(Exception ex) {
       
}
                 
                 
             }break;
             }}
         else {
             System.out.println("invalid username or password");
         }
             }
     else if (x==2){
         System.out.println("1-register on the system:");
         System.out.println("2-Edit your data:");
         System.out.println("3-request order:");
         System.out.println("4-generate orders report:");
         int o=input.nextInt();
         switch (o){
             case 1:{
                 System.out.println("Enter name phone Email:");
                 register_client( f3);
             }break;
             case 2:{
                 System.out.println("Enter your name then your phone and email:");
                 String namee=input.next();
                 String phone=input.next();
                 String mail=input.next();
                 update_client_phone( f3, f4, namee,phone);
                 update_client_Email( f3, f4, namee,mail);
             }break;
             case 3:{
                 System.out.println("Enter name of product and quantity:");
                 String namee=input.next();
                 int quantity =input.nextInt();
                 purchase_order( f, f2, namee, quantity);
              
                 FileWriter fr = new FileWriter(f9, true);
BufferedWriter br = new BufferedWriter(fr);
//FileWriter ff=new FileWriter(f10,true);
//BufferedWriter bf=new BufferedWriter (ff);
//Scanner input=new Scanner(System.in);
int i;
for (i=0;i<1;i++){
 
 
br.write(namee+" "+quantity+"\n");

        br.close();
    }
System.out.println("Enter your name:");
String nameee=input.next();
notification_by_Email( f7, nameee);
             }break;
            case 4:{
                           try  {
        Scanner scann = new Scanner(f9) ;
         int c;
            for (c=0;c<100;c++){
                
                product.name[c]=scann.next();
                product.quantity[c]=scann.nextInt();
                System.out.println(product.name[c]+" "+product.quantity[c]);
                PrintWriter writer = new PrintWriter(f9);
            writer.print("");
            writer.close();
            }                    
            
        
             }
                    catch(Exception ex) {}
         }break;
            
         
         }
}}
}