package edu.uta.softeng.anappforjack;

import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class RegisterRequest extends StringRequest {

    private static final String URL_REGISTER_REQUESTER = "anappforjack.000webhostapp.com/Register.php";
    private java.util.Map<String,String> params;

    public RegisterRequest (String email, String username, String password,com.android.volley.Response.Listener<String> listener){
        super(Method.POST, URL_REGISTER_REQUESTER, listener,null);
        params = new HashMap<>();
        params.put("email",email);
        params.put("username",username);
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
