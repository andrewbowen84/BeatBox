package com.andrewbowen.android.beatbox

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel (private val beatBox: BeatBox) : BaseObservable() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }
    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }
    @get:Bindable//
    val title: String?
        get() = sound?.name



}