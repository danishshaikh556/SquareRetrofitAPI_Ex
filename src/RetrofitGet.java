
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;

public class RetrofitGet {
private static final String API_URL = "http://interview-danish.herokuapp.com";
 // private static final String API_URL = "http://hmkcode.appspot.com";

  

  interface GETInterface {
    @GET("/books")
   JsonElement getData();
    
  }
  
  

  public static void main(String... args) throws JSONException {
    
	  // Create a very simple REST adapter which points the Your Site API  endpoint.
    RestAdapter restAdapter = new RestAdapter.Builder()
        .setEndpoint(API_URL)
        .build();

    // Create an instance of our GETInterface API interface.
    GETInterface toGet = restAdapter.create(GETInterface.class);

    // Fetch and print a list of the contributors to this library.
    JsonElement contributors = toGet.getData();
    
      String a =contributors.toString();
     JSONObject da = new JSONObject(a);
     JSONArray dan = da.getJSONArray("books");
   
      System.out.println(dan.get(6).toString());
    		 
  }
}