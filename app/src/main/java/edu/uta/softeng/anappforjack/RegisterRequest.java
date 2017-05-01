package edu.uta.softeng.anappforjack;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://anappforjack.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String stremail, String strUsername, String strPassword, String strPasswordCheck, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("email", stremail);
        params.put("username", strUsername);
        params.put("password", strPassword);
        params.put("passwordcheck", strPasswordCheck);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}