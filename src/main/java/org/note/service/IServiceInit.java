package org.note.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IServiceInit {
	public void addNewService(String name);
	public void addNewUnderService(String name,long id);
	public void renoveNewService();
	public void initTree();
	public void iniTreeCh()throws JsonProcessingException;

}
