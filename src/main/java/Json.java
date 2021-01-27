import org.json.JSONObject;

public class Json {

    public Json(){
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
        System.out.println(jo.toString());
    }

}
