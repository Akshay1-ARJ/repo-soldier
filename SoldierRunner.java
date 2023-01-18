package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.soldierDTO;
import com.xworkz.soldier.repository.SoldierRepository;
import com.xworkz.soldier.repository.SoldierRepositoryImpl;
import com.xworkz.soldier.service.SoldierServiceimpl;

public class SoldierRunner {

	public static void main(String[] args) {

		System.out.println("Running SoldierRunner");

		soldierDTO dto = new soldierDTO("omkar", 36, "bangladesh", "third rank", "bootan", true);
		SoldierRepository repository = new SoldierRepositoryImpl();
		SoldierServiceimpl impl = new SoldierServiceimpl();
		impl.setRepo(repository);
		System.out.println(impl.validateAndSave(dto));

	}

}
