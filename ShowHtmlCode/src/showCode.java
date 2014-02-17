import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class showCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getHtml("http://www.google.com"));
	}
	
	public static String getHtml(String websiteurl)
	{
		String html="";
		try{
			URL url=null;
			url=new URL(websiteurl);
			URLConnection conn=url.openConnection();
			BufferedReader reader=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line="";
			
			while((line=reader.readLine())!=null){
				//txthtml.append(line+"\n");
				html+=(line)+"\n";
			}
			}
		catch(Exception e){
			return e.toString();
		}
	
		return html;
	
	}

}
