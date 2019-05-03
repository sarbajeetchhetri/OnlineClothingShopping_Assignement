package fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.online.MainActivity;
import com.online.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment implements View.OnClickListener {


    Button btnRegister;
    EditText etUsername, etPassword;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        btnRegister = view.findViewById(R.id.btnRegister);
        etPassword = view.findViewById(R.id.etPassword);
        etUsername = view.findViewById(R.id.etUserName);

        btnRegister.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        registerUser(v.getContext());
    }
    private void registerUser(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("User", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("username", etUsername.getText().toString());
            editor.putString("password", etPassword.getText().toString());
            editor.commit();
            Toast.makeText(context, "Sucessfully Registered", Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
