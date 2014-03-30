
import java.io.UnsupportedEncodingException;
import java.util.List;

import retrofit.RestAdapter;
import retrofit.http.Body;
import retrofit.http.POST;

public class RetrofitPost {
private static final String API_URL = "http://interview-danish.herokuapp.com";
 // private static final String API_URL = "http://hmkcode.appspot.com";

  
 interface POSTInterface {
	  @POST("/books")
	  List<Object> postData(@Body people body);
	}

 

  public static void main(String... args) throws UnsupportedEncodingException {
   
	  // Create a very simple REST adapter which points the Your Site API endpoint.
    RestAdapter restAdapter = new RestAdapter.Builder()
        .setEndpoint(API_URL)
        .build();

    //Creating a raw json script
    //String json = "{\"name\":\"DAnish\",\"country\":\"inds\",\"twitter\":\"kpss\"}";
    
    //Or create an object it defaults it to a json 
    people danish =new people("rat","rest","rre","rrw","rres");
     
    //Uncomment this only when using a raw json obj  
    //TypedInput in = new TypedByteArray("application/json", json.getBytes("UTF-8"));
   
    // Create an instance of our GPOSTInterface API interface.
    POSTInterface  toPost = restAdapter.create(POSTInterface.class);
   
    //Pass "in" variable when using raw json
    List<Object> response = toPost.postData(danish);
    
    

   
    
    
      System.out.println(response.toString());
    		
  }
}
