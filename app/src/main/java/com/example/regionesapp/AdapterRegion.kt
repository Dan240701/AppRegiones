package com.example.regionesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class AdapterRegion(context: Context, val lista:List<RegionLis>):
ArrayAdapter<RegionLis>(context,0,lista){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        //definimos la vista del elmento
        var itemView = convertView

        //indexamos todos los elementos que se encuentran en esa vista
        if (itemView == null)
            itemView = LayoutInflater.from(context)
                .inflate(android.R.layout.simple_list_item_2, parent, false)
        //Obtenemos el elemento de la lista
        val region = lista[position]

        //Personalizamos la vista
        itemView!!.findViewById<TextView>(android.R.id.text1)?.setText(region.region)



        return itemView


    }

}