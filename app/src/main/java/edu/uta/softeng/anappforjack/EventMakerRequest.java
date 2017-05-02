package edu.uta.softeng.anappforjack;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class EventMakerRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://anappforjack.000webhostapp.com/EventMaker.php";
    private Map<String, String> params;

    public EventMakerRequest(String strEvent, String strLocation, String strTime, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("event", strEvent);
        params.put("location", strLocation);
        params.put("time", strTime);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}