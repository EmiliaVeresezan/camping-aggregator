package ro.sci.camping.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sci.camping.dao.CampsiteDAO;
import ro.sci.camping.domain.Campsite;


@Service
public class CampsiteService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CampsiteService.class);

//	@Autowired
//	private CampsiteDAO dao;
//	
//	public Collection<Campsite> listAll() {
//		return dao.getAll();
//	}
//	
//	//search by campsite name 
//	public Collection<Campsite> serachByName(String query){
//		LOGGER.debug("Seraching for " + query);
//		return dao.searchByName(query);
//	}
//	
//	//search by campsite id - cand dau click pe un campsite de pe harta 
//	//trebuie sa ma duca la campsite-ul cu id-ul respectiv
//	//nu stiu daca e necesar search pentru asta, in sensul ca dai click pe campsite
//	//si te se genereaza dinamic pagina respectiva
//	public Collection<Campsite> searchById(Long id){
//		//LOGGER.debug("Seraching for " + query);
//		return dao.searchById(id);
//	}
//
//	//search by region - when clicking on the map region
//	public Collection<Campsite> searchByRegion(String query){
//		LOGGER.debug("Searching for "+query);
//		return dao.searchByRegion(query);
//	}
//	
//	public boolean delete(Long id){
//		LOGGER.debug("Deleting campsite for id: " + id);
//		Campsite campsite = dao.findById(id);
//		if (campsite != null) {
//			dao.delete(campsite);
//			return true;
//		}
//		
//	}
//	
//	public void save(Campsite campsite) throws ValidationException {
//		LOGGER.debug("Saving: " + campsite);
//		validate(campsite);
//		dao.update(campsite);
//	}
//	
//	private void validate(Campsite campsite) throws ValidationException{
//		
//	}
}
