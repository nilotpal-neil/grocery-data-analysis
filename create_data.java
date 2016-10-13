import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class findUniqueAttributes {
 
    public List<String> getDistinctWordList(String fileName)
	{
 
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        List<String> wordList = new ArrayList<String>();
        try {
            fis = new FileInputStream(fileName);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, ",.;:\"");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken().toLowerCase();
                    if(!wordList.contains(tmp)){
                        wordList.add(tmp);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
        return wordList;
    }
     
    public static void main(String a[])
	{
        findAttributes distFw = new findAttributes();
        List<String> wordList = distFw.getDistinctWordList("data.txt");
        for(String str:wordList){
            System.out.println(str);
        }
    }
}

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