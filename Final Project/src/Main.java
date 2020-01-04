import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main
{
	public static void main(String[] args) throws Exception 
	{
		ArrayList<Keyword> keywords = new ArrayList<Keyword>();
		keywords.add(new Keyword("Jordan",5));
		keywords.add(new Keyword("Puma",5));
		keywords.add(new Keyword("Nike",5));
		keywords.add(new Keyword("Under armour",5));
		keywords.add(new Keyword("vans",5));
		keywords.add(new Keyword("Balenciaga",5));
		keywords.add(new Keyword("聯名",10));
		keywords.add(new Keyword("限定",10));
		keywords.add(new Keyword("配色",10));
		keywords.add(new Keyword("Collab",5));
		keywords.add(new Keyword("球鞋",5));
		ArrayList<String>url=new ArrayList<String>();
		ArrayList<WebTree>wbts=new ArrayList<WebTree>();
		System.out.println("hey");
		url.add("https://www.nike.com/tw/zh_tw/c/jordan");
		url.add("http://soslab.nccu.edu.tw/Courses.html");
		url.add("https://www.underarmour.tw/");
		url.add("https://hk.puma.com/");
		url.add("http://www.vanstaiwan.com/items.php?for=men&type=shoes");
		System.out.println("yeet");
		for(String i:url) 
		{
			wbts.add(new WebTree(new WebPage(i)));
		}
		for(WebTree wbt:wbts) 
		{
			wbt.setPostOrderScore(keywords);
			wbt.eularPrintTree();
		}
		
	}
	
}
