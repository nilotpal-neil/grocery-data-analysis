package findattributes;

import java.io.*;
//import java.net.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class FindNumericAttributes 
{
 
    public void getNumerical(String fileName)
    {
        FileInputStream fis = null,fir = null;
        DataInputStream dis = null,dir = null;
        BufferedReader br = null, bi = null;
        try 
	{
            fir = new FileInputStream("data.txt");
            dir = new DataInputStream(fir);
            bi = new BufferedReader(new InputStreamReader(dir));
            String line = null;
            while((line = bi.readLine()) != null)
	    {
		try
                {
                    fis = new FileInputStream(fileName);
                    dis = new DataInputStream(fis);
                    br = new BufferedReader(new InputStreamReader(dis));
                    String word = "";
                    //StringTokenizer st = new StringTokenizer(line, ",.;:\"");
                    for(int i = 0;i < 172;i++)
                    {
                        if((word = br.readLine()) != null)
                        {
                                String num = ""+i;
                                line = line.replaceAll(word, num);
                        }
                        else	
                                break;
                    }
                    try
                    {
                        File file =new File("output.txt");
                        FileWriter writer = new FileWriter(file,true);
                        try 
                        (BufferedWriter buffer = new BufferedWriter(writer)) 
                        {
                                line = line+'\n';
                                buffer.write(line);
                                buffer.close();
                        }
                    }
                    catch(Exception ex)
                    {
                            ex.printStackTrace();
                    }
                }
                catch(Exception ex)
                {
                        ex.printStackTrace();
                }
            }
        } 
	catch (FileNotFoundException e) 
	{
            e.printStackTrace();
        } 
        catch (IOException e) 
	{
            e.printStackTrace();
        } 
        finally
	{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
 //     return wordList;
    }


        public static void main(String a[])
        {
            FindNumericAttributes getNum = new FindNumericAttributes();
            getNum.getNumerical("Attributes.txt");
        }
}
