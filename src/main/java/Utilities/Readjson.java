package Utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Readjson {

	
public static JSONObject testdata;



public JSONObject readjson(String path) throws IOException, ParseException {
	
		
	JSONParser J_parser = new JSONParser();
	
   FileReader file = new FileReader(path);
   
   return testdata = (JSONObject) J_parser.parse(file);
	
	
	
}

public JSONObject loadTestData(String filepath) throws IOException, ParseException {
	
	return testdata =readjson(filepath);
}

}
