package com.example.bankingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

    var navController: NavController?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.button_view_transactions).setOnClickListener(this)
        view.findViewById<Button>(R.id.button_send_money).setOnClickListener(this)
        view.findViewById<Button>(R.id.button_view_balance).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_view_transactions -> navController!!.navigate(R.id.action_mainFragment_to_viewTransactionFragment2)
            R.id.button_send_money -> navController!!.navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
            R.id.button_view_balance -> navController!!.navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }

}
