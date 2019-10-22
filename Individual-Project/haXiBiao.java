
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class haXiBiao {
final static int N=10;
public static String StatList(String str) {
StringBuffer sb = new StringBuffer();
HashMap<String ,Integer> has = new HashMap<String ,Integer> (); // 打开一个哈希表
String[] slist = str.split("[^a-zA-Z\']+");
for (int i = 0; i < slist.length; i++) {
if (!has.containsKey(slist[i])) { // 若尚无此单词
//	Pattern pa=Pattern.compile("[^a-zA-Z]+"); //正则表达式 匹配字符串
//	Matcher match=pa.matcher(slist[i]);
//	if(!match.matches())
has.put(slist[i], 1);
} 
else {//如果有，就在将次数加1
has.put(slist[i],has.get(slist[i])+1 );
}
}

//遍历map
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
sb.append("单词：").append(a[i]).append(" 次数").append(has.get(a[i])).append("\r\n");
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

 