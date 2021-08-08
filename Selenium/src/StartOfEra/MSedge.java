package StartOfEra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MSedge 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver e = new EdgeDriver();
		e.get("https://www.trivago.in/?sem_keyword=trivago%20login&sem_creativeid=72567820491171&sem_matchtype=bp&sem_network=o&sem_device=c&sem_campaignid=191340819&sem_adgroupid=3930406454&sem_targetid=72568182224811&cip=9119110005&msclkid=0590528e54211f6295dc32aaae382d72");
		e.get("https://www.amazon.in/ref=as_li_ss_tl?ie=UTF8&linkCode=ll2&tag=enin-edge-topsites-curate-ana-21&linkId=fbedcb44d04a4bae8eae32722a2f41c2&language=en_IN");
	}

}
