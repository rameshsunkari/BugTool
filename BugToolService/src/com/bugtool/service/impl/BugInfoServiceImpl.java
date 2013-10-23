package com.bugtool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bugtool.dao.BugInfoDAO;
import com.bugtool.model.BugInfo;
import com.bugtool.service.BugInfoService;

@Service("bugInfoService")
@Transactional
public class BugInfoServiceImpl implements BugInfoService {

	@Autowired
	private BugInfoDAO bugInfoDAO;

	@Override
	public void createBugInfo(BugInfo bugInfo) {
		getBugInfoDAO().create(bugInfo);

	}

	@Override
	public void editBugInfo(BugInfo bugInfo) {
		getBugInfoDAO().edit(bugInfo);
	}

	@Override
	public void deleteBugInfo(BugInfo bugInfo) {
		getBugInfoDAO().delete(bugInfo);
	}

	@Override
	public BugInfo findBugInfoById(Integer id) {
		return getBugInfoDAO().find(id);
	}

	public BugInfoDAO getBugInfoDAO() {
		return bugInfoDAO;
	}

	public void setBugInfoDAO(BugInfoDAO bugInfoDAO) {
		this.bugInfoDAO = bugInfoDAO;
	}

}
