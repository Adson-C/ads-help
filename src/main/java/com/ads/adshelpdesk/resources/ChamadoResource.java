package com.ads.adshelpdesk.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.adshelpdesk.domain.Chamado;
import com.ads.adshelpdesk.domain.dtos.ChamadoDTO;
import com.ads.adshelpdesk.services.ChamadoService;

@RestController
@RequestMapping(value = "/chamados")
public class ChamadoResource {
	
	@Autowired
	private ChamadoService service;

	
	// buscar por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<ChamadoDTO> findById(@PathVariable Integer id) {
		
		Chamado obj = service.findById(id);
		
		return ResponseEntity.ok().body(new ChamadoDTO(obj));
		
	}
}