package com.ast;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UL_USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "S_NO")
	private Integer sNo;
	
	@Column(name = "U_ID")
	private Integer id;
	
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "creation_date")
	private LocalDateTime creationDate;

}
