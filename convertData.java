import java.io.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class convertData
{
	public static int COL = 172;
	public static int ROW = 9835;
	public static void main(String []args)
	{
		int [][]arr = new int[ROW][COL];
		for(int i = 0;i < ROW;i++)
		{
			for(int j = 0;j < COL;j++)
			{
				arr[i][j] = 0;
				
			}
		}
		//System.out.println("check1");
		FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
		try 
		{
            fis = new FileInputStream("Numericaldata.txt");
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
			//System.out.println("check2");
			for(int i = 0;i < ROW;i++)
			{
				//Read 1st line of data
				if((line = br.readLine()) != null)
				{
					StringTokenizer st = new StringTokenizer(line, ",.;:\"");
					while(st.hasMoreTokens())
					{
						String tmp = st.nextToken();
						int j = Integer.parseInt(tmp);
						arr[i][j] = 1;
					}
				}
			}
			//System.out.println("check3");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		String line = "";
		for(int i = 0;i < ROW;i++)
		{
			for(int j = 0;j < COL;j++)
			{
				line = line+arr[i][j];
				if(j+1 != COL)
				{
					line = line+",";
				}
			}
			System.out.println(i);
			try
			{
				File file =new File("NumericalDataFinal.txt");
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
			line = "";
		}
	}
}