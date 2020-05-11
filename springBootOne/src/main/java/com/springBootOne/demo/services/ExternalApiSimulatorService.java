package com.springBootOne.demo.services;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

import com.springBootOne.demo.Dao.dataConversion;
import com.springBootOne.demo.Model.JsonInputData;
import com.springBootOne.demo.Model.XmlInputData;



@Service
public class ExternalApiSimulatorService  implements dataConversion {
	XmlInputData xm =new XmlInputData ();
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	public String TEST_XML_STRING = xm.getXmlInput();
	
	JsonInputData js=new JsonInputData();


	@Override
	public String jsonToXml() {
		JSONObject obj = new JSONObject(js.getJsonInput());
		// converting json to xml
		String xml_data = XML.toString(obj);
		
		return xml_data;

	}

	@Override
	public String XmlToJson() {
		
		
		  String jsonPrettyPrintString = null ;
			 try {
		            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
		            jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
		           
		        } catch (JSONException je) {
		            System.out.println(je.toString());
		        }
			 
			 return jsonPrettyPrintString;

	}

	@Override
	public String XmlToSelfMed() {
		
		String autre=TEST_XML_STRING;
		
		autre.toString();

		String response=null;
		
		
		String []tableau=autre.split("[\\p{Punct} \\s \\p{Punct}  ]");
		
		
		
		 for (int i =0 ; i < tableau.length-1; i++) {  
			  
			   response+="\t"
			   		+ ""
			   		+ ""+ tableau[i] + ""
			   				+ ""
			   				+ "\t";
		
		}
		return  ""+ response ;

	}

	

}
