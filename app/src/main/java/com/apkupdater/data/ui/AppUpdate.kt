package com.apkupdater.data.ui

import android.net.Uri

data class AppUpdate(
	val name: String,
	val packageName: String,
	val version: String,
	val versionCode: Long,
	val source: Source,
	val iconUri: Uri = Uri.EMPTY,
	val link: String = "",
	val isInstalling: Boolean = false,
	val id: Int = "${source.name}.$packageName.$versionCode".hashCode()
)

fun List<AppUpdate>.indexOf(id: Int) = indexOfFirst { it.id == id }
