
import Graphs.Arista;
import Graphs.ListaSimple;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;



/**
 *
 * @author esteb
 */
public class Util {
    
    
    public static final String ERROR = "Error";

    public static String loadTxt(){
        JFileChooser jf = new JFileChooser();

        File file = new File(System.getProperty("user.home") + File.separator + "Desktop");
        
        jf.setCurrentDirectory(file);
        
        int value = jf.showOpenDialog(null);
        
        if(value == JFileChooser.APPROVE_OPTION){
            
            File selectedFile = jf.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            return filePath;
        }
        else{
            return ERROR;
        }
    }
    
    public static ListaSimple read(){
        String filePath = loadTxt();
        
        try{
            FileReader fileR = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileR);
            
            String line;
            ListaSimple adyList = new ListaSimple();
            while((line = reader.readLine()) != null){
                if(line.contains(",")){
                    String[] array = line.split(",");
                    Arista edge = new Arista(array[0], array[1]);
                    adyList.append(edge);
                }
            } 
            return adyList;
        }
        catch(IOException e){
            System.out.println(e);
            return null;
        }
    }
    
    public static void readUsers(){
        String filePath = loadTxt();
        
        try{
            FileReader file = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(file);
            
            boolean run = true;
            String line;
            while(run){      
                line = reader.readLine();
                if(!line.equals("relaciones") && !line.equals("usuarios")){
                    System.out.println(line);
                }
                else if(line.equals("relaciones")){
                    run = false;
                }
            }
            
        }
        catch(Exception error){
            System.out.println(error);
        }  
    }
    
    public static void readRelations(){
        String filePath = loadTxt();
        
        try{
            FileReader file = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(file);
            
            boolean run = true;           
            boolean print = false;
            
            String line;
            while(run){      
                line = reader.readLine();
                if(line == null){
                    run = false;
                }
                else if(line.equals("relaciones")){
                    print = true;
                }
                else if(print){
                    String[] array = line.split(",");
                    System.out.println(array[0] + " " + array[1]);
                }
            }
            
        }
        catch(Exception error){
            System.out.println(error);
        }  
    }
    
    public static void write(){
        String filePath = loadTxt();
        
        try{
            FileWriter fw = new FileWriter(filePath, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            fw.write("\nHolaaaaaaaaaa");
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void writeTxt(String str){
        String filePath = loadTxt();
        
        try{
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            fw.write("\n" + str);
            fw.close();
        }
        catch(Exception error){
            System.out.println(error);
        }
    }
    
    
    
    
}

    

