package com.bugtool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bugtool.dao.EnvInfoDAO;
import com.bugtool.model.EnvInfo;
import com.bugtool.service.EnvInfoService;

@Service("envInfoService")
@Transactional

public class EnvInfoServiceImpl implements EnvInfoService {
	
	@Autowired
	private EnvInfoDAO envInfoDAO;

	@Override
	public void createEnvInfo(EnvInfo envInfo) {
		getEnvInfoDAO().create(envInfo);
	}

	@Override
	public void editEnvInfo(EnvInfo envInfo) {
		getEnvInfoDAO().edit(envInfo);

	}

	@Override
	public void deleteEnvInfo(EnvInfo envInfo) {
		getEnvInfoDAO().delete(envInfo);

	}

	@Override
	public EnvInfo findEnvInfoById(Integer id) {
		return getEnvInfoDAO().find(id);
	}

	public EnvInfoDAO getEnvInfoDAO() {
		return envInfoDAO;
	}

	public void setEnvInfoDAO(EnvInfoDAO envInfoDAO) {
		this.envInfoDAO = envInfoDAO;
	}

}
