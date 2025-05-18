package com.example.kotlinfragmentsapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context,
            "onAttach() is called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,
            "onCreate() is called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Toast.makeText(context,
            "onCreateView() is called",
            Toast.LENGTH_SHORT).show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Toast.makeText(context,
            "onStart() is called",
            Toast.LENGTH_SHORT).show()

        super.onStart()
    }

    override fun onResume() {

        Toast.makeText(context,
            "onResume() is called",
            Toast.LENGTH_SHORT).show()

        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(context,
            "onPause() is called",
            Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {

        Toast.makeText(context,
            "onStop() is called",
            Toast.LENGTH_SHORT).show()

        super.onStop()
    }

    override fun onDestroyView() {
        Toast.makeText(context,
            "onDestroyView() is called",
            Toast.LENGTH_SHORT).show()
        super.onDestroyView()
    }

    override fun onDestroy() {

        Toast.makeText(context,
            "onDestroy() is called",
            Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onDetach() {
        Toast.makeText(context,
            "onDetach() is called",
            Toast.LENGTH_SHORT).show()
        super.onDetach()
    }

}