
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class haXiBiao {
final static int N=10;
public static String StatList(String str) {
StringBuffer sb = new StringBuffer();
HashMap<String ,Integer> has = new HashMap<String ,Integer> (); // ��һ����ϣ��
String[] slist = str.split("[^a-zA-Z\']+");
for (int i = 0; i < slist.length; i++) {
if (!has.containsKey(slist[i])) { // �����޴˵���
//	Pattern pa=Pattern.compile("[^a-zA-Z]+"); //������ʽ ƥ���ַ���
//	Matcher match=pa.matcher(slist[i]);
//	if(!match.matches())
has.put(slist[i], 1);
} 
else {//����У����ڽ�������1
has.put(slist[i],has.get(slist[i])+1 );
}
}

//����map
Iterator<String> iterator = has.keySet().iterator();
String a[]=new String[10];
int s[]=new int[10];


for(int i=0;i<N;i++)
{
iterator = has.keySet().iterator();
while(iterator.hasNext()){
String word = (String) iterator.next();
if(s[i]<has.get(word))
{
s[i]=has.get(word);
a[i]=word;
}
}
sb.append("���ʣ�").append(a[i]).append(" ����").append(has.get(a[i])).append("\r\n");
has.remove(a[i]);
}
return sb.toString();
}

public static void main(String[] args) {
// TODO Auto-generated method stub
String filePath = "F:\\javacx\\Harry Potter.txt";
String sz=writeFromFile.readTxtFile(filePath);
String ltxt=null;
System.out.println(ltxt=StatList(sz)); 
try {
writeFromFile.daochu(ltxt);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

}

 