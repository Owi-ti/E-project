package dev.owiti.e_commersemobileapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.owiti.e_commersemobileapplication.databinding.ActivityHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding:ActivityHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
//         Inflate the layout for this fragment
//        binding=ActivityHomeBinding.inflate(layoutInflater)
//        binding.root
        return inflater.inflate(R.layout.fragment_home, container, false)
        displayImages()
    }

    fun displayImages(){
        val images = listOf(R.drawable.gglelogo, R.drawable.fblogo, R.drawable.ic_baseline_shopping_cart_24)
        val adapter=HomeRvAdapter(images)
        var image=Home("")
}

}
