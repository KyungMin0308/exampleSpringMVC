package com.kyungmin.exampleSpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyungmin.exampleSpringMVC.model.Offer;
import com.kyungmin.exampleSpringMVC.service.OfferService;

@Controller
public class OfferController {
	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping(value="/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "offers";
	}

}
