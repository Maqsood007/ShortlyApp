package com.task.shortlyapp.ui.shorteninglink

import com.task.shortlyapp.repository.locale.entity.ShortlyLink

interface ShortyLinkView {
    fun triggerShorty()
    fun onShortyError(message: String?)
    fun emptyURLError()
    fun getEnteredLink(): String
    fun onDelete(shortlyLink: ShortlyLink)
    fun onCopy(shortlyLink: ShortlyLink)
}
