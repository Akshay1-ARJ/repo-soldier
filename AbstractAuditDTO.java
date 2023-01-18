package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDate createdAt;
	private String updatedBy;
	private LocalDate updateedAt;

}
