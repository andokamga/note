package org.note.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="TYPE", length = 4)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Eservice {
	//@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String tilte;
	private long level;
	private long numService=-1;

}
