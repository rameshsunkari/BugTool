package com.bugtool.dao;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.bugtool.model.EnvInfo;

/**
 * Home object for domain model class EnvInfo.
 * 
 * @see com.bugmodel.dao.EnvInfo
 * @author rsunkari
 */

@Repository
public class EnvInfoDAO extends BaseDAO<EnvInfo> {

	private static final Log log = LogFactory.getLog(EnvInfoDAO.class);

	public EnvInfoDAO() {
		super(EnvInfo.class);
	}

}
