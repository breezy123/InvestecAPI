package InvestecAPI.co.za.tools;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class APIUtility {

    public static URL url;
    public static HttpURLConnection conn;
    public static JSONObject jsnobject;
    public static JSONArray jsonArray;
    public static int count =0;
    public static  ArrayList<String> listdata;

    public static int GetResponseStatus()
    {
        try
        {
            url = new URL("https://swapi.dev/api/people/?format=json");

            conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            return conn.getResponseCode();
        }
        catch(Exception ex)
        {
            System.out.print("[ERROR]. Failed to process Get Request Status");
            return 0;
        }
    }

    public static String JsonText(){

        try
        {
            int count=0;
            String inline ="";
            Scanner sc = new Scanner(url.openStream());

            while(sc.hasNext())
            {
                inline+=sc.nextLine();
                count++;
            }

            sc.close();

            System.out.println(inline);
            return inline;
        }
        catch(Exception ex)
        {
            return null;
        }
    } //get JSON format data

    public static boolean GettAllData(){

        try
        {
            //Converting jsonData string into JSON object
            jsnobject = new JSONObject(JsonText());
            jsonArray = jsnobject.getJSONArray("results");

            listdata = new ArrayList<String>();

            //Checking whether the JSON array has some value or not
            if (jsonArray != null) {

                //Iterating JSON array
                for (int i=0;i<jsonArray.length();i++){

                    //Adding each element of JSON array into ArrayList
                    listdata.add(jsonArray.get(i).toString());
                    count++;
                }
            }

            System.out.println("Each element of ArrayList");
            for(int i=0; i<listdata.size(); i++) {
                //Printing each element of ArrayList
                System.out.println(listdata.get(i));

            }

            return true;
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
            return false;
        }
    }

}
