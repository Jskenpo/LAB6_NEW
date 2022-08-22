package com.plataformas.activityprincipal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PlaylistFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PlaylistFragment : Fragment(R.layout.fragment_playlist) {
    private lateinit var imageCount: ImageView
    private lateinit var songs: TextView
    private var count: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        imageCount = view.findViewById(R.id.Add_Playlist)
        songs = view.findViewById(R.id.LikedSongs)
        setListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setListeners() {
        imageCount.setOnClickListener {
            count++
            songs.text=count.toString()+" Songs"
        }
    }


}