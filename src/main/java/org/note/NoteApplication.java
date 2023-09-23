package org.note;


import org.note.service.IServiceInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteApplication implements CommandLineRunner {
	@Autowired
	private IServiceInit iServiceInit;
	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		iServiceInit.initTree();
		iServiceInit.iniTreeCh();
		//iServiceInit.addNewService();
	}

}
