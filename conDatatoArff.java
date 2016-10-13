import java.util.StringTokenizer;
import java.io.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class conDatatoArff
{
	private static int ROW = 9835;
	public static void main(String []args)
	{
		FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        try
        {
        	fis = new FileInputStream("data.txt");
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            for(int i = 0;i < ROW;i++)
			{
				if((line = br.readLine()) != null)
				{
					StringTokenizer st = new StringTokenizer(line, ",");
					while(st.hasMoreTokens())
					{
						String tmp = "";
						int k = i+1;
						tmp = tmp+k+","+st.nextToken()+'\n';
						try
						{
							File file =new File("finalGroceryArff.txt");
							FileWriter writer = new FileWriter(file,true);
							try 
							(BufferedWriter buffer = new BufferedWriter(writer)) 
							{
									buffer.write(tmp);
									buffer.close();
							}
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
					}
				}
			}
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
		try
		{
			fis = new FileInputStream("Attributes.txt");
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null, str = ""; 
			while((line = br.readLine()) != null)
			{
				str = str+line.trim()+",";
			}
			System.out.print(str);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}