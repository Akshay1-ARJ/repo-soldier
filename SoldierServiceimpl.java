package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.soldierDTO;
import com.xworkz.soldier.repository.SoldierRepository;

public class SoldierServiceimpl implements SoldierService {

	SoldierRepository repo;
	public void setRepo(SoldierRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(soldierDTO dto) {

		System.out.println("Validation is running");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<soldierDTO>> violations = factory.getValidator().validate(dto);

		if (!violations.isEmpty()) {
			System.out.println("validation in valid");

			return false;

		} else {
			System.out.println("Saving running");
			boolean save = repo.save(dto);
			return save;
		}

	}

}
