package com.example.countriesoftheworld.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.countriesoftheworld.databinding.CountryCardBinding

class CountryCardAdapter(private val fragment: Fragment) :
    RecyclerView.Adapter<CountryCardAdapter.ViewHolder>() {

        private var countries: List<Country> = listOf()

    class ViewHolder(view: CountryCardBinding) : RecyclerView.ViewHolder(view.root) {
        val ivFlag = view.ivFlag
        val tvName = view.tvName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: CountryCardBinding =
            CountryCardBinding.inflate(LayoutInflater.from(fragment.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = countries[position]

        TODO("FINISH OFF")

    }

    override fun getItemCount(): Int {
        return countries.size
    }
}