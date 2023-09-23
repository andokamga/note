package org.note.service;


import org.note.dao.ServiceRepository;
import org.note.entity.Eservice;
import org.note.entity.ServiceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class IServiceInitImpl implements IServiceInit {

	@Autowired
	public ServiceRepository EserviceRepository ;
	@Override
	public void initTree() {
		org.note.entity.Service service = new org.note.entity.Service();
		service.setTilte("chap 1");
		service.setNumService(0);
		EserviceRepository.save(service);
		/*org.note.entity.Service service2 = (org.note.entity.Service) EserviceRepository.findById((long) 1).get();
		System.out.println(service2.toString());
		service1.setTilte("sous chap 1");
		service2.getServive().add(service1);
		service.getServive().add(service1);
		service.getServive().add(serviceItem);
		service.getServive().add(serviceItem1);
		EserviceRepository.save(serviceItem);*/
		
	}
	@Override
	public void iniTreeCh() throws JsonProcessingException {
		org.note.entity.Service service1 = new org.note.entity.Service();
		service1.setTilte("ando");
		org.note.entity.Service service5 = new org.note.entity.Service();
		service5.setTilte("ando");
		org.note.entity.Service service2 = (org.note.entity.Service) EserviceRepository.findById((long) 1).get();
		ServiceItem serviceItem = new ServiceItem();
		ServiceItem serviceItem1 = new ServiceItem();
		serviceItem.setConclusion("fin");
		serviceItem.setTilte("fait bien");
		serviceItem.setConclusion("aime");
		serviceItem1.setConclusion("la vie");
		serviceItem1.setConclusion("dure");
		EserviceRepository.save(serviceItem);
		System.out.println(service2.toString());
		service1.setTilte("sous chap 1");
		EserviceRepository.save(service1);
		EserviceRepository.save(service5);
		EserviceRepository.save(serviceItem1);
		service2.getServive().add(service1);
		service2.getServive().add(serviceItem);
		org.note.entity.Service service4 = (org.note.entity.Service) EserviceRepository.findById((long) 3).get();
		service4.getServive().add(serviceItem1);
		service4.getServive().add(service5);
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = objectMapper.writeValueAsString(service4);
		System.out.println(jsonData);
		System.out.println(service4);
		/*serviceItem.setConclusion("fin");
		serviceItem.setConclusion("aime");
		service.getServive().add(service1);
		service.getServive().add(serviceItem);
		service.getServive().add(serviceItem1);
		EserviceRepository.save(serviceItem);*/
		
		
	}
	@Override
	public void addNewService(String name) {
		org.note.entity.Service ser = new org.note.entity.Service();
		ser.setLevel(0);
		ser.setNumService(1);
		ser.setRef(ser.getNumService()+"");
		EserviceRepository.findAll().forEach(service->{
			if(service instanceof org.note.entity.Service) {
				if(service.getNumService()!=-1) {
					ser.setNumService(ser.getNumService()+1);
					System.out.println("bonjour");
				}  
				System.out.println("bonsoir");
			}
		});
		ser.setTilte(name+" "+ser.getNumService());
		EserviceRepository.save(ser);
	}
	@Override
	public void addNewUnderService(String name,long id) {
		if(EserviceRepository.findById(id).isPresent()) {
			int i=1;
			org.note.entity.Service ser = (org.note.entity.Service) EserviceRepository.findById(id).get();
			org.note.entity.Service service = new org.note.entity.Service();
			service.setLevel(ser.getLevel()+1);
			for(Eservice serv:ser.getServive()) {
				i++;
			}
			service.setRef(ser.getRef()+"."+i);
			service.setTilte(name+" "+service.getRef());
			EserviceRepository.save(ser);
			if(service.getNumService()==-1) {
				
			}
		}
		
	}
	@Override
	public void renoveNewService() {
		// TODO Auto-generated method stub
		
	}

	

}
