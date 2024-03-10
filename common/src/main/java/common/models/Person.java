package common.models;



import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Person {

	@JsonProperty
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@JsonProperty
    private String firstName;
	@JsonProperty
    private String lastName;
    
}