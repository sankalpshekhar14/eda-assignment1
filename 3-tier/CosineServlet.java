import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class CosneServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String name = requestUrl.substring("/eda/".length());
		
		Cosine cosine = DataStore.getInstance().getValue(radian);
		
		if(cosine != null){
			String json = "{\n";
			json += "\"radian\": " + JSONObject.quote(.getRadian()) + ",\n";
			json += "\"value\": " + JSONObject.quote(.getValue()) + ",\n";
			json += "}";
			response.getOutputStream().println(json);
		}
		else{
			//Error
			response.getOutputStream().println("{}");
		}
	}
	
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String value = request.getParameter("value");
		String radian = request.getParameter("radian")
		double val=Double.parseDouble(value);
		double rad=Double.parseDouble(radian)
		
		DataStore.getInstance().putPerson(new Cosine(rad));
	}