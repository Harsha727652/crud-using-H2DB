package in.harsha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BOOK_DETAILS")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="BOOK_ID")	
 private Integer bookid;
	@JoinColumn(name="BOOK_NAME")	
 private String bookName;
	@Column(name="PRICE")	
 private Double price;
}
