package com.biryaniwala.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class biryani {
		@Id
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private int biryaniprice;
	private String biryaniDesc;

}
