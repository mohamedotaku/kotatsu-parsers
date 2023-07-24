package org.koitharu.kotatsu.parsers.site.madara.ru


import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser


@MangaSourceParser("MANGAZAVR", "Mangazavr", "ru")
internal class Mangazavr(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAZAVR, "mangazavr.ru") {

	override val datePattern = "dd.MM.yyyy"
	override val isNsfwSource = true
}