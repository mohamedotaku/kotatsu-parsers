package org.koitharu.kotatsu.parsers.site.madara.es

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.*
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MONARCAMANGA", "MonarcaManga", "es")
internal class MonarcaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MONARCAMANGA, "monarcamanga.com") {
	override val tagPrefix = "manga-generos/"
}
