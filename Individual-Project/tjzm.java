import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

  public class tjzm
  {
     public static void main(String[] args) throws IOException 
	 {

        String fileName ="F:abc.txt";
		//��ȡ�ı��ļ�
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line =bufferedReader.readLine();
        Map map=new HashMap();//�������ݳ��ֵĴ����ļ���
		
//������������
        for (int i = 0; i < line.length(); i++) 			
        {
            char a=changeLowwer(line.charAt(i));
            //ȡ�������ַ�,����Ǵ�д����ĸ����changelowwer()����ת��ΪСд��ĸ

            if(isSingleWord(a))
            {
                if(map.get(a)!=null)//�������ַ��Ѿ�����
                {
                    int num=Integer.parseInt(map.get(a).toString());
                    map.put(a,num+1);//������һ��
                }
				else
                {
                    map.put(a,1);//�������ַ������ھ�Ϊ1
                }
            }
        }
        Object[] aa=map.keySet().toArray();//ȡ���������е�key
        int sum=0;
        int []wz=new int[aa.length];
        for(int i=0;i<aa.length;i++)//�ٱ���
        {
            
            sum=sum+(int)(map.get(aa[i]));
//            System.out.println(aa[i]+"������"+map.get(aa[i])+"��");
        }
        for(int i=0;i<aa.length-1;i++)//�ٱ���
        {
            for(int j=i+1;j<aa.length;j++)
            {
                if((int)map.get(aa[i])<(int)map.get(aa[j]))//ѡ������
                {
                    char temp=(char)aa[i];
                    aa[i]=aa[j];
                    aa[j]=temp;
                }
            }
        }
		
        for(int i=0;i<aa.length;i++)//�ٱ���
        {           
            System.out.println(aa[i]+"����Ƶ��"+String.format("%6.2f%%", ((int)map.get(aa[i]))/(double)sum*100));
        }
		
        while (line!=null){
            //System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
    }

    static boolean isSingleWord(char a)//�жϻ�ȡ���ַ��Ƿ�����ĸ
    {
        if(a>='a'&&a<='z'||a>='A'&&a<='Z')
        {
            return true;
        }
        return false;
    }
	
    static char changeLowwer(char a)//ת����д��ĸΪСд
    {
        if(a>='A'&&a<='Z')
        {
            return (char)(a-'A'+'a');
        }
        return a;
    }
}



