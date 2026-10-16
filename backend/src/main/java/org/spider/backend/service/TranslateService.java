package org.spider.backend.service;

import org.spider.backend.model.HadoLanguageMvc;
import org.springframework.stereotype.Service;

@Service
public class TranslateService {

	public String translateToHado(String text) {

		StringBuilder translator = new StringBuilder();

		for (char c : text.toCharArray()) {

			translator.append(
					HadoLanguageMvc.hadoLanguagee(String.valueOf(c))
			);
		}

		return translator.toString();
	}

	public String reverseTranslate(String text) {

		StringBuilder translator = new StringBuilder();

		for (char c : text.toCharArray()) {

			translator.append(
					HadoLanguageMvc.reverseHadoLanguage(String.valueOf(c))
			);
		}

		return translator.toString();
	}
}