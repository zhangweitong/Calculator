import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
//import java.io.Reader; 
//从文本文档中读入
public class writeFromFile 
{
		public static String readTxtFile(String filePath)
		{ 
			try 
			{ 
				String encoding="GBK"; 
				File file=new File(filePath); 
				if(file.isFile() && file.exists())
				{ //判断文件是否存在 
					InputStreamReader read = new InputStreamReader( 
					new FileInputStream(file),encoding);//考虑到编码格式 
					BufferedReader bufferedReader = new BufferedReader(read); 
					String lineTxt = null;
					String lineText="";
					while((lineTxt = bufferedReader.readLine()) != null)
					{ 
					lineText+=(lineTxt); 
				    } 
			      read.close(); 
			      return lineText;
			    }
					 else
					 { 
					  System.out.println("找不到指定的文件"); 
					 } 
			} catch (Exception e) { 
			  System.out.println("读取文件内容出错"); 
			  e.printStackTrace(); 
			} 
		return null;
	} 

	public static void daochu(String a) throws IOException
	{
		File file=new File("F:\\abc.txt");
		FileOutputStream fos=new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.append(a);
		osw.close();
		fos.close();
	}
}



