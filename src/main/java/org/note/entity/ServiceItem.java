package org.note.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@AllArgsConstructor
@Data
@NoArgsConstructor 
//@DiscriminatorValue("ITEM")
public class ServiceItem extends Eservice{

	private String introduction;
	private String conclusion;
}
