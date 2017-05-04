package edu.uta.softeng.anappforjack;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

//Class for linking initial login creditentials to php file @ anappforjack.000webhostapp.com by Julian Ducharme 1001014461

public class LoginRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://anappforjack.000webhostapp.com/Login.php";
    private Map<String, String> params;

    public LoginRequest (String strUsername, String strPassword, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", strUsername);
        params.put("password", strPassword);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}