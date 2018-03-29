import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.text.AbstractDocument.BranchElement;

public class KTthuvien {
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
//		Calendar cd = Calendar.getInstance();
//		System.out.println(date.toString());
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//		System.out.println(df.format(date));
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		System.out.println(sdf.format(date));
//		System.out.println(cd.get(cd.DATE) +"/"+(cd.get(cd.MONTH)+1)+"/"+cd.get(cd.YEAR));
//		System.out.println(cd.getTime());
		try {
			FileInputStream fis = new FileInputStream("C:\\gh.txt");
			InputStreamReader ips = new InputStreamReader(fis);
			BufferedReader bs = new BufferedReader(ips);
			StringBuilder sb = new StringBuilder();
			String line = bs.readLine();
			while(line != null)
			{
				sb.append(line);
				sb.append("\n");
				line = bs.readLine();
			}
			System.out.println(sb.toString());
			bs.close();
			ips.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
