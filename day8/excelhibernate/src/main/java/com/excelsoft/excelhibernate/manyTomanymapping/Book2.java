package manyTomanymapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int b_id;
	private String title;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student2> students;
}
