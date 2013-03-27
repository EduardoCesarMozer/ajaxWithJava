import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Eduardo
 * 
 */
public class AjaxComboBoxXmlServlet extends HttpServlet
{
	private static final long serialVersionUID = 1461740814960522894L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServerException, IOException
	{
		String strEnteredKey     = request.getParameter("option");
		
		StringBuffer responseXML = null;
		
		if (!strEnteredKey.isEmpty() && strEnteredKey != null)
		{
			int num = Integer.parseInt(strEnteredKey);
			
			responseXML = new StringBuffer("\r\n<NUMBERS_MULTIPLIED>");
			responseXML.append("\r\n<VALUE>" + num * 1 + "</VALUE>");
			responseXML.append("\r\n<VALUE>" + num * 10 + "</VALUE>");
			responseXML.append("\r\n<VALUE>" + num * 100 + "</VALUE>");
			responseXML.append("\r\n<VALUE>" + num * 1000 + "</VALUE>");
			responseXML.append("\r\n<VALUE>" + num * 10000 + "</VALUE>");
			responseXML.append("\r\n</NUMBERS_MULTIPLIED>");
			
			System.out.println("\n" + responseXML.toString());
			
			response.setContentType("text/xml");
			response.setHeader("Cache-Control", "no-cache");
			response.getWriter().write(responseXML.toString());
		}
		else
		{
			responseXML = new StringBuffer("\r\n<NUMBERS_MULTIPLIED>");
			responseXML.append("\r\n<VALUE>?</VALUE>");
			responseXML.append("\r\n</NUMBERS_MULTIPLIED>");
			
			System.out.println("\n" + responseXML.toString());
			
			response.setContentType("text/xml");
			response.setHeader("Cache-Control", "no-cache");
			response.getWriter().write(responseXML.toString());
		}
	}
}
