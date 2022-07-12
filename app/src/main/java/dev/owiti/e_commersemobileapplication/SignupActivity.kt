package dev.owiti.e_commersemobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.owiti.e_commersemobileapplication.databinding.ActivityLoginBinding
import dev.owiti.e_commersemobileapplication.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            validateSign()

        }
        binding.tvlogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


    }

    fun validateSign() {
        var name = binding.etJina.text.toString()
        var mail = binding.etEmail.text.toString()
        var pass = binding.etPassword.text.toString()


        if (name.isBlank()) {
            binding.tilName.error = "firstname_required"
        }
        if (mail.isBlank()) {
            binding.tilEmail.error = "email_required"
        }
        if (pass.isBlank()) {
            binding.tilPassword.error = "password_required"
        }

//      if (pass!= ) {
//          binding.tilPassword.error="password do not match"       }
//    }
    }
}


