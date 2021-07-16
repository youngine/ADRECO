package com.app.adView.biz.adView.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.adView.biz.adView.service.AdViewService;
import com.app.adView.sys.util.Result;

@RestController
@RequestMapping("/api/adView")
public class AdViewController {
	
	@Autowired
	private AdViewService adViewService;
	
	@GetMapping("/getAdView")
	public ResponseEntity<Result> getAdView() {
		return adViewService.getAdView();
	}
}
