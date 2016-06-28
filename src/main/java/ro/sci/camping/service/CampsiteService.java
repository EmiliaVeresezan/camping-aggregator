package ro.sci.camping.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sci.camping.domain.Campsite;


@Service
public class CampsiteService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CampsiteService.class);

	@Autowired
	private CampsiteDAO dao;
	
	public Collection<Campsite> listAll() {
		return dao.getAll();
	}
	
	public Collection<Campsite> serach(String query){
		LOGGER.debug("Seraching for " + query);
		return dao.searchByName(query);
	}
	
	public boolean delete(Long id){
		LOGGER.debug("Deleting campsite for id: " + id);
		Campsite campsite = dao.findById(id);
		if (campsite != null) {
			dao.delete(campsite);
			return true;
		}
		
	}
	
	public void save(Campsite campsite) throws ValidationException {
		LOGGER.debug("Saving: " + campsite);
		validate(campsite);
		dao.update(campsite);
	}
	
	private void validate(Campsite campsite) throws ValidationException{
		
	}
}
