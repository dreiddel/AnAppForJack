package edu.uta.softeng.anappforjack;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://anappforjack.000webhostapp.com/storage/h14/694/1470694/public_html/Register.php";
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