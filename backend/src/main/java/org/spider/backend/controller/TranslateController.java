package org.spider.backend.controller;

import org.spider.backend.dto.TranslateRequest;
import org.spider.backend.dto.TranslateResponse;
import org.spider.backend.service.TranslateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${app.translate-path}")
@CrossOrigin(origins = "${app.frontend-origin}")
public class TranslateController {

	private final TranslateService translateService;

	public TranslateController(TranslateService translateService) {
		this.translateService = translateService;
	}

	@PostMapping
	public TranslateResponse translate(
			@RequestBody TranslateRequest request
	) {

		String result =
				translateService.translateToHado(request.getText());

		return new TranslateResponse(result);
	}

	@PostMapping("/reverse")
	public TranslateResponse reverseTranslate(
			@RequestBody TranslateRequest request
	) {

		String result =
				translateService.reverseTranslate(request.getText());

		return new TranslateResponse(result);
	}
}