package com.icaboalo.devfapp.io.model

/**
 * Created by icaboalo on 5/05/16.
 */
class OptionApiModel{

    constructor(name: String?, image: String?, itemsCount: Int?) {
        this.name = name
        this.image = image
        this.itemsCount = itemsCount
    }

    var name: String? = null

    var image: String? = null

    var itemsCount: Int? = null
}