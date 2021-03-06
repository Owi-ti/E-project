package dev.owiti.e_commersemobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.owiti.e_commersemobileapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            validateLogin()
//            startActivity(Intent(this, HomeActivity::class.java))
//            finish()
        }

        binding.tvsignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }

    fun validateLogin() {
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilEmail.error = "email_required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Password required"
            error = true
        }
        if (!error) {

        }
    }
}
