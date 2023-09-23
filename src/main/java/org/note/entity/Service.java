package org.note.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@AllArgsConstructor 
@Data
@NoArgsConstructor 
//@DiscriminatorValue("SERV")
public class Service extends Eservice {
	@OneToMany
	private List<Eservice> servive = new ArrayList<>();
	private String ref;

}
