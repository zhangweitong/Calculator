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
		//读取文本文件
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line =bufferedReader.readLine();
        Map map=new HashMap();//保存数据出现的次数的集合
		
//遍历测试数据
        for (int i = 0; i < line.length(); i++) 			
        {
            char a=changeLowwer(line.charAt(i));
            //取出单个字符,如果是大写的字母调用changelowwer()函数转换为小写字母

            if(isSingleWord(a))
            {
                if(map.get(a)!=null)//如果这个字符已经存在
                {
                    int num=Integer.parseInt(map.get(a).toString());
                    map.put(a,num+1);//数量加一次
                }
				else
                {
                    map.put(a,1);//如果这个字符不存在就为1
                }
            }
        }
        Object[] aa=map.keySet().toArray();//取出集合所有的key
        int sum=0;
        int []wz=new int[aa.length];
        for(int i=0;i<aa.length;i++)//再遍历
        {
            
            sum=sum+(int)(map.get(aa[i]));
//            System.out.println(aa[i]+"出现了"+map.get(aa[i])+"次");
        }
        for(int i=0;i<aa.length-1;i++)//再遍历
        {
            for(int j=i+1;j<aa.length;j++)
            {
                if((int)map.get(aa[i])<(int)map.get(aa[j]))//选择排序
                {
                    char temp=(char)aa[i];
                    aa[i]=aa[j];
                    aa[j]=temp;
                }
            }
        }
		
        for(int i=0;i<aa.length;i++)//再遍历
        {           
            System.out.println(aa[i]+"出现频率"+String.format("%6.2f%%", ((int)map.get(aa[i]))/(double)sum*100));
        }
		
        while (line!=null){
            //System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
    }

    static boolean isSingleWord(char a)//判断获取的字符是否是字母
    {
        if(a>='a'&&a<='z'||a>='A'&&a<='Z')
        {
            return true;
        }
        return false;
    }
	
    static char changeLowwer(char a)//转化大写字母为小写
    {
        if(a>='A'&&a<='Z')
        {
            return (char)(a-'A'+'a');
        }
        return a;
    }
}



