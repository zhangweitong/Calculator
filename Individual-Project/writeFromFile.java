import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
//import java.io.Reader; 
//���ı��ĵ��ж���
public class writeFromFile 
{
		public static String readTxtFile(String filePath)
		{ 
			try 
			{ 
				String encoding="GBK"; 
				File file=new File(filePath); 
				if(file.isFile() && file.exists())
				{ //�ж��ļ��Ƿ���� 
					InputStreamReader read = new InputStreamReader( 
					new FileInputStream(file),encoding);//���ǵ������ʽ 
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
					  System.out.println("�Ҳ���ָ�����ļ�"); 
					 } 
			} catch (Exception e) { 
			  System.out.println("��ȡ�ļ����ݳ���"); 
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



