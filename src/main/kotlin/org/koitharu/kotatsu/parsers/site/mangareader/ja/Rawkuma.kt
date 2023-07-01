package org.koitharu.kotatsu.parsers.site.mangareader.ja

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.RAWKUMA, pageSize = 54, searchPageSize = 54) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("rawkuma.com")

}