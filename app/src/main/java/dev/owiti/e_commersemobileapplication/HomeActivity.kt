package dev.owiti.e_commersemobileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.owiti.e_commersemobileapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        casViews()
        setupBottomNav()
    }


    fun casViews(){
        binding.fcvHome
        binding.bnvHome
    }
    fun setupBottomNav() {
        binding.bnvHome.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, HomeFragment()).commit()
                    true
                }
                R.id.shop-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ShopFragment()).commit()
                    true
                }
                R.id.favorite-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, FavoriteFragment()).commit()
                    true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ProfileFragment()).commit()
                    true
                }
                else -> false
            }
        }

    }
}