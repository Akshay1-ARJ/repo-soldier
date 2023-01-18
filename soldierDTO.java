package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class soldierDTO extends AbstractAuditDTO {

	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "name must be greter than 3 and less than 20")
	private String name;
	@Min(value = 10, message = "age must be greter then 10 less then 150")
	@Max(150)
	private int age;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "country must be greter than 3 and less than 20")
	private String country;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "rank must be greter than 3 and less than 20")
	private String rank;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "battelian must be greter than 3 and less than 20")
	private String batallion;
	private boolean alive;

}
