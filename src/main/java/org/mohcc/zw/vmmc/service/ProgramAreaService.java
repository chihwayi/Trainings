package org.mohcc.zw.vmmc.service;

import java.util.List;

import org.mohcc.zw.vmmc.model.ProgramArea;

public interface ProgramAreaService {
	ProgramArea saveProgramArea(ProgramArea programArea);
	ProgramArea getProgramAreaById(String id);
	List<ProgramArea> getAllProgramArea();

}
